package www.components

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import www.components.MuPdfWorkerClient

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success

import scalajs.js.Thenable.Implicits.*
import scalajs.js

case class MuPdfViewer(
    urlSignal: Signal[String],
    muPdfWorkerClient: MuPdfWorkerClient
) {
  def apply(): HtmlElement = {
    div(
      idAttr("laminar-mupdfjs-viewer"),
      child <-- muPdfWorkerClient.workerInitializedSignal.map { initialized =>
        if (initialized) {
          MuPdfDocument(urlSignal = urlSignal, muPdfWorkerClient = muPdfWorkerClient)()
        } else {
          div()
        }
      }
    )
  }
}

case class MuPdfDocument(
    urlSignal: Signal[String],
    muPdfWorkerClient: MuPdfWorkerClient
) {
  case class DocumentData(pageCount: Int)
  val documentDataVar = Var(Option.empty[DocumentData])
  val documentDataSignal = documentDataVar.signal.distinct
  val pageCountVar      = Var(0)

  def loadPdf(url: String): Unit = {
    dom
      .fetch(url)
      .toFuture
      .flatMap { response =>
        if (!response.ok) {
          throw Exception(s"Failed to fetch PDF: ${response.statusText}")
        }
        response.arrayBuffer()
      }
      .onComplete {
        case Failure(error) =>
          println(s"Failed to load PDF: ${error.getMessage}")
        case Success(pdfData) =>
          muPdfWorkerClient.openDocument(pdfData).onComplete {
            case Success(result) =>

              val pageCount = result.asInstanceOf[js.Dynamic].pageCount.asInstanceOf[Int]
              documentDataVar.set(Some(DocumentData(pageCount)))
            case Failure(err) =>
              println(s"Failed to open document: ${err.getMessage}")
          }
      }
  }

  def apply() = {
    div(
      dataAttr("css-part") := "mupdfjs-document",
      urlSignal.distinct --> Observer[String](loadPdf),
      child <-- documentDataSignal.map {
        case Some(DocumentData(pageCount)) =>
          div(
            dataAttr("css-part") := "mupdfjs-pages",
            MuPdfPage(
              pageIndex = 0,
              muPdfWorkerClient = muPdfWorkerClient,
              scale = 1
            )()
          // 0.until(count).map { pageIndex =>
          //   MuPdfPage(
          //     pageIndex = pageIndex,
          //     muPdfWorkerClient = muPdfWorkerClient,
          //     scale = 1
          //   )()
          // }
          )
        case None =>
          div()
      }
    )
  }
}

case class MuPdfPage(
    pageIndex: Int,
    scale: Double,
    muPdfWorkerClient: MuPdfWorkerClient
) {
  case class PageData(imageUrl: String, width: Double, height: Double)
  case class PageSize(width: Double, height: Double)
  val DPR            = dom.window.devicePixelRatio
  val pageDataVar    = Var(Option.empty[PageData])
  val pageDataSignal = pageDataVar.signal.distinct
  val pageSizeSignal: Signal[PageSize] = pageDataSignal.map(_.map { data =>
    val width  = Math.floor(data.width / (scale * DPR))
    val height = Math.floor(data.height / (scale * DPR))
    PageSize(width, height)
  }.getOrElse(PageSize(0, 0)))

  muPdfWorkerClient.renderPage(pageIndex, scale * DPR).onComplete {
    case Success(result) =>
      val resultData = result.asInstanceOf[js.Dynamic]
      val pngData    = resultData.imageData.asInstanceOf[js.typedarray.Uint8Array]
      // Create a blob URL to display the image
      val blobOptions = js.Dynamic.literal(`type` = "image/png").asInstanceOf[dom.BlobPropertyBag]
      val blob        = new dom.Blob(js.Array(pngData), blobOptions)
      val url         = dom.URL.createObjectURL(blob)

      pageDataVar
        .set(Some(PageData(url, resultData.width.asInstanceOf[Double], resultData.height.asInstanceOf[Double])))
    case Failure(err) =>
      println(s"Failed to render page: ${err.getMessage}")
  }
  def apply() = {
    div(
      dataAttr("css-part") := "mupdfjs-page-wrapper",
      div(
        dataAttr("css-part") := "mupdfjs-page",
        width <-- pageSizeSignal.map(pageSize => s"${pageSize.width}px"),
        height <-- pageSizeSignal.map(pageSize => s"${pageSize.height}px"),
        child <-- pageDataSignal.map {
          case Some(pageData) =>
            img(
              dataAttr("css-part") := "mupdfjs-page-image",
              src                  := pageData.imageUrl
            )
          case None =>
            div()
        }
      )
    )
  }
}
