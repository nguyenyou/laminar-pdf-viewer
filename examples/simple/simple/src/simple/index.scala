package simple

import org.scalajs.dom
import com.raquo.laminar.api.L.*
import io.github.nguyenyou.laminar.pdfjs.PdfConfig
import io.github.nguyenyou.laminar.pdfjs.PdfViewer

import scalajs.js

@main
def main(): Unit = {
  val workerUrl = org.scalajs.dom.URL(
    url = "pdfjs-dist/build/pdf.worker.min.mjs",
    base = js.`import`.meta.url.asInstanceOf[String]
  ).toString
  PdfConfig.setWorkerUrl(workerUrl)

  render(
    dom.document.getElementById("app"),
    PdfViewer(
      urlSignal = Val(s"/compressed.tracemonkey-pldi-09.pdf")
    )()
  )
}
