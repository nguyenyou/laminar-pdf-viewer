package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  var line: js.Array[Any]
  
  var points: js.Array[Any]
}
object Line {
  
  inline def apply(line: js.Array[Any], points: js.Array[Any]): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    inline def setLine(value: js.Array[Any]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineVarargs(value: Any*): Self = StObject.set(x, "line", js.Array(value*))
    
    inline def setPoints(value: js.Array[Any]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Any*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
