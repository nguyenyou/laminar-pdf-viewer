package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMapData extends StObject {
  
  var cMapData: js.typedarray.Uint8Array
  
  var isCompressed: Boolean
}
object CMapData {
  
  inline def apply(cMapData: js.typedarray.Uint8Array, isCompressed: Boolean): CMapData = {
    val __obj = js.Dynamic.literal(cMapData = cMapData.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMapData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CMapData] (val x: Self) extends AnyVal {
    
    inline def setCMapData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cMapData", value.asInstanceOf[js.Any])
    
    inline def setIsCompressed(value: Boolean): Self = StObject.set(x, "isCompressed", value.asInstanceOf[js.Any])
  }
}
