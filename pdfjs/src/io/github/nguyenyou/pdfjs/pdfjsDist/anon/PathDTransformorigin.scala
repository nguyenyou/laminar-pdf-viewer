package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDTransformorigin extends StObject {
  
  var path: DTransformorigin
  
  var root: ViewBox
}
object PathDTransformorigin {
  
  inline def apply(path: DTransformorigin, root: ViewBox): PathDTransformorigin = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDTransformorigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDTransformorigin] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DTransformorigin): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: ViewBox): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
