package io.github.nguyenyou.comlink.std

import org.scalajs.dom.WebGLShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_debug_shaders) */
trait WEBGLDebugShaders extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_debug_shaders/getTranslatedShaderSource) */
  /* standard dom */
  def getTranslatedShaderSource(shader: WebGLShader): String
}
object WEBGLDebugShaders {
  
  inline def apply(getTranslatedShaderSource: WebGLShader => String): WEBGLDebugShaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = js.Any.fromFunction1(getTranslatedShaderSource))
    __obj.asInstanceOf[WEBGLDebugShaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLDebugShaders] (val x: Self) extends AnyVal {
    
    inline def setGetTranslatedShaderSource(value: WebGLShader => String): Self = StObject.set(x, "getTranslatedShaderSource", js.Any.fromFunction1(value))
  }
}
