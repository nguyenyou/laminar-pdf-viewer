package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasDescription extends StObject {
  
  var hasDescription: Boolean
  
  var `type`: String
}
object HasDescription {
  
  inline def apply(hasDescription: Boolean, `type`: String): HasDescription = {
    val __obj = js.Dynamic.literal(hasDescription = hasDescription.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasDescription] (val x: Self) extends AnyVal {
    
    inline def setHasDescription(value: Boolean): Self = StObject.set(x, "hasDescription", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
