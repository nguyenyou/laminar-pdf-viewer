package io.github.nguyenyou.mupdfjs.mupdf.anon

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bbox extends StObject {
  
  var bbox: Rect
  
  var image: io.github.nguyenyou.mupdfjs.mupdf.mod.Image
  
  var matrix: Matrix
}
object Bbox {
  
  inline def apply(bbox: Rect, image: io.github.nguyenyou.mupdfjs.mupdf.mod.Image, matrix: Matrix): Bbox = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bbox] (val x: Self) extends AnyVal {
    
    inline def setBbox(value: Rect): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setImage(value: io.github.nguyenyou.mupdfjs.mupdf.mod.Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
