package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AltText extends StObject {
  
  var altText: Null
  
  var decorative: Boolean
  
  var guessedText: Null
  
  var textWithDisclaimer: Null
}
object AltText {
  
  inline def apply(altText: Null, decorative: Boolean, guessedText: Null, textWithDisclaimer: Null): AltText = {
    val __obj = js.Dynamic.literal(altText = altText.asInstanceOf[js.Any], decorative = decorative.asInstanceOf[js.Any], guessedText = guessedText.asInstanceOf[js.Any], textWithDisclaimer = textWithDisclaimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AltText] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: Null): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setDecorative(value: Boolean): Self = StObject.set(x, "decorative", value.asInstanceOf[js.Any])
    
    inline def setGuessedText(value: Null): Self = StObject.set(x, "guessedText", value.asInstanceOf[js.Any])
    
    inline def setTextWithDisclaimer(value: Null): Self = StObject.set(x, "textWithDisclaimer", value.asInstanceOf[js.Any])
  }
}
