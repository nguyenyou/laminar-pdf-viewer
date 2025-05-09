package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewBoxString extends StObject {
  
  var viewBox: String
}
object ViewBoxString {
  
  inline def apply(viewBox: String): ViewBoxString = {
    val __obj = js.Dynamic.literal(viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBoxString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewBoxString] (val x: Self) extends AnyVal {
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
