package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "DocumentWriter")
@js.native
open class DocumentWriter protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.DocumentWriter {
  def this(buffer: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Buffer, format: String, options: String) = this()
}
/* static members */
object DocumentWriter {
  
  @JSImport("mupdf/dist/mupdfjs", "DocumentWriter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_document_writer'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
