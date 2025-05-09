package io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnProgressParameters extends StObject {
  
  /**
    * - Currently loaded number of bytes.
    */
  var loaded: Double
  
  /**
    * - Total number of bytes in the PDF file.
    */
  var total: Double
}
object OnProgressParameters {
  
  inline def apply(loaded: Double, total: Double): OnProgressParameters = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnProgressParameters] (val x: Self) extends AnyVal {
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
