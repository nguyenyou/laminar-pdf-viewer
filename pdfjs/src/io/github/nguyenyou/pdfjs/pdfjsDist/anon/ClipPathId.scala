package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipPathId extends StObject {
  
  var clipPathId: String
  
  var id: Double
}
object ClipPathId {
  
  inline def apply(clipPathId: String, id: Double): ClipPathId = {
    val __obj = js.Dynamic.literal(clipPathId = clipPathId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipPathId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipPathId] (val x: Self) extends AnyVal {
    
    inline def setClipPathId(value: String): Self = StObject.set(x, "clipPathId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
