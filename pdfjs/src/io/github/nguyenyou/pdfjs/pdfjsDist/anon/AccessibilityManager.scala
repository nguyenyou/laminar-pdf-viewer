package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityManager extends StObject {
  
  var accessibilityManager: Any
  
  var annotationCanvasMap: Any
  
  var annotationEditorUIManager: Any
  
  var div: Any
  
  var page: Any
  
  var structTreeLayer: Any
  
  var viewport: Any
}
object AccessibilityManager {
  
  inline def apply(
    accessibilityManager: Any,
    annotationCanvasMap: Any,
    annotationEditorUIManager: Any,
    div: Any,
    page: Any,
    structTreeLayer: Any,
    viewport: Any
  ): AccessibilityManager = {
    val __obj = js.Dynamic.literal(accessibilityManager = accessibilityManager.asInstanceOf[js.Any], annotationCanvasMap = annotationCanvasMap.asInstanceOf[js.Any], annotationEditorUIManager = annotationEditorUIManager.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], structTreeLayer = structTreeLayer.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityManager] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityManager(value: Any): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
    
    inline def setAnnotationCanvasMap(value: Any): Self = StObject.set(x, "annotationCanvasMap", value.asInstanceOf[js.Any])
    
    inline def setAnnotationEditorUIManager(value: Any): Self = StObject.set(x, "annotationEditorUIManager", value.asInstanceOf[js.Any])
    
    inline def setDiv(value: Any): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setStructTreeLayer(value: Any): Self = StObject.set(x, "structTreeLayer", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Any): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
