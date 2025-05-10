package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.laminar.pdfjs.libs.scalawind.*
import org.scalajs.dom

case class PdfViewer(
  urlSignal: Signal[String]
) {
  def apply(): HtmlElement = {
    div(
      dataAttr("ui") := "pdf-viewer",
      child <-- urlSignal.map(url => {
        PdfDocument(url) { doc =>
          div(
            dataAttr("ui") := "pdf-pages",
            0.until(doc.numPages.toInt).map { pageIndex =>
              PdfPage(
                pageIndex = pageIndex,
                doc = doc
              )()
            }
          )
        }
      }),
    )
  }
}

object PdfViewer {
  def DPR = dom.window.devicePixelRatio
}
