package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lines extends StObject {
  
  var lines: Any
  
  var points: Any
}
object Lines {
  
  inline def apply(lines: Any, points: Any): Lines = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lines] (val x: Self) extends AnyVal {
    
    inline def setLines(value: Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Any): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
