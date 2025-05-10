package io.github.nguyenyou.comlink.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasState extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isContextLost) */
  /* standard dom */
  def isContextLost(): Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/reset) */
  /* standard dom */
  def reset(): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/restore) */
  /* standard dom */
  def restore(): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/save) */
  /* standard dom */
  def save(): Unit
}
object CanvasState {
  
  inline def apply(isContextLost: () => Boolean, reset: () => Unit, restore: () => Unit, save: () => Unit): CanvasState = {
    val __obj = js.Dynamic.literal(isContextLost = js.Any.fromFunction0(isContextLost), reset = js.Any.fromFunction0(reset), restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[CanvasState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasState] (val x: Self) extends AnyVal {
    
    inline def setIsContextLost(value: () => Boolean): Self = StObject.set(x, "isContextLost", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
  }
}
