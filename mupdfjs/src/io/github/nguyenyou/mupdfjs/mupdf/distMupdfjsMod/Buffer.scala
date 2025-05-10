package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "Buffer")
@js.native
/** New empty Buffer. */
open class Buffer ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.Buffer {
  /** New Buffer initialized with string contents as UTF-8. */
  def this(data: String) = this()
  /** New Buffer initialized with typed array contents. */
  def this(data: js.typedarray.ArrayBuffer) = this()
  def this(data: js.typedarray.Uint8Array) = this()
  /** PRIVATE */
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_buffer'> */ Any) = this()
}
/* static members */
object Buffer {
  
  @JSImport("mupdf/dist/mupdfjs", "Buffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_buffer'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
