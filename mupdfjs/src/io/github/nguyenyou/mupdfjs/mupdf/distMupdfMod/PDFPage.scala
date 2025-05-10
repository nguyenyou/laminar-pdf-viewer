package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "PDFPage")
@js.native
open class PDFPage protected () extends Page {
  def this(doc: PDFDocument, clone: PDFPage) = this()
  def this(
    doc: PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_page'> */ Any
  ) = this()
  
  var _annots: js.Array[PDFAnnotation] | Null = js.native
  
  var _doc: PDFDocument = js.native
  
  var _widgets: js.Array[PDFWidget] | Null = js.native
  
  def applyRedactions(): Unit = js.native
  def applyRedactions(black_boxes: Boolean): Unit = js.native
  def applyRedactions(black_boxes: Boolean, image_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Boolean, image_method: Double, line_art_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Boolean, image_method: Double, line_art_method: Double, text_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Boolean, image_method: Double, line_art_method: Unit, text_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Boolean, image_method: Unit, line_art_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Boolean, image_method: Unit, line_art_method: Double, text_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Boolean, image_method: Unit, line_art_method: Unit, text_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Unit, image_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Unit, image_method: Double, line_art_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Unit, image_method: Double, line_art_method: Double, text_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Unit, image_method: Double, line_art_method: Unit, text_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Unit, image_method: Unit, line_art_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Unit, image_method: Unit, line_art_method: Double, text_method: Double): Unit = js.native
  def applyRedactions(black_boxes: Unit, image_method: Unit, line_art_method: Unit, text_method: Double): Unit = js.native
  
  def createAnnotation(`type`: PDFAnnotationType): PDFAnnotation = js.native
  
  def deleteAnnotation(annot: PDFAnnotation): Unit = js.native
  
  def getAnnotations(): js.Array[PDFAnnotation] = js.native
  
  def getObject(): PDFObject = js.native
  
  def getTransform(): Matrix = js.native
  
  def getWidgets(): js.Array[PDFWidget] = js.native
  
  def setPageBox(box: PageBox, rect: Rect): Unit = js.native
  
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Boolean, showExtras: Boolean, usage: String): Pixmap = js.native
  def toPixmap(
    matrix: Matrix,
    colorspace: ColorSpace,
    alpha: Boolean,
    showExtras: Boolean,
    usage: String,
    box: PageBox
  ): Pixmap = js.native
  def toPixmap(
    matrix: Matrix,
    colorspace: ColorSpace,
    alpha: Boolean,
    showExtras: Boolean,
    usage: Unit,
    box: PageBox
  ): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Boolean, showExtras: Unit, usage: String): Pixmap = js.native
  def toPixmap(
    matrix: Matrix,
    colorspace: ColorSpace,
    alpha: Boolean,
    showExtras: Unit,
    usage: String,
    box: PageBox
  ): Pixmap = js.native
  def toPixmap(
    matrix: Matrix,
    colorspace: ColorSpace,
    alpha: Boolean,
    showExtras: Unit,
    usage: Unit,
    box: PageBox
  ): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Unit, showExtras: Boolean, usage: String): Pixmap = js.native
  def toPixmap(
    matrix: Matrix,
    colorspace: ColorSpace,
    alpha: Unit,
    showExtras: Boolean,
    usage: String,
    box: PageBox
  ): Pixmap = js.native
  def toPixmap(
    matrix: Matrix,
    colorspace: ColorSpace,
    alpha: Unit,
    showExtras: Boolean,
    usage: Unit,
    box: PageBox
  ): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Unit, showExtras: Unit, usage: String): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Unit, showExtras: Unit, usage: String, box: PageBox): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Unit, showExtras: Unit, usage: Unit, box: PageBox): Pixmap = js.native
  
  def update(): Boolean = js.native
}
/* static members */
object PDFPage {
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_IMAGE_NONE")
  @js.native
  val REDACT_IMAGE_NONE: /* 0 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_IMAGE_PIXELS")
  @js.native
  val REDACT_IMAGE_PIXELS: /* 2 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_IMAGE_REMOVE")
  @js.native
  val REDACT_IMAGE_REMOVE: /* 1 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_IMAGE_UNLESS_INVISIBLE")
  @js.native
  val REDACT_IMAGE_UNLESS_INVISIBLE: /* 3 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_LINE_ART_NONE")
  @js.native
  val REDACT_LINE_ART_NONE: /* 0 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_LINE_ART_REMOVE_IF_COVERED")
  @js.native
  val REDACT_LINE_ART_REMOVE_IF_COVERED: /* 1 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_LINE_ART_REMOVE_IF_TOUCHED")
  @js.native
  val REDACT_LINE_ART_REMOVE_IF_TOUCHED: /* 2 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_TEXT_NONE")
  @js.native
  val REDACT_TEXT_NONE: /* 1 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFPage.REDACT_TEXT_REMOVE")
  @js.native
  val REDACT_TEXT_REMOVE: /* 0 */ Double = js.native
}
