package io.github.nguyenyou.mupdfjs.mupdf.mod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PageBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "Page")
@js.native
open class Page ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Page
/* static members */
object Page {
  
  @JSImport("mupdf", "Page")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf", "Page.BOXES")
  @js.native
  val BOXES: js.Array[PageBox] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_page'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
