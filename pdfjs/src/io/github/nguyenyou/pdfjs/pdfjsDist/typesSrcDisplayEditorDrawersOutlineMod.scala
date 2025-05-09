package io.github.nguyenyou.pdfjs.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorDrawersOutlineMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/drawers/outline", "Outline")
  @js.native
  open class Outline () extends StObject {
    
    /**
      * @type {Object|null} The bounding box of the outline.
      */
    def box: js.Object | Null = js.native
    
    def serialize(_bbox: Any, _rotation: Any): Unit = js.native
    
    /**
      * @returns {string} The SVG path of the outline.
      */
    def toSVGPath(): String = js.native
  }
  /* static members */
  object Outline {
    
    @JSImport("pdfjs-dist/types/src/display/editor/drawers/outline", "Outline")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/drawers/outline", "Outline.PRECISION")
    @js.native
    def PRECISION: Double = js.native
    inline def PRECISION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRECISION")(x.asInstanceOf[js.Any])
    
    inline def _normalizePagePoint(x: Any, y: Any, rotation: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_normalizePagePoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def _normalizePoint(x: Any, y: Any, parentWidth: Any, parentHeight: Any, rotation: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_normalizePoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], parentWidth.asInstanceOf[js.Any], parentHeight.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def _rescale(src: Any, tx: Any, ty: Any, sx: Any, sy: Any, dest: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_rescale")(src.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def _rescaleAndSwap(src: Any, tx: Any, ty: Any, sx: Any, sy: Any, dest: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_rescaleAndSwap")(src.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def _translate(src: Any, tx: Any, ty: Any, dest: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_translate")(src.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def createBezierPoints(x1: Any, y1: Any, x2: Any, y2: Any, x3: Any, y3: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBezierPoints")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def svgRound(x: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("svgRound")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
