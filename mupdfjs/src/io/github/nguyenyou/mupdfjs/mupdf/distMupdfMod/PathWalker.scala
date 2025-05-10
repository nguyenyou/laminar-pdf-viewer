package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathWalker extends StObject {
  
  var closePath: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var curveTo: js.UndefOr[
    js.Function6[
      /* x1 */ Double, 
      /* y1 */ Double, 
      /* x2 */ Double, 
      /* y2 */ Double, 
      /* x3 */ Double, 
      /* y3 */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var lineTo: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  
  var moveTo: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
}
object PathWalker {
  
  inline def apply(): PathWalker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathWalker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathWalker] (val x: Self) extends AnyVal {
    
    inline def setClosePath(value: () => Unit): Self = StObject.set(x, "closePath", js.Any.fromFunction0(value))
    
    inline def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    inline def setCurveTo(
      value: (/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, /* x3 */ Double, /* y3 */ Double) => Unit
    ): Self = StObject.set(x, "curveTo", js.Any.fromFunction6(value))
    
    inline def setCurveToUndefined: Self = StObject.set(x, "curveTo", js.undefined)
    
    inline def setLineTo(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "lineTo", js.Any.fromFunction2(value))
    
    inline def setLineToUndefined: Self = StObject.set(x, "lineTo", js.undefined)
    
    inline def setMoveTo(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction2(value))
    
    inline def setMoveToUndefined: Self = StObject.set(x, "moveTo", js.undefined)
  }
}
