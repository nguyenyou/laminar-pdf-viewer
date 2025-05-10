package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Link")
@js.native
open class Link ()
  extends StObject
     with Userdata[fz_link] {
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getBounds(): Rect = js.native
  
  def getURI(): String = js.native
  
  def isExternal(): Boolean = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def setBounds(rect: Rect): Unit = js.native
  
  def setURI(uri: String): Unit = js.native
}
/* static members */
object Link {
  
  @JSImport("mupdf/dist/mupdf", "Link")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_link'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
