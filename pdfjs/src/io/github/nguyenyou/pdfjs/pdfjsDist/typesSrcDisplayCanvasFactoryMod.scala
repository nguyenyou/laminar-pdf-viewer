package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Context
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.EnableHWA
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.OwnerDocument
import org.scalajs.dom.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayCanvasFactoryMod {
  
  @JSImport("pdfjs-dist/types/src/display/canvas_factory", "BaseCanvasFactory")
  @js.native
  open class BaseCanvasFactory protected () extends StObject {
    def this(param0: EnableHWA) = this()
    
    /**
      * @ignore
      */
    def _createCanvas(width: Any, height: Any): Unit = js.native
    
    def create(width: Any, height: Any): Context = js.native
    
    def destroy(canvasAndContext: Any): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def reset(canvasAndContext: Any, width: Any, height: Any): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/canvas_factory", "DOMCanvasFactory")
  @js.native
  open class DOMCanvasFactory protected () extends BaseCanvasFactory {
    def this(param0: OwnerDocument) = this()
    
    var _document: Document = js.native
  }
}
