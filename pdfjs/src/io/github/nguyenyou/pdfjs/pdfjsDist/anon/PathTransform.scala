package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTransform extends StObject {
  
  var path: Transform
}
object PathTransform {
  
  inline def apply(path: Transform): PathTransform = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTransform] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Transform): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
