package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Image")
@js.native
open class Image protected ()
  extends StObject
     with Userdata[fz_image] {
  def this(pixmap: Pixmap) = this()
  def this(pointer: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_image'> */ Any) | AnyBuffer) = this()
  def this(pixmap: Pixmap, mask: Image) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getBitsPerComponent(): Double = js.native
  
  def getColorSpace(): ColorSpace | Null = js.native
  
  def getHeight(): Double = js.native
  
  def getImageMask(): Boolean = js.native
  
  def getMask(): Image | Null = js.native
  
  def getNumberOfComponents(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def getXResolution(): Double = js.native
  
  def getYResolution(): Double = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def toPixmap(): Pixmap = js.native
}
/* static members */
object Image {
  
  @JSImport("mupdf/dist/mupdf", "Image")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_image'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
