package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bbox extends StObject {
  
  var bbox: Any
  
  var path: DTransformTransformorigin
  
  var root: ViewBox
  
  var rootClass: Draw
}
object Bbox {
  
  inline def apply(bbox: Any, path: DTransformTransformorigin, root: ViewBox, rootClass: Draw): Bbox = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rootClass = rootClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bbox] (val x: Self) extends AnyVal {
    
    inline def setBbox(value: Any): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setPath(value: DTransformTransformorigin): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: ViewBox): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootClass(value: Draw): Self = StObject.set(x, "rootClass", value.asInstanceOf[js.Any])
  }
}
