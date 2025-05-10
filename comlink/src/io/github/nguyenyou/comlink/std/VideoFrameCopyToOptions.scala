package io.github.nguyenyou.comlink.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFrameCopyToOptions extends StObject {
  
  /* standard dom */
  var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
  
  /* standard dom */
  var format: js.UndefOr[VideoPixelFormat] = js.undefined
  
  /* standard dom */
  var layout: js.UndefOr[js.Array[PlaneLayout]] = js.undefined
  
  /* standard dom */
  var rect: js.UndefOr[DOMRectInit] = js.undefined
}
object VideoFrameCopyToOptions {
  
  inline def apply(): VideoFrameCopyToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFrameCopyToOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoFrameCopyToOptions] (val x: Self) extends AnyVal {
    
    inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setFormat(value: VideoPixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLayout(value: js.Array[PlaneLayout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLayoutVarargs(value: PlaneLayout*): Self = StObject.set(x, "layout", js.Array(value*))
    
    inline def setRect(value: DOMRectInit): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
  }
}
