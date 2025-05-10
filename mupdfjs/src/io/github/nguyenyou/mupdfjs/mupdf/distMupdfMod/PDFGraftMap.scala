package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.pdf_graft_map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "PDFGraftMap")
@js.native
open class PDFGraftMap protected ()
  extends StObject
     with Userdata[pdf_graft_map] {
  def this(
    doc: PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_graft_map'> */ Any
  ) = this()
  
  var _doc: PDFDocument = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def graftObject(obj: PDFObject): PDFObject = js.native
  
  def graftPage(to: Double, srcDoc: PDFDocument, srcPage: Double): Unit = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
}
/* static members */
object PDFGraftMap {
  
  @JSImport("mupdf/dist/mupdf", "PDFGraftMap")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_graft_map'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
