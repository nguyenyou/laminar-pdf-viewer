package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.laminar.pdfjs.PdfViewer

import scala.scalajs.LinkingInfo.developmentMode

val demoUrl = if (developmentMode) {
  ""
} else {
  "/laminar-pdf-viewer"
}

case class App() {
  def apply(): HtmlElement = {
    div(
      PdfViewer(
        urlSignal = Val(s"${demoUrl}/pdf/compressed.tracemonkey-pldi-09.pdf")
      )()
    )
  }
}
