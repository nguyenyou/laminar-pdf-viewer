package io.github.nguyenyou.mupdfjs.mupdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "PDFObject")
@js.native
open class PDFObject protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFObject {
  def this(
    doc: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_obj'> */ Any
  ) = this()
}
/* static members */
object PDFObject {
  
  @JSImport("mupdf", "PDFObject")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf", "PDFObject.Null")
  @js.native
  val Null: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFObject = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_obj'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
