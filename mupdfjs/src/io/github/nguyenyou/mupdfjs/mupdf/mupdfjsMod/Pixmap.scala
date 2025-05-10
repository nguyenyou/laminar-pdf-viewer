package io.github.nguyenyou.mupdfjs.mupdf.mupdfjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/mupdfjs", "Pixmap")
@js.native
open class Pixmap protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.Pixmap {
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_pixmap'> */ Any) = this()
  def this(
    colorspace: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.ColorSpace,
    bbox: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect,
    alpha: Boolean
  ) = this()
}
/* static members */
object Pixmap {
  
  @JSImport("mupdf/mupdfjs", "Pixmap")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_pixmap'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
