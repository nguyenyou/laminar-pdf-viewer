package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Decorative
import org.scalajs.dom.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorAltTextMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/alt_text", "AltText")
  @js.native
  open class AltText protected () extends StObject {
    def this(editor: Any) = this()
    
    def data: Decorative = js.native
    /**
      * Set the alt text data.
      */
    def data_=(param0: Decorative): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def finish(): Unit = js.native
    
    def guessedText: Null = js.native
    
    def hasData(): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    def render(): js.Promise[HTMLButtonElement] = js.native
    
    def serialize(isForCopying: Any): io.github.nguyenyou.pdfjs.pdfjsDist.anon.AltText = js.native
    
    def setGuessedText(guessedText: Any): js.Promise[Unit] = js.native
    
    def shown(): Unit = js.native
    
    def toggle(): Unit = js.native
    def toggle(enabled: Boolean): Unit = js.native
    
    def toggleAltTextBadge(): Unit = js.native
    def toggleAltTextBadge(visibility: Boolean): Unit = js.native
  }
  /* static members */
  object AltText {
    
    @JSImport("pdfjs-dist/types/src/display/editor/alt_text", "AltText")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/alt_text", "AltText.__#40@#l10nNewButton")
    @js.native
    val `__Numbersign40@Numbersignl10nNewButton`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/alt_text", "AltText._l10n")
    @js.native
    def _l10n: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _l10n_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_l10n")(x.asInstanceOf[js.Any])
    
    inline def initialize(l10n: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
