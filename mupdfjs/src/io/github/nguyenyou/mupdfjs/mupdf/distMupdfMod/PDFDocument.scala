package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.anon.CreationDate
import io.github.nguyenyou.mupdfjs.mupdf.anon.Position
import io.github.nguyenyou.mupdfjs.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "PDFDocument")
@js.native
open class PDFDocument () extends Document {
  def this(clone: PDFDocument) = this()
  def this(data: Buffer) = this()
  def this(data: Stream) = this()
  def this(data: js.typedarray.ArrayBuffer) = this()
  def this(data: js.typedarray.Uint8Array) = this()
  def this(filename: String) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_document'> */ Any) = this()
  
  def _PDFOBJ(obj: Any): Any = js.native
  
  def _fromPDFObjectKeep(
    ptr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_obj'> */ Any
  ): PDFObject = js.native
  
  def _fromPDFObjectNew(
    ptr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_obj'> */ Any
  ): PDFObject = js.native
  
  def _rewriteEmbeddedFiles(efs: Record[String, PDFObject]): Unit = js.native
  
  def _toPDFObject(obj: Any): PDFObject = js.native
  
  def abandonOperation(): Unit = js.native
  
  def addCJKFont(font: Font, lang: FontCJKLanguage): PDFObject = js.native
  def addCJKFont(font: Font, lang: FontCJKLanguage, wmode: Double): PDFObject = js.native
  def addCJKFont(font: Font, lang: FontCJKLanguage, wmode: Double, serif: Boolean): PDFObject = js.native
  def addCJKFont(font: Font, lang: FontCJKLanguage, wmode: Unit, serif: Boolean): PDFObject = js.native
  def addCJKFont(font: Font, lang: FontCJKOrdering): PDFObject = js.native
  def addCJKFont(font: Font, lang: FontCJKOrdering, wmode: Double): PDFObject = js.native
  def addCJKFont(font: Font, lang: FontCJKOrdering, wmode: Double, serif: Boolean): PDFObject = js.native
  def addCJKFont(font: Font, lang: FontCJKOrdering, wmode: Unit, serif: Boolean): PDFObject = js.native
  
  def addEmbeddedFile(filename: String, mimetype: String, contents: AnyBuffer, created: js.Date, modified: js.Date): PDFObject = js.native
  def addEmbeddedFile(
    filename: String,
    mimetype: String,
    contents: AnyBuffer,
    created: js.Date,
    modified: js.Date,
    checksum: Boolean
  ): PDFObject = js.native
  
  def addFont(font: Font): PDFObject = js.native
  
  def addImage(image: Image): PDFObject = js.native
  
  def addObject(obj: Any): PDFObject = js.native
  
  def addPage(mediabox: Rect, rotate: Rotate, resources: Any, contents: AnyBuffer): PDFObject = js.native
  
  def addRawStream(buf: AnyBuffer, obj: Any): PDFObject = js.native
  
  def addSimpleFont(font: Font): PDFObject = js.native
  def addSimpleFont(font: Font, encoding: FontSimpleEncoding): PDFObject = js.native
  
  def addStream(buf: AnyBuffer, obj: Any): PDFObject = js.native
  
  def bake(): Unit = js.native
  def bake(bakeAnnots: Boolean): Unit = js.native
  def bake(bakeAnnots: Boolean, bakeWidgets: Boolean): Unit = js.native
  def bake(bakeAnnots: Unit, bakeWidgets: Boolean): Unit = js.native
  
  def beginImplicitOperation(): Unit = js.native
  
  def beginOperation(op: String): Unit = js.native
  
  def canBeSavedIncrementally(): Boolean = js.native
  
  def canRedo(): Boolean = js.native
  
  def canUndo(): Boolean = js.native
  
  def countLayers(): Double = js.native
  
  def countObjects(): Double = js.native
  
  def countUnsavedVersions(): Double = js.native
  
  def countVersions(): Double = js.native
  
  def createObject(): PDFObject = js.native
  
  def deleteEmbeddedFile(filename: String): Unit = js.native
  
  def deleteObject(num: PDFObject): Unit = js.native
  def deleteObject(num: Double): Unit = js.native
  
  def deletePage(at: Double): Unit = js.native
  
  def deletePageLabels(index: Double): Unit = js.native
  
  def disableJS(): Unit = js.native
  
  def enableJS(): Unit = js.native
  
  def enableJournal(): Unit = js.native
  
  def endOperation(): Unit = js.native
  
  def findPage(index: Double): PDFObject = js.native
  
  def getEmbeddedFileContents(ref: PDFObject): Buffer | Null = js.native
  
  def getEmbeddedFileParams(ref: PDFObject): CreationDate = js.native
  
  def getEmbeddedFiles(): Record[String, PDFObject] = js.native
  
  def getJournal(): Position = js.native
  
  def getLanguage(): String = js.native
  
  def getLayerName(layer: Double): String = js.native
  
  def getTrailer(): PDFObject = js.native
  
  def getVersion(): Double = js.native
  
  def graftObject(obj: PDFObject): PDFObject = js.native
  
  def graftPage(to: Double, srcDoc: PDFDocument, srcPage: Double): Unit = js.native
  
  def hasUnsavedChanges(): Boolean = js.native
  
  def insertEmbeddedFile(filename: String, filespec: PDFObject): Unit = js.native
  
  def insertPage(at: Double, obj: PDFObject): Unit = js.native
  
  def isEmbeddedFile(ref: PDFObject): Double = js.native
  
  def isJSSupported(): Boolean = js.native
  
  def isLayerVisible(layer: Double): Boolean = js.native
  
  def loadImage(ref: PDFObject): Image = js.native
  
  def loadNameTree(treeName: String): Record[String, PDFObject] = js.native
  
  def newArray(): PDFObject = js.native
  def newArray(cap: Double): PDFObject = js.native
  
  def newBoolean(v: Boolean): PDFObject = js.native
  
  def newByteString(v: js.typedarray.Uint8Array): PDFObject = js.native
  
  def newDictionary(): PDFObject = js.native
  def newDictionary(cap: Double): PDFObject = js.native
  
  def newGraftMap(): PDFGraftMap = js.native
  
  def newIndirect(v: Double): PDFObject = js.native
  
  def newInteger(v: Double): PDFObject = js.native
  
  def newName(v: String): PDFObject = js.native
  
  def newNull(): PDFObject = js.native
  
  def newReal(v: Double): PDFObject = js.native
  
  def newString(v: String): PDFObject = js.native
  
  def rearrangePages(pages: js.Array[Double]): Unit = js.native
  
  def redo(): Unit = js.native
  
  def resetForm(fields: PDFObject, exclude: Boolean): Unit = js.native
  
  def save(filename: String): Unit = js.native
  def save(filename: String, options: Record[String, Any]): Unit = js.native
  def save(filename: String, options: String): Unit = js.native
  
  def saveToBuffer(): Buffer = js.native
  def saveToBuffer(options: Record[String, Any]): Buffer = js.native
  def saveToBuffer(options: String): Buffer = js.native
  
  def setJSEventListener(_listener: Any): Unit = js.native
  
  def setLanguage(lang: String): Unit = js.native
  
  def setLayerVisible(layer: Double, visible: Boolean): Unit = js.native
  
  def setPageLabels(index: Double): Unit = js.native
  def setPageLabels(index: Double, style: String): Unit = js.native
  def setPageLabels(index: Double, style: String, prefix: String): Unit = js.native
  def setPageLabels(index: Double, style: String, prefix: String, start: Double): Unit = js.native
  def setPageLabels(index: Double, style: String, prefix: Unit, start: Double): Unit = js.native
  def setPageLabels(index: Double, style: Unit, prefix: String): Unit = js.native
  def setPageLabels(index: Double, style: Unit, prefix: String, start: Double): Unit = js.native
  def setPageLabels(index: Double, style: Unit, prefix: Unit, start: Double): Unit = js.native
  
  def subsetFonts(): Unit = js.native
  
  def undo(): Unit = js.native
  
  def validateChangeHistory(): Double = js.native
  
  def wasRepaired(): Boolean = js.native
}
/* static members */
object PDFDocument {
  
  @JSImport("mupdf/dist/mupdf", "PDFDocument.PAGE_LABEL_ALPHA_LC")
  @js.native
  val PAGE_LABEL_ALPHA_LC: /* "a" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFDocument.PAGE_LABEL_ALPHA_UC")
  @js.native
  val PAGE_LABEL_ALPHA_UC: /* "A" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFDocument.PAGE_LABEL_DECIMAL")
  @js.native
  val PAGE_LABEL_DECIMAL: /* "D" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFDocument.PAGE_LABEL_NONE")
  @js.native
  val PAGE_LABEL_NONE: /* "\\u0000" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFDocument.PAGE_LABEL_ROMAN_LC")
  @js.native
  val PAGE_LABEL_ROMAN_LC: /* "r" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFDocument.PAGE_LABEL_ROMAN_UC")
  @js.native
  val PAGE_LABEL_ROMAN_UC: /* "R" */ String = js.native
}
