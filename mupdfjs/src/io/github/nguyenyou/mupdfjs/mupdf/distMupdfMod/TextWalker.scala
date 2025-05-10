package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextWalker extends StObject {
  
  var beginSpan: js.UndefOr[
    js.Function6[
      /* font */ Font, 
      /* trm */ Matrix, 
      /* wmode */ Double, 
      /* bidi */ Double, 
      /* markupDirection */ Double, 
      /* language */ String, 
      Unit
    ]
  ] = js.undefined
  
  var endSpan: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showGlyph: js.UndefOr[
    js.Function6[
      /* font */ Font, 
      /* trm */ Matrix, 
      /* glyph */ Double, 
      /* unicode */ Double, 
      /* wmode */ Double, 
      /* bidi */ Double, 
      Unit
    ]
  ] = js.undefined
}
object TextWalker {
  
  inline def apply(): TextWalker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextWalker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextWalker] (val x: Self) extends AnyVal {
    
    inline def setBeginSpan(
      value: (/* font */ Font, /* trm */ Matrix, /* wmode */ Double, /* bidi */ Double, /* markupDirection */ Double, /* language */ String) => Unit
    ): Self = StObject.set(x, "beginSpan", js.Any.fromFunction6(value))
    
    inline def setBeginSpanUndefined: Self = StObject.set(x, "beginSpan", js.undefined)
    
    inline def setEndSpan(value: () => Unit): Self = StObject.set(x, "endSpan", js.Any.fromFunction0(value))
    
    inline def setEndSpanUndefined: Self = StObject.set(x, "endSpan", js.undefined)
    
    inline def setShowGlyph(
      value: (/* font */ Font, /* trm */ Matrix, /* glyph */ Double, /* unicode */ Double, /* wmode */ Double, /* bidi */ Double) => Unit
    ): Self = StObject.set(x, "showGlyph", js.Any.fromFunction6(value))
    
    inline def setShowGlyphUndefined: Self = StObject.set(x, "showGlyph", js.undefined)
  }
}
