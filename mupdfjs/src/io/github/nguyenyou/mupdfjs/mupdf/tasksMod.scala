package io.github.nguyenyou.mupdfjs.mupdf

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Quad
import io.github.nguyenyou.mupdfjs.mupdf.mod.PDFDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object tasksMod {
  
  @JSImport("mupdf/tasks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawPageAsHTML(document: PDFDocument, pageNumber: Double, id: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPageAsHTML")(document.asInstanceOf[js.Any], pageNumber.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def drawPageAsPNG(document: PDFDocument, pageNumber: Double, dpi: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPageAsPNG")(document.asInstanceOf[js.Any], pageNumber.asInstanceOf[js.Any], dpi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def drawPageAsSVG(document: PDFDocument, pageNumber: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPageAsSVG")(document.asInstanceOf[js.Any], pageNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPageText(document: PDFDocument, pageNumber: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageText")(document.asInstanceOf[js.Any], pageNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def loadPDF(data: js.typedarray.ArrayBuffer): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPDF")(data.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  inline def loadPDF(data: js.typedarray.Uint8Array): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPDF")(data.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  inline def loadPDF(
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  ): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPDF")(data.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  
  inline def searchPageText(document: PDFDocument, pageNumber: Double, searchString: String): js.Array[js.Array[Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPageText")(document.asInstanceOf[js.Any], pageNumber.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Quad]]]
  inline def searchPageText(document: PDFDocument, pageNumber: Double, searchString: String, maxHits: Double): js.Array[js.Array[Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPageText")(document.asInstanceOf[js.Any], pageNumber.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], maxHits.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Quad]]]
}
