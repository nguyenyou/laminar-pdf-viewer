package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersInkdrawMod.InkDrawOutline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreContours extends StObject {
  
  var areContours: Any
  
  var height: Any
  
  var newCurves: js.Array[Any]
  
  var outline: InkDrawOutline
  
  var thickness: Any
  
  var width: Any
}
object AreContours {
  
  inline def apply(
    areContours: Any,
    height: Any,
    newCurves: js.Array[Any],
    outline: InkDrawOutline,
    thickness: Any,
    width: Any
  ): AreContours = {
    val __obj = js.Dynamic.literal(areContours = areContours.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], newCurves = newCurves.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreContours]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreContours] (val x: Self) extends AnyVal {
    
    inline def setAreContours(value: Any): Self = StObject.set(x, "areContours", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setNewCurves(value: js.Array[Any]): Self = StObject.set(x, "newCurves", value.asInstanceOf[js.Any])
    
    inline def setNewCurvesVarargs(value: Any*): Self = StObject.set(x, "newCurves", js.Array(value*))
    
    inline def setOutline(value: InkDrawOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
