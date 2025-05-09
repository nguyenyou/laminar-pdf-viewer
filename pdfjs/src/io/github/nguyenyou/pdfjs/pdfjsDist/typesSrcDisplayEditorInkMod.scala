package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Opacity
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawMod.DrawingEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawMod.DrawingOptions
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersInkdrawMod.InkDrawOutliner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorInkMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkDrawingOptions")
  @js.native
  open class InkDrawingOptions protected () extends DrawingOptions {
    def this(viewerParameters: Any) = this()
    
    var _viewParameters: Any = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor")
  @js.native
  open class InkEditor protected () extends DrawingEditor {
    def this(params: Any) = this()
    
    var _drawingOptions: Any = js.native
    
    /** @inheritdoc */
    def createDrawingOptions(param0: Opacity): Unit = js.native
    
    var defaultL10nId: String = js.native
  }
  /* static members */
  object InkEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor._defaultDrawingOptions")
    @js.native
    def _defaultDrawingOptions: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _defaultDrawingOptions_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultDrawingOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor._editorType")
    @js.native
    def _editorType: Double = js.native
    inline def _editorType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_editorType")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor._type")
    @js.native
    def _type: String = js.native
    inline def _type_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_type")(x.asInstanceOf[js.Any])
    
    /** @inheritdoc */
    inline def createDrawerInstance(x: Any, y: Any, parentWidth: Any, parentHeight: Any, rotation: Any): InkDrawOutliner = (^.asInstanceOf[js.Dynamic].applyDynamic("createDrawerInstance")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], parentWidth.asInstanceOf[js.Any], parentHeight.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[InkDrawOutliner]
    
    /** @inheritdoc */
    inline def deserializeDraw(pageX: Any, pageY: Any, pageWidth: Any, pageHeight: Any, innerMargin: Any, data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeDraw")(pageX.asInstanceOf[js.Any], pageY.asInstanceOf[js.Any], pageWidth.asInstanceOf[js.Any], pageHeight.asInstanceOf[js.Any], innerMargin.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** @inheritdoc */
    inline def getDefaultDrawingOptions(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDrawingOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** @inheritdoc */
    inline def initialize(l10n: Any, uiManager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
