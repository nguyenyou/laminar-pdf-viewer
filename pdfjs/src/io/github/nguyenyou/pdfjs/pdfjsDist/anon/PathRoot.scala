package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRoot extends StObject {
  
  var path: Transformorigin
  
  var root: ViewBox
}
object PathRoot {
  
  inline def apply(path: Transformorigin, root: ViewBox): PathRoot = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRoot] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Transformorigin): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: ViewBox): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
