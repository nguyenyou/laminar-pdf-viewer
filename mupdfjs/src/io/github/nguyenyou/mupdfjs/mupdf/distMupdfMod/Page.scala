package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.any_page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Page")
@js.native
open class Page ()
  extends StObject
     with Userdata[any_page] {
  
  def createLink(bbox: Rect, uri: String): Link = js.native
  
  def deleteLink(link: Link): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getBounds(): Rect = js.native
  def getBounds(box: PageBox): Rect = js.native
  
  def getLabel(): String = js.native
  
  def getLinks(): js.Array[Link] = js.native
  
  def isPDF(): Boolean = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def run(device: Device, matrix: Matrix): Unit = js.native
  
  def runPageAnnots(device: Device, matrix: Matrix): Unit = js.native
  
  def runPageContents(device: Device, matrix: Matrix): Unit = js.native
  
  def runPageWidgets(device: Device, matrix: Matrix): Unit = js.native
  
  def search(needle: String): js.Array[js.Array[Quad]] = js.native
  def search(needle: String, max_hits: Double): js.Array[js.Array[Quad]] = js.native
  
  def toDisplayList(): DisplayList = js.native
  def toDisplayList(showExtras: Boolean): DisplayList = js.native
  
  def toPixmap(matrix: Matrix, colorspace: ColorSpace): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Boolean): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Boolean, showExtras: Boolean): Pixmap = js.native
  def toPixmap(matrix: Matrix, colorspace: ColorSpace, alpha: Unit, showExtras: Boolean): Pixmap = js.native
  
  def toStructuredText(): StructuredText = js.native
  def toStructuredText(options: String): StructuredText = js.native
}
/* static members */
object Page {
  
  @JSImport("mupdf/dist/mupdf", "Page")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "Page.BOXES")
  @js.native
  val BOXES: js.Array[PageBox] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'any_page'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
