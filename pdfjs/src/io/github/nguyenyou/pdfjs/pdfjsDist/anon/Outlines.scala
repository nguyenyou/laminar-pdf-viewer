package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outlines extends StObject {
  
  var areContours: Boolean
  
  var height: Double
  
  var outlines: js.Array[js.typedarray.Float32Array]
  
  var thickness: Double
  
  var width: Double
}
object Outlines {
  
  inline def apply(
    areContours: Boolean,
    height: Double,
    outlines: js.Array[js.typedarray.Float32Array],
    thickness: Double,
    width: Double
  ): Outlines = {
    val __obj = js.Dynamic.literal(areContours = areContours.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], outlines = outlines.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outlines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outlines] (val x: Self) extends AnyVal {
    
    inline def setAreContours(value: Boolean): Self = StObject.set(x, "areContours", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOutlines(value: js.Array[js.typedarray.Float32Array]): Self = StObject.set(x, "outlines", value.asInstanceOf[js.Any])
    
    inline def setOutlinesVarargs(value: js.typedarray.Float32Array*): Self = StObject.set(x, "outlines", js.Array(value*))
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
