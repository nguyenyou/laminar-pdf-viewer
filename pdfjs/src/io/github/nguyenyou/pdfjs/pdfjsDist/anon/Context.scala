package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var canvas: Unit
  
  var context: Any
}
object Context {
  
  inline def apply(canvas: Unit, context: Any): Context = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: Unit): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
