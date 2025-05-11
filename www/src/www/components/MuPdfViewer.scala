package www.components

import com.raquo.laminar.api.L.*
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import org.scalajs.dom
import scalajs.js.Thenable.Implicits.*
import scala.util.{Failure, Success}
import www.components.MuPdfWorkerClient
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
  val firstPageImageVar = Var(Option.empty[String])
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
              pageCountVar.set(pageCount)
            case Failure(err) =>
              println(s"Failed to open document: ${err.getMessage}")
          }
      }
  }

  def apply() = {
    div(
      dataAttr("css-part") := "mupdfjs-document",
      urlSignal.distinct --> Observer[String](loadPdf),
      child <-- pageCountVar.signal.map { count =>
        div(
          dataAttr("css-part") := "mupdfjs-pages",
          0.until(count).map { pageIndex =>
            MuPdfPage(
              pageIndex = pageIndex,
              muPdfWorkerClient = muPdfWorkerClient,
              scale = 1
            )()
          }
        )
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
