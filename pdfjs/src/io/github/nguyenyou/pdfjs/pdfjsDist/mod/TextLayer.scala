package io.github.nguyenyou.pdfjs.pdfjsDist.mod

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayTextLayerMod.TextLayerParameters
import io.github.nguyenyou.pdfjs.std.Map
import io.github.nguyenyou.pdfjs.std.Set
import io.github.nguyenyou.pdfjs.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist", "TextLayer")
@js.native
open class TextLayer protected ()
  extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayTextLayerMod.TextLayer {
  /**
    * @param {TextLayerParameters} options
    */
  def this(param0: TextLayerParameters) = this()
}
/* static members */
object TextLayer {
  
  @JSImport("pdfjs-dist", "TextLayer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist", "TextLayer.__#54@#ascentCache")
  @js.native
  val `__Numbersign54@NumbersignascentCache`: Map[Any, Any] = js.native
  
  @JSImport("pdfjs-dist", "TextLayer.__#54@#canvasContexts")
  @js.native
  val `__Numbersign54@NumbersigncanvasContexts`: Map[Any, Any] = js.native
  
  @JSImport("pdfjs-dist", "TextLayer.__#54@#canvasCtxFonts")
  @js.native
  val `__Numbersign54@NumbersigncanvasCtxFonts`: WeakMap[js.Object, Any] = js.native
  
  inline def `__Numbersign54@NumbersignensureCtxFont`(ctx: Any, size: Any, family: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#54@#ensureCtxFont")(ctx.asInstanceOf[js.Any], size.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Compute the minimum font size enforced by the browser.
    */
  inline def `__Numbersign54@NumbersignensureMinFontSizeComputed`(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__#54@#ensureMinFontSizeComputed")().asInstanceOf[Unit]
  
  inline def `__Numbersign54@NumbersigngetAscent`(fontFamily: Any, style: Any, lang: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__#54@#getAscent")(fontFamily.asInstanceOf[js.Any], style.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def `__Numbersign54@NumbersigngetCtx`(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__#54@#getCtx")().asInstanceOf[Any]
  
  @JSImport("pdfjs-dist", "TextLayer.__#54@#minFontSize")
  @js.native
  val `__Numbersign54@NumbersignminFontSize`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  @JSImport("pdfjs-dist", "TextLayer.__#54@#pendingTextLayers")
  @js.native
  val `__Numbersign54@NumbersignpendingTextLayers`: Set[Any] = js.native
  
  /**
    * Clean-up global textLayer data.
    * @returns {undefined}
    */
  inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
}
