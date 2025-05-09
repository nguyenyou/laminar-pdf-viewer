package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.AreContours
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.AreContoursOutline
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.HasAltText
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Thickness
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawMod.DrawingEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorSignatureMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/signature", "SignatureEditor")
  @js.native
  open class SignatureEditor protected () extends DrawingEditor {
    def this(params: Any) = this()
    
    var _drawingOptions: Any = js.native
    
    def addSignature(data: Any, heightInPage: Any, description: Any, uuid: Any): Unit = js.native
    
    /** @inheritdoc */
    def createDrawingOptions(param0: Thickness): Unit = js.native
    
    var defaultL10nId: String = js.native
    
    def description: Null = js.native
    def description_=(description: Null): Unit = js.native
    
    def getDrawnSignature(curves: Any): AreContours | Null = js.native
    
    def getFromImage(bitmap: Any): AreContours | Null = js.native
    
    def getFromText(text: Any, fontInfo: Any): AreContours | Null = js.native
    
    def getSignaturePreview(): AreContoursOutline = js.native
    
    def getUuid(): Null = js.native
    
    def setUuid(uuid: Any): Unit = js.native
  }
  /* static members */
  object SignatureEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/signature", "SignatureEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/signature", "SignatureEditor._defaultDrawingOptions")
    @js.native
    def _defaultDrawingOptions: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _defaultDrawingOptions_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultDrawingOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/signature", "SignatureEditor._editorType")
    @js.native
    def _editorType: Double = js.native
    inline def _editorType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_editorType")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/signature", "SignatureEditor._type")
    @js.native
    def _type: String = js.native
    inline def _type_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_type")(x.asInstanceOf[js.Any])
    
    inline def computeTelemetryFinalData(data: Any): HasAltText = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTelemetryFinalData")(data.asInstanceOf[js.Any]).asInstanceOf[HasAltText]
    
    /** @inheritdoc */
    inline def deserializeDraw(pageX: Any, pageY: Any, pageWidth: Any, pageHeight: Any, innerMargin: Any, data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeDraw")(pageX.asInstanceOf[js.Any], pageY.asInstanceOf[js.Any], pageWidth.asInstanceOf[js.Any], pageHeight.asInstanceOf[js.Any], innerMargin.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** @inheritdoc */
    inline def getDefaultDrawingOptions(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDrawingOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** @inheritdoc */
    inline def initialize(l10n: Any, uiManager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
