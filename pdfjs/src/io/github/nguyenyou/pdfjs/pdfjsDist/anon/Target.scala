package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var target: Any
  
  var x: Any
  
  var y: Any
}
object Target {
  
  inline def apply(target: Any, x: Any, y: Any): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
