package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import org.scalajs.dom

case class PdfViewer(
    urlSignal: Signal[String]
) {
  def apply(): HtmlElement = {
    div(
      cls("pdf-viewer"),
      idAttr := "laminar-pdfjs-viewer",
      child <-- urlSignal.map(url => {
        PdfDocument(url) { doc =>
          div(
            cls("pdf-pages"),
            0.until(doc.numPages.toInt).map { pageIndex =>
              PdfPage(
                pageIndex = pageIndex,
                doc = doc
              )()
            }
          )
        }
      })
    )
  }
}

object PdfViewer {
  def DPR: Double = dom.window.devicePixelRatio
}
