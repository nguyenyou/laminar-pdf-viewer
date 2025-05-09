package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.HasAltText
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.ImageData
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorStampMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/stamp", "StampEditor")
  @js.native
  open class StampEditor protected () extends AnnotationEditor {
    def this(params: Any) = this()
    
    def copyCanvas(maxDataDimension: Any, maxPreviewDimension: Any): ImageData = js.native
    def copyCanvas(maxDataDimension: Any, maxPreviewDimension: Any, createImageData: Boolean): ImageData = js.native
    
    var defaultL10nId: String = js.native
    
    def mlGuessAltText(): js.Promise[Any] = js.native
    def mlGuessAltText(imageData: Null, updateAltTextData: Boolean): js.Promise[Any] = js.native
    def mlGuessAltText(imageData: Unit, updateAltTextData: Boolean): js.Promise[Any] = js.native
    
    def onScaleChanging(): Unit = js.native
    
    /** @inheritdoc */
    def onceAdded(focus: Any): Unit = js.native
    
    /** @inheritdoc */
    def renderAnnotationElement(annotation: Any): Null = js.native
    
    def setCanvas(annotationElementId: Any, canvas: Any): Unit = js.native
  }
  /* static members */
  object StampEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/stamp", "StampEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/stamp", "StampEditor._editorType")
    @js.native
    def _editorType: Double = js.native
    inline def _editorType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_editorType")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/stamp", "StampEditor._type")
    @js.native
    def _type: String = js.native
    inline def _type_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_type")(x.asInstanceOf[js.Any])
    
    inline def computeTelemetryFinalData(data: Any): HasAltText = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTelemetryFinalData")(data.asInstanceOf[js.Any]).asInstanceOf[HasAltText]
    
    /** @inheritdoc */
    inline def deserialize(data: Any, parent: Any, uiManager: Any): js.Promise[AnnotationEditor | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotationEditor | Null]]
    
    /** @inheritdoc */
    inline def initialize(l10n: Any, uiManager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** @inheritdoc */
    inline def isHandlingMimeForPasting(mime: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandlingMimeForPasting")(mime.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** @inheritdoc */
    inline def paste(item: Any, parent: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(item.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
