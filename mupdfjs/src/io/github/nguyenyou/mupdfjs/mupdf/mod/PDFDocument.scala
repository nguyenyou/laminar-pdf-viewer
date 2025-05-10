package io.github.nguyenyou.mupdfjs.mupdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "PDFDocument")
@js.native
open class PDFDocument ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFDocument {
  def this(clone: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFDocument) = this()
  def this(data: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Buffer) = this()
  def this(data: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Stream) = this()
  def this(data: js.typedarray.ArrayBuffer) = this()
  def this(data: js.typedarray.Uint8Array) = this()
  def this(filename: String) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_document'> */ Any) = this()
}
/* static members */
object PDFDocument {
  
  @JSImport("mupdf", "PDFDocument.PAGE_LABEL_ALPHA_LC")
  @js.native
  val PAGE_LABEL_ALPHA_LC: /* "a" */ String = js.native
  
  @JSImport("mupdf", "PDFDocument.PAGE_LABEL_ALPHA_UC")
  @js.native
  val PAGE_LABEL_ALPHA_UC: /* "A" */ String = js.native
  
  @JSImport("mupdf", "PDFDocument.PAGE_LABEL_DECIMAL")
  @js.native
  val PAGE_LABEL_DECIMAL: /* "D" */ String = js.native
  
  @JSImport("mupdf", "PDFDocument.PAGE_LABEL_NONE")
  @js.native
  val PAGE_LABEL_NONE: /* "\\u0000" */ String = js.native
  
  @JSImport("mupdf", "PDFDocument.PAGE_LABEL_ROMAN_LC")
  @js.native
  val PAGE_LABEL_ROMAN_LC: /* "r" */ String = js.native
  
  @JSImport("mupdf", "PDFDocument.PAGE_LABEL_ROMAN_UC")
  @js.native
  val PAGE_LABEL_ROMAN_UC: /* "R" */ String = js.native
}
