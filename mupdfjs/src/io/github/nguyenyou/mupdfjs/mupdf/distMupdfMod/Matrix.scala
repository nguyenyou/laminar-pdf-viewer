package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Matrix {
  
  @JSImport("mupdf/dist/mupdf", "Matrix")
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(one: Matrix, two: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  @JSImport("mupdf/dist/mupdf", "Matrix.identity")
  @js.native
  def identity: Matrix = js.native
  inline def identity_=(x: Matrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
  
  inline def invert(m: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(m.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def rotate(d: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(d.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def scale(sx: Double, sy: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def translate(tx: Double, ty: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
