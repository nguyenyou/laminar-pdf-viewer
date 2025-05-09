package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.X
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersOutlineMod.Outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorDrawersFreedrawMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/drawers/freedraw", "FreeDrawOutline")
  @js.native
  open class FreeDrawOutline protected () extends Outline {
    def this(outline: Any, points: Any, box: Any, scaleFactor: Any, innerMargin: Any, isLTR: Any) = this()
    
    def getNewOutline(thickness: Any, innerMargin: Any): FreeDrawOutline = js.native
    
    var lastPoint: js.Array[Double] = js.native
    
    def newOutliner(point: Any, box: Any, scaleFactor: Any, thickness: Any, isLTR: Any): FreeDrawOutliner = js.native
    def newOutliner(point: Any, box: Any, scaleFactor: Any, thickness: Any, isLTR: Any, innerMargin: Double): FreeDrawOutliner = js.native
    
    /* private */ var `private`: Any = js.native
    
    def serialize(param0: js.Tuple4[Any, Any, Any, Any], rotation: Any): io.github.nguyenyou.pdfjs.pdfjsDist.anon.Outline = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/drawers/freedraw", "FreeDrawOutliner")
  @js.native
  open class FreeDrawOutliner protected () extends StObject {
    def this(param0: X, box: Any, scaleFactor: Any, thickness: Any, isLTR: Any) = this()
    def this(param0: X, box: Any, scaleFactor: Any, thickness: Any, isLTR: Any, innerMargin: Double) = this()
    
    def add(param0: X): Boolean = js.native
    
    def getOutlines(): FreeDrawOutline = js.native
    
    def isEmpty(): Boolean = js.native
    
    def newFreeDrawOutline(outline: Any, points: Any, box: Any, scaleFactor: Any, innerMargin: Any, isLTR: Any): FreeDrawOutline = js.native
    
    /* private */ var `private`: Any = js.native
    
    def toSVGPath(): String = js.native
  }
  /* static members */
  object FreeDrawOutliner {
    
    @JSImport("pdfjs-dist/types/src/display/editor/drawers/freedraw", "FreeDrawOutliner.__#19@#MIN")
    @js.native
    val `__Numbersign19@NumbersignMIN`: Double = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/drawers/freedraw", "FreeDrawOutliner.__#19@#MIN_DIFF")
    @js.native
    val `__Numbersign19@NumbersignMIN_DIFF`: Double = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/drawers/freedraw", "FreeDrawOutliner.__#19@#MIN_DIST")
    @js.native
    val `__Numbersign19@NumbersignMIN_DIST`: Double = js.native
  }
}
