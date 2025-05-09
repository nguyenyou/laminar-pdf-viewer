package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasAltText extends StObject {
  
  var hasAltText: Any
  
  var hasNoAltText: Any
}
object HasAltText {
  
  inline def apply(hasAltText: Any, hasNoAltText: Any): HasAltText = {
    val __obj = js.Dynamic.literal(hasAltText = hasAltText.asInstanceOf[js.Any], hasNoAltText = hasNoAltText.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasAltText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasAltText] (val x: Self) extends AnyVal {
    
    inline def setHasAltText(value: Any): Self = StObject.set(x, "hasAltText", value.asInstanceOf[js.Any])
    
    inline def setHasNoAltText(value: Any): Self = StObject.set(x, "hasNoAltText", value.asInstanceOf[js.Any])
  }
}
