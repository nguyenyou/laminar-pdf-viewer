package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamily extends StObject {
  
  var fontFamily: Any
  
  var fontStyle: Any
  
  var fontWeight: Any
}
object FontFamily {
  
  inline def apply(fontFamily: Any, fontStyle: Any, fontWeight: Any): FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFamily] (val x: Self) extends AnyVal {
    
    inline def setFontFamily(value: Any): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: Any): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
  }
}
