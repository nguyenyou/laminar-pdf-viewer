package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorative extends StObject {
  
  var altText: Null
  
  var decorative: Boolean
}
object Decorative {
  
  inline def apply(altText: Null, decorative: Boolean): Decorative = {
    val __obj = js.Dynamic.literal(altText = altText.asInstanceOf[js.Any], decorative = decorative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Decorative] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: Null): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setDecorative(value: Boolean): Self = StObject.set(x, "decorative", value.asInstanceOf[js.Any])
  }
}
