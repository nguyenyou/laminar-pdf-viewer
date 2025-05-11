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
    println(s"workerUrl: $workerUrl")
    PdfConfig.setWorkerUrl()

    val muPdfWorkerClient = MuPdfWorkerClient(worker)
    muPdfWorkerClient.listen()

    // val mupdfWorkerUrl = org.scalajs.dom
    //   .URL(
    //     url = "workers/mupdf.worker.js",
    //     base = scalajs.js.`import`.meta.url.asInstanceOf[String]
    //   )
    //   .toString
    // println(s"mupdfWorkerUrl: $mupdfWorkerUrl")

    // val workerOptions = scalajs.js.Dynamic
    //   .literal(
    //     `type` = WorkerType.module
    //   )
    //   .asInstanceOf[WorkerOptions]
    // val mupdfWorker   = new Worker(mupdfWorkerUrl, workerOptions)

    

    // val someWorker = new Worker(org.scalajs.dom
    //   .URL(
    //     url = "/some-worker.js",
    //     base = scalajs.js.`import`.meta.url.asInstanceOf[String]
    //   )
    //   .toString, workerOptions)

    val container = dom.document.getElementById("app")

    render(container, ThemeProvider()(App(muPdfWorkerClient = muPdfWorkerClient)()))
  }

}
