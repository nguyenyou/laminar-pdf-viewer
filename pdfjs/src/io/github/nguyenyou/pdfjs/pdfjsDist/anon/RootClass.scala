package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootClass extends StObject {
  
  var bbox: js.Array[Double]
  
  var root: ViewBoxString
  
  var rootClass: Draw
}
object RootClass {
  
  inline def apply(bbox: js.Array[Double], root: ViewBoxString, rootClass: Draw): RootClass = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rootClass = rootClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootClass] (val x: Self) extends AnyVal {
    
    inline def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value*))
    
    inline def setRoot(value: ViewBoxString): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootClass(value: Draw): Self = StObject.set(x, "rootClass", value.asInstanceOf[js.Any])
  }
}
