package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: Double
  
  var isHole: Boolean
  
  var parent: Double
  
  var points: js.Array[Double]
}
object Id {
  
  inline def apply(id: Double, isHole: Boolean, parent: Double, points: js.Array[Double]): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isHole = isHole.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsHole(value: Boolean): Self = StObject.set(x, "isHole", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
