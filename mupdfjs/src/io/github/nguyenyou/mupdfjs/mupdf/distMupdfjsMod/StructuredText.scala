package io.github.nguyenyou.mupdfjs.mupdf.distMupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.SelectMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdfjs", "StructuredText")
@js.native
open class StructuredText ()
  extends io.github.nguyenyou.mupdfjs.mupdf.mod.StructuredText
/* static members */
object StructuredText {
  
  @JSImport("mupdf/dist/mupdfjs", "StructuredText")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "StructuredText.SELECT_CHARS")
  @js.native
  val SELECT_CHARS: /* "chars" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "StructuredText.SELECT_LINES")
  @js.native
  val SELECT_LINES: /* "lines" */ String = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "StructuredText.SELECT_MODE")
  @js.native
  val SELECT_MODE: js.Array[SelectMode] = js.native
  
  @JSImport("mupdf/dist/mupdfjs", "StructuredText.SELECT_WORDS")
  @js.native
  val SELECT_WORDS: /* "words" */ String = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_stext_page'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
