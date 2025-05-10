package io.github.nguyenyou.mupdfjs.mupdf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var image: io.github.nguyenyou.mupdfjs.mupdf.mod.Image
  
  var name: String
}
object Image {
  
  inline def apply(image: io.github.nguyenyou.mupdfjs.mupdf.mod.Image, name: String): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    inline def setImage(value: io.github.nguyenyou.mupdfjs.mupdf.mod.Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
