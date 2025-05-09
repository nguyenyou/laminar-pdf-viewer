package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var path: D
}
object Path {
  
  inline def apply(path: D): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    inline def setPath(value: D): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
