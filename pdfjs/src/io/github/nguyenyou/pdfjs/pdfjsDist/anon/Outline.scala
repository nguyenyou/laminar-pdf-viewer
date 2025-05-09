package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  var outline: js.Array[Any]
  
  var points: js.Array[js.Array[Any]]
}
object Outline {
  
  inline def apply(outline: js.Array[Any], points: js.Array[js.Array[Any]]): Outline = {
    val __obj = js.Dynamic.literal(outline = outline.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outline] (val x: Self) extends AnyVal {
    
    inline def setOutline(value: js.Array[Any]): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineVarargs(value: Any*): Self = StObject.set(x, "outline", js.Array(value*))
    
    inline def setPoints(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
