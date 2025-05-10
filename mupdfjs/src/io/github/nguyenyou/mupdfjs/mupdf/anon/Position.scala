package io.github.nguyenyou.mupdfjs.mupdf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: Double
  
  var steps: js.Array[String]
}
object Position {
  
  inline def apply(position: Double, steps: js.Array[String]): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[String]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: String*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
