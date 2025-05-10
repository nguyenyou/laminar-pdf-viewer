package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Path")
@js.native
open class Path ()
  extends StObject
     with Userdata[fz_path] {
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_path'> */ Any) = this()
  
  def closePath(): Unit = js.native
  
  def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Unit = js.native
  
  def curveToV(cx: Double, cy: Double, ex: Double, ey: Double): Unit = js.native
  
  def curveToY(cx: Double, cy: Double, ex: Double, ey: Double): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getBounds(strokeState: StrokeState, transform: Matrix): Rect = js.native
  
  def lineTo(x: Double, y: Double): Unit = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def rect(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  
  def transform(matrix: Matrix): Unit = js.native
  
  def walk(walker: PathWalker): Unit = js.native
}
/* static members */
object Path {
  
  @JSImport("mupdf/dist/mupdf", "Path")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_path'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
