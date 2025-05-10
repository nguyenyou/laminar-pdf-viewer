package io.github.nguyenyou.mupdfjs.mupdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "PDFPage")
@js.native
open class PDFPage protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFPage {
  def this(
    doc: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFDocument,
    clone: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFPage
  ) = this()
  def this(
    doc: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_page'> */ Any
  ) = this()
}
/* static members */
object PDFPage {
  
  @JSImport("mupdf", "PDFPage.REDACT_IMAGE_NONE")
  @js.native
  val REDACT_IMAGE_NONE: /* 0 */ Double = js.native
  
  @JSImport("mupdf", "PDFPage.REDACT_IMAGE_PIXELS")
  @js.native
  val REDACT_IMAGE_PIXELS: /* 2 */ Double = js.native
  
  @JSImport("mupdf", "PDFPage.REDACT_IMAGE_REMOVE")
  @js.native
  val REDACT_IMAGE_REMOVE: /* 1 */ Double = js.native
  
  @JSImport("mupdf", "PDFPage.REDACT_IMAGE_UNLESS_INVISIBLE")
  @js.native
  val REDACT_IMAGE_UNLESS_INVISIBLE: /* 3 */ Double = js.native
  
  @JSImport("mupdf", "PDFPage.REDACT_LINE_ART_NONE")
  @js.native
  val REDACT_LINE_ART_NONE: /* 0 */ Double = js.native
  
  @JSImport("mupdf", "PDFPage.REDACT_LINE_ART_REMOVE_IF_COVERED")
  @js.native
  val REDACT_LINE_ART_REMOVE_IF_COVERED: /* 1 */ Double = js.native
  
  @JSImport("mupdf", "PDFPage.REDACT_LINE_ART_REMOVE_IF_TOUCHED")
  @js.native
  val REDACT_LINE_ART_REMOVE_IF_TOUCHED: /* 2 */ Double = js.native
  
  @JSImport("mupdf", "PDFPage.REDACT_TEXT_NONE")
  @js.native
  val REDACT_TEXT_NONE: /* 1 */ Double = js.native
  
  @JSImport("mupdf", "PDFPage.REDACT_TEXT_REMOVE")
  @js.native
  val REDACT_TEXT_REMOVE: /* 0 */ Double = js.native
}
