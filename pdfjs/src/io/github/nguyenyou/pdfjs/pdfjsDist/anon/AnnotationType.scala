package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationType extends StObject {
  
  var annotationType: Double
  
  var areContours: Boolean
  
  var color: js.Array[Double]
  
  var isSignature: Boolean
  
  var pageIndex: Double
  
  var rect: Any
  
  var rotation: Double
  
  var structTreeParentId: Any
  
  var thickness: Any
}
object AnnotationType {
  
  inline def apply(
    annotationType: Double,
    areContours: Boolean,
    color: js.Array[Double],
    isSignature: Boolean,
    pageIndex: Double,
    rect: Any,
    rotation: Double,
    structTreeParentId: Any,
    thickness: Any
  ): AnnotationType = {
    val __obj = js.Dynamic.literal(annotationType = annotationType.asInstanceOf[js.Any], areContours = areContours.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], isSignature = isSignature.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], structTreeParentId = structTreeParentId.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationType] (val x: Self) extends AnyVal {
    
    inline def setAnnotationType(value: Double): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAreContours(value: Boolean): Self = StObject.set(x, "areContours", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setIsSignature(value: Boolean): Self = StObject.set(x, "isSignature", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Any): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setStructTreeParentId(value: Any): Self = StObject.set(x, "structTreeParentId", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
