package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DTransformorigin extends StObject {
  
  var d: String
  
  var `transform-origin`: String
}
object DTransformorigin {
  
  inline def apply(d: String, `transform-origin`: String): DTransformorigin = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.updateDynamic("transform-origin")(`transform-origin`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DTransformorigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DTransformorigin] (val x: Self) extends AnyVal {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def `setTransform-origin`(value: String): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
  }
}
