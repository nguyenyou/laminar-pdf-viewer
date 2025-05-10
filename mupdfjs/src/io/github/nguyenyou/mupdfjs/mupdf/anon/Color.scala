package io.github.nguyenyou.mupdfjs.mupdf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color
  
  var font: String
  
  var size: Double
}
object Color {
  
  inline def apply(color: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color, font: String, size: Double): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setColor(value: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
