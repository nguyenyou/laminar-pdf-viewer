package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorFreetextMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor")
  @js.native
  open class FreeTextEditor protected () extends AnnotationEditor {
    def this(params: Any) = this()
    
    /**
      * Helper to translate the editor with the keyboard when it's empty.
      * @param {number} x in page units.
      * @param {number} y in page units.
      */
    def _translateEmpty(x: Double, y: Double): Unit = js.native
    
    /**
      * ondblclick callback.
      * @param {MouseEvent} event
      */
    def dblclick(event: MouseEvent): Unit = js.native
    
    var editorDiv: js.UndefOr[HTMLDivElement] = js.native
    
    def editorDivBlur(event: Any): Unit = js.native
    
    def editorDivFocus(event: Any): Unit = js.native
    
    def editorDivInput(event: Any): Unit = js.native
    
    def editorDivKeydown(event: Any): Unit = js.native
    
    def editorDivPaste(event: Any): Unit = js.native
    
    /** @inheritdoc */
    def onceAdded(focus: Any): Unit = js.native
    
    var overlayDiv: js.UndefOr[HTMLDivElement] = js.native
    
    /** @inheritdoc */
    def renderAnnotationElement(annotation: Any): HTMLElement | Null = js.native
    
    /** @inheritdoc */
    def updateParams(`type`: Any, value: Any): Unit = js.native
  }
  /* static members */
  object FreeTextEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def `__Numbersign18@NumbersigndeserializeContent`(content: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__#18@#deserializeContent")(content.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def `__Numbersign18@NumbersigngetNodeContent`(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__#18@#getNodeContent")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._defaultColor")
    @js.native
    def _defaultColor: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _defaultColor_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultColor")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._defaultFontSize")
    @js.native
    def _defaultFontSize: Double = js.native
    inline def _defaultFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._editorType")
    @js.native
    def _editorType: Double = js.native
    inline def _editorType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_editorType")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._freeTextDefaultContent")
    @js.native
    def _freeTextDefaultContent: String = js.native
    inline def _freeTextDefaultContent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_freeTextDefaultContent")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._internalPadding")
    @js.native
    def _internalPadding: Double = js.native
    inline def _internalPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_internalPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._type")
    @js.native
    def _type: String = js.native
    inline def _type_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_type")(x.asInstanceOf[js.Any])
    
    /** @inheritdoc */
    inline def deserialize(data: Any, parent: Any, uiManager: Any): js.Promise[AnnotationEditor | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnnotationEditor | Null]]
    
    /** @inheritdoc */
    inline def initialize(l10n: Any, uiManager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** @inheritdoc */
    inline def updateDefaultParams(`type`: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDefaultParams")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type AnnotationEditorLayer = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer
}
