package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.BaseUrl
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.CMapData
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.NameAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayCmapReaderFactoryMod {
  
  @JSImport("pdfjs-dist/types/src/display/cmap_reader_factory", "BaseCMapReaderFactory")
  @js.native
  open class BaseCMapReaderFactory protected () extends StObject {
    def this(param0: BaseUrl) = this()
    
    /**
      * @ignore
      * @returns {Promise<Uint8Array>}
      */
    def _fetch(url: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    
    var baseUrl: Any = js.native
    
    def fetch(param0: NameAny): js.Promise[CMapData] = js.native
    
    var isCompressed: Boolean = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/cmap_reader_factory", "DOMCMapReaderFactory")
  @js.native
  open class DOMCMapReaderFactory protected () extends BaseCMapReaderFactory {
    def this(param0: BaseUrl) = this()
  }
}
