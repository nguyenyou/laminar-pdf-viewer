package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opacity extends StObject {
  
  var color: Any
  
  var opacity: Any
  
  var thickness: Any
}
object Opacity {
  
  inline def apply(color: Any, opacity: Any, thickness: Any): Opacity = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Any): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
