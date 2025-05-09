package io.github.nguyenyou.pdfjs.pdfjsDist

import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorToolbarMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/toolbar", "EditorToolbar")
  @js.native
  open class EditorToolbar protected () extends StObject {
    def this(editor: Any) = this()
    
    def addAltText(altText: Any): js.Promise[Unit] = js.native
    
    def addColorPicker(colorPicker: Any): Unit = js.native
    
    def addEditSignatureButton(signatureManager: Any): js.Promise[Unit] = js.native
    
    def div: Null = js.native
    
    def hide(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def remove(): Unit = js.native
    
    def render(): HTMLDivElement = js.native
    
    def show(): Unit = js.native
    
    def updateEditSignatureButton(description: Any): Unit = js.native
  }
  /* static members */
  object EditorToolbar {
    
    @JSImport("pdfjs-dist/types/src/display/editor/toolbar", "EditorToolbar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/toolbar", "EditorToolbar.__#3@#l10nRemove")
    @js.native
    val `__Numbersign3@Numbersignl10nRemove`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    inline def `__Numbersign3@NumbersignpointerDown`(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__#3@#pointerDown")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/toolbar", "HighlightToolbar")
  @js.native
  open class HighlightToolbar protected () extends StObject {
    def this(uiManager: Any) = this()
    
    def hide(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def show(parent: Any, boxes: Any, isLTR: Any): Unit = js.native
  }
}
