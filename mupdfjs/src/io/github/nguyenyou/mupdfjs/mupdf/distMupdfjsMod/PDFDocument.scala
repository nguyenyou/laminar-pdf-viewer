package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.anon.AttachedFiles
import io.github.nguyenyou.mupdfjs.mupdf.anon.Filename
import io.github.nguyenyou.mupdfjs.mupdf.mupdfInts.`0`
import io.github.nguyenyou.mupdfjs.mupdf.mupdfInts.`180`
import io.github.nguyenyou.mupdfjs.mupdf.mupdfInts.`270`
import io.github.nguyenyou.mupdfjs.mupdf.mupdfInts.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "PDFDocument")
@js.native
open class PDFDocument ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.PDFDocument {
  def this(clone: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFDocument) = this()
  def this(data: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Buffer) = this()
  def this(data: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Stream) = this()
  def this(data: js.typedarray.ArrayBuffer) = this()
  def this(data: js.typedarray.Uint8Array) = this()
  def this(filename: String) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_document'> */ Any) = this()
  
  def attachFile(name: String, data: Buffer): Unit = js.native
  def attachFile(name: String, data: Buffer, options: Filename): Unit = js.native
  def attachFile(name: String, data: js.typedarray.ArrayBuffer): Unit = js.native
  def attachFile(name: String, data: js.typedarray.ArrayBuffer, options: Filename): Unit = js.native
  def attachFile(name: String, data: js.typedarray.Uint8Array): Unit = js.native
  def attachFile(name: String, data: js.typedarray.Uint8Array, options: Filename): Unit = js.native
  
  def authenticate(password: String): Double = js.native
  
  def copyPage(pno: Double): Unit = js.native
  def copyPage(pno: Double, to: Double): Unit = js.native
  
  /* private */ var copyPageAnnotations: Any = js.native
  
  /* private */ var copyPageLinks: Any = js.native
  
  def deletePages(args: Any*): Unit = js.native
  
  /* private */ var getPageLabel: Any = js.native
  
  def getPageLabels(): js.Array[PageLabelRule] = js.native
  
  def getPageNumbers(label: String): js.Array[Double] = js.native
  def getPageNumbers(label: String, onlyOne: Boolean): js.Array[Double] = js.native
  
  /* private */ var guessMimeType: Any = js.native
  
  def merge(
    sourcePDF: io.github.nguyenyou.mupdfjs.mupdf.mod.PDFDocument,
    fromPage: js.UndefOr[Double],
    toPage: js.UndefOr[Double],
    startAt: js.UndefOr[Double],
    rotate: js.UndefOr[`0` | `90` | `180` | `270`],
    copyLinks: js.UndefOr[Boolean],
    copyAnnotations: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def newPage(): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage = js.native
  def newPage(pno: Double): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage = js.native
  def newPage(pno: Double, width: Double): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage = js.native
  def newPage(pno: Double, width: Double, height: Double): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage = js.native
  def newPage(pno: Double, width: Unit, height: Double): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage = js.native
  def newPage(pno: Unit, width: Double): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage = js.native
  def newPage(pno: Unit, width: Double, height: Double): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage = js.native
  def newPage(pno: Unit, width: Unit, height: Double): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage = js.native
  
  def scrub(options: AttachedFiles): Unit = js.native
  
  def setPageLabelsArray(labels: js.Array[PageLabelRule]): Unit = js.native
  
  def split(): js.Array[PDFDocument] = js.native
  def split(range: js.Array[Double]): js.Array[PDFDocument] = js.native
  
  /* private */ var toAlpha: Any = js.native
  
  /* private */ var toRoman: Any = js.native
}
/* static members */
object PDFDocument {
  
  @JSImport("mupdf/dist/mupdfjs", "PDFDocument")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlankDocument(): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlankDocument")().asInstanceOf[PDFDocument]
  inline def createBlankDocument(width: Double): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlankDocument")(width.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  inline def createBlankDocument(width: Double, height: Double): PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlankDocument")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PDFDocument]
  inline def createBlankDocument(width: Unit, height: Double): PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlankDocument")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PDFDocument]
  
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.mod.Buffer): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.mod.Buffer, magic: String): PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[PDFDocument]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.mod.Stream): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.mod.Stream, magic: String): PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[PDFDocument]
  inline def openDocument(from: String): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  inline def openDocument(from: String, magic: String): PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[PDFDocument]
  inline def openDocument(from: js.typedarray.ArrayBuffer): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  inline def openDocument(from: js.typedarray.ArrayBuffer, magic: String): PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[PDFDocument]
  inline def openDocument(from: js.typedarray.Uint8Array): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  inline def openDocument(from: js.typedarray.Uint8Array, magic: String): PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[PDFDocument]
}
