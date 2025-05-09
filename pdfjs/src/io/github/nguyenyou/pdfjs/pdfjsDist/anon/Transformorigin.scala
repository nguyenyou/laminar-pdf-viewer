package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformorigin extends StObject {
  
  var `transform-origin`: String
}
object Transformorigin {
  
  inline def apply(`transform-origin`: String): Transformorigin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transform-origin")(`transform-origin`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformorigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transformorigin] (val x: Self) extends AnyVal {
    
    inline def `setTransform-origin`(value: String): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
  }
}
