package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageIndex extends StObject {
  
  var pageIndex: Any
}
object PageIndex {
  
  inline def apply(pageIndex: Any): PageIndex = {
    val __obj = js.Dynamic.literal(pageIndex = pageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageIndex] (val x: Self) extends AnyVal {
    
    inline def setPageIndex(value: Any): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
  }
}
