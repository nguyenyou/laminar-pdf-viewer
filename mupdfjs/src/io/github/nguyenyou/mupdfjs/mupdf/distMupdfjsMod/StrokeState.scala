package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.LineCap
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.LineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "StrokeState")
@js.native
open class StrokeState ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.StrokeState {
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_stroke_state'> */ Any) = this()
}
/* static members */
object StrokeState {
  
  @JSImport("mupdf/dist/mupdfjs", "StrokeState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "StrokeState.LINE_CAP")
  @js.native
  val LINE_CAP: js.Array[LineCap] = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "StrokeState.LINE_JOIN")
  @js.native
  val LINE_JOIN: js.Array[LineJoin] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_stroke_state'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
