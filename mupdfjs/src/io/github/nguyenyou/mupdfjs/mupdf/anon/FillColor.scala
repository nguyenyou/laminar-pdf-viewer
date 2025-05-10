package io.github.nguyenyou.mupdfjs.mupdf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillColor extends StObject {
  
  var fillColor: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color
  
  var strokeColor: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color
  
  var strokeThickness: Double
}
object FillColor {
  
  inline def apply(
    fillColor: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color,
    strokeColor: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color,
    strokeThickness: Double
  ): FillColor = {
    val __obj = js.Dynamic.literal(fillColor = fillColor.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeThickness = strokeThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillColor] (val x: Self) extends AnyVal {
    
    inline def setFillColor(value: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorVarargs(value: Double*): Self = StObject.set(x, "fillColor", js.Array(value*))
    
    inline def setStrokeColor(value: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorVarargs(value: Double*): Self = StObject.set(x, "strokeColor", js.Array(value*))
    
    inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
  }
}
