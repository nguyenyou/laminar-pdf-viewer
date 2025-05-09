package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalajs.dom.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageData extends StObject {
  
  var canvas: HTMLCanvasElement | Null
  
  var height: Any
  
  var imageData: Data | Null
  
  var width: Any
}
object ImageData {
  
  inline def apply(height: Any, width: Any): ImageData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], canvas = null, imageData = null)
    __obj.asInstanceOf[ImageData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasNull: Self = StObject.set(x, "canvas", null)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageData(value: Data): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataNull: Self = StObject.set(x, "imageData", null)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
