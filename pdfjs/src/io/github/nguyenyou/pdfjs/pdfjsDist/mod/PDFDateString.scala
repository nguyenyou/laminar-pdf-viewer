package io.github.nguyenyou.pdfjs.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist", "PDFDateString")
@js.native
open class PDFDateString ()
  extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PDFDateString
/* static members */
object PDFDateString {
  
  @JSImport("pdfjs-dist", "PDFDateString")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist", "PDFDateString.__#2@#regex")
  @js.native
  val `__Numbersign2@Numbersignregex`: Any = js.native
  
  /**
    * Convert a PDF date string to a JavaScript `Date` object.
    *
    * The PDF date string format is described in section 7.9.4 of the official
    * PDF 32000-1:2008 specification. However, in the PDF 1.7 reference (sixth
    * edition) Adobe describes the same format including a trailing apostrophe.
    * This syntax in incorrect, but Adobe Acrobat creates PDF files that contain
    * them. We ignore all apostrophes as they are not necessary for date parsing.
    *
    * Moreover, Adobe Acrobat doesn't handle changing the date to universal time
    * and doesn't use the user's time zone (effectively ignoring the HH' and mm'
    * parts of the date string).
    *
    * @param {string} input
    * @returns {Date|null}
    */
  inline def toDateObject(input: String): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateObject")(input.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
}
