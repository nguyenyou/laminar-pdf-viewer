package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Filename
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayStandardFontdataFactoryMod {
  
  @JSImport("pdfjs-dist/types/src/display/standard_fontdata_factory", "BaseStandardFontDataFactory")
  @js.native
  open class BaseStandardFontDataFactory protected () extends StObject {
    def this(param0: `0`) = this()
    
    /**
      * @ignore
      * @returns {Promise<Uint8Array>}
      */
    def _fetch(url: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    
    var baseUrl: Any = js.native
    
    def fetch(param0: Filename): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/standard_fontdata_factory", "DOMStandardFontDataFactory")
  @js.native
  open class DOMStandardFontDataFactory protected () extends BaseStandardFontDataFactory {
    def this(param0: `0`) = this()
  }
}
