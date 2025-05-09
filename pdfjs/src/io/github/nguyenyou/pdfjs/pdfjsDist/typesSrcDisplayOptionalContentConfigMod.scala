package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PreserveRB
import io.github.nguyenyou.pdfjs.std.MapIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayOptionalContentConfigMod {
  
  @JSImport("pdfjs-dist/types/src/display/optional_content_config", "OptionalContentConfig")
  @js.native
  open class OptionalContentConfig protected () extends StObject {
    def this(data: Any) = this()
    def this(data: Any, renderingIntent: Double) = this()
    
    var creator: Any = js.native
    
    def getGroup(id: Any): Any = js.native
    
    def getHash(): String = js.native
    
    def getOrder(): Any = js.native
    
    def hasInitialVisibility: Boolean = js.native
    
    def isVisible(group: Any): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[MapIterator[js.Tuple2[Any, Any]]] = js.native
    
    var name: Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    var renderingIntent: Double = js.native
    
    def setOCGState(param0: PreserveRB): Unit = js.native
    
    def setVisibility(id: Any): Unit = js.native
    def setVisibility(id: Any, visible: Boolean): Unit = js.native
    def setVisibility(id: Any, visible: Boolean, preserveRB: Boolean): Unit = js.native
    def setVisibility(id: Any, visible: Unit, preserveRB: Boolean): Unit = js.native
  }
}
