package io.github.nguyenyou.pdfjs.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplaySvgFactoryMod {
  
  @JSImport("pdfjs-dist/types/src/display/svg_factory", "BaseSVGFactory")
  @js.native
  open class BaseSVGFactory () extends StObject {
    
    /**
      * @ignore
      */
    def _createSVG(`type`: Any): Unit = js.native
    
    def create(width: Any, height: Any): Unit = js.native
    def create(width: Any, height: Any, skipDimensions: Boolean): Unit = js.native
    
    def createElement(`type`: Any): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/svg_factory", "DOMSVGFactory")
  @js.native
  open class DOMSVGFactory () extends BaseSVGFactory
}
