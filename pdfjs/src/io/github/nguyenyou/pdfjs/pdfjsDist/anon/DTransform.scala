package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DTransform extends StObject {
  
  var d: String
  
  var transform: String | Null
  
  var `transform-origin`: String
}
object DTransform {
  
  inline def apply(d: String, `transform-origin`: String): DTransform = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], transform = null)
    __obj.updateDynamic("transform-origin")(`transform-origin`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DTransform] (val x: Self) extends AnyVal {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def `setTransform-origin`(value: String): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
    
    inline def setTransformNull: Self = StObject.set(x, "transform", null)
  }
}
