package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_colorspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "ColorSpace")
@js.native
open class ColorSpace protected ()
  extends StObject
     with Userdata[fz_colorspace] {
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_colorspace'> */ Any) = this()
  def this(profile: AnyBuffer, name: String) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getName(): String = js.native
  
  def getNumberOfComponents(): Double = js.native
  
  def getType(): ColorSpaceType = js.native
  
  def isCMYK(): Boolean = js.native
  
  def isDeviceN(): Boolean = js.native
  
  def isGray(): Boolean = js.native
  
  def isIndexed(): Boolean = js.native
  
  def isLab(): Boolean = js.native
  
  def isRGB(): Boolean = js.native
  
  def isSubtractive(): Boolean = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
}
/* static members */
object ColorSpace {
  
  @JSImport("mupdf/dist/mupdf", "ColorSpace")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "ColorSpace.COLORSPACE_TYPES")
  @js.native
  val COLORSPACE_TYPES: js.Array[ColorSpaceType] = js.native
  
  @JSImport("mupdf/dist/mupdf", "ColorSpace.DeviceBGR")
  @js.native
  val DeviceBGR: ColorSpace = js.native
  
  @JSImport("mupdf/dist/mupdf", "ColorSpace.DeviceCMYK")
  @js.native
  val DeviceCMYK: ColorSpace = js.native
  
  @JSImport("mupdf/dist/mupdf", "ColorSpace.DeviceGray")
  @js.native
  val DeviceGray: ColorSpace = js.native
  
  @JSImport("mupdf/dist/mupdf", "ColorSpace.DeviceRGB")
  @js.native
  val DeviceRGB: ColorSpace = js.native
  
  @JSImport("mupdf/dist/mupdf", "ColorSpace.Lab")
  @js.native
  val Lab: ColorSpace = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_colorspace'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
