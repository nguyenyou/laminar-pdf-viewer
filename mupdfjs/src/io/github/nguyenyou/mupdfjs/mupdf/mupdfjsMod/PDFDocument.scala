package io.github.nguyenyou.mupdfjs.mupdf.mupdfjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/mupdfjs", "PDFDocument")
@js.native
open class PDFDocument ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument {
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
  
  @JSImport("mupdf/mupdfjs", "PDFDocument")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlankDocument(): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlankDocument")().asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def createBlankDocument(width: Double): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlankDocument")(width.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def createBlankDocument(width: Double, height: Double): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlankDocument")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def createBlankDocument(width: Unit, height: Double): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlankDocument")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.mod.Buffer): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.mod.Buffer, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.mod.Stream): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.mod.Stream, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: String, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: js.typedarray.ArrayBuffer): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: js.typedarray.ArrayBuffer, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: js.typedarray.Uint8Array): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
  inline def openDocument(from: js.typedarray.Uint8Array, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod.PDFDocument]
}
