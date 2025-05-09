package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.AnnotationElementId
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.AnnotationElementIdAny
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Cmd
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.NameAny
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PageNumber
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PagesRotation
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.RealScale
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Scale
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Value
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Width
import io.github.nguyenyou.pdfjs.std.Map
import io.github.nguyenyou.pdfjs.std.Set
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorToolsMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", "AnnotationEditorUIManager")
  @js.native
  open class AnnotationEditorUIManager protected () extends StObject {
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
    
    var _editorUndoBar: Null = js.native
    
    var _eventBus: Any = js.native
    
    var _signal: AbortSignal = js.native
    
    var _supportsPinchToZoom: Boolean = js.native
    
    def addChangedExistingAnnotation(param0: AnnotationElementId): Unit = js.native
    
    /**
      * Add a command to execute (cmd) and another one to undo it.
      * @param {Object} params
      */
    def addCommands(params: js.Object): Unit = js.native
    
    /**
      * The annotation element with the given id has been deleted.
      * @param {AnnotationEditor} editor
      */
    def addDeletedAnnotationElement(editor: AnnotationEditor): Unit = js.native
    
    def addEditListeners(): Unit = js.native
    
    /**
      * Add a new editor.
      * @param {AnnotationEditor} editor
      */
    def addEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add a new layer for a page which will contains the editors.
      * @param {AnnotationEditorLayer} layer
      */
    def addLayer(layer: AnnotationEditorLayer): Unit = js.native
    
    def addMissingCanvas(annotationId: Any, editor: Any): Unit = js.native
    
    def addNewEditorFromKeyboard(): Unit = js.native
    
    def addShouldRescale(editor: Any): Unit = js.native
    
    /**
      * Add an editor in the annotation storage.
      * @param {AnnotationEditor} editor
      */
    def addToAnnotationStorage(editor: AnnotationEditor): Unit = js.native
    
    def blur(): Unit = js.native
    
    def cleanUndoStack(`type`: Any): Unit = js.native
    
    def combinedSignal(ac: Any): AbortSignal = js.native
    
    def commitOrRemove(): Unit = js.native
    
    /**
      * Copy callback.
      * @param {ClipboardEvent} event
      */
    def copy(event: ClipboardEvent): Unit = js.native
    
    def currentLayer: Any = js.native
    
    def currentPageIndex: Double = js.native
    
    /**
      * Cut callback.
      * @param {ClipboardEvent} event
      */
    def cut(event: ClipboardEvent): Unit = js.native
    
    /**
      * Delete the current editor or all.
      */
    def delete(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def direction: Any = js.native
    
    def disableUserSelect(): Unit = js.native
    def disableUserSelect(value: Boolean): Unit = js.native
    
    def dragOver(event: Any): Unit = js.native
    
    /**
      * Drag the set of selected editors.
      * @param {number} tx
      * @param {number} ty
      */
    def dragSelectedEditors(tx: Double, ty: Double): Unit = js.native
    
    /**
      * Drop callback.
      * @param {DragEvent} event
      */
    def drop(event: DragEvent): Unit = js.native
    
    def editAltText(editor: Any): Unit = js.native
    def editAltText(editor: Any, firstTime: Boolean): Unit = js.native
    
    def enableWaiting(): Unit = js.native
    def enableWaiting(mustWait: Boolean): Unit = js.native
    
    /**
      * Ends the drag session.
      * @returns {boolean} true if at least one editor has been moved.
      */
    def endDragSession(): Boolean = js.native
    
    def findParent(x: Any, y: Any): Any = js.native
    
    def firstSelectedEditor: Any = js.native
    
    def focus(): Unit = js.native
    
    def focusMainContainer(): Unit = js.native
    
    /**
      * Get the current active editor.
      * @returns {AnnotationEditor|null}
      */
    def getActive(): AnnotationEditor | Null = js.native
    
    /**
      * Get an editor with the given id.
      * @param {string} id
      * @returns {AnnotationEditor}
      */
    def getEditor(id: String): AnnotationEditor = js.native
    
    /**
      * Get all the editors belonging to a given page.
      * @param {number} pageIndex
      * @returns {Array<AnnotationEditor>}
      */
    def getEditors(pageIndex: Double): js.Array[AnnotationEditor] = js.native
    
    /**
      * Get an id.
      * @returns {string}
      */
    def getId(): String = js.native
    
    def getLayer(pageIndex: Any): Any = js.native
    
    /**
      * Get the current editor mode.
      * @returns {number}
      */
    def getMode(): Double = js.native
    
    def getSelectionBoxes(textLayer: Any): js.Array[Width] | Null = js.native
    
    def getSignature(editor: Any): Unit = js.native
    
    def hasSelection: Boolean = js.native
    
    def hasSomethingToControl(): Boolean = js.native
    
    def hcmFilter: Any = js.native
    
    def highlightColorNames: Any = js.native
    
    def highlightColors: Any = js.native
    
    def highlightSelection(): Unit = js.native
    def highlightSelection(methodOfCreation: String): Unit = js.native
    
    def imageManager: Any = js.native
    
    /**
      * Is the current editor the one passed as argument?
      * @param {AnnotationEditor} editor
      * @returns
      */
    def isActive(editor: AnnotationEditor): /* is never */ Boolean = js.native
    
    /**
      * Check if the annotation element with the given id has been deleted.
      * @param {string} annotationElementId
      * @returns {boolean}
      */
    def isDeletedAnnotationElement(annotationElementId: String): Boolean = js.native
    
    def isEditorHandlingKeyboard: Any = js.native
    
    def isEnterHandled: Any = js.native
    
    /**
      * Check if the editor is selected.
      * @param {AnnotationEditor} editor
      */
    def isSelected(editor: AnnotationEditor): Boolean = js.native
    
    var isShiftKeyDown: Boolean = js.native
    
    /**
      * Keydown callback.
      * @param {KeyboardEvent} event
      */
    def keydown(event: KeyboardEvent): Unit = js.native
    
    /**
      * Keyup callback.
      * @param {KeyboardEvent} event
      */
    def keyup(event: KeyboardEvent): Unit = js.native
    
    def mlManager: Null = js.native
    
    /**
      * Execute an action for a given name.
      * For example, the user can click on the "Undo" entry in the context menu
      * and it'll trigger the undo action.
      */
    def onEditingAction(param0: NameAny): Unit = js.native
    
    def onPageChanging(param0: PageNumber): Unit = js.native
    
    def onRotationChanging(param0: PagesRotation): Unit = js.native
    
    def onScaleChanging(param0: Scale): Unit = js.native
    
    def onSetPreference(param0: Value): Unit = js.native
    
    /**
      * Paste callback.
      * @param {ClipboardEvent} event
      */
    def paste(event: ClipboardEvent): js.Promise[Unit] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Rebuild the editor (usually on undo/redo actions) on a potentially
      * non-rendered page.
      * @param {AnnotationEditor} editor
      */
    def rebuild(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Redo the last undoed command.
      */
    def redo(): Unit = js.native
    
    def registerEditorTypes(types: Any): Unit = js.native
    
    def removeChangedExistingAnnotation(param0: AnnotationElementIdAny): Unit = js.native
    
    /**
      * The annotation element with the given id have been restored.
      * @param {AnnotationEditor} editor
      */
    def removeDeletedAnnotationElement(editor: AnnotationEditor): Unit = js.native
    
    def removeEditListeners(): Unit = js.native
    
    /**
      * Remove an editor.
      * @param {AnnotationEditor} editor
      */
    def removeEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Remove a layer.
      * @param {AnnotationEditorLayer} layer
      */
    def removeLayer(layer: AnnotationEditorLayer): Unit = js.native
    
    def removeShouldRescale(editor: Any): Unit = js.native
    
    def renderAnnotationElement(annotation: Any): Unit = js.native
    
    /**
      * Select all the editors.
      */
    def selectAll(): Unit = js.native
    
    /**
      * Set the given editor as the active one.
      * @param {AnnotationEditor} editor
      */
    def setActiveEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Set the current drawing session.
      * @param {AnnotationEditorLayer} layer
      */
    def setCurrentDrawingSession(layer: AnnotationEditorLayer): Unit = js.native
    
    /**
      * Set the editing state.
      * It can be useful to temporarily disable it when the user is editing a
      * FreeText annotation.
      * @param {boolean} isEditing
      */
    def setEditingState(isEditing: Boolean): Unit = js.native
    
    def setMainHighlightColorPicker(colorPicker: Any): Unit = js.native
    
    def setMissingCanvas(annotationId: Any, annotationElementId: Any, canvas: Any): Unit = js.native
    
    def setPreference(name: Any, value: Any): Unit = js.native
    
    /**
      * Set the last selected editor.
      * @param {AnnotationEditor} editor
      */
    def setSelected(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Set up the drag session for moving the selected editors.
      */
    def setUpDragSession(): Unit = js.native
    
    def showAllEditors(`type`: Any, visible: Any): Unit = js.native
    def showAllEditors(`type`: Any, visible: Any, updateButton: Boolean): Unit = js.native
    
    def signatureManager: Null = js.native
    
    def switchToMode(mode: Any, callback: Any): Unit = js.native
    
    /**
      * Add or remove an editor the current selection.
      * @param {AnnotationEditor} editor
      */
    def toggleSelected(editor: AnnotationEditor): Unit = js.native
    
    def translateSelectedEditors(x: Any, y: Any): Unit = js.native
    def translateSelectedEditors(x: Any, y: Any, noCommit: Boolean): Unit = js.native
    
    /**
      * Undo the last command.
      */
    def undo(): Unit = js.native
    
    /**
      * Unselect an editor.
      * @param {AnnotationEditor} editor
      */
    def unselect(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Unselect all the selected editors.
      */
    def unselectAll(): Unit = js.native
    
    /**
      * Change the editor mode (None, FreeText, Ink, ...)
      * @param {number} mode
      * @param {string|null} editId
      * @param {boolean} [isFromKeyboard] - true if the mode change is due to a
      *   keyboard action.
      */
    def updateMode(mode: Double): js.Promise[Unit] = js.native
    def updateMode(mode: Double, editId: String): js.Promise[Unit] = js.native
    def updateMode(mode: Double, editId: String, isFromKeyboard: Boolean): js.Promise[Unit] = js.native
    def updateMode(mode: Double, editId: Null, isFromKeyboard: Boolean): js.Promise[Unit] = js.native
    def updateMode(mode: Double, editId: Unit, isFromKeyboard: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Update a parameter in the current editor or globally.
      * @param {number} type
      * @param {*} value
      */
    def updateParams(`type`: Double, value: Any): Unit = js.native
    
    /**
      * Update the toolbar if it's required to reflect the tool currently used.
      * @param {number} mode
      * @returns {undefined}
      */
    def updateToolbar(mode: Double): Unit = js.native
    
    /**
      * Update the UI of the active editor.
      * @param {AnnotationEditor} editor
      */
    def updateUI(editor: AnnotationEditor): Unit = js.native
    
    def updateUIForDefaultProperties(editorType: Any): Unit = js.native
    
    def useNewAltTextFlow: Boolean = js.native
    
    def useNewAltTextWhenAddingImage: Boolean = js.native
    
    var viewParameters: RealScale = js.native
  }
  /* static members */
  object AnnotationEditorUIManager {
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "AnnotationEditorUIManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "AnnotationEditorUIManager.TRANSLATE_BIG")
    @js.native
    def TRANSLATE_BIG: Double = js.native
    inline def TRANSLATE_BIG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSLATE_BIG")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "AnnotationEditorUIManager.TRANSLATE_SMALL")
    @js.native
    def TRANSLATE_SMALL: Double = js.native
    inline def TRANSLATE_SMALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSLATE_SMALL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", "ColorManager")
  @js.native
  open class ColorManager () extends StObject {
    
    def _colors: Any = js.native
    
    /**
      * In High Contrast Mode, the color on the screen is not always the
      * real color used in the pdf.
      * For example in some cases white can appear to be black but when saving
      * we want to have white.
      * @param {string} color
      * @returns {Array<number>}
      */
    def convert(color: String): js.Array[Double] = js.native
    
    /**
      * An input element must have its color value as a hex string
      * and not as color name.
      * So this function converts a name into an hex string.
      * @param {string} name
      * @returns {string}
      */
    def getHexCode(name: String): String = js.native
  }
  /* static members */
  object ColorManager {
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "ColorManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "ColorManager._colorsMapping")
    @js.native
    def _colorsMapping: Map[String, js.Array[Double]] = js.native
    inline def _colorsMapping_=(x: Map[String, js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_colorsMapping")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", "CommandManager")
  @js.native
  open class CommandManager () extends StObject {
    def this(maxSize: Double) = this()
    
    /**
      * @typedef {Object} addOptions
      * @property {function} cmd
      * @property {function} undo
      * @property {function} [post]
      * @property {boolean} mustExec
      * @property {number} type
      * @property {boolean} overwriteIfSameType
      * @property {boolean} keepUndo
      */
    /**
      * Add a new couple of commands to be used in case of redo/undo.
      * @param {addOptions} options
      */
    def add(param0: Cmd): Unit = js.native
    
    def cleanType(`type`: Any): Unit = js.native
    
    def destroy(): Unit = js.native
    
    /**
      * Check if there is something to redo.
      * @returns {boolean}
      */
    def hasSomethingToRedo(): Boolean = js.native
    
    /**
      * Check if there is something to undo.
      * @returns {boolean}
      */
    def hasSomethingToUndo(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Redo the last command.
      */
    def redo(): Unit = js.native
    
    /**
      * Undo the last command.
      */
    def undo(): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", "KeyboardManager")
  @js.native
  open class KeyboardManager protected () extends StObject {
    /**
      * Create a new keyboard manager class.
      * @param {Array<Array>} callbacks - an array containing an array of shortcuts
      * and a callback to call.
      * A shortcut is a string like `ctrl+c` or `mac+ctrl+c` for mac OS.
      */
    def this(callbacks: js.Array[js.Array[Any]]) = this()
    
    var allKeys: Set[Any] = js.native
    
    var buffer: js.Array[Any] = js.native
    
    var callbacks: Map[Any, Any] = js.native
    
    /**
      * Execute a callback, if any, for a given keyboard event.
      * The self is used as `this` in the callback.
      * @param {Object} self
      * @param {KeyboardEvent} event
      * @returns
      */
    def exec(self: js.Object, event: KeyboardEvent): Unit = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  inline def bindEvents(obj: Any, element: Any, names: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindEvents")(obj.asInstanceOf[js.Any], element.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AnnotationEditor = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
  
  type AnnotationEditorLayer = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer
}
