package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Root
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorDrawMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor")
  @js.native
  open class DrawingEditor protected () extends AnnotationEditor {
    def this(params: Any) = this()
    
    def _addOutlines(params: Any): Unit = js.native
    
    var _drawId: Null = js.native
    
    /** @inheritdoc */
    def _onTranslated(): Unit = js.native
    
    /** @inheritdoc */
    def _onTranslating(_x: Any, _y: Any): Unit = js.native
    
    /**
      * Update a property and make this action undoable.
      * @param {string} color
      */
    def _updateProperty(`type`: Any, name: Any, value: Any): Unit = js.native
    
    /**
      * Create the drawing options.
      * @param {Object} _data
      */
    def createDrawingOptions(_data: js.Object): Unit = js.native
    
    def onScaleChanging(): Unit = js.native
    
    /** @inheritdoc */
    def onceAdded(focus: Any): Unit = js.native
    
    /** @inheritdoc */
    def renderAnnotationElement(annotation: Any): Null = js.native
    
    /** @inheritdoc */
    def rotate(): Unit = js.native
    
    def serializeDraw(isForCopying: Any): Any = js.native
    
    /** @inheritdoc */
    def updateParams(`type`: Any, value: Any): Unit = js.native
  }
  /* static members */
  object DrawingEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor._INNER_MARGIN")
    @js.native
    def _INNER_MARGIN: Double = js.native
    inline def _INNER_MARGIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_INNER_MARGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor.__#26@#currentDraw")
    @js.native
    val `__Numbersign26@NumbersigncurrentDraw`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor.__#26@#currentDrawingAC")
    @js.native
    val `__Numbersign26@NumbersigncurrentDrawingAC`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor.__#26@#currentDrawingOptions")
    @js.native
    val `__Numbersign26@NumbersigncurrentDrawingOptions`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor.__#26@#currentMoveTimestamp")
    @js.native
    val `__Numbersign26@NumbersigncurrentMoveTimestamp`: Double = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor.__#26@#currentPointerId")
    @js.native
    val `__Numbersign26@NumbersigncurrentPointerId`: Double = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor.__#26@#currentPointerIds")
    @js.native
    val `__Numbersign26@NumbersigncurrentPointerIds`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor.__#26@#currentPointerType")
    @js.native
    val `__Numbersign26@NumbersigncurrentPointerType`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    inline def _cleanup(all: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_cleanup")(all.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor._currentDrawId")
    @js.native
    def _currentDrawId: Double = js.native
    inline def _currentDrawId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_currentDrawId")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingEditor._currentParent")
    @js.native
    def _currentParent: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _currentParent_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_currentParent")(x.asInstanceOf[js.Any])
    
    inline def _drawMove(event: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drawMove")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def _endDraw(event: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDraw")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def _mergeSVGProperties(p1: Any, p2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_mergeSVGProperties")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Create a new drawer instance.
      * @param {number} x - The x coordinate of the event.
      * @param {number} y - The y coordinate of the event.
      * @param {number} parentWidth - The parent width.
      * @param {number} parentHeight - The parent height.
      * @param {number} rotation - The parent rotation.
      */
    inline def createDrawerInstance(_x: Any, _y: Any, _parentWidth: Any, _parentHeight: Any, _rotation: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createDrawerInstance")(_x.asInstanceOf[js.Any], _y.asInstanceOf[js.Any], _parentWidth.asInstanceOf[js.Any], _parentHeight.asInstanceOf[js.Any], _rotation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** @inheritdoc */
    inline def deserialize(data: Any, parent: Any, uiManager: Any): js.Promise[AnnotationEditor | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotationEditor | Null]]
    
    /**
      * Deserialize the drawing outlines.
      * @param {number} pageX - The x coordinate of the page.
      * @param {number} pageY - The y coordinate of the page.
      * @param {number} pageWidth - The width of the page.
      * @param {number} pageHeight - The height of the page.
      * @param {number} innerWidth - The inner width.
      * @param {Object} data - The data to deserialize.
      * @returns {Object} The deserialized outlines.
      */
    inline def deserializeDraw(_pageX: Any, _pageY: Any, _pageWidth: Any, _pageHeight: Any, _innerWidth: Any, _data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeDraw")(_pageX.asInstanceOf[js.Any], _pageY.asInstanceOf[js.Any], _pageWidth.asInstanceOf[js.Any], _pageHeight.asInstanceOf[js.Any], _innerWidth.asInstanceOf[js.Any], _data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def endDrawing(isAborted: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("endDrawing")(isAborted.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * @param {Object} options
      * @return {DrawingOptions} the default options to use for a new editor.
      */
    inline def getDefaultDrawingOptions(_options: Any): DrawingOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDrawingOptions")(_options.asInstanceOf[js.Any]).asInstanceOf[DrawingOptions]
    
    inline def onScaleChangingWhenDrawing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onScaleChangingWhenDrawing")().asInstanceOf[Unit]
    
    inline def startDrawing(parent: Any, uiManager: Any, _isLTR: Any, event: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrawing")(parent.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any], _isLTR.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** @inheritdoc */
    inline def updateDefaultParams(`type`: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDefaultParams")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/draw", "DrawingOptions")
  @js.native
  open class DrawingOptions () extends StObject {
    
    /* private */ var `private`: Any = js.native
    
    def reset(): Unit = js.native
    
    def toSVGProperties(): Root = js.native
    
    def updateAll(): Unit = js.native
    def updateAll(options: this.type): Unit = js.native
    
    def updateProperties(properties: Any): Unit = js.native
    
    def updateProperty(name: Any, value: Any): Unit = js.native
    
    def updateSVGProperty(name: Any, value: Any): Unit = js.native
  }
}
