package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofFreeTextEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofHighlightEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofInkEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofSignatureEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TypeofStampEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import io.github.nguyenyou.pdfjs.std.Map
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorAnnotationEditorLayerMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/annotation_editor_layer", "AnnotationEditorLayer")
  @js.native
  open class AnnotationEditorLayer protected () extends StObject {
    /**
      * @param {AnnotationEditorLayerOptions} options
      */
    def this(param0: AnnotationEditorLayerOptions) = this()
    
    var _structTree: Any = js.native
    
    /**
      * Add a new editor in the current view.
      * @param {AnnotationEditor} editor
      */
    def add(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add some commands into the CommandManager (undo/redo stuff).
      * @param {Object} params
      */
    def addCommands(params: js.Object): Unit = js.native
    
    /**
      * Create and add a new editor.
      */
    def addNewEditor(): Unit = js.native
    def addNewEditor(data: js.Object): Unit = js.native
    
    /**
      * Add or rebuild depending if it has been removed or not.
      * @param {AnnotationEditor} editor
      */
    def addOrRebuild(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add a new editor and make this addition undoable.
      * @param {AnnotationEditor} editor
      */
    def addUndoableEditor(editor: AnnotationEditor): Unit = js.native
    
    def attach(editor: Any): Unit = js.native
    
    def canCreateNewEmptyEditor(): js.UndefOr[Boolean] = js.native
    
    /**
      * An editor can have a different parent, for example after having
      * being dragged and droped from a page to another.
      * @param {AnnotationEditor} editor
      */
    def changeParent(editor: AnnotationEditor): Unit = js.native
    
    def cleanUndoStack(`type`: Any): Unit = js.native
    
    def combinedSignal(ac: Any): AbortSignal = js.native
    
    def commitOrRemove(): Boolean = js.native
    
    /**
      * Create and add a new editor.
      * @param {PointerEvent} event
      * @param {boolean} isCentered
      * @param [Object] data
      * @returns {AnnotationEditor}
      */
    def createAndAddNewEditor(event: PointerEvent, isCentered: Boolean): AnnotationEditor = js.native
    def createAndAddNewEditor(event: PointerEvent, isCentered: Boolean, data: js.Object): AnnotationEditor = js.native
    
    /**
      * Create a new editor
      * @param {Object} data
      * @returns {AnnotationEditor | null}
      */
    def deserialize(data: js.Object): AnnotationEditor | Null = js.native
    
    /**
      * Destroy the main editor.
      */
    def destroy(): Unit = js.native
    
    def detach(editor: Any): Unit = js.native
    
    /**
      * Disable editor creation.
      */
    def disable(): Unit = js.native
    
    def disableClick(): Unit = js.native
    
    def disableTextSelection(): Unit = js.native
    
    var div: HTMLDivElement = js.native
    
    var drawLayer: io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayDrawLayerMod.DrawLayer = js.native
    
    /**
      * Enable pointer events on the main div in order to enable
      * editor creation.
      */
    def enable(): js.Promise[Unit] = js.native
    
    def enableClick(): Unit = js.native
    
    def enableTextSelection(): Unit = js.native
    
    def endDrawingSession(): Any = js.native
    def endDrawingSession(isAborted: Boolean): Any = js.native
    
    /**
      *
      * @param {AnnotationEditor} editor
      * @param {number} x
      * @param {number} y
      * @returns
      */
    def findNewParent(editor: AnnotationEditor, x: Double, y: Double): Boolean = js.native
    
    def getEditableAnnotation(id: Any): Any = js.native
    
    /**
      * Get an id for an editor.
      * @returns {string}
      */
    def getNextId(): String = js.native
    
    def hasTextLayer(textLayer: Any): Boolean = js.native
    
    def isEmpty: Boolean = js.native
    
    def isInvisible: Boolean = js.native
    
    def moveEditorInDOM(editor: Any): Unit = js.native
    
    def onScaleChanging(): Unit = js.native
    
    /**
      * Get page dimensions.
      * @returns {Object} dimensions.
      */
    def pageDimensions: js.Object = js.native
    
    var pageIndex: Double = js.native
    
    /**
      * Paste some content into a new editor.
      * @param {number} mode
      * @param {Object} params
      */
    def pasteEditor(mode: Double, params: js.Object): js.Promise[Unit] = js.native
    
    def pause(on: Any): Unit = js.native
    
    /**
      * Pointerdown callback.
      * @param {PointerEvent} event
      */
    def pointerdown(event: PointerEvent): Unit = js.native
    
    /**
      * Pointerup callback.
      * @param {PointerEvent} event
      */
    def pointerup(event: PointerEvent): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Remove an editor.
      * @param {AnnotationEditor} editor
      */
    def remove(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Render the main editor.
      * @param {RenderEditorLayerOptions} parameters
      */
    def render(param0: RenderEditorLayerOptions): Unit = js.native
    
    def scale: Double = js.native
    
    /**
      * Set the current editor.
      * @param {AnnotationEditor} editor
      */
    def setActiveEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Set the editing state.
      * @param {boolean} isEditing
      */
    def setEditingState(isEditing: Boolean): Unit = js.native
    
    /**
      * Set the last selected editor.
      * @param {AnnotationEditor} editor
      */
    def setSelected(editor: AnnotationEditor): Unit = js.native
    
    def startDrawingSession(event: Any): Unit = js.native
    
    def toggleAnnotationLayerPointerEvents(): Unit = js.native
    def toggleAnnotationLayerPointerEvents(enabled: Boolean): Unit = js.native
    
    def toggleDrawing(): Unit = js.native
    def toggleDrawing(enabled: Boolean): Unit = js.native
    
    def togglePointerEvents(): Unit = js.native
    def togglePointerEvents(enabled: Boolean): Unit = js.native
    
    /**
      * Add or remove an editor the current selection.
      * @param {AnnotationEditor} editor
      */
    def toggleSelected(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Unselect an editor.
      * @param {AnnotationEditor} editor
      */
    def unselect(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Update the main editor.
      * @param {RenderEditorLayerOptions} parameters
      */
    def update(param0: RenderEditorLayerOptions): Unit = js.native
    
    /**
      * The mode has changed: it must be updated.
      * @param {number} mode
      */
    def updateMode(): Unit = js.native
    def updateMode(mode: Double): Unit = js.native
    
    /**
      * Update the toolbar if it's required to reflect the tool currently used.
      * @param {number} mode
      */
    def updateToolbar(mode: Double): Unit = js.native
    
    var viewport: io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport = js.native
  }
  /* static members */
  object AnnotationEditorLayer {
    
    @JSImport("pdfjs-dist/types/src/display/editor/annotation_editor_layer", "AnnotationEditorLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/annotation_editor_layer", "AnnotationEditorLayer.__#34@#editorTypes")
    @js.native
    val `__Numbersign34@NumbersigneditorTypes`: Map[
        Double, 
        TypeofFreeTextEditor | TypeofHighlightEditor | TypeofInkEditor | TypeofSignatureEditor | TypeofStampEditor
      ] = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/annotation_editor_layer", "AnnotationEditorLayer._initialized")
    @js.native
    def _initialized: Boolean = js.native
    inline def _initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_initialized")(x.asInstanceOf[js.Any])
  }
  
  trait AnnotationEditorLayerOptions extends StObject {
    
    var accessibilityManager: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_text_accessibility.TextAccessibilityManager */ Any
      ] = js.undefined
    
    var annotationLayer: js.UndefOr[
        io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayAnnotationLayerMod.AnnotationLayer
      ] = js.undefined
    
    var div: HTMLDivElement
    
    var drawLayer: DrawLayer
    
    var enabled: Boolean
    
    var l10n: IL10n
    
    var mode: js.Object
    
    var pageIndex: Double
    
    var structTreeLayer: StructTreeLayerBuilder
    
    var textLayer: js.UndefOr[HTMLDivElement] = js.undefined
    
    var uiManager: AnnotationEditorUIManager
    
    var viewport: PageViewport
  }
  object AnnotationEditorLayerOptions {
    
    inline def apply(
      div: HTMLDivElement,
      drawLayer: DrawLayer,
      enabled: Boolean,
      l10n: IL10n,
      mode: js.Object,
      pageIndex: Double,
      structTreeLayer: StructTreeLayerBuilder,
      uiManager: AnnotationEditorUIManager,
      viewport: PageViewport
    ): AnnotationEditorLayerOptions = {
      val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], drawLayer = drawLayer.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], structTreeLayer = structTreeLayer.asInstanceOf[js.Any], uiManager = uiManager.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationEditorLayerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationEditorLayerOptions] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityManager(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_text_accessibility.TextAccessibilityManager */ Any
      ): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityManagerUndefined: Self = StObject.set(x, "accessibilityManager", js.undefined)
      
      inline def setAnnotationLayer(value: io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayAnnotationLayerMod.AnnotationLayer): Self = StObject.set(x, "annotationLayer", value.asInstanceOf[js.Any])
      
      inline def setAnnotationLayerUndefined: Self = StObject.set(x, "annotationLayer", js.undefined)
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDrawLayer(value: DrawLayer): Self = StObject.set(x, "drawLayer", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setL10n(value: IL10n): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setMode(value: js.Object): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      inline def setStructTreeLayer(value: StructTreeLayerBuilder): Self = StObject.set(x, "structTreeLayer", value.asInstanceOf[js.Any])
      
      inline def setTextLayer(value: HTMLDivElement): Self = StObject.set(x, "textLayer", value.asInstanceOf[js.Any])
      
      inline def setTextLayerUndefined: Self = StObject.set(x, "textLayer", js.undefined)
      
      inline def setUiManager(value: AnnotationEditorUIManager): Self = StObject.set(x, "uiManager", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  type AnnotationEditorUIManager = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorToolsMod.AnnotationEditorUIManager
  
  type AnnotationLayer = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayAnnotationLayerMod.AnnotationLayer
  
  type DrawLayer = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayDrawLayerMod.DrawLayer
  
  type IL10n = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IL10n */ Any
  
  type PageViewport = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport
  
  trait RenderEditorLayerOptions extends StObject {
    
    var viewport: PageViewport
  }
  object RenderEditorLayerOptions {
    
    inline def apply(viewport: PageViewport): RenderEditorLayerOptions = {
      val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderEditorLayerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderEditorLayerOptions] (val x: Self) extends AnyVal {
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  type StructTreeLayerBuilder = Any
  
  type TextAccessibilityManager = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_text_accessibility.TextAccessibilityManager */ Any
}
