package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.BaseUrl
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.EnableHWA
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.`0`
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayCanvasFactoryMod.BaseCanvasFactory
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayCmapReaderFactoryMod.BaseCMapReaderFactory
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayFilterFactoryMod.BaseFilterFactory
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayStandardFontdataFactoryMod.BaseStandardFontDataFactory
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayWasmFactoryMod.BaseWasmFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayNodeUtilsMod {
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", "NodeCMapReaderFactory")
  @js.native
  open class NodeCMapReaderFactory protected () extends BaseCMapReaderFactory {
    def this(param0: BaseUrl) = this()
  }
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", "NodeCanvasFactory")
  @js.native
  open class NodeCanvasFactory protected () extends BaseCanvasFactory {
    def this(param0: EnableHWA) = this()
  }
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", "NodeFilterFactory")
  @js.native
  open class NodeFilterFactory () extends BaseFilterFactory
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", "NodeStandardFontDataFactory")
  @js.native
  open class NodeStandardFontDataFactory protected () extends BaseStandardFontDataFactory {
    def this(param0: `0`) = this()
  }
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", "NodeWasmFactory")
  @js.native
  open class NodeWasmFactory protected () extends BaseWasmFactory {
    def this(param0: `0`) = this()
  }
  
  inline def fetchData(url: Any): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchData")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
