package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.anon.RecordDocumentPermissionn
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.LinkDestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "Document")
@js.native
open class Document ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.Document
/* static members */
object Document {
  
  @JSImport("mupdf/dist/mupdfjs", "Document")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.LINK_DEST")
  @js.native
  val LINK_DEST: js.Array[LinkDestType] = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_ENCRYPTION")
  @js.native
  val META_ENCRYPTION: /* "encryption" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_FORMAT")
  @js.native
  val META_FORMAT: /* "format" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_INFO_AUTHOR")
  @js.native
  val META_INFO_AUTHOR: /* "info:Author" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_INFO_CREATIONDATE")
  @js.native
  val META_INFO_CREATIONDATE: /* "info:CreationDate" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_INFO_CREATOR")
  @js.native
  val META_INFO_CREATOR: /* "info:Creator" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_INFO_KEYWORDS")
  @js.native
  val META_INFO_KEYWORDS: /* "info:Keywords" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_INFO_MODIFICATIONDATE")
  @js.native
  val META_INFO_MODIFICATIONDATE: /* "info:ModDate" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_INFO_PRODUCER")
  @js.native
  val META_INFO_PRODUCER: /* "info:Producer" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_INFO_SUBJECT")
  @js.native
  val META_INFO_SUBJECT: /* "info:Subject" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.META_INFO_TITLE")
  @js.native
  val META_INFO_TITLE: /* "info:Title" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "Document.PERMISSION")
  @js.native
  val PERMISSION: RecordDocumentPermissionn = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_document'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Buffer): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Buffer, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Stream): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Stream, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: String, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: js.typedarray.ArrayBuffer): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: js.typedarray.ArrayBuffer, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: js.typedarray.Uint8Array): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
  inline def openDocument(from: js.typedarray.Uint8Array, magic: String): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Document]
}
