package io.github.nguyenyou.mupdfjs.mupdf.mupdfjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rect {
  
  @JSImport("mupdf/mupdfjs", "Rect")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/mupdfjs", "Rect.MAX_INF_RECT")
  @js.native
  def MAX_INF_RECT: Double = js.native
  inline def MAX_INF_RECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_INF_RECT")(x.asInstanceOf[js.Any])
  
  @JSImport("mupdf/mupdfjs", "Rect.MIN_INF_RECT")
  @js.native
  def MIN_INF_RECT: Double = js.native
  inline def MIN_INF_RECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_INF_RECT")(x.asInstanceOf[js.Any])
  
  inline def isEmpty(rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(rect.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInfinite(rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInfinite")(rect.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValid(rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(rect.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def transform(
    rect: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect,
    matrix: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Matrix
  ): io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(rect.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Rect]
}
