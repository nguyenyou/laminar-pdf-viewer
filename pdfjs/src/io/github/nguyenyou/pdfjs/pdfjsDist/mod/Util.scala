package io.github.nguyenyou.pdfjs.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist", "Util")
@js.native
open class Util ()
  extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcSharedUtilMod.Util
/* static members */
object Util {
  
  @JSImport("pdfjs-dist", "Util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def `__Numbersign1@NumbersigngetExtremum`(
    x0: Any,
    x1: Any,
    x2: Any,
    x3: Any,
    y0: Any,
    y1: Any,
    y2: Any,
    y3: Any,
    a: Any,
    b: Any,
    c: Any,
    minMax: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#1@#getExtremum")(x0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], minMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def `__Numbersign1@NumbersigngetExtremumOnCurve`(x0: Any, x1: Any, x2: Any, x3: Any, y0: Any, y1: Any, y2: Any, y3: Any, t: Any, minMax: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#1@#getExtremumOnCurve")(x0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], t.asInstanceOf[js.Any], minMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyInverseTransform(p: Any, m: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyInverseTransform")(p.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyTransform(p: Any, m: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(p.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyTransform(p: Any, m: Any, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(p.asInstanceOf[js.Any], m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyTransformToBezier(p: Any, transform: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformToBezier")(p.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyTransformToBezier(p: Any, transform: Any, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformToBezier")(p.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def axialAlignedBoundingBox(rect: Any, transform: Any, output: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("axialAlignedBoundingBox")(rect.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bezierBoundingBox(x0: Any, y0: Any, x1: Any, y1: Any, x2: Any, y2: Any, x3: Any, y3: Any, minMax: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bezierBoundingBox")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], minMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def intersect(rect1: Any, rect2: Any): js.Array[Double] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(rect1.asInstanceOf[js.Any], rect2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | Null]
  
  inline def inverseTransform(m: Any): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("inverseTransform")(m.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def makeHexColor(r: Any, g: Any, b: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeHexColor")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def normalizeRect(rect: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRect")(rect.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def pointBoundingBox(x: Any, y: Any, minMax: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pointBoundingBox")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], minMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rectBoundingBox(x0: Any, y0: Any, x1: Any, y1: Any, minMax: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectBoundingBox")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], minMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scaleMinMax(transform: Any, minMax: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleMinMax")(transform.asInstanceOf[js.Any], minMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def singularValueDecompose2dScale(matrix: Any, output: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("singularValueDecompose2dScale")(matrix.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transform(m1: Any, m2: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
