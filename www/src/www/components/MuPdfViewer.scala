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
      dataAttr("part") := "mupdf-viewer",
      child <-- muPdfWorkerClient.workerInitializedSignal.map { initialized =>
        if (initialized) {
          MuPdfDocument(urlSignal = urlSignal, muPdfWorkerClient = muPdfWorkerClient)()
        } else {
          div("Waiting for MuPDF Worker to initialize...")
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
          println(pdfData)
          muPdfWorkerClient.openDocument(pdfData).onComplete {
            case Success(_) =>
              muPdfWorkerClient.getPageCount().onComplete {
                case Success(count) =>
                  println(s"Document has $count pages")
                  pageCountVar.set(count)
                case Failure(err) => println(s"Failed to get page count: ${err.getMessage}")
              }
            case Failure(err) =>
              println(s"Failed to open document: ${err.getMessage}")
          }
      }
  }

  def apply() = {
    div(
      dataAttr("part") := "mupdf-document",
      urlSignal.distinct --> Observer[String](loadPdf),
      child <-- pageCountVar.signal.map { count =>
        div(
          0.until(count).map { pageIndex =>
            MuPdfPage(
              pageIndex = pageIndex,
              muPdfWorkerClient = muPdfWorkerClient
            )()
          }
        )
      }
    )
  }
}

case class MuPdfPage(
    pageIndex: Int,
    muPdfWorkerClient: MuPdfWorkerClient
) {
  val imageVar = Var(Option.empty[String])
  muPdfWorkerClient.renderPage(pageIndex, 1 * dom.window.devicePixelRatio).onComplete {
    case Success(pageData) =>
      val pngData = pageData.asInstanceOf[js.typedarray.Uint8Array]
      // Create a blob URL to display the image
      val blobOptions = js.Dynamic.literal(`type` = "image/png").asInstanceOf[dom.BlobPropertyBag]
      val blob        = new dom.Blob(js.Array(pngData), blobOptions)
      val url         = dom.URL.createObjectURL(blob)
      imageVar.set(Some(url))

    case Failure(err) =>
      println(s"Failed to render page: ${err.getMessage}")
  }
  def apply() = {
    div(
      dataAttr("part")       := "mupdf-page",
      dataAttr("page-index") := pageIndex.toString,
      cls("w-full h-full"),
      child <-- imageVar.signal.map {
        case Some(url) =>
          img(src := url, width := "100%", height := "100%")
        case None =>
          div("Loading...")
      }
    )
  }
}
