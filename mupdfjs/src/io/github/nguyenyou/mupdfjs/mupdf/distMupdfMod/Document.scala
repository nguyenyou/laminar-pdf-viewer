package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.anon.RecordDocumentPermissionn
import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.any_document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Document")
@js.native
open class Document ()
  extends StObject
     with Userdata[any_document] {
  
  def authenticatePassword(password: String): Double = js.native
  
  def countPages(): Double = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def formatLinkURI(dest: LinkDest): String = js.native
  
  def getMetaData(key: String): js.UndefOr[String] = js.native
  
  def hasPermission(perm: DocumentPermission): Boolean = js.native
  
  def isPDF(): Boolean = js.native
  
  def isReflowable(): Unit = js.native
  
  def layout(w: Double, h: Double, em: Double): Unit = js.native
  
  def loadOutline(): js.Array[OutlineItem] | Null = js.native
  
  def loadPage(index: Double): PDFPage | Page = js.native
  
  def needsPassword(): Boolean = js.native
  
  def outlineIterator(): OutlineIterator = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def resolveLink(link: Link): Double = js.native
  def resolveLink(link: String): Double = js.native
  
  def resolveLinkDestination(link: Link): LinkDest = js.native
  def resolveLinkDestination(link: String): LinkDest = js.native
  
  def setMetaData(key: String, value: String): Unit = js.native
}
/* static members */
object Document {
  
  @JSImport("mupdf/dist/mupdf", "Document")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.LINK_DEST")
  @js.native
  val LINK_DEST: js.Array[LinkDestType] = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_ENCRYPTION")
  @js.native
  val META_ENCRYPTION: /* "encryption" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_FORMAT")
  @js.native
  val META_FORMAT: /* "format" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_INFO_AUTHOR")
  @js.native
  val META_INFO_AUTHOR: /* "info:Author" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_INFO_CREATIONDATE")
  @js.native
  val META_INFO_CREATIONDATE: /* "info:CreationDate" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_INFO_CREATOR")
  @js.native
  val META_INFO_CREATOR: /* "info:Creator" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_INFO_KEYWORDS")
  @js.native
  val META_INFO_KEYWORDS: /* "info:Keywords" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_INFO_MODIFICATIONDATE")
  @js.native
  val META_INFO_MODIFICATIONDATE: /* "info:ModDate" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_INFO_PRODUCER")
  @js.native
  val META_INFO_PRODUCER: /* "info:Producer" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_INFO_SUBJECT")
  @js.native
  val META_INFO_SUBJECT: /* "info:Subject" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.META_INFO_TITLE")
  @js.native
  val META_INFO_TITLE: /* "info:Title" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "Document.PERMISSION")
  @js.native
  val PERMISSION: RecordDocumentPermissionn = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_document'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def openDocument(from: Buffer): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def openDocument(from: Buffer, magic: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[Document]
  inline def openDocument(from: Stream): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def openDocument(from: Stream, magic: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[Document]
  inline def openDocument(from: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def openDocument(from: String, magic: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[Document]
  inline def openDocument(from: js.typedarray.ArrayBuffer): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def openDocument(from: js.typedarray.ArrayBuffer, magic: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[Document]
  inline def openDocument(from: js.typedarray.Uint8Array): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def openDocument(from: js.typedarray.Uint8Array, magic: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(from.asInstanceOf[js.Any], magic.asInstanceOf[js.Any])).asInstanceOf[Document]
}
