package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.anon.End
import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.pdf_annot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "PDFAnnotation")
@js.native
open class PDFAnnotation protected ()
  extends StObject
     with Userdata[pdf_annot] {
  def this(
    doc: PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_annot'> */ Any
  ) = this()
  
  var _doc: PDFDocument = js.native
  
  def addBorderDashItem(v: Double): Unit = js.native
  
  def addInkListStroke(): Unit = js.native
  
  def addInkListStrokeVertex(v: Point): Unit = js.native
  
  def addQuadPoint(quad: Quad): Unit = js.native
  
  def addVertex(vertex: Point): Unit = js.native
  
  def applyRedaction(): Unit = js.native
  def applyRedaction(black_boxes: Double): Unit = js.native
  def applyRedaction(black_boxes: Double, image_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Double, image_method: Double, line_art_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Double, image_method: Double, line_art_method: Double, text_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Double, image_method: Double, line_art_method: Unit, text_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Double, image_method: Unit, line_art_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Double, image_method: Unit, line_art_method: Double, text_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Double, image_method: Unit, line_art_method: Unit, text_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Unit, image_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Unit, image_method: Double, line_art_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Unit, image_method: Double, line_art_method: Double, text_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Unit, image_method: Double, line_art_method: Unit, text_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Unit, image_method: Unit, line_art_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Unit, image_method: Unit, line_art_method: Double, text_method: Double): Unit = js.native
  def applyRedaction(black_boxes: Unit, image_method: Unit, line_art_method: Unit, text_method: Double): Unit = js.native
  
  def clearBorderDash(): Unit = js.native
  
  def clearInkList(): Unit = js.native
  
  def clearQuadPoints(): Unit = js.native
  
  def clearVertices(): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getAuthor(): String = js.native
  
  def getBorderDashCount(): Double = js.native
  
  def getBorderDashItem(idx: Double): Double = js.native
  
  def getBorderDashPattern(): js.Array[Any] = js.native
  
  def getBorderEffect(): PDFAnnotationBorderEffect = js.native
  
  def getBorderEffectIntensity(): Double = js.native
  
  def getBorderStyle(): PDFAnnotationBorderStyle = js.native
  
  def getBorderWidth(): Double = js.native
  
  def getBounds(): Rect = js.native
  
  def getCalloutLine(): js.UndefOr[js.Array[Point]] = js.native
  
  def getCalloutPoint(): js.UndefOr[Point] = js.native
  
  def getCalloutStyle(): PDFAnnotationLineEndingStyle = js.native
  
  def getColor(): Color = js.native
  
  def getContents(): String = js.native
  
  def getCreationDate(): js.Date = js.native
  
  def getDefaultAppearance(): io.github.nguyenyou.mupdfjs.mupdf.anon.Color = js.native
  
  def getFileSpec(): PDFObject = js.native
  
  def getFlags(): Double = js.native
  
  def getHiddenForEditing(): Boolean = js.native
  
  def getIcon(): String = js.native
  
  def getInkList(): js.Array[js.Array[Point]] = js.native
  
  def getIntent(): PDFAnnotationIntent = js.native
  
  def getInteriorColor(): Color = js.native
  
  def getIsOpen(): Boolean = js.native
  
  def getLanguage(): String = js.native
  
  def getLine(): js.Array[Point] = js.native
  
  def getLineCaption(): Boolean = js.native
  
  def getLineCaptionOffset(): Point = js.native
  
  def getLineEndingStyles(): End = js.native
  
  def getLineLeader(): Double = js.native
  
  def getLineLeaderExtension(): Double = js.native
  
  def getLineLeaderOffset(): Double = js.native
  
  def getModificationDate(): js.Date = js.native
  
  def getObject(): PDFObject = js.native
  
  def getOpacity(): Double = js.native
  
  def getPopup(): Rect = js.native
  
  def getQuadPoints(): js.Array[Quad] = js.native
  
  def getQuadding(): Double = js.native
  
  def getRect(): Rect = js.native
  
  def getType(): PDFAnnotationType = js.native
  
  def getVertices(): js.Array[Point] = js.native
  
  def hasAuthor(): Boolean = js.native
  
  def hasBorder(): Boolean = js.native
  
  def hasBorderEffect(): Boolean = js.native
  
  def hasCallout(): Boolean = js.native
  
  def hasFilespec(): Boolean = js.native
  
  def hasIcon(): Boolean = js.native
  
  def hasInkList(): Boolean = js.native
  
  def hasInteriorColor(): Boolean = js.native
  
  def hasLine(): Boolean = js.native
  
  def hasLineEndingStyles(): Boolean = js.native
  
  def hasOpen(): Boolean = js.native
  
  def hasQuadPoints(): Boolean = js.native
  
  def hasRect(): Boolean = js.native
  
  def hasVertices(): Boolean = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def run(device: Device, matrix: Matrix): Unit = js.native
  
  def setAppearance(
    appearance: String,
    state: String,
    transform: Matrix,
    bbox: Rect,
    resources: Any,
    contents: AnyBuffer
  ): Unit = js.native
  def setAppearance(
    appearance: String,
    state: Null,
    transform: Matrix,
    bbox: Rect,
    resources: Any,
    contents: AnyBuffer
  ): Unit = js.native
  def setAppearance(
    appearance: Null,
    state: String,
    transform: Matrix,
    bbox: Rect,
    resources: Any,
    contents: AnyBuffer
  ): Unit = js.native
  def setAppearance(appearance: Null, state: Null, transform: Matrix, bbox: Rect, resources: Any, contents: AnyBuffer): Unit = js.native
  
  def setAppearanceFromDisplayList(appearance: String, state: String, transform: Matrix, list: DisplayList): Unit = js.native
  def setAppearanceFromDisplayList(appearance: String, state: Null, transform: Matrix, list: DisplayList): Unit = js.native
  def setAppearanceFromDisplayList(appearance: Null, state: String, transform: Matrix, list: DisplayList): Unit = js.native
  def setAppearanceFromDisplayList(appearance: Null, state: Null, transform: Matrix, list: DisplayList): Unit = js.native
  
  def setAuthor(text: String): Unit = js.native
  
  def setBorderDashPattern(list: js.Array[Double]): Unit = js.native
  
  def setBorderEffect(value: PDFAnnotationBorderEffect): Unit = js.native
  
  def setBorderEffectIntensity(value: Double): Unit = js.native
  
  def setBorderStyle(value: PDFAnnotationBorderStyle): Unit = js.native
  
  def setBorderWidth(value: Double): Unit = js.native
  
  def setCalloutLine(line: js.Array[Point]): Unit = js.native
  
  def setCalloutPoint(p: Point): Unit = js.native
  
  def setCalloutStyle(style: PDFAnnotationLineEndingStyle): Unit = js.native
  
  def setColor(color: Color): Unit = js.native
  
  def setContents(text: String): Unit = js.native
  
  def setCreationDate(date: js.Date): Unit = js.native
  
  def setDefaultAppearance(fontName: String, size: Double, color: Color): Unit = js.native
  
  def setFileSpec(fs: PDFObject): Unit = js.native
  
  def setFlags(flags: Double): Unit = js.native
  
  def setHiddenForEditing(isHidden: Boolean): Unit = js.native
  
  def setIcon(text: String): Unit = js.native
  
  def setInkList(inklist: js.Array[js.Array[Point]]): Unit = js.native
  
  def setIntent(value: PDFAnnotationIntent): Unit = js.native
  
  def setInteriorColor(color: Color): Unit = js.native
  
  def setIsOpen(isOpen: Boolean): Unit = js.native
  
  def setLanguage(lang: String): Unit = js.native
  
  def setLine(a: Point, b: Point): Unit = js.native
  
  def setLineCaption(on: Boolean): Unit = js.native
  
  def setLineCaptionOffset(p: Point): Unit = js.native
  
  def setLineEndingStyles(start: PDFAnnotationLineEndingStyle, end: PDFAnnotationLineEndingStyle): Unit = js.native
  
  def setLineLeader(v: Double): Unit = js.native
  
  def setLineLeaderExtension(v: Double): Unit = js.native
  
  def setLineLeaderOffset(v: Double): Unit = js.native
  
  def setModificationDate(date: js.Date): Unit = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  def setPopup(rect: Rect): Unit = js.native
  
  def setQuadPoints(quadlist: js.Array[Quad]): Unit = js.native
  
  def setQuadding(quadding: Double): Unit = js.native
  
  def setRect(rect: Rect): Unit = js.native
  
  def setStampImage(image: Image): Unit = js.native
  
  def setVertices(vertexlist: js.Array[Point]): Unit = js.native
  
  def toDisplayList(): DisplayList = js.native
  
  def toPixmap(matrix: Matrix, colorspace: ColorSpace): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Boolean): Pixmap = js.native
  
  def update(): Boolean = js.native
}
/* static members */
object PDFAnnotation {
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.ANNOT_TYPES")
  @js.native
  val ANNOT_TYPES: js.Array[PDFAnnotationType] = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.BORDER_EFFECT")
  @js.native
  val BORDER_EFFECT: js.Array[PDFAnnotationBorderEffect] = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.BORDER_STYLE")
  @js.native
  val BORDER_STYLE: js.Array[PDFAnnotationBorderStyle] = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.INTENT")
  @js.native
  val INTENT: js.Array[PDFAnnotationIntent] = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_HIDDEN")
  @js.native
  val IS_HIDDEN: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_INVISIBLE")
  @js.native
  val IS_INVISIBLE: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_LOCKED")
  @js.native
  val IS_LOCKED: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_LOCKED_CONTENTS")
  @js.native
  val IS_LOCKED_CONTENTS: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_NO_ROTATE")
  @js.native
  val IS_NO_ROTATE: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_NO_VIEW")
  @js.native
  val IS_NO_VIEW: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_NO_ZOOM")
  @js.native
  val IS_NO_ZOOM: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_PRINT")
  @js.native
  val IS_PRINT: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.IS_TOGGLE_NO_VIEW")
  @js.native
  val IS_TOGGLE_NO_VIEW: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFAnnotation.LINE_ENDING")
  @js.native
  val LINE_ENDING: js.Array[PDFAnnotationLineEndingStyle] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_annot'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
