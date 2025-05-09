package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.X
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersFreedrawMod.FreeDrawOutliner
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersOutlineMod.Outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorDrawersHighlightMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/drawers/highlight", "FreeHighlightOutliner")
  @js.native
  open class FreeHighlightOutliner protected () extends FreeDrawOutliner {
    def this(param0: X, box: Any, scaleFactor: Any, thickness: Any, isLTR: Any) = this()
    def this(param0: X, box: Any, scaleFactor: Any, thickness: Any, isLTR: Any, innerMargin: Double) = this()
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/drawers/highlight", "HighlightOutliner")
  @js.native
  open class HighlightOutliner protected () extends StObject {
    /**
      * Construct an outliner.
      * @param {Array<Object>} boxes - An array of axis-aligned rectangles.
      * @param {number} borderWidth - The width of the border of the boxes, it
      *   allows to make the boxes bigger (or smaller).
      * @param {number} innerMargin - The margin between the boxes and the
      *   outlines. It's important to not have a null innerMargin when we want to
      *   draw the outline else the stroked outline could be clipped because of its
      *   width.
      * @param {boolean} isLTR - true if we're in LTR mode. It's used to determine
      *   the last point of the boxes.
      */
    def this(boxes: js.Array[js.Object]) = this()
    def this(boxes: js.Array[js.Object], borderWidth: Double) = this()
    def this(boxes: js.Array[js.Object], borderWidth: Double, innerMargin: Double) = this()
    def this(boxes: js.Array[js.Object], borderWidth: Unit, innerMargin: Double) = this()
    def this(boxes: js.Array[js.Object], borderWidth: Double, innerMargin: Double, isLTR: Boolean) = this()
    def this(boxes: js.Array[js.Object], borderWidth: Double, innerMargin: Unit, isLTR: Boolean) = this()
    def this(boxes: js.Array[js.Object], borderWidth: Unit, innerMargin: Double, isLTR: Boolean) = this()
    def this(boxes: js.Array[js.Object], borderWidth: Unit, innerMargin: Unit, isLTR: Boolean) = this()
    
    def getOutlines(): HighlightOutline = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  @js.native
  trait HighlightOutline extends Outline {
    
    def classNamesForOutlining: js.Array[String] = js.native
    
    var lastPoint: Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Serialize the outlines into the PDF page coordinate system.
      * @param {Array<number>} _bbox - the bounding box of the annotation.
      * @param {number} _rotation - the rotation of the annotation.
      * @returns {Array<Array<number>>}
      */
    def serialize(param0: js.Array[Double], _rotation: Double): js.Array[js.Array[Double]] = js.native
  }
}
