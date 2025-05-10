package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_pixmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Pixmap")
@js.native
open class Pixmap protected ()
  extends StObject
     with Userdata[fz_pixmap] {
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_pixmap'> */ Any) = this()
  def this(colorspace: ColorSpace, bbox: Rect, alpha: Boolean) = this()
  
  def asJPEG(quality: Double, invert_cmyk: Boolean): js.typedarray.Uint8Array = js.native
  
  def asPAM(): js.typedarray.Uint8Array = js.native
  
  def asPNG(): js.typedarray.Uint8Array = js.native
  
  def asPSD(): js.typedarray.Uint8Array = js.native
  
  def clear(): Unit = js.native
  def clear(value: Double): Unit = js.native
  
  def convertToColorSpace(colorspace: ColorSpace): Pixmap = js.native
  def convertToColorSpace(colorspace: ColorSpace, keepAlpha: Boolean): Pixmap = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def gamma(p: Double): Unit = js.native
  
  def getAlpha(): Double = js.native
  
  def getBounds(): js.Array[Double] = js.native
  
  def getColorSpace(): ColorSpace | Null = js.native
  
  def getHeight(): Double = js.native
  
  def getNumberOfComponents(): Double = js.native
  
  def getPixels(): js.typedarray.Uint8ClampedArray = js.native
  
  def getStride(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def getX(): Double = js.native
  
  def getXResolution(): Double = js.native
  
  def getY(): Double = js.native
  
  def getYResolution(): Double = js.native
  
  def invert(): Unit = js.native
  
  def invertLuminance(): Unit = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def setResolution(x: Double, y: Double): Unit = js.native
  
  def tint(black: Color, white: Color): Unit = js.native
  def tint(black: Color, white: Double): Unit = js.native
  def tint(black: Double, white: Color): Unit = js.native
  def tint(black: Double, white: Double): Unit = js.native
  
  def warp(points: js.Array[Point], width: Double, height: Double): Pixmap = js.native
}
/* static members */
object Pixmap {
  
  @JSImport("mupdf/dist/mupdf", "Pixmap")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_pixmap'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
