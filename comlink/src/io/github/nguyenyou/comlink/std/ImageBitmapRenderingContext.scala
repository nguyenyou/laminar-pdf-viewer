package io.github.nguyenyou.comlink.std

import org.scalajs.dom.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext) */
@js.native
trait ImageBitmapRenderingContext
  extends StObject
     with _OffscreenRenderingContext
     with _RenderingContext {
  
  /**
    * Returns the canvas element that the context is bound to.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/canvas)
    */
  /* standard dom */
  val canvas: HTMLCanvasElement | OffscreenCanvas = js.native
  
  /**
    * Transfers the underlying bitmap data from imageBitmap to context, and the bitmap becomes the contents of the canvas element to which context is bound.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap)
    */
  /* standard dom */
  def transferFromImageBitmap(): Unit = js.native
  def transferFromImageBitmap(bitmap: ImageBitmap): Unit = js.native
}
