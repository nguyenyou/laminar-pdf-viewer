package io.github.nguyenyou.mupdfjs.mupdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Matrix {
  
  @JSImport("mupdf", "Matrix")
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(
    one: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix,
    two: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix
  ): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix]
  
  @JSImport("mupdf", "Matrix.identity")
  @js.native
  def identity: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix = js.native
  inline def identity_=(x: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
  
  inline def invert(m: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(m.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix]
  
  inline def rotate(d: Double): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(d.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix]
  
  inline def scale(sx: Double, sy: Double): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix]
  
  inline def translate(tx: Double, ty: Double): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix]
}
