package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersInkdrawMod.InkDrawOutline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreContoursOutline extends StObject {
  
  var areContours: Any
  
  var outline: InkDrawOutline
}
object AreContoursOutline {
  
  inline def apply(areContours: Any, outline: InkDrawOutline): AreContoursOutline = {
    val __obj = js.Dynamic.literal(areContours = areContours.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreContoursOutline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreContoursOutline] (val x: Self) extends AnyVal {
    
    inline def setAreContours(value: Any): Self = StObject.set(x, "areContours", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: InkDrawOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
