package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.pdfjs.pdfjsDist.mod.getDocument
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.{DocumentInitParameters, PDFDocumentProxy}
import Document.DocumentStatus

case class Document(
    url: String
) {
  private val params     = DocumentInitParameters().setUrl(url)
  private val statusVar  = Var[DocumentStatus](DocumentStatus.Loading)
  val statusSignal: Signal[DocumentStatus] = statusVar.signal.distinct

  private def loadDocument() = {
    val loadingTask = getDocument(params)

    loadingTask.promise.`then`(
      onFulfilled = (doc: PDFDocumentProxy) => {
        statusVar.set(DocumentStatus.Loaded(doc))
      }
    )
  }

  def apply(render: PDFDocumentProxy => HtmlElement): HtmlElement = {
    div(
      child <-- statusSignal.map {
        case DocumentStatus.Loading     => div("Loading...")
        case DocumentStatus.Loaded(doc) => render(doc)
      },
      onMountCallback { _ =>
        loadDocument()
      }
    )
  }
}

object Document {
  sealed trait DocumentStatus
  object DocumentStatus {
    case object Loading extends DocumentStatus

    case class Loaded(doc: PDFDocumentProxy) extends DocumentStatus
  }
}
