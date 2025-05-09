package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowRangeRequests extends StObject {
  
  var allowRangeRequests: Boolean
  
  var suggestedLength: Unit
}
object AllowRangeRequests {
  
  inline def apply(allowRangeRequests: Boolean, suggestedLength: Unit): AllowRangeRequests = {
    val __obj = js.Dynamic.literal(allowRangeRequests = allowRangeRequests.asInstanceOf[js.Any], suggestedLength = suggestedLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowRangeRequests]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowRangeRequests] (val x: Self) extends AnyVal {
    
    inline def setAllowRangeRequests(value: Boolean): Self = StObject.set(x, "allowRangeRequests", value.asInstanceOf[js.Any])
    
    inline def setSuggestedLength(value: Unit): Self = StObject.set(x, "suggestedLength", value.asInstanceOf[js.Any])
  }
}
