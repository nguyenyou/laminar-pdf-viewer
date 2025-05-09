package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Points extends StObject {
  
  var lines: js.Array[Any]
  
  var points: js.Array[Any]
  
  var rect: js.Array[Any]
}
object Points {
  
  inline def apply(lines: js.Array[Any], points: js.Array[Any], rect: js.Array[Any]): Points = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
    
    inline def setLines(value: js.Array[Any]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: Any*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setPoints(value: js.Array[Any]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Any*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setRect(value: js.Array[Any]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectVarargs(value: Any*): Self = StObject.set(x, "rect", js.Array(value*))
  }
}
