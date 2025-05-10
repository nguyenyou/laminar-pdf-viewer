package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.anon.Bbox
import io.github.nguyenyou.mupdfjs.mupdf.anon.FillColor
import io.github.nguyenyou.mupdfjs.mupdf.anon.Height
import io.github.nguyenyou.mupdfjs.mupdf.anon.Key
import io.github.nguyenyou.mupdfjs.mupdf.anon.Width
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationType
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "PDFPage")
@js.native
open class PDFPage protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage {
  def this(
    doc: io.github.nguyenyou.mupdfjs.mupdf.mod.PDFDocument,
    page: io.github.nguyenyou.mupdfjs.mupdf.mod.PDFPage
  ) = this()
  def this(doc: io.github.nguyenyou.mupdfjs.mupdf.mod.PDFDocument, page: Double) = this()
  
  def addAnnotation(`type`: PDFAnnotationType, metrics: Width): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFAnnotation = js.native
  def addAnnotation(`type`: PDFAnnotationType, metrics: Width, author: String): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFAnnotation = js.native
  def addAnnotation(`type`: PDFAnnotationType, metrics: Width, author: String, contents: String): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFAnnotation = js.native
  def addAnnotation(`type`: PDFAnnotationType, metrics: Width, author: Unit, contents: String): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFAnnotation = js.native
  
  def addRedaction(metrics: Width): io.github.nguyenyou.mupdfjs.mupdf.mod.PDFAnnotation = js.native
  
  def delete(ref: io.github.nguyenyou.mupdfjs.mupdf.mod.Link): Unit = js.native
  def delete(ref: io.github.nguyenyou.mupdfjs.mupdf.mod.PDFAnnotation): Unit = js.native
  def delete(ref: io.github.nguyenyou.mupdfjs.mupdf.mod.PDFWidget): Unit = js.native
  def delete(ref: String): Unit = js.native
  
  def getImages(): js.Array[Bbox] = js.native
  
  def getResourcesXrefObjects(): js.Array[Key] = js.native
  
  def getText(): String = js.native
  
  def getWords(): js.Array[PDFWord] = js.native
  
  def insertImage(data: io.github.nguyenyou.mupdfjs.mupdf.anon.Image): Unit = js.native
  def insertImage(data: io.github.nguyenyou.mupdfjs.mupdf.anon.Image, metrics: Height): Unit = js.native
  
  def insertLink(metrics: Width, uri: String): Unit = js.native
  
  def insertText(value: String, point: Point): Unit = js.native
  def insertText(value: String, point: Point, fontName: String): Unit = js.native
  def insertText(value: String, point: Point, fontName: String, fontSize: Double): Unit = js.native
  def insertText(value: String, point: Point, fontName: String, fontSize: Double, graphics: FillColor): Unit = js.native
  def insertText(value: String, point: Point, fontName: String, fontSize: Unit, graphics: FillColor): Unit = js.native
  def insertText(value: String, point: Point, fontName: Unit, fontSize: Double): Unit = js.native
  def insertText(value: String, point: Point, fontName: Unit, fontSize: Double, graphics: FillColor): Unit = js.native
  def insertText(value: String, point: Point, fontName: Unit, fontSize: Unit, graphics: FillColor): Unit = js.native
  
  def rotate(r: Double): Unit = js.native
  
  def setArtBox(rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Unit = js.native
  
  def setBleedBox(rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Unit = js.native
  
  def setCropBox(rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Unit = js.native
  
  def setMediaBox(rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Unit = js.native
  
  def setTrimBox(rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Unit = js.native
}
