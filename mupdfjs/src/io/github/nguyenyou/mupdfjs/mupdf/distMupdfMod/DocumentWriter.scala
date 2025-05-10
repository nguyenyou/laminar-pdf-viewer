package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_document_writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "DocumentWriter")
@js.native
open class DocumentWriter protected ()
  extends StObject
     with Userdata[fz_document_writer] {
  def this(buffer: Buffer, format: String, options: String) = this()
  
  def beginPage(mediabox: Rect): Device = js.native
  
  def close(): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def endPage(): Unit = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
}
/* static members */
object DocumentWriter {
  
  @JSImport("mupdf/dist/mupdf", "DocumentWriter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_document_writer'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
