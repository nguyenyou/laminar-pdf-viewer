package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_device
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Device")
@js.native
open class Device protected ()
  extends StObject
     with Userdata[fz_device] {
  def this(callbacks: DeviceFunctions) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_device'> */ Any) = this()
  
  def beginGroup(
    area: Rect,
    colorspace: ColorSpace,
    isolated: Boolean,
    knockout: Boolean,
    blendmode: BlendMode,
    alpha: Double
  ): Unit = js.native
  
  def beginLayer(name: String): Unit = js.native
  
  def beginMask(area: Rect, luminosity: Boolean, colorspace: ColorSpace, color: Color): Unit = js.native
  
  def beginTile(area: Rect, view: Rect, xstep: Double, ystep: Double, ctm: Matrix, id: Double): Double = js.native
  
  def clipImageMask(image: Image, ctm: Matrix): Unit = js.native
  
  def clipPath(path: Path, evenOdd: Boolean, ctm: Matrix): Unit = js.native
  
  def clipStrokePath(path: Path, stroke: StrokeState, ctm: Matrix): Unit = js.native
  
  def clipStrokeText(text: Text, stroke: StrokeState, ctm: Matrix): Unit = js.native
  
  def clipText(text: Text, ctm: Matrix): Unit = js.native
  
  def close(): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def endGroup(): Unit = js.native
  
  def endLayer(): Unit = js.native
  
  def endMask(): Unit = js.native
  
  def endTile(): Unit = js.native
  
  def fillImage(image: Image, ctm: Matrix, alpha: Double): Unit = js.native
  
  def fillImageMask(image: Image, ctm: Matrix, colorspace: ColorSpace, color: Color, alpha: Double): Unit = js.native
  
  def fillPath(path: Path, evenOdd: Boolean, ctm: Matrix, colorspace: ColorSpace, color: Color, alpha: Double): Unit = js.native
  
  def fillShade(shade: Shade, ctm: Matrix, alpha: Double): Unit = js.native
  
  def fillText(text: Text, ctm: Matrix, colorspace: ColorSpace, color: Color, alpha: Double): Unit = js.native
  
  def ignoreText(text: Text, ctm: Matrix): Unit = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def popClip(): Unit = js.native
  
  def strokePath(path: Path, stroke: StrokeState, ctm: Matrix, colorspace: ColorSpace, color: Color, alpha: Double): Unit = js.native
  
  def strokeText(text: Text, stroke: StrokeState, ctm: Matrix, colorspace: ColorSpace, color: Color, alpha: Double): Unit = js.native
}
/* static members */
object Device {
  
  @JSImport("mupdf/dist/mupdf", "Device")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "Device.BLEND_MODES")
  @js.native
  val BLEND_MODES: js.Array[BlendMode] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_device'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
