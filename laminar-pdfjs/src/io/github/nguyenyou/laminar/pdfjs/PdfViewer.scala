package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import org.scalajs.dom

case class PdfViewer(
  urlSignal: Signal[String]
) {


  def apply(): HtmlElement = {
    div(
      child <-- urlSignal.map(url => {
        PdfDocument(url) { doc =>
          div(
            0.until(doc.numPages.toInt).map { pageIndex =>
              div(pageIndex.toString)
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
