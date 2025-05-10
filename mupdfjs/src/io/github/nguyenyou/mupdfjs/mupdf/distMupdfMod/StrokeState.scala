package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_stroke_state
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "StrokeState")
@js.native
open class StrokeState ()
  extends StObject
     with Userdata[fz_stroke_state] {
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_stroke_state'> */ Any) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getLineCap(): Double = js.native
  
  def getLineJoin(): Double = js.native
  
  def getLineWidth(): Double = js.native
  
  def getMiterLimit(): Double = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def setLineCap(j: LineCap): Unit = js.native
  
  def setLineJoin(j: LineJoin): Unit = js.native
  
  def setLineWidth(w: Double): Unit = js.native
  
  def setMiterLimit(m: Double): Unit = js.native
}
/* static members */
object StrokeState {
  
  @JSImport("mupdf/dist/mupdf", "StrokeState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "StrokeState.LINE_CAP")
  @js.native
  val LINE_CAP: js.Array[LineCap] = js.native
  
  @JSImport("mupdf/dist/mupdf", "StrokeState.LINE_JOIN")
  @js.native
  val LINE_JOIN: js.Array[LineJoin] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_stroke_state'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
