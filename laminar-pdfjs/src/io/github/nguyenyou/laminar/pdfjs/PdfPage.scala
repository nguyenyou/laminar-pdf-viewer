package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFDocumentProxy

case class PdfPage(
    pageIndex: Int,
    doc: PDFDocumentProxy
) {
  def apply(): HtmlElement = {
    div(
      pageIndex
    )
  }
}
