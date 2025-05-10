package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.pdf_obj
import io.github.nguyenyou.mupdfjs.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "PDFObject")
@js.native
open class PDFObject protected ()
  extends StObject
     with Userdata[pdf_obj] {
  def this(
    doc: PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_obj'> */ Any
  ) = this()
  
  var _doc: PDFDocument = js.native
  
  def _get(path: PDFObjectPath): Any = js.native
  
  def asBoolean(): Boolean = js.native
  
  def asByteString(): js.typedarray.Uint8Array = js.native
  
  def asIndirect(): Double = js.native
  
  def asJS(): Any = js.native
  def asJS(seen: Record[Double, PDFObject]): Any = js.native
  
  def asName(): String = js.native
  
  def asNumber(): Double = js.native
  
  def asString(): String = js.native
  
  def delete(key: PDFObject): Unit = js.native
  def delete(key: String): Unit = js.native
  def delete(key: Double): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def forEach(fn: js.Function3[/* val */ this.type, /* key */ Double | String, /* self */ this.type, Unit]): Unit = js.native
  
  def get(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param path because its type PDFObjectPath is not an array type */ path: PDFObjectPath
  ): PDFObject = js.native
  
  def getBoolean(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param path because its type PDFObjectPath is not an array type */ path: PDFObjectPath
  ): Boolean = js.native
  
  def getIndirect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param path because its type PDFObjectPath is not an array type */ path: PDFObjectPath
  ): Double = js.native
  
  def getInheritable(key: PDFObject): PDFObject = js.native
  def getInheritable(key: String): PDFObject = js.native
  
  def getName(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param path because its type PDFObjectPath is not an array type */ path: PDFObjectPath
  ): String = js.native
  
  def getNumber(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param path because its type PDFObjectPath is not an array type */ path: PDFObjectPath
  ): Double = js.native
  
  def getString(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param path because its type PDFObjectPath is not an array type */ path: PDFObjectPath
  ): String = js.native
  
  def isArray(): Boolean = js.native
  
  def isBoolean(): Boolean = js.native
  
  def isDictionary(): Boolean = js.native
  
  def isIndirect(): Boolean = js.native
  
  def isInteger(): Boolean = js.native
  
  def isName(): Boolean = js.native
  
  def isNull(): Boolean = js.native
  
  def isNumber(): Boolean = js.native
  
  def isStream(): Boolean = js.native
  
  def isString(): Boolean = js.native
  
  def length: Any = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def push(value: Any): Any = js.native
  
  def put(key: PDFObject, value: Any): Any = js.native
  def put(key: String, value: Any): Any = js.native
  def put(key: Double, value: Any): Any = js.native
  
  def readRawStream(): Buffer = js.native
  
  def readStream(): Buffer = js.native
  
  def resolve(): PDFObject = js.native
  
  def toString(tight: Boolean): String = js.native
  def toString(tight: Boolean, ascii: Boolean): String = js.native
  def toString(tight: Unit, ascii: Boolean): String = js.native
  
  def writeObject(obj: Any): Unit = js.native
  
  def writeRawStream(buf: AnyBuffer): Unit = js.native
  
  def writeStream(buf: AnyBuffer): Unit = js.native
}
/* static members */
object PDFObject {
  
  @JSImport("mupdf/dist/mupdf", "PDFObject")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFObject.Null")
  @js.native
  val Null: PDFObject = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_obj'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
