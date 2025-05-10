package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.laminar.pdfjs.PdfConfig
import org.scalajs.dom
import www.components.ThemeProvider
import org.scalajs.dom.{MessageEvent, Worker, WorkerOptions, WorkerType}
import io.github.nguyenyou.mupdfjs.worker.MupdfWorker
import io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.Endpoint

@main
def main(): Unit = {
  PdfConfig.setWorkerUrl(url =
    org.scalajs.dom
      .URL(
        url = "pdfjs-dist/build/pdf.worker.min.mjs",
        base = scalajs.js.`import`.meta.url.asInstanceOf[String]
      )
      .toString
  )

  val mupdfWorkerUrl = org.scalajs.dom
    .URL(
      url = "/mupdfjs-worker.js",
      base = scalajs.js.`import`.meta.url.asInstanceOf[String]
    )
    .toString

  val workerOptions = scalajs.js.Dynamic
    .literal(
      `type` = WorkerType.module
    )
    .asInstanceOf[WorkerOptions]
  val mupdfWorker   = new Worker(mupdfWorkerUrl, workerOptions)

  mupdfWorker.addEventListener(
    "message",
    (event: MessageEvent) => {
      if (event.data == "MUPDF_LOADED") {
        println("MESSAGE FROM WORKER MUPDF_LOADED")
      }
    }
  )

  mupdfWorker.postMessage("Hello from main thread")

  val someWorker = new Worker(org.scalajs.dom
    .URL(
      url = "/some-worker.js",
      base = scalajs.js.`import`.meta.url.asInstanceOf[String]
    )
    .toString, workerOptions)

  val container = dom.document.getElementById("app")

  render(container, ThemeProvider()(App(
    mupdfWorker = mupdfWorker
  )()))
}
