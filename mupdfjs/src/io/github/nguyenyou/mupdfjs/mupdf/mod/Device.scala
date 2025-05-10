package io.github.nguyenyou.mupdfjs.mupdf.mod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.BlendMode
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.DeviceFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "Device")
@js.native
open class Device protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Device {
  def this(callbacks: DeviceFunctions) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_device'> */ Any) = this()
}
/* static members */
object Device {
  
  @JSImport("mupdf", "Device")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf", "Device.BLEND_MODES")
  @js.native
  val BLEND_MODES: js.Array[BlendMode] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_device'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
