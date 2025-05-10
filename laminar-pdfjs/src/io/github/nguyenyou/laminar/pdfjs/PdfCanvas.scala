package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.laminar.pdfjs.facades.AnnotationMode
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.GetViewportParameters
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFPageProxy
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.RenderParameters
import org.scalajs.dom.CanvasRenderingContext2D

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success

case class PdfCanvas(
    width: Double,
    height: Double,
    scale: Double,
    page: PDFPageProxy
) {
  private val viewport  = page.getViewport(GetViewportParameters(scale = scale * PdfViewer.DPR))
  private val canvas    = canvasTag()
  private val canvasRef = canvas.ref
  canvasRef.width = viewport.width.toInt
  canvasRef.height = viewport.height.toInt
  canvasRef.style.width = s"${Math.floor(width)}px"
  canvasRef.style.height = s"${Math.floor(height)}px"
  canvasRef.style.visibility = "hidden"

  private val context          = canvasRef.getContext("2d").asInstanceOf[CanvasRenderingContext2D] // scalafix:ok
  private val renderParameters = RenderParameters(canvasContext = context, viewport = viewport)
  renderParameters.setAnnotationMode(AnnotationMode.Enable)
  private val task = page.render(renderParameters)

  task.promise.toFuture.onComplete {
    case Failure(_) =>
      ()
    case Success(_) =>
      canvasRef.style.visibility = ""
  }

  def apply(): HtmlElement = {
    div(
      cls("pdf-canvas"),
      canvas
    )
  }
}
