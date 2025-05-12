package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.pdfjs.pdfjsDist.mod.getDocument
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.DocumentInitParameters
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFDocumentProxy

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success

import PdfDocument.DocumentStatus

case class PdfDocument(
    url: String
) {
  private val params                               = DocumentInitParameters().setUrl(url)
  private val statusVar                            = Var[DocumentStatus](DocumentStatus.Loading)
  private val statusSignal: Signal[DocumentStatus] = statusVar.signal.distinct

  private val loadingTask = getDocument(params)

  loadingTask.promise.toFuture.onComplete {
    case Failure(_)   => statusVar.set(DocumentStatus.Error)
    case Success(doc) => statusVar.set(DocumentStatus.Loaded(doc))
  }

  def apply(render: PDFDocumentProxy => HtmlElement): HtmlElement = {
    div(
      cls("pdf-document"),
      child <-- statusSignal.map {
        case DocumentStatus.Loading => div()
        case DocumentStatus.Error       => div("Load document error")
        case DocumentStatus.Loaded(doc) => render(doc)
      }
    )
  }
}

object PdfDocument {
  sealed trait DocumentStatus
  object DocumentStatus {
    case object Loading                      extends DocumentStatus
    case object Error                        extends DocumentStatus
    case class Loaded(doc: PDFDocumentProxy) extends DocumentStatus
  }
}
