package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationBorderEffect
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationBorderStyle
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationIntent
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationLineEndingStyle
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "PDFAnnotation")
@js.native
open class PDFAnnotation protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.PDFAnnotation {
  def this(
    doc: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_annot'> */ Any
  ) = this()
}
/* static members */
object PDFAnnotation {
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.ANNOT_TYPES")
  @js.native
  val ANNOT_TYPES: js.Array[PDFAnnotationType] = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.BORDER_EFFECT")
  @js.native
  val BORDER_EFFECT: js.Array[PDFAnnotationBorderEffect] = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.BORDER_STYLE")
  @js.native
  val BORDER_STYLE: js.Array[PDFAnnotationBorderStyle] = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.INTENT")
  @js.native
  val INTENT: js.Array[PDFAnnotationIntent] = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_HIDDEN")
  @js.native
  val IS_HIDDEN: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_INVISIBLE")
  @js.native
  val IS_INVISIBLE: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_LOCKED")
  @js.native
  val IS_LOCKED: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_LOCKED_CONTENTS")
  @js.native
  val IS_LOCKED_CONTENTS: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_NO_ROTATE")
  @js.native
  val IS_NO_ROTATE: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_NO_VIEW")
  @js.native
  val IS_NO_VIEW: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_NO_ZOOM")
  @js.native
  val IS_NO_ZOOM: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_PRINT")
  @js.native
  val IS_PRINT: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.IS_TOGGLE_NO_VIEW")
  @js.native
  val IS_TOGGLE_NO_VIEW: Double = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "PDFAnnotation.LINE_ENDING")
  @js.native
  val LINE_ENDING: js.Array[PDFAnnotationLineEndingStyle] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_annot'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
