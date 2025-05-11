package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.laminar.pdfjs.PdfViewer
import www.components.MuPdfViewer
import www.components.MuPdfWorkerClient

import scala.scalajs.js.typedarray.ArrayBuffer

import scalajs.js

val isProd = scalajs.js.`import`.meta.env.PROD.asInstanceOf[Boolean]

val demoUrl = if (isProd) {
  "/laminar-pdf-viewer"
} else {
  ""
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
    div(
      cls("grid grid-cols-2"),
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
