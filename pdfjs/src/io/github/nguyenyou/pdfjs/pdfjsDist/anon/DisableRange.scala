package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableRange extends StObject {
  
  var disableRange: Any
  
  var isHttp: Any
  
  var rangeChunkSize: Any
  
  var responseHeaders: Any
}
object DisableRange {
  
  inline def apply(disableRange: Any, isHttp: Any, rangeChunkSize: Any, responseHeaders: Any): DisableRange = {
    val __obj = js.Dynamic.literal(disableRange = disableRange.asInstanceOf[js.Any], isHttp = isHttp.asInstanceOf[js.Any], rangeChunkSize = rangeChunkSize.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableRange] (val x: Self) extends AnyVal {
    
    inline def setDisableRange(value: Any): Self = StObject.set(x, "disableRange", value.asInstanceOf[js.Any])
    
    inline def setIsHttp(value: Any): Self = StObject.set(x, "isHttp", value.asInstanceOf[js.Any])
    
    inline def setRangeChunkSize(value: Any): Self = StObject.set(x, "rangeChunkSize", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: Any): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
  }
}
