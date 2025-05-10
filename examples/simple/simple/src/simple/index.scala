package simple

import org.scalajs.dom
import com.raquo.laminar.api.L._
import io.github.nguyenyou.laminar.pdfjs.PdfConfig
import io.github.nguyenyou.laminar.pdfjs.PdfViewer

@main
def main(): Unit = {
  PdfConfig.setWorkerUrl()
  render(
    dom.document.getElementById("app"),
    PdfViewer(
      urlSignal = Val(s"/compressed.tracemonkey-pldi-09.pdf")
    )()
  )
}
