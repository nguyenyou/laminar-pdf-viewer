package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_shade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Shade")
@js.native
open class Shade ()
  extends StObject
     with Userdata[fz_shade] {
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getBounds(): Rect = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
}
/* static members */
object Shade {
  
  @JSImport("mupdf/dist/mupdf", "Shade")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_shade'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
