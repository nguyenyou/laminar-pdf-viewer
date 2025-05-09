package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewBox extends StObject {
  
  var viewBox: Any
}
object ViewBox {
  
  inline def apply(viewBox: Any): ViewBox = {
    val __obj = js.Dynamic.literal(viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewBox] (val x: Self) extends AnyVal {
    
    inline def setViewBox(value: Any): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
