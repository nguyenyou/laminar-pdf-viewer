package www

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import io.github.nguyenyou.laminar.pdfjs.PdfViewer
import io.github.nguyenyou.laminar.pdfjs.PdfConfig
import scala.scalajs.LinkingInfo.developmentMode

@main
def main(): Unit = {
  PdfConfig.setWorkerUrl()
  val container = dom.document.getElementById("app")
  val demoUrl = if (developmentMode) {
    ""
  } else {
    "/laminar-pdf-viewer"
  }
  val viewer = PdfViewer(
    urlSignal = Val(s"${demoUrl}/pdf/compressed.tracemonkey-pldi-09.pdf")
  )
  val app = div(
    h1("Hello, world!"),
    p("This is a test"),
    viewer()
  )
  render(container, app)
}
