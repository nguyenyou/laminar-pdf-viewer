package io.github.nguyenyou.mupdfjs.mupdf.mod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "Stream")
@js.native
open class Stream protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Stream {
  def this(handle: StreamHandle) = this()
}
/* static members */
object Stream {
  
  @JSImport("mupdf", "Stream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_stream'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
