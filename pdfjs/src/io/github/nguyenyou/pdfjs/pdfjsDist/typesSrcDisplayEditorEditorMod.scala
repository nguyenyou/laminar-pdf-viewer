package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorToolbarMod.EditorToolbar
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorToolsMod.AnnotationEditorUIManager
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorToolsMod.ColorManager
import io.github.nguyenyou.pdfjs.std.DataTransferItem
import org.scalajs.dom.DOMRect
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorEditorMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor")
  @js.native
  open class AnnotationEditor protected () extends StObject {
    /**
      * @param {AnnotationEditorParameters} parameters
      */
    def this(parameters: AnnotationEditorParameters) = this()
    
    var _editToolbar: Null = js.native
    
    var _focusEventsAllowed: Boolean = js.native
    
    def _hasBeenMoved: Boolean = js.native
    
    def _hasBeenResized: Boolean = js.native
    
    var _initialData: Null = js.native
    
    var _initialOptions: Any = js.native
    
    var _isCopy: Boolean = js.native
    
    def _isDraggable: Boolean = js.native
    def _isDraggable_=(value: Boolean): Unit = js.native
    
    var _isVisible: Boolean = js.native
    
    def _moveAfterPaste(baseX: Any, baseY: Any): Unit = js.native
    
    /**
      * @returns {boolean} true if position must be fixed (i.e. make the x and y
      * living in the page).
      */
    def _mustFixPosition: Boolean = js.native
    
    /**
      * Called when the editor has been resized.
      */
    def _onResized(): Unit = js.native
    
    /**
      * Called when the editor is being resized.
      */
    def _onResizing(): Unit = js.native
    
    def _onStartDragging(): Unit = js.native
    
    def _onStopDragging(): Unit = js.native
    
    /**
      * Called when the editor has been translated.
      * @param {number} x - in page coordinates.
      * @param {number} y - in page coordinates.
      */
    def _onTranslated(x: Double, y: Double): Unit = js.native
    
    /**
      * Called when the editor is being translated.
      * @param {number} x - in page coordinates.
      * @param {number} y - in page coordinates.
      */
    def _onTranslating(x: Double, y: Double): Unit = js.native
    
    def _reportTelemetry(data: Any): Unit = js.native
    def _reportTelemetry(data: Any, mustWait: Boolean): Unit = js.native
    
    def _resizeWithKeyboard(x: Any, y: Any): Unit = js.native
    
    def _setParentAndPosition(parent: Any, x: Any, y: Any): Unit = js.native
    
    def _stopResizingWithKeyboard(): Unit = js.native
    
    var _structTreeParentId: Any = js.native
    
    var _uiManager: Null = js.native
    
    var _willKeepAspectRatio: Boolean = js.native
    
    def addAltTextButton(): js.Promise[Unit] = js.native
    
    /**
      * Add some commands into the CommandManager (undo/redo stuff).
      * @param {Object} params
      */
    def addCommands(params: js.Object): Unit = js.native
    
    def addContainer(container: Any): Unit = js.native
    
    /**
      * Add a toolbar for this editor.
      * @returns {Promise<EditorToolbar|null>}
      */
    def addEditToolbar(): js.Promise[EditorToolbar | Null] = js.native
    
    def addToAnnotationStorage(): Unit = js.native
    
    def altTextData: Any = js.native
    /**
      * Set the alt text data.
      */
    def altTextData_=(data: Any): Unit = js.native
    
    /**
      * Called when the alt text dialog is closed.
      */
    def altTextFinish(): Unit = js.native
    
    var annotationElementId: Any = js.native
    
    def center(): Unit = js.native
    
    /**
      * Commit the data contained in this editor.
      */
    def commit(): Unit = js.native
    
    def commitOrRemove(): Unit = js.native
    
    /**
      * Get the div which really contains the displayed content.
      * @returns {HTMLDivElement | undefined}
      */
    def contentDiv: js.UndefOr[HTMLDivElement] = js.native
    
    def currentLayer: Any = js.native
    
    var deleted: Boolean = js.native
    
    def disable(): Unit = js.native
    
    /**
      * Disable edit mode.
      */
    def disableEditMode(): Unit = js.native
    
    /**
      * When the user disables the editing mode some editors can change some of
      * their properties.
      */
    def disableEditing(): Unit = js.native
    
    var div: HTMLDivElement | Null = js.native
    
    def drag(tx: Any, ty: Any): Unit = js.native
    
    def editorType: Any = js.native
    
    def enable(): Unit = js.native
    
    /**
      * Enable edit mode.
      */
    def enableEditMode(): Unit = js.native
    
    /**
      * When the user enables the editing mode some editors can change some of
      * their properties.
      */
    def enableEditing(): Unit = js.native
    
    /**
      * The editor is about to be edited.
      */
    def enterInEditMode(): Unit = js.native
    
    /**
      * Fix the position of the editor in order to keep it inside its parent page.
      * @param {number} [rotation] - the rotation of the page.
      */
    def fixAndSetPosition(): Unit = js.native
    def fixAndSetPosition(rotation: Double): Unit = js.native
    
    def fixDims(): Unit = js.native
    
    /**
      * onfocus callback.
      */
    def focusin(event: Any): Unit = js.native
    
    /**
      * onblur callback.
      * @param {FocusEvent} event
      */
    def focusout(event: FocusEvent): Unit = js.native
    
    /**
      * Get the translation to take into account the editor border.
      * The CSS engine positions the element by taking the border into account so
      * we must apply the opposite translation to have the editor in the right
      * position.
      * @returns {Array<number>}
      */
    def getBaseTranslation(): js.Array[Double] = js.native
    
    def getClientDimensions(): DOMRect = js.native
    
    /**
      * @returns {HTMLElement | null} the element requiring an alt text.
      */
    def getElementForAltText(): HTMLElement | Null = js.native
    
    /**
      * Get the translation used to position this editor when it's created.
      * @returns {Array<number>}
      */
    def getInitialTranslation(): js.Array[Double] = js.native
    
    /**
      * Convert the current rect into a page one.
      * @param {number} tx - x-translation in screen coordinates.
      * @param {number} ty - y-translation in screen coordinates.
      * @param {number} [rotation] - the rotation of the page.
      */
    def getRect(tx: Double, ty: Double): js.Array[Any] = js.native
    def getRect(tx: Double, ty: Double, rotation: Double): js.Array[Any] = js.native
    
    def getRectInCurrentCoords(rect: Any, pageHeight: Any): js.Array[Any] = js.native
    
    def guessedAltText: Any = js.native
    
    def hasAltText(): Boolean = js.native
    
    def hasAltTextData(): Any = js.native
    
    /**
      * Check if an existing annotation associated with this editor has been
      * modified.
      * @returns {boolean}
      */
    def hasBeenModified: Boolean = js.native
    
    var height: Any = js.native
    
    var id: String = js.native
    
    var isAttachedToDOM: Boolean = js.native
    
    /**
      * If true then the editor is currently edited.
      * @type {boolean}
      */
    def isEditing: Boolean = js.native
    /**
      * When set to true, it means that this editor is currently edited.
      * @param {boolean} value
      */
    def isEditing_=(value: Boolean): Unit = js.native
    
    /**
      * Check if the editor contains something.
      * @returns {boolean}
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @returns {boolean} true if the editor handles the Enter key itself.
      */
    def isEnterHandled: Boolean = js.native
    
    /**
      * Check if the editor is edited.
      * @returns {boolean}
      */
    def isInEditMode(): Boolean = js.native
    
    def isOnScreen: Boolean = js.native
    
    /**
      * @returns {boolean} true if this editor can be resized.
      */
    def isResizable: Boolean = js.native
    
    def isSelected: Any = js.native
    
    /**
      * onkeydown callback.
      * @param {KeyboardEvent} event
      */
    def keydown(event: KeyboardEvent): Unit = js.native
    
    /**
      * Add the resizers to this editor.
      */
    def makeResizable(): Unit = js.native
    
    def moveInDOM(): Unit = js.native
    
    var name: Any = js.native
    
    /**
      * Check if this editor needs to be rebuilt or not.
      * @returns {boolean}
      */
    def needsToBeRebuilt(): Boolean = js.native
    
    /**
      * Executed once this editor has been rendered.
      * @param {boolean} focus - true if the editor should be focused.
      */
    def onceAdded(focus: Boolean): Unit = js.native
    
    var pageDimensions: js.Array[Any] = js.native
    
    var pageIndex: Double = js.native
    
    var pageRotation: Double = js.native
    
    var pageTranslation: js.Array[Any] = js.native
    
    /**
      * Convert a page translation into a screen one.
      * @param {number} x
      * @param {number} y
      */
    def pageTranslationToScreen(x: Double, y: Double): js.Array[Any] = js.native
    
    var parent: io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer = js.native
    
    def parentDimensions: js.Array[Double] = js.native
    
    def parentRotation: Double = js.native
    
    def parentScale: Any = js.native
    
    /**
      * Onpointerdown callback.
      * @param {PointerEvent} event
      */
    def pointerdown(event: PointerEvent): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Get the properties to update in the UI for this editor.
      * @returns {Array}
      */
    def propertiesToUpdate: js.Array[Any] = js.native
    
    /**
      * Rebuild the editor in case it has been removed on undo.
      *
      * To implement in subclasses.
      */
    def rebuild(): Unit = js.native
    
    /**
      * Remove this editor.
      * It's used on ctrl+backspace action.
      */
    def remove(): Unit = js.native
    
    def removeEditToolbar(): Unit = js.native
    
    /**
      * Render this editor in a div.
      * @returns {HTMLDivElement | null}
      */
    def render(): HTMLDivElement | Null = js.native
    
    /**
      * Render an annotation in the annotation layer.
      * @param {Object} annotation
      * @returns {HTMLElement|null}
      */
    def renderAnnotationElement(annotation: js.Object): HTMLElement | Null = js.native
    
    def resetAnnotationElement(annotation: Any): Unit = js.native
    
    /**
      * Resize the editor when the page is resized.
      */
    def resize(): Unit = js.native
    
    /**
      * Rotate the editor when the page is rotated.
      * @param {number} angle
      */
    def rotate(_angle: Any): Unit = js.native
    
    var rotation: Double = js.native
    
    /**
      * Convert a screen translation into a page one.
      * @param {number} x
      * @param {number} y
      */
    def screenToPageTranslation(x: Double, y: Double): js.Array[Any] = js.native
    
    /**
      * Select this editor.
      */
    def select(): Unit = js.native
    
    /**
      * Serialize the editor.
      * The result of the serialization will be used to construct a
      * new annotation to add to the pdf document.
      *
      * To implement in subclasses.
      * @param {boolean} [isForCopying]
      * @param {Object | null} [context]
      * @returns {Object | null}
      */
    def serialize(): js.Object | Null = js.native
    def serialize(isForCopying: Boolean): js.Object | Null = js.native
    def serialize(isForCopying: Boolean, context: js.Object): js.Object | Null = js.native
    def serialize(isForCopying: Unit, context: js.Object): js.Object | Null = js.native
    
    def serializeAltText(isForCopying: Any): Any = js.native
    
    /**
      * Serialize the editor when it has been deleted.
      * @returns {Object}
      */
    def serializeDeleted(): js.Object = js.native
    
    /**
      * Set the aspect ratio to use when resizing.
      * @param {number} width
      * @param {number} height
      */
    def setAspectRatio(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the editor position within its parent.
      * @param {number} x
      * @param {number} y
      * @param {number} tx - x-translation in screen coordinates.
      * @param {number} ty - y-translation in screen coordinates.
      */
    def setAt(x: Double, y: Double, tx: Double, ty: Double): Unit = js.native
    
    /**
      * Set the dimensions of this editor.
      * @param {number} width
      * @param {number} height
      */
    def setDims(width: Double, height: Double): Unit = js.native
    
    def setGuessedAltText(text: Any): js.Promise[Unit] = js.native
    
    /**
      * This editor will be behind the others.
      */
    def setInBackground(): Unit = js.native
    
    /**
      * This editor will be in the foreground.
      */
    def setInForeground(): Unit = js.native
    
    def setParent(parent: Any): Unit = js.native
    
    /**
      * If it returns true, then this editor handles the keyboard
      * events itself.
      * @returns {boolean}
      */
    def shouldGetKeyboardEvents(): Boolean = js.native
    
    /**
      * Show or hide this editor.
      * @param {boolean|undefined} visible
      */
    def show(): Unit = js.native
    def show(visible: Boolean): Unit = js.native
    
    /**
      * The telemetry data to use when saving/printing.
      * @returns {Object|null}
      */
    def telemetryFinalData: js.Object | Null = js.native
    
    /**
      * Get the data to report to the telemetry when the editor is added.
      * @returns {Object}
      */
    def telemetryInitialData: js.Object = js.native
    
    def toolbarPosition: Null = js.native
    
    /**
      * Translate the editor position within its parent.
      * @param {number} x - x-translation in screen coordinates.
      * @param {number} y - y-translation in screen coordinates.
      */
    def translate(x: Double, y: Double): Unit = js.native
    
    /**
      * Translate the editor position within its page and adjust the scroll
      * in order to have the editor in the view.
      * @param {number} x - x-translation in page coordinates.
      * @param {number} y - y-translation in page coordinates.
      */
    def translateInPage(x: Double, y: Double): Unit = js.native
    
    def translationDone(): Unit = js.native
    
    /**
      * Unselect this editor.
      */
    def unselect(): Unit = js.native
    
    /**
      * Update some parameters which have been changed through the UI.
      * @param {number} type
      * @param {*} value
      */
    def updateParams(`type`: Double, value: Any): Unit = js.native
    
    var width: Any = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object AnnotationEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def `__Numbersign42@NumbersignrotatePoint`(x: Any, y: Any, angle: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("__#42@#rotatePoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor._borderLineWidth")
    @js.native
    def _borderLineWidth: Double = js.native
    inline def _borderLineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_borderLineWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor._colorManager")
    @js.native
    def _colorManager: ColorManager = js.native
    inline def _colorManager_=(x: ColorManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_colorManager")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor._l10n")
    @js.native
    def _l10n: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor._l10nResizer")
    @js.native
    def _l10nResizer: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _l10nResizer_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_l10nResizer")(x.asInstanceOf[js.Any])
    
    inline def _l10n_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_l10n")(x.asInstanceOf[js.Any])
    
    inline def _round(x: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_round")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor._telemetryTimeout")
    @js.native
    def _telemetryTimeout: Double = js.native
    inline def _telemetryTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_telemetryTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor._zIndex")
    @js.native
    def _zIndex: Double = js.native
    inline def _zIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_zIndex")(x.asInstanceOf[js.Any])
    
    inline def canCreateNewEmptyEditor(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateNewEmptyEditor")().asInstanceOf[Boolean]
    
    inline def deleteAnnotationElement(editor: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAnnotationElement")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Deserialize the editor.
      * The result of the deserialization is a new editor.
      *
      * @param {Object} data
      * @param {AnnotationEditorLayer} parent
      * @param {AnnotationEditorUIManager} uiManager
      * @returns {Promise<AnnotationEditor | null>}
      */
    inline def deserialize(data: js.Object, parent: AnnotationEditorLayer, uiManager: AnnotationEditorUIManager): js.Promise[AnnotationEditor | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotationEditor | Null]]
    
    /**
      * Initialize the l10n stuff for this type of editor.
      * @param {Object} l10n
      */
    inline def initialize(l10n: js.Object, _uiManager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any], _uiManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Check if this kind of editor is able to handle the given mime type for
      * pasting.
      * @param {string} mime
      * @returns {boolean}
      */
    inline def isHandlingMimeForPasting(mime: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandlingMimeForPasting")(mime.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Extract the data from the clipboard item and delegate the creation of the
      * editor to the parent.
      * @param {DataTransferItem} item
      * @param {AnnotationEditorLayer} parent
      */
    inline def paste(item: DataTransferItem, parent: AnnotationEditorLayer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(item.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Update the default parameters for this type of editor.
      * @param {number} _type
      * @param {*} _value
      */
    inline def updateDefaultParams(_type: Double, _value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDefaultParams")(_type.asInstanceOf[js.Any], _value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type AnnotationEditorLayer = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer
  
  trait AnnotationEditorParameters extends StObject {
    
    /**
      * - editor id
      */
    var id: String
    
    /**
      * - the layer containing this editor
      */
    var parent: AnnotationEditorLayer
    
    /**
      * - the global manager
      */
    var uiManager: AnnotationEditorUIManager
    
    /**
      * - x-coordinate
      */
    var x: Double
    
    /**
      * - y-coordinate
      */
    var y: Double
  }
  object AnnotationEditorParameters {
    
    inline def apply(
      id: String,
      parent: AnnotationEditorLayer,
      uiManager: AnnotationEditorUIManager,
      x: Double,
      y: Double
    ): AnnotationEditorParameters = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], uiManager = uiManager.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationEditorParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationEditorParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParent(value: AnnotationEditorLayer): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setUiManager(value: AnnotationEditorUIManager): Self = StObject.set(x, "uiManager", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
