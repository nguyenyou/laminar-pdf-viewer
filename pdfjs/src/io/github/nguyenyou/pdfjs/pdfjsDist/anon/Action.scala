package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: String
  
  var color: Any
  
  var methodOfCreation: String
  
  var thickness: Any
  
  var `type`: String
}
object Action {
  
  inline def apply(action: String, color: Any, methodOfCreation: String, thickness: Any, `type`: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], methodOfCreation = methodOfCreation.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMethodOfCreation(value: String): Self = StObject.set(x, "methodOfCreation", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
