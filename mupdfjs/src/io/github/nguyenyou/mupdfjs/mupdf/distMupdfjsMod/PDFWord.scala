package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFWord extends StObject {
  
  var font: io.github.nguyenyou.mupdfjs.mupdf.mod.Font
  
  var rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect
  
  var size: Double
  
  var text: String
}
object PDFWord {
  
  inline def apply(
    font: io.github.nguyenyou.mupdfjs.mupdf.mod.Font,
    rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect,
    size: Double,
    text: String
  ): PDFWord = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFWord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFWord] (val x: Self) extends AnyVal {
    
    inline def setFont(value: io.github.nguyenyou.mupdfjs.mupdf.mod.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setRect(value: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
