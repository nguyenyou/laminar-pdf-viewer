package io.github.nguyenyou.pdfjs.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.pdfjs`.std.ReadableStreamReadValueResult[T]
  - `io.github.nguyenyou.pdfjs`.std.ReadableStreamReadDoneResult[T]
*/
trait ReadableStreamReadResult[T] extends StObject
object ReadableStreamReadResult {
  
  inline def ReadableStreamReadDoneResult[T](): io.github.nguyenyou.pdfjs.std.ReadableStreamReadDoneResult[T] = {
    val __obj = js.Dynamic.literal(done = true)
    __obj.asInstanceOf[io.github.nguyenyou.pdfjs.std.ReadableStreamReadDoneResult[T]]
  }
  
  inline def ReadableStreamReadValueResult[T](value: T): io.github.nguyenyou.pdfjs.std.ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[io.github.nguyenyou.pdfjs.std.ReadableStreamReadValueResult[T]]
  }
}
