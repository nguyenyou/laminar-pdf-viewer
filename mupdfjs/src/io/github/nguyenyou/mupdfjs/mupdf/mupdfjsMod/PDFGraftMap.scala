package io.github.nguyenyou.mupdfjs.mupdf.mupdfjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/mupdfjs", "PDFGraftMap")
@js.native
open class PDFGraftMap protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFGraftMap {
  def this(
    doc: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_graft_map'> */ Any
  ) = this()
}
/* static members */
object PDFGraftMap {
  
  @JSImport("mupdf/mupdfjs", "PDFGraftMap")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_graft_map'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
