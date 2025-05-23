package io.github.nguyenyou.pdfjs.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader) */
@js.native
trait ReadableStreamBYOBReader
  extends StObject
     with ReadableStreamGenericReader
     with ReadableStreamReader[Any] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/read) */
  /* standard dom */
  def read[T /* <: js.typedarray.ArrayBufferView */](view: T): js.Promise[ReadableStreamReadResult[T]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/releaseLock) */
  /* standard dom */
  def releaseLock(): Unit = js.native
}
