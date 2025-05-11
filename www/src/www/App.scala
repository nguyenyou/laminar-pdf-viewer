package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

import scala.scalajs.LinkingInfo.developmentMode
import org.scalajs.dom
import scala.scalajs.js.typedarray.ArrayBuffer
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scalajs.js.Thenable.Implicits.*
//import io.github.nguyenyou.mupdfjs.models.Foo
import scala.scalajs.js.JSConverters.JSRichIterableOnce
import scalajs.js
import io.github.nguyenyou.laminar.pdfjs.PdfViewer
import org.scalajs.dom.Worker
import www.components.MuPdfWorkerClient
import www.components.MuPdfViewer


val demoUrl = if (developmentMode) {
  ""
} else {
  "/laminar-pdf-viewer"
}

trait ExecuteRequestData extends js.Object {
  val name: String
  val args: js.Array[js.Any]
}

trait ExecuteRequest extends js.Object {
  val id: String
  val tpe: String
  val data: ExecuteRequestData
}

trait WorkerEngine {
  def openDocument(file: ArrayBuffer): Unit
}

case class App(
  muPdfWorkerClient: MuPdfWorkerClient,
) {

  def apply(): HtmlElement = {
    // mupdfWorker.postMessage("Hello from main thread")

    div(
      cls("grid grid-cols-2"),
      // Add a container for the PDF images
      MuPdfViewer(
        urlSignal = Val(s"${demoUrl}/pdf/compressed.tracemonkey-pldi-09.pdf"),
        muPdfWorkerClient = muPdfWorkerClient
      )(),
      PdfViewer(
        urlSignal = Val(s"${demoUrl}/pdf/compressed.tracemonkey-pldi-09.pdf")
      )(),
    )
  }
}
