package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Buffer")
@js.native
/** New empty Buffer. */
open class Buffer ()
  extends StObject
     with Userdata[fz_buffer] {
  /** New Buffer initialized with string contents as UTF-8. */
  def this(data: String) = this()
  /** New Buffer initialized with typed array contents. */
  def this(data: js.typedarray.ArrayBuffer) = this()
  def this(data: js.typedarray.Uint8Array) = this()
  /** PRIVATE */
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_buffer'> */ Any) = this()
  
  def asString(): String = js.native
  
  def asUint8Array(): js.typedarray.Uint8Array = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getLength(): Double = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def readByte(at: Double): Double = js.native
  
  def save(filename: String): Unit = js.native
  
  def slice(start: Double, end: Double): Buffer = js.native
  
  def write(s: String): Unit = js.native
  
  def writeBuffer(other: AnyBuffer): Unit = js.native
  
  def writeByte(b: Double): Unit = js.native
  
  def writeLine(s: String): Unit = js.native
}
/* static members */
object Buffer {
  
  @JSImport("mupdf/dist/mupdf", "Buffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_buffer'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
