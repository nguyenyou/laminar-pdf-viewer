package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.ClipPathId
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PageIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayDrawLayerMod {
  
  @JSImport("pdfjs-dist/types/src/display/draw_layer", "DrawLayer")
  @js.native
  open class DrawLayer protected () extends StObject {
    def this(param0: PageIndex) = this()
    
    def destroy(): Unit = js.native
    
    def draw(properties: Any): ClipPathId = js.native
    def draw(properties: Any, isPathUpdatable: Boolean): ClipPathId = js.native
    def draw(properties: Any, isPathUpdatable: Boolean, hasClip: Boolean): ClipPathId = js.native
    def draw(properties: Any, isPathUpdatable: Unit, hasClip: Boolean): ClipPathId = js.native
    
    def drawOutline(properties: Any, mustRemoveSelfIntersections: Any): Double = js.native
    
    def finalizeDraw(id: Any, properties: Any): Unit = js.native
    
    var pageIndex: Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    def remove(id: Any): Unit = js.native
    
    def setParent(parent: Any): Unit = js.native
    
    def updateParent(id: Any, layer: Any): Unit = js.native
    
    def updateProperties(elementOrId: Any, properties: Any): Unit = js.native
  }
  /* static members */
  object DrawLayer {
    
    @JSImport("pdfjs-dist/types/src/display/draw_layer", "DrawLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/draw_layer", "DrawLayer.__#33@#id")
    @js.native
    val `__Numbersign33@Numbersignid`: Double = js.native
    
    inline def `__Numbersign33@NumbersignsetBox`(element: Any, param1: js.Tuple4[Any, Any, Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#33@#setBox")(element.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
