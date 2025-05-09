package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDTransform extends StObject {
  
  var path: DTransform
  
  var root: ViewBox
}
object PathDTransform {
  
  inline def apply(path: DTransform, root: ViewBox): PathDTransform = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDTransform] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DTransform): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: ViewBox): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
