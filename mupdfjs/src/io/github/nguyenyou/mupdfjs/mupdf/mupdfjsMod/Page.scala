package io.github.nguyenyou.mupdfjs.mupdf.mupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PageBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/mupdfjs", "Page")
@js.native
open class Page ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.Page
/* static members */
object Page {
  
  @JSImport("mupdf/mupdfjs", "Page")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/mupdfjs", "Page.BOXES")
  @js.native
  val BOXES: js.Array[PageBox] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_page'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
