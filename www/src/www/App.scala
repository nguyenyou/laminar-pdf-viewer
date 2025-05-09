package www

import com.raquo.laminar.api.L.*

import scala.scalajs.LinkingInfo.developmentMode
import io.github.nguyenyou.laminar.pdfjs.PdfViewer
import io.github.nguyenyou.ui5.webcomponents.laminar.*


case class App() {
  def apply(): HtmlElement = {
    val demoUrl = if (developmentMode) {
      ""
    } else {
      "/laminar-pdf-viewer"
    }

    val viewer = PdfViewer(
      urlSignal = Val(s"${demoUrl}/pdf/compressed.tracemonkey-pldi-09.pdf")
    )
    div(
      div(
        Button()("Open")
      ),
      viewer()
    )
  }
}
