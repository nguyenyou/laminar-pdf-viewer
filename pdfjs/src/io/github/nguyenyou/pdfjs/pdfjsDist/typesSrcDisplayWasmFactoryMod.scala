package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Filename
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayWasmFactoryMod {
  
  @JSImport("pdfjs-dist/types/src/display/wasm_factory", "BaseWasmFactory")
  @js.native
  open class BaseWasmFactory protected () extends StObject {
    def this(param0: `0`) = this()
    
    /**
      * @ignore
      * @returns {Promise<Uint8Array>}
      */
    def _fetch(url: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    
    var baseUrl: Any = js.native
    
    def fetch(param0: Filename): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/wasm_factory", "DOMWasmFactory")
  @js.native
  open class DOMWasmFactory protected () extends BaseWasmFactory {
    def this(param0: `0`) = this()
  }
}
