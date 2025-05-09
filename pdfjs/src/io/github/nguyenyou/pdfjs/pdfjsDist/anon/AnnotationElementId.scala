package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationElementId extends StObject {
  
  var annotationElementId: Any
  
  var id: Any
}
object AnnotationElementId {
  
  inline def apply(annotationElementId: Any, id: Any): AnnotationElementId = {
    val __obj = js.Dynamic.literal(annotationElementId = annotationElementId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationElementId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationElementId] (val x: Self) extends AnyVal {
    
    inline def setAnnotationElementId(value: Any): Self = StObject.set(x, "annotationElementId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
