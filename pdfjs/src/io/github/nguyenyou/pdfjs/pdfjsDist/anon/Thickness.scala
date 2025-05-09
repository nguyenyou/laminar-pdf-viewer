package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thickness extends StObject {
  
  var areContours: Any
  
  var thickness: Any
}
object Thickness {
  
  inline def apply(areContours: Any, thickness: Any): Thickness = {
    val __obj = js.Dynamic.literal(areContours = areContours.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thickness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Thickness] (val x: Self) extends AnyVal {
    
    inline def setAreContours(value: Any): Self = StObject.set(x, "areContours", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
