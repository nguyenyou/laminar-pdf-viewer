package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.std.Map
import io.github.nguyenyou.pdfjs.std.Set
import io.github.nguyenyou.pdfjs.std.WeakMap
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayTextLayerMod {
  
  @JSImport("pdfjs-dist/types/src/display/text_layer", "TextLayer")
  @js.native
  open class TextLayer protected () extends StObject {
    /**
      * @param {TextLayerParameters} options
      */
    def this(param0: TextLayerParameters) = this()
    
    /**
      * Cancel rendering of the textLayer.
      * @returns {undefined}
      */
    def cancel(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Render the textLayer.
      * @returns {Promise}
      */
    def render(): js.Promise[Any] = js.native
    
    /**
      * @type {Array<string>} Strings that correspond to the `str` property of
      *   the text items of the textContent input.
      *   This is output and will initially be set to an empty array
      */
    def textContentItemsStr: js.Array[String] = js.native
    
    /**
      * @type {Array<HTMLElement>} HTML elements that correspond to the text items
      *   of the textContent input.
      *   This is output and will initially be set to an empty array.
      */
    def textDivs: js.Array[HTMLElement] = js.native
    
    /**
      * Update a previously rendered textLayer, if necessary.
      * @param {TextLayerUpdateParameters} options
      * @returns {undefined}
      */
    def update(param0: TextLayerUpdateParameters): Unit = js.native
  }
  /* static members */
  object TextLayer {
    
    @JSImport("pdfjs-dist/types/src/display/text_layer", "TextLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/text_layer", "TextLayer.__#54@#ascentCache")
    @js.native
    val `__Numbersign54@NumbersignascentCache`: Map[Any, Any] = js.native
    
    @JSImport("pdfjs-dist/types/src/display/text_layer", "TextLayer.__#54@#canvasContexts")
    @js.native
    val `__Numbersign54@NumbersigncanvasContexts`: Map[Any, Any] = js.native
    
    @JSImport("pdfjs-dist/types/src/display/text_layer", "TextLayer.__#54@#canvasCtxFonts")
    @js.native
    val `__Numbersign54@NumbersigncanvasCtxFonts`: WeakMap[js.Object, Any] = js.native
    
    inline def `__Numbersign54@NumbersignensureCtxFont`(ctx: Any, size: Any, family: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#54@#ensureCtxFont")(ctx.asInstanceOf[js.Any], size.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Compute the minimum font size enforced by the browser.
      */
    inline def `__Numbersign54@NumbersignensureMinFontSizeComputed`(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__#54@#ensureMinFontSizeComputed")().asInstanceOf[Unit]
    
    inline def `__Numbersign54@NumbersigngetAscent`(fontFamily: Any, style: Any, lang: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__#54@#getAscent")(fontFamily.asInstanceOf[js.Any], style.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def `__Numbersign54@NumbersigngetCtx`(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__#54@#getCtx")().asInstanceOf[Any]
    
    @JSImport("pdfjs-dist/types/src/display/text_layer", "TextLayer.__#54@#minFontSize")
    @js.native
    val `__Numbersign54@NumbersignminFontSize`: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/text_layer", "TextLayer.__#54@#pendingTextLayers")
    @js.native
    val `__Numbersign54@NumbersignpendingTextLayers`: Set[Any] = js.native
    
    /**
      * Clean-up global textLayer data.
      * @returns {undefined}
      */
    inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
  }
  
  type PageViewport = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport
  
  type TextContent = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.TextContent
  
  trait TextLayerParameters extends StObject {
    
    /**
      * - The DOM node that will contain the text
      * runs.
      */
    var container: HTMLElement
    
    /**
      * - Text content to
      * render, i.e. the value returned by the page's `streamTextContent` or
      * `getTextContent` method.
      */
    var textContentSource: ReadableStream[Any] | TextContent
    
    /**
      * - The target viewport to properly layout
      * the text runs.
      */
    var viewport: PageViewport
  }
  object TextLayerParameters {
    
    inline def apply(
      container: HTMLElement,
      textContentSource: ReadableStream[Any] | TextContent,
      viewport: PageViewport
    ): TextLayerParameters = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], textContentSource = textContentSource.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextLayerParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextLayerParameters] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setTextContentSource(value: ReadableStream[Any] | TextContent): Self = StObject.set(x, "textContentSource", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextLayerUpdateParameters extends StObject {
    
    /**
      * - Callback invoked before the textLayer is
      * updated in the DOM.
      */
    var onBefore: js.UndefOr[js.Function] = js.undefined
    
    /**
      * - The target viewport to properly layout
      * the text runs.
      */
    var viewport: PageViewport
  }
  object TextLayerUpdateParameters {
    
    inline def apply(viewport: PageViewport): TextLayerUpdateParameters = {
      val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextLayerUpdateParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextLayerUpdateParameters] (val x: Self) extends AnyVal {
      
      inline def setOnBefore(value: js.Function): Self = StObject.set(x, "onBefore", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeUndefined: Self = StObject.set(x, "onBefore", js.undefined)
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
}
