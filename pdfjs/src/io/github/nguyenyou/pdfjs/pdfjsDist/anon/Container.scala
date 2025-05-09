package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: Any
  
  var isPinchingDisabled: js.UndefOr[Null] = js.undefined
  
  var isPinchingStopped: js.UndefOr[Null] = js.undefined
  
  var onPinchEnd: js.UndefOr[Null] = js.undefined
  
  var onPinchStart: js.UndefOr[Null] = js.undefined
  
  var onPinching: js.UndefOr[Null] = js.undefined
  
  var signal: Any
}
object Container {
  
  inline def apply(container: Any, signal: Any): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: Any): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
