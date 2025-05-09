package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.NumberOfColors
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Target
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorHighlightMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor")
  @js.native
  open class HighlightEditor protected () extends AnnotationEditor {
    def this(params: Any) = this()
    
    def _moveCaret(direction: Any): Unit = js.native
    
    var color: Any = js.native
    
    var defaultL10nId: String = js.native
    
    /** @inheritdoc */
    def getRect(tx: Any, ty: Any): js.Array[Any] = js.native
    
    /** @inheritdoc */
    def onceAdded(focus: Any): Unit = js.native
    
    def pointerleave(): Unit = js.native
    
    def pointerover(): Unit = js.native
    
    /** @inheritdoc */
    def renderAnnotationElement(annotation: Any): Null = js.native
    
    /** @inheritdoc */
    def translateInPage(x: Any, y: Any): Unit = js.native
    
    /** @inheritdoc */
    def updateParams(`type`: Any, value: Any): Unit = js.native
  }
  /* static members */
  object HighlightEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def `__Numbersign24@NumbersignendHighlight`(parent: Any, event: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#24@#endHighlight")(parent.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `__Numbersign24@NumbersignhighlightMove`(parent: Any, event: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#24@#highlightMove")(parent.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `__Numbersign24@NumbersignrotateBbox`(param0: js.Tuple4[Any, Any, Any, Any], angle: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("__#24@#rotateBbox")(param0.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor._defaultColor")
    @js.native
    def _defaultColor: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _defaultColor_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultColor")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor._defaultOpacity")
    @js.native
    def _defaultOpacity: Double = js.native
    inline def _defaultOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor._defaultThickness")
    @js.native
    def _defaultThickness: Double = js.native
    inline def _defaultThickness_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultThickness")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor._editorType")
    @js.native
    def _editorType: Double = js.native
    inline def _editorType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_editorType")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor._freeHighlight")
    @js.native
    def _freeHighlight: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor._freeHighlightClipId")
    @js.native
    def _freeHighlightClipId: String = js.native
    inline def _freeHighlightClipId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_freeHighlightClipId")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor._freeHighlightId")
    @js.native
    def _freeHighlightId: Double = js.native
    inline def _freeHighlightId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_freeHighlightId")(x.asInstanceOf[js.Any])
    
    inline def _freeHighlight_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_freeHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/highlight", "HighlightEditor._type")
    @js.native
    def _type: String = js.native
    inline def _type_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_type")(x.asInstanceOf[js.Any])
    
    inline def computeTelemetryFinalData(data: Any): NumberOfColors = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTelemetryFinalData")(data.asInstanceOf[js.Any]).asInstanceOf[NumberOfColors]
    
    /** @inheritdoc */
    inline def deserialize(data: Any, parent: Any, uiManager: Any): js.Promise[AnnotationEditor | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotationEditor | Null]]
    
    /** @inheritdoc */
    inline def initialize(l10n: Any, uiManager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def startHighlighting(parent: Any, isLTR: Any, param2: Target): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startHighlighting")(parent.asInstanceOf[js.Any], isLTR.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** @inheritdoc */
    inline def updateDefaultParams(`type`: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDefaultParams")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
