package io.github.nguyenyou.pdfjs.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist", "AnnotationEditorUIManager")
@js.native
open class AnnotationEditorUIManager protected ()
  extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorToolsMod.AnnotationEditorUIManager {
  def this(
    container: Any,
    viewer: Any,
    altTextManager: Any,
    signatureManager: Any,
    eventBus: Any,
    pdfDocument: Any,
    pageColors: Any,
    highlightColors: Any,
    enableHighlightFloatingButton: Any,
    enableUpdatedAddImage: Any,
    enableNewAltTextWhenAddingImage: Any,
    mlManager: Any,
    editorUndoBar: Any,
    supportsPinchToZoom: Any
  ) = this()
}
/* static members */
object AnnotationEditorUIManager {
  
  @JSImport("pdfjs-dist", "AnnotationEditorUIManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist", "AnnotationEditorUIManager.TRANSLATE_BIG")
  @js.native
  def TRANSLATE_BIG: Double = js.native
  inline def TRANSLATE_BIG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSLATE_BIG")(x.asInstanceOf[js.Any])
  
  @JSImport("pdfjs-dist", "AnnotationEditorUIManager.TRANSLATE_SMALL")
  @js.native
  def TRANSLATE_SMALL: Double = js.native
  inline def TRANSLATE_SMALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSLATE_SMALL")(x.asInstanceOf[js.Any])
}
