package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerMargin extends StObject {
  
  var areContours: Any
  
  var innerMargin: Any
  
  var lines: Any
  
  var mustSmooth: Any
  
  var pageHeight: Any
  
  var pageWidth: Any
  
  var rotation: Any
}
object InnerMargin {
  
  inline def apply(
    areContours: Any,
    innerMargin: Any,
    lines: Any,
    mustSmooth: Any,
    pageHeight: Any,
    pageWidth: Any,
    rotation: Any
  ): InnerMargin = {
    val __obj = js.Dynamic.literal(areContours = areContours.asInstanceOf[js.Any], innerMargin = innerMargin.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], mustSmooth = mustSmooth.asInstanceOf[js.Any], pageHeight = pageHeight.asInstanceOf[js.Any], pageWidth = pageWidth.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerMargin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InnerMargin] (val x: Self) extends AnyVal {
    
    inline def setAreContours(value: Any): Self = StObject.set(x, "areContours", value.asInstanceOf[js.Any])
    
    inline def setInnerMargin(value: Any): Self = StObject.set(x, "innerMargin", value.asInstanceOf[js.Any])
    
    inline def setLines(value: Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setMustSmooth(value: Any): Self = StObject.set(x, "mustSmooth", value.asInstanceOf[js.Any])
    
    inline def setPageHeight(value: Any): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
    
    inline def setPageWidth(value: Any): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Any): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
