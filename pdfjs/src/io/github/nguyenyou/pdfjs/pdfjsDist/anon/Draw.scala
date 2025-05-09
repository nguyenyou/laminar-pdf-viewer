package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draw extends StObject {
  
  var draw: Boolean
}
object Draw {
  
  inline def apply(draw: Boolean): Draw = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Draw] (val x: Self) extends AnyVal {
    
    inline def setDraw(value: Boolean): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
  }
}
