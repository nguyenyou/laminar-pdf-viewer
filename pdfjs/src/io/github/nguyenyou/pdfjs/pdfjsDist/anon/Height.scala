package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var areContours: Any
  
  var height: Any
  
  var outlines: Any
  
  var thickness: Any
  
  var width: Any
}
object Height {
  
  inline def apply(areContours: Any, height: Any, outlines: Any, thickness: Any, width: Any): Height = {
    val __obj = js.Dynamic.literal(areContours = areContours.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], outlines = outlines.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    inline def setAreContours(value: Any): Self = StObject.set(x, "areContours", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOutlines(value: Any): Self = StObject.set(x, "outlines", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
