package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.laminar.pdfjs.libs.scalawind.*
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.GetViewportParameters
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFDocumentProxy
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFPageProxy

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success

import PdfPage.PageStatus

case class PdfPage(
    pageIndex: Int,
    doc: PDFDocumentProxy
) {
  private val statusVar = Var[PageStatus](PageStatus.Loading)

  doc.getPage(pageIndex + 1).toFuture.onComplete {
    case Failure(_)    => statusVar.set(PageStatus.Error)
    case Success(page) => statusVar.set(PageStatus.Loaded(page = page))
  }

  private def renderPage(page: PDFPageProxy) = {
    val viewport = page.getViewport(GetViewportParameters(scale = 1))
    div(
      dataAttr("ui") := "pdf-page",
      tw.relative.border.border_grid,
      width  := s"${viewport.width}px",
      height := s"${viewport.height}px",
      PdfCanvas(
        width = viewport.width,
        height = viewport.height,
        scale = 1,
        page = page
      )()
    )
  }

  def apply(): HtmlElement = {
    div(
      dataAttr("ui") := "pdf-page-wrapper",
      tw.flex.justify_center,
      child <-- statusVar.signal.map {
        case PageStatus.Loading      => div("Loading page...")
        case PageStatus.Error        => div("Load page error")
        case PageStatus.Loaded(page) => renderPage(page)
      }
    )
  }
}

object PdfPage {
  sealed trait PageStatus
  object PageStatus {
    case object Loading                   extends PageStatus
    case object Error                     extends PageStatus
    case class Loaded(page: PDFPageProxy) extends PageStatus
  }
}
