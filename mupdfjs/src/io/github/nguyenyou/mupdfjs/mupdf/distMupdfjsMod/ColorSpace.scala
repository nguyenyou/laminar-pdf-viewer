package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.AnyBuffer
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.ColorSpaceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "ColorSpace")
@js.native
open class ColorSpace protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.ColorSpace {
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_colorspace'> */ Any) = this()
  def this(profile: AnyBuffer, name: String) = this()
}
/* static members */
object ColorSpace {
  
  @JSImport("mupdf/dist/mupdfjs", "ColorSpace")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "ColorSpace.COLORSPACE_TYPES")
  @js.native
  val COLORSPACE_TYPES: js.Array[ColorSpaceType] = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "ColorSpace.DeviceBGR")
  @js.native
  val DeviceBGR: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.ColorSpace = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "ColorSpace.DeviceCMYK")
  @js.native
  val DeviceCMYK: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.ColorSpace = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "ColorSpace.DeviceGray")
  @js.native
  val DeviceGray: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.ColorSpace = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "ColorSpace.DeviceRGB")
  @js.native
  val DeviceRGB: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.ColorSpace = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "ColorSpace.Lab")
  @js.native
  val Lab: io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.ColorSpace = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_colorspace'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
