package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveRB extends StObject {
  
  var preserveRB: Any
  
  var state: Any
}
object PreserveRB {
  
  inline def apply(preserveRB: Any, state: Any): PreserveRB = {
    val __obj = js.Dynamic.literal(preserveRB = preserveRB.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveRB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreserveRB] (val x: Self) extends AnyVal {
    
    inline def setPreserveRB(value: Any): Self = StObject.set(x, "preserveRB", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
