package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageLabelRule extends StObject {
  
  var firstpagenum: js.UndefOr[Double] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var startpage: Double
  
  var style: js.UndefOr[String] = js.undefined
}
object PageLabelRule {
  
  inline def apply(startpage: Double): PageLabelRule = {
    val __obj = js.Dynamic.literal(startpage = startpage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLabelRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageLabelRule] (val x: Self) extends AnyVal {
    
    inline def setFirstpagenum(value: Double): Self = StObject.set(x, "firstpagenum", value.asInstanceOf[js.Any])
    
    inline def setFirstpagenumUndefined: Self = StObject.set(x, "firstpagenum", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setStartpage(value: Double): Self = StObject.set(x, "startpage", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
