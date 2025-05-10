package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_display_list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "DisplayList")
@js.native
open class DisplayList protected ()
  extends StObject
     with Userdata[fz_display_list] {
  def this(mediabox: Rect) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_display_list'> */ Any) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getBounds(): Rect = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def run(device: Device, matrix: Matrix): Unit = js.native
  
  def search(needle: String): js.Array[js.Array[Quad]] = js.native
  def search(needle: String, max_hits: Double): js.Array[js.Array[Quad]] = js.native
  
  def toPixmap(matrix: Matrix, colorspace: ColorSpace): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Boolean): Pixmap = js.native
  
  def toStructuredText(): StructuredText = js.native
  def toStructuredText(options: String): StructuredText = js.native
}
/* static members */
object DisplayList {
  
  @JSImport("mupdf/dist/mupdf", "DisplayList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_display_list'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
