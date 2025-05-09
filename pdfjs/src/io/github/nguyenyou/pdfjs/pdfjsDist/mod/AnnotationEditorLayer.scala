package io.github.nguyenyou.pdfjs.pdfjsDist.mod

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofFreeTextEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofHighlightEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofInkEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofSignatureEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofStampEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayerOptions
import io.github.nguyenyou.pdfjs.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist", "AnnotationEditorLayer")
@js.native
open class AnnotationEditorLayer protected ()
  extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer {
  /**
    * @param {AnnotationEditorLayerOptions} options
    */
  def this(param0: AnnotationEditorLayerOptions) = this()
}
/* static members */
object AnnotationEditorLayer {
  
  @JSImport("pdfjs-dist", "AnnotationEditorLayer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist", "AnnotationEditorLayer.__#34@#editorTypes")
  @js.native
  val `__Numbersign34@NumbersigneditorTypes`: Map[
    Double, 
    TypeofFreeTextEditor | TypeofHighlightEditor | TypeofInkEditor | TypeofSignatureEditor | TypeofStampEditor
  ] = js.native
  
  @JSImport("pdfjs-dist", "AnnotationEditorLayer._initialized")
  @js.native
  def _initialized: Boolean = js.native
  inline def _initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_initialized")(x.asInstanceOf[js.Any])
}
