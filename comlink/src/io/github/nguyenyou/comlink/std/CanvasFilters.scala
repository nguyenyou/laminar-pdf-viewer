package io.github.nguyenyou.comlink.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasFilters extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/filter) */
  /* standard dom */
  var filter: String
}
object CanvasFilters {
  
  inline def apply(filter: String): CanvasFilters = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasFilters] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
