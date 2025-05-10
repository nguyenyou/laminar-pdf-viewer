package io.github.nguyenyou.mupdfjs.mupdf.mod

import io.github.nguyenyou.mupdfjs.mupdf.anon.RecordFontCJKLanguageFont
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.AnyBuffer
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.FontSimpleEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf", "Font")
@js.native
open class Font protected ()
  extends io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Font {
  def this(name: String) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_font'> */ Any) = this()
  def this(name: String, data: AnyBuffer) = this()
  def this(name: String, data: AnyBuffer, subfont: Double) = this()
}
/* static members */
object Font {
  
  @JSImport("mupdf", "Font")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf", "Font.ADOBE_CNS")
  @js.native
  val ADOBE_CNS: /* 0 */ Double = js.native
  
  @JSImport("mupdf", "Font.ADOBE_GB")
  @js.native
  val ADOBE_GB: /* 1 */ Double = js.native
  
  @JSImport("mupdf", "Font.ADOBE_JAPAN")
  @js.native
  val ADOBE_JAPAN: /* 2 */ Double = js.native
  
  @JSImport("mupdf", "Font.ADOBE_KOREA")
  @js.native
  val ADOBE_KOREA: /* 3 */ Double = js.native
  
  @JSImport("mupdf", "Font.CJK_ORDERING_BY_LANG")
  @js.native
  val CJK_ORDERING_BY_LANG: RecordFontCJKLanguageFont = js.native
  
  @JSImport("mupdf", "Font.SIMPLE_ENCODING")
  @js.native
  val SIMPLE_ENCODING: js.Array[FontSimpleEncoding] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_font'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
