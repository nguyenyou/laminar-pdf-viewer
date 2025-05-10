package io.github.nguyenyou.mupdfjs.mupdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "DisplayList")
@js.native
open class DisplayList protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.DisplayList {
  def this(mediabox: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_display_list'> */ Any) = this()
}
/* static members */
object DisplayList {
  
  @JSImport("mupdf", "DisplayList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_display_list'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
