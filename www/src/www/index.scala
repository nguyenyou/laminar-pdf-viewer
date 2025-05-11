package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.laminar.pdfjs.PdfConfig
import org.scalajs.dom
import org.scalajs.dom.Worker
import www.components.MuPdfWorkerClient
import www.components.ThemeProvider

import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("Main")
object Main {
  @JSExport
  def run(worker: Worker): Unit = {
    val workerUrl = org.scalajs.dom.URL(
      url = "pdfjs-dist/build/pdf.worker.min.mjs",
      base = scalajs.js.`import`.meta.url.asInstanceOf[String]
    ).toString
    PdfConfig.setWorkerUrl(workerUrl)

    val muPdfWorkerClient = MuPdfWorkerClient(worker)
    muPdfWorkerClient.listen()

    val container = dom.document.getElementById("app")

    render(container, ThemeProvider()(App(muPdfWorkerClient = muPdfWorkerClient)()))
  }

}
