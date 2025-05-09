package io.github.nguyenyou.pdfjs.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace) */
trait FontFace extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/ascentOverride) */
  /* standard dom */
  var ascentOverride: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/descentOverride) */
  /* standard dom */
  var descentOverride: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display) */
  /* standard dom */
  var display: FontDisplay
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/family) */
  /* standard dom */
  var family: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/featureSettings) */
  /* standard dom */
  var featureSettings: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/lineGapOverride) */
  /* standard dom */
  var lineGapOverride: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/load) */
  /* standard dom */
  def load(): js.Promise[FontFace]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/loaded) */
  /* standard dom */
  val loaded: js.Promise[FontFace]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status) */
  /* standard dom */
  val status: FontFaceLoadStatus
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/stretch) */
  /* standard dom */
  var stretch: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/style) */
  /* standard dom */
  var style: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/unicodeRange) */
  /* standard dom */
  var unicodeRange: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/weight) */
  /* standard dom */
  var weight: String
}
object FontFace {
  
  inline def apply(
    ascentOverride: String,
    descentOverride: String,
    display: FontDisplay,
    family: String,
    featureSettings: String,
    lineGapOverride: String,
    load: () => js.Promise[FontFace],
    loaded: js.Promise[FontFace],
    status: FontFaceLoadStatus,
    stretch: String,
    style: String,
    unicodeRange: String,
    weight: String
  ): FontFace = {
    val __obj = js.Dynamic.literal(ascentOverride = ascentOverride.asInstanceOf[js.Any], descentOverride = descentOverride.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], featureSettings = featureSettings.asInstanceOf[js.Any], lineGapOverride = lineGapOverride.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loaded = loaded.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unicodeRange = unicodeRange.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFace] (val x: Self) extends AnyVal {
    
    inline def setAscentOverride(value: String): Self = StObject.set(x, "ascentOverride", value.asInstanceOf[js.Any])
    
    inline def setDescentOverride(value: String): Self = StObject.set(x, "descentOverride", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: FontDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFeatureSettings(value: String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
    
    inline def setLineGapOverride(value: String): Self = StObject.set(x, "lineGapOverride", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: () => js.Promise[FontFace]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setLoaded(value: js.Promise[FontFace]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: FontFaceLoadStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
