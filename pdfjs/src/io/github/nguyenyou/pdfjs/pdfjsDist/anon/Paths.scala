package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paths extends StObject {
  
  var paths: Lines
  
  var rotation: Any
  
  var thickness: Any
}
object Paths {
  
  inline def apply(paths: Lines, rotation: Any, thickness: Any): Paths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paths] (val x: Self) extends AnyVal {
    
    inline def setPaths(value: Lines): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Any): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
