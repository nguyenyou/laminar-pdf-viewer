package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

case class Viewer(
  urlSignal: Signal[String]
) {


  def apply(): HtmlElement = {
    div(
      child <-- urlSignal.map(url => {
        Document(url) { doc =>
          div(
            0.until(doc.numPages.toInt).map { pageIndex =>
              div(pageIndex.toString)
            }
          )
        }
      }),
    )
  }
}
