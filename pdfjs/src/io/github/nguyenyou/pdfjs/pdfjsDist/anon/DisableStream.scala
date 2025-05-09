package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableStream extends StObject {
  
  var disableRange: js.UndefOr[Boolean] = js.undefined
  
  var disableStream: js.UndefOr[Boolean] = js.undefined
}
object DisableStream {
  
  inline def apply(): DisableStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableStream] (val x: Self) extends AnyVal {
    
    inline def setDisableRange(value: Boolean): Self = StObject.set(x, "disableRange", value.asInstanceOf[js.Any])
    
    inline def setDisableRangeUndefined: Self = StObject.set(x, "disableRange", js.undefined)
    
    inline def setDisableStream(value: Boolean): Self = StObject.set(x, "disableStream", value.asInstanceOf[js.Any])
    
    inline def setDisableStreamUndefined: Self = StObject.set(x, "disableStream", js.undefined)
  }
}
