package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredTextWalker extends StObject {
  
  var beginLine: js.UndefOr[js.Function3[/* bbox */ Rect, /* wmode */ Double, /* direction */ Point, Unit]] = js.undefined
  
  var beginTextBlock: js.UndefOr[js.Function1[/* bbox */ Rect, Unit]] = js.undefined
  
  var endLine: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var endTextBlock: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onChar: js.UndefOr[
    js.Function6[
      /* c */ String, 
      /* origin */ Point, 
      /* font */ Font, 
      /* size */ Double, 
      /* quad */ Quad, 
      /* color */ Color, 
      Unit
    ]
  ] = js.undefined
  
  var onImageBlock: js.UndefOr[js.Function3[/* bbox */ Rect, /* transform */ Matrix, /* image */ Image, Unit]] = js.undefined
}
object StructuredTextWalker {
  
  inline def apply(): StructuredTextWalker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredTextWalker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructuredTextWalker] (val x: Self) extends AnyVal {
    
    inline def setBeginLine(value: (/* bbox */ Rect, /* wmode */ Double, /* direction */ Point) => Unit): Self = StObject.set(x, "beginLine", js.Any.fromFunction3(value))
    
    inline def setBeginLineUndefined: Self = StObject.set(x, "beginLine", js.undefined)
    
    inline def setBeginTextBlock(value: /* bbox */ Rect => Unit): Self = StObject.set(x, "beginTextBlock", js.Any.fromFunction1(value))
    
    inline def setBeginTextBlockUndefined: Self = StObject.set(x, "beginTextBlock", js.undefined)
    
    inline def setEndLine(value: () => Unit): Self = StObject.set(x, "endLine", js.Any.fromFunction0(value))
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setEndTextBlock(value: () => Unit): Self = StObject.set(x, "endTextBlock", js.Any.fromFunction0(value))
    
    inline def setEndTextBlockUndefined: Self = StObject.set(x, "endTextBlock", js.undefined)
    
    inline def setOnChar(
      value: (/* c */ String, /* origin */ Point, /* font */ Font, /* size */ Double, /* quad */ Quad, /* color */ Color) => Unit
    ): Self = StObject.set(x, "onChar", js.Any.fromFunction6(value))
    
    inline def setOnCharUndefined: Self = StObject.set(x, "onChar", js.undefined)
    
    inline def setOnImageBlock(value: (/* bbox */ Rect, /* transform */ Matrix, /* image */ Image) => Unit): Self = StObject.set(x, "onImageBlock", js.Any.fromFunction3(value))
    
    inline def setOnImageBlockUndefined: Self = StObject.set(x, "onImageBlock", js.undefined)
  }
}
