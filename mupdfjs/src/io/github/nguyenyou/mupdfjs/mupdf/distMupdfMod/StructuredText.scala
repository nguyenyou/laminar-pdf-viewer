package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_stext_page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "StructuredText")
@js.native
open class StructuredText ()
  extends StObject
     with Userdata[fz_stext_page] {
  
  def asHTML(id: Double): String = js.native
  
  def asJSON(): String = js.native
  def asJSON(scale: Double): String = js.native
  
  def asText(): String = js.native
  
  def copy(p: Point, q: Point): String = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def highlight(p: Point, q: Point): js.Array[Quad] = js.native
  def highlight(p: Point, q: Point, max_hits: Double): js.Array[Quad] = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def search(needle: String): js.Array[js.Array[Quad]] = js.native
  def search(needle: String, max_hits: Double): js.Array[js.Array[Quad]] = js.native
  
  def snap(p: Point, q: Point, mode: SelectMode): Quad = js.native
  
  def walk(walker: StructuredTextWalker): Unit = js.native
}
/* static members */
object StructuredText {
  
  @JSImport("mupdf/dist/mupdf", "StructuredText")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "StructuredText.SELECT_CHARS")
  @js.native
  val SELECT_CHARS: /* "chars" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "StructuredText.SELECT_LINES")
  @js.native
  val SELECT_LINES: /* "lines" */ String = js.native
  
  @JSImport("mupdf/dist/mupdf", "StructuredText.SELECT_MODE")
  @js.native
  val SELECT_MODE: js.Array[SelectMode] = js.native
  
  @JSImport("mupdf/dist/mupdf", "StructuredText.SELECT_WORDS")
  @js.native
  val SELECT_WORDS: /* "words" */ String = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_stext_page'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
