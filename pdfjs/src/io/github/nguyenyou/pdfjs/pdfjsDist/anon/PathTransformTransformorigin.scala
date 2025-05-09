package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTransformTransformorigin extends StObject {
  
  var path: TransformTransformorigin
}
object PathTransformTransformorigin {
  
  inline def apply(path: TransformTransformorigin): PathTransformTransformorigin = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTransformTransformorigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTransformTransformorigin] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TransformTransformorigin): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
