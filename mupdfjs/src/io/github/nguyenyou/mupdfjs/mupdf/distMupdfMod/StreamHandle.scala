package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamHandle extends StObject {
  
  def close(): Unit
  
  def fileSize(): Double
  
  def read(memory: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): Double
}
object StreamHandle {
  
  inline def apply(
    close: () => Unit,
    fileSize: () => Double,
    read: (js.typedarray.Uint8Array, Double, Double, Double) => Double
  ): StreamHandle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), fileSize = js.Any.fromFunction0(fileSize), read = js.Any.fromFunction4(read))
    __obj.asInstanceOf[StreamHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamHandle] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setFileSize(value: () => Double): Self = StObject.set(x, "fileSize", js.Any.fromFunction0(value))
    
    inline def setRead(value: (js.typedarray.Uint8Array, Double, Double, Double) => Double): Self = StObject.set(x, "read", js.Any.fromFunction4(value))
  }
}
