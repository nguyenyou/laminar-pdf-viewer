package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationElementIdAny extends StObject {
  
  var annotationElementId: Any
}
object AnnotationElementIdAny {
  
  inline def apply(annotationElementId: Any): AnnotationElementIdAny = {
    val __obj = js.Dynamic.literal(annotationElementId = annotationElementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationElementIdAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationElementIdAny] (val x: Self) extends AnyVal {
    
    inline def setAnnotationElementId(value: Any): Self = StObject.set(x, "annotationElementId", value.asInstanceOf[js.Any])
  }
}
