package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFontFace extends StObject {
  
  var _inspectFont: Any
  
  var disableFontFace: Any
  
  var systemFontInfo: Any
}
object DisableFontFace {
  
  inline def apply(_inspectFont: Any, disableFontFace: Any, systemFontInfo: Any): DisableFontFace = {
    val __obj = js.Dynamic.literal(_inspectFont = _inspectFont.asInstanceOf[js.Any], disableFontFace = disableFontFace.asInstanceOf[js.Any], systemFontInfo = systemFontInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableFontFace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableFontFace] (val x: Self) extends AnyVal {
    
    inline def setDisableFontFace(value: Any): Self = StObject.set(x, "disableFontFace", value.asInstanceOf[js.Any])
    
    inline def setSystemFontInfo(value: Any): Self = StObject.set(x, "systemFontInfo", value.asInstanceOf[js.Any])
    
    inline def set_inspectFont(value: Any): Self = StObject.set(x, "_inspectFont", value.asInstanceOf[js.Any])
  }
}
