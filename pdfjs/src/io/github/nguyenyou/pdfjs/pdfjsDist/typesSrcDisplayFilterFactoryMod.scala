package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.DocId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayFilterFactoryMod {
  
  @JSImport("pdfjs-dist/types/src/display/filter_factory", "BaseFilterFactory")
  @js.native
  open class BaseFilterFactory () extends StObject {
    
    def addAlphaFilter(map: Any): String = js.native
    
    def addFilter(maps: Any): String = js.native
    
    def addHCMFilter(fgColor: Any, bgColor: Any): String = js.native
    
    def addHighlightHCMFilter(filterName: Any, fgColor: Any, bgColor: Any, newFgColor: Any, newBgColor: Any): String = js.native
    
    def addLuminosityFilter(map: Any): String = js.native
    
    def destroy(): Unit = js.native
    def destroy(keepHCM: Boolean): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/filter_factory", "DOMFilterFactory")
  @js.native
  open class DOMFilterFactory protected () extends BaseFilterFactory {
    def this(param0: DocId) = this()
    
    /* private */ var `private`: Any = js.native
  }
}
