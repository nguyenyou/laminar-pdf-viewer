package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayTouchManagerMod {
  
  @JSImport("pdfjs-dist/types/src/display/touch_manager", "TouchManager")
  @js.native
  open class TouchManager protected () extends StObject {
    def this(param0: Container) = this()
    
    /**
      * NOTE: Don't shadow this value since `devicePixelRatio` may change if the
      * window resolution changes, e.g. if the viewer is moved to another monitor.
      */
    def MIN_TOUCH_DISTANCE_TO_PINCH: Double = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
