package io.github.nguyenyou.mupdfjs.mupdf.anon

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationLineEndingStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: PDFAnnotationLineEndingStyle
  
  var start: PDFAnnotationLineEndingStyle
}
object End {
  
  inline def apply(end: PDFAnnotationLineEndingStyle, start: PDFAnnotationLineEndingStyle): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: PDFAnnotationLineEndingStyle): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: PDFAnnotationLineEndingStyle): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
