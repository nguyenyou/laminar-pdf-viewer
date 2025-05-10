package io.github.nguyenyou.mupdfjs.mupdf.mod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.AnyBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "Image")
@js.native
open class Image protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Image {
  def this(pixmap: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Pixmap) = this()
  def this(pointer: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_image'> */ Any) | AnyBuffer) = this()
  def this(
    pixmap: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Pixmap,
    mask: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Image
  ) = this()
}
/* static members */
object Image {
  
  @JSImport("mupdf", "Image")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_image'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
