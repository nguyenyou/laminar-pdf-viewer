package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceFunctions extends StObject {
  
  var beginGroup: js.UndefOr[
    js.Function6[
      /* bbox */ Rect, 
      /* colorspace */ ColorSpace, 
      /* isolated */ Boolean, 
      /* knockout */ Boolean, 
      /* blendmode */ BlendMode, 
      /* alpha */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var beginLayer: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  
  var beginMask: js.UndefOr[
    js.Function4[
      /* bbox */ Rect, 
      /* luminosity */ Boolean, 
      /* colorspace */ ColorSpace, 
      /* color */ js.Array[Double], 
      Unit
    ]
  ] = js.undefined
  
  var beginTile: js.UndefOr[
    js.Function6[
      /* area */ Rect, 
      /* view */ Rect, 
      /* xstep */ Double, 
      /* ystep */ Double, 
      /* ctm */ Matrix, 
      /* id */ Double, 
      Double
    ]
  ] = js.undefined
  
  var clipImageMask: js.UndefOr[js.Function2[/* image */ Image, /* ctm */ Matrix, Unit]] = js.undefined
  
  var clipPath: js.UndefOr[js.Function3[/* path */ Path, /* evenOdd */ Boolean, /* ctm */ Matrix, Unit]] = js.undefined
  
  var clipStrokePath: js.UndefOr[js.Function3[/* path */ Path, /* stroke */ StrokeState, /* ctm */ Matrix, Unit]] = js.undefined
  
  var clipStrokeText: js.UndefOr[js.Function3[/* text */ Text, /* stroke */ StrokeState, /* ctm */ Matrix, Unit]] = js.undefined
  
  var clipText: js.UndefOr[js.Function2[/* text */ Text, /* ctm */ Matrix, Unit]] = js.undefined
  
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var drop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var endGroup: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var endLayer: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var endMask: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var endTile: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fillImage: js.UndefOr[js.Function3[/* image */ Image, /* ctm */ Matrix, /* alpha */ Double, Unit]] = js.undefined
  
  var fillImageMask: js.UndefOr[
    js.Function5[
      /* image */ Image, 
      /* ctm */ Matrix, 
      /* colorspace */ ColorSpace, 
      /* color */ js.Array[Double], 
      /* alpha */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var fillPath: js.UndefOr[
    js.Function6[
      /* path */ Path, 
      /* evenOdd */ Boolean, 
      /* ctm */ Matrix, 
      /* colorspace */ ColorSpace, 
      /* color */ js.Array[Double], 
      /* alpha */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var fillShade: js.UndefOr[js.Function3[/* shade */ Shade, /* ctm */ Matrix, /* alpha */ Double, Unit]] = js.undefined
  
  var fillText: js.UndefOr[
    js.Function5[
      /* text */ Text, 
      /* ctm */ Matrix, 
      /* colorspace */ ColorSpace, 
      /* color */ js.Array[Double], 
      /* alpha */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var ignoreText: js.UndefOr[js.Function2[/* text */ Text, /* ctm */ Matrix, Unit]] = js.undefined
  
  var popClip: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var strokePath: js.UndefOr[
    js.Function6[
      /* path */ Path, 
      /* stroke */ StrokeState, 
      /* ctm */ Matrix, 
      /* colorspace */ ColorSpace, 
      /* color */ js.Array[Double], 
      /* alpha */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var strokeText: js.UndefOr[
    js.Function6[
      /* text */ Text, 
      /* stroke */ StrokeState, 
      /* ctm */ Matrix, 
      /* colorspace */ ColorSpace, 
      /* color */ js.Array[Double], 
      /* alpha */ Double, 
      Unit
    ]
  ] = js.undefined
}
object DeviceFunctions {
  
  inline def apply(): DeviceFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFunctions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceFunctions] (val x: Self) extends AnyVal {
    
    inline def setBeginGroup(
      value: (/* bbox */ Rect, /* colorspace */ ColorSpace, /* isolated */ Boolean, /* knockout */ Boolean, /* blendmode */ BlendMode, /* alpha */ Double) => Unit
    ): Self = StObject.set(x, "beginGroup", js.Any.fromFunction6(value))
    
    inline def setBeginGroupUndefined: Self = StObject.set(x, "beginGroup", js.undefined)
    
    inline def setBeginLayer(value: /* name */ String => Unit): Self = StObject.set(x, "beginLayer", js.Any.fromFunction1(value))
    
    inline def setBeginLayerUndefined: Self = StObject.set(x, "beginLayer", js.undefined)
    
    inline def setBeginMask(
      value: (/* bbox */ Rect, /* luminosity */ Boolean, /* colorspace */ ColorSpace, /* color */ js.Array[Double]) => Unit
    ): Self = StObject.set(x, "beginMask", js.Any.fromFunction4(value))
    
    inline def setBeginMaskUndefined: Self = StObject.set(x, "beginMask", js.undefined)
    
    inline def setBeginTile(
      value: (/* area */ Rect, /* view */ Rect, /* xstep */ Double, /* ystep */ Double, /* ctm */ Matrix, /* id */ Double) => Double
    ): Self = StObject.set(x, "beginTile", js.Any.fromFunction6(value))
    
    inline def setBeginTileUndefined: Self = StObject.set(x, "beginTile", js.undefined)
    
    inline def setClipImageMask(value: (/* image */ Image, /* ctm */ Matrix) => Unit): Self = StObject.set(x, "clipImageMask", js.Any.fromFunction2(value))
    
    inline def setClipImageMaskUndefined: Self = StObject.set(x, "clipImageMask", js.undefined)
    
    inline def setClipPath(value: (/* path */ Path, /* evenOdd */ Boolean, /* ctm */ Matrix) => Unit): Self = StObject.set(x, "clipPath", js.Any.fromFunction3(value))
    
    inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    inline def setClipStrokePath(value: (/* path */ Path, /* stroke */ StrokeState, /* ctm */ Matrix) => Unit): Self = StObject.set(x, "clipStrokePath", js.Any.fromFunction3(value))
    
    inline def setClipStrokePathUndefined: Self = StObject.set(x, "clipStrokePath", js.undefined)
    
    inline def setClipStrokeText(value: (/* text */ Text, /* stroke */ StrokeState, /* ctm */ Matrix) => Unit): Self = StObject.set(x, "clipStrokeText", js.Any.fromFunction3(value))
    
    inline def setClipStrokeTextUndefined: Self = StObject.set(x, "clipStrokeText", js.undefined)
    
    inline def setClipText(value: (/* text */ Text, /* ctm */ Matrix) => Unit): Self = StObject.set(x, "clipText", js.Any.fromFunction2(value))
    
    inline def setClipTextUndefined: Self = StObject.set(x, "clipText", js.undefined)
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDrop(value: () => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction0(value))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setEndGroup(value: () => Unit): Self = StObject.set(x, "endGroup", js.Any.fromFunction0(value))
    
    inline def setEndGroupUndefined: Self = StObject.set(x, "endGroup", js.undefined)
    
    inline def setEndLayer(value: () => Unit): Self = StObject.set(x, "endLayer", js.Any.fromFunction0(value))
    
    inline def setEndLayerUndefined: Self = StObject.set(x, "endLayer", js.undefined)
    
    inline def setEndMask(value: () => Unit): Self = StObject.set(x, "endMask", js.Any.fromFunction0(value))
    
    inline def setEndMaskUndefined: Self = StObject.set(x, "endMask", js.undefined)
    
    inline def setEndTile(value: () => Unit): Self = StObject.set(x, "endTile", js.Any.fromFunction0(value))
    
    inline def setEndTileUndefined: Self = StObject.set(x, "endTile", js.undefined)
    
    inline def setFillImage(value: (/* image */ Image, /* ctm */ Matrix, /* alpha */ Double) => Unit): Self = StObject.set(x, "fillImage", js.Any.fromFunction3(value))
    
    inline def setFillImageMask(
      value: (/* image */ Image, /* ctm */ Matrix, /* colorspace */ ColorSpace, /* color */ js.Array[Double], /* alpha */ Double) => Unit
    ): Self = StObject.set(x, "fillImageMask", js.Any.fromFunction5(value))
    
    inline def setFillImageMaskUndefined: Self = StObject.set(x, "fillImageMask", js.undefined)
    
    inline def setFillImageUndefined: Self = StObject.set(x, "fillImage", js.undefined)
    
    inline def setFillPath(
      value: (/* path */ Path, /* evenOdd */ Boolean, /* ctm */ Matrix, /* colorspace */ ColorSpace, /* color */ js.Array[Double], /* alpha */ Double) => Unit
    ): Self = StObject.set(x, "fillPath", js.Any.fromFunction6(value))
    
    inline def setFillPathUndefined: Self = StObject.set(x, "fillPath", js.undefined)
    
    inline def setFillShade(value: (/* shade */ Shade, /* ctm */ Matrix, /* alpha */ Double) => Unit): Self = StObject.set(x, "fillShade", js.Any.fromFunction3(value))
    
    inline def setFillShadeUndefined: Self = StObject.set(x, "fillShade", js.undefined)
    
    inline def setFillText(
      value: (/* text */ Text, /* ctm */ Matrix, /* colorspace */ ColorSpace, /* color */ js.Array[Double], /* alpha */ Double) => Unit
    ): Self = StObject.set(x, "fillText", js.Any.fromFunction5(value))
    
    inline def setFillTextUndefined: Self = StObject.set(x, "fillText", js.undefined)
    
    inline def setIgnoreText(value: (/* text */ Text, /* ctm */ Matrix) => Unit): Self = StObject.set(x, "ignoreText", js.Any.fromFunction2(value))
    
    inline def setIgnoreTextUndefined: Self = StObject.set(x, "ignoreText", js.undefined)
    
    inline def setPopClip(value: () => Unit): Self = StObject.set(x, "popClip", js.Any.fromFunction0(value))
    
    inline def setPopClipUndefined: Self = StObject.set(x, "popClip", js.undefined)
    
    inline def setStrokePath(
      value: (/* path */ Path, /* stroke */ StrokeState, /* ctm */ Matrix, /* colorspace */ ColorSpace, /* color */ js.Array[Double], /* alpha */ Double) => Unit
    ): Self = StObject.set(x, "strokePath", js.Any.fromFunction6(value))
    
    inline def setStrokePathUndefined: Self = StObject.set(x, "strokePath", js.undefined)
    
    inline def setStrokeText(
      value: (/* text */ Text, /* stroke */ StrokeState, /* ctm */ Matrix, /* colorspace */ ColorSpace, /* color */ js.Array[Double], /* alpha */ Double) => Unit
    ): Self = StObject.set(x, "strokeText", js.Any.fromFunction6(value))
    
    inline def setStrokeTextUndefined: Self = StObject.set(x, "strokeText", js.undefined)
  }
}
