package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineItem extends StObject {
  
  var down: js.UndefOr[js.Array[OutlineItem]] = js.undefined
  
  var open: Boolean
  
  var page: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
}
object OutlineItem {
  
  inline def apply(open: Boolean): OutlineItem = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlineItem] (val x: Self) extends AnyVal {
    
    inline def setDown(value: js.Array[OutlineItem]): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setDownVarargs(value: OutlineItem*): Self = StObject.set(x, "down", js.Array(value*))
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
