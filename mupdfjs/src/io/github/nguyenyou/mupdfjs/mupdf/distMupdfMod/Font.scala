package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.anon.RecordFontCJKLanguageFont
import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Font")
@js.native
open class Font protected ()
  extends StObject
     with Userdata[fz_font] {
  def this(name: String) = this()
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_font'> */ Any) = this()
  def this(name: String, data: AnyBuffer) = this()
  def this(name: String, data: AnyBuffer, subfont: Double) = this()
  
  def advanceGlyph(gid: Double): Double = js.native
  def advanceGlyph(gid: Double, wmode: Double): Double = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def encodeCharacter(uni: String): Double = js.native
  def encodeCharacter(uni: Double): Double = js.native
  
  def getName(): String = js.native
  
  def isBold(): Boolean = js.native
  
  def isItalic(): Boolean = js.native
  
  def isMono(): Boolean = js.native
  
  def isSerif(): Boolean = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
}
/* static members */
object Font {
  
  @JSImport("mupdf/dist/mupdf", "Font")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "Font.ADOBE_CNS")
  @js.native
  val ADOBE_CNS: /* 0 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "Font.ADOBE_GB")
  @js.native
  val ADOBE_GB: /* 1 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "Font.ADOBE_JAPAN")
  @js.native
  val ADOBE_JAPAN: /* 2 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "Font.ADOBE_KOREA")
  @js.native
  val ADOBE_KOREA: /* 3 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "Font.CJK_ORDERING_BY_LANG")
  @js.native
  val CJK_ORDERING_BY_LANG: RecordFontCJKLanguageFont = js.native
  
  @JSImport("mupdf/dist/mupdf", "Font.SIMPLE_ENCODING")
  @js.native
  val SIMPLE_ENCODING: js.Array[FontSimpleEncoding] = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_font'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
