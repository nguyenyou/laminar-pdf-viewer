package io.github.nguyenyou.mupdfjs.mupdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "OutlineIterator")
@js.native
open class OutlineIterator ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.OutlineIterator
/* static members */
object OutlineIterator {
  
  @JSImport("mupdf", "OutlineIterator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf", "OutlineIterator.RESULT_AT_EMPTY")
  @js.native
  val RESULT_AT_EMPTY: /* 1 */ Double = js.native
  
  @JSImport("mupdf", "OutlineIterator.RESULT_AT_ITEM")
  @js.native
  val RESULT_AT_ITEM: /* 0 */ Double = js.native
  
  @JSImport("mupdf", "OutlineIterator.RESULT_DID_NOT_MOVE")
  @js.native
  val RESULT_DID_NOT_MOVE: /* -1 */ Double = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_outline_iterator'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
