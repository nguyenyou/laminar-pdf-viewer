package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberOfColors extends StObject {
  
  var numberOfColors: Any
}
object NumberOfColors {
  
  inline def apply(numberOfColors: Any): NumberOfColors = {
    val __obj = js.Dynamic.literal(numberOfColors = numberOfColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfColors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberOfColors] (val x: Self) extends AnyVal {
    
    inline def setNumberOfColors(value: Any): Self = StObject.set(x, "numberOfColors", value.asInstanceOf[js.Any])
  }
}
