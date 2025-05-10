package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkDest extends StObject {
  
  var chapter: Double
  
  var height: Double
  
  var page: Double
  
  var `type`: LinkDestType
  
  var width: Double
  
  var x: Double
  
  var y: Double
  
  var zoom: Double
}
object LinkDest {
  
  inline def apply(
    chapter: Double,
    height: Double,
    page: Double,
    `type`: LinkDestType,
    width: Double,
    x: Double,
    y: Double,
    zoom: Double
  ): LinkDest = {
    val __obj = js.Dynamic.literal(chapter = chapter.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkDest] (val x: Self) extends AnyVal {
    
    inline def setChapter(value: Double): Self = StObject.set(x, "chapter", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setType(value: LinkDestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
