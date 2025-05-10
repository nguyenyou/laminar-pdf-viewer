package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.laminar.pdfjs.PdfConfig
import org.scalajs.dom
import www.components.ThemeProvider
import org.scalajs.dom.{MessageEvent, Worker, WorkerOptions, WorkerType}
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.scalajs.dom.Worker

@JSExportTopLevel("Main")
object Main {
  @JSExport
  def run(worker: Worker): Unit = {
    PdfConfig.setWorkerUrl()

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

    worker.addEventListener(
      "message",
      (event: MessageEvent) => {
        println(s"message: ${event.data}")
      }
    )

    // val someWorker = new Worker(org.scalajs.dom
    //   .URL(
    //     url = "/some-worker.js",
    //     base = scalajs.js.`import`.meta.url.asInstanceOf[String]
    //   )
    //   .toString, workerOptions)

    val container = dom.document.getElementById("app")

    render(container, ThemeProvider()(App()()))
  }

}
