package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Editor
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorColorPickerMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/color_picker", "ColorPicker")
  @js.native
  open class ColorPicker protected () extends StObject {
    def this(param0: Editor) = this()
    
    def _colorSelectFromKeyboard(event: Any): Unit = js.native
    
    def _hideDropdownFromKeyboard(): Unit = js.native
    
    def _moveToBeginning(event: Any): Unit = js.native
    
    def _moveToEnd(event: Any): Unit = js.native
    
    def _moveToNext(event: Any): Unit = js.native
    
    def _moveToPrevious(event: Any): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def hideDropdown(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def renderButton(): HTMLButtonElement = js.native
    
    def renderMainDropdown(): HTMLDivElement = js.native
    
    def updateColor(color: Any): Unit = js.native
  }
  /* static members */
  object ColorPicker {
    
    @JSImport("pdfjs-dist/types/src/display/editor/color_picker", "ColorPicker.__#23@#l10nColor")
    @js.native
    val `__Numbersign23@Numbersignl10nColor`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  }
}
