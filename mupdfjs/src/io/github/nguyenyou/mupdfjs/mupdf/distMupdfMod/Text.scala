package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "Text")
@js.native
open class Text ()
  extends StObject
     with Userdata[fz_text] {
  def this(pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_text'> */ Any) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def getBounds(strokeState: StrokeState, transform: Matrix): Rect = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def showGlyph(font: Font, trm: Matrix, gid: Double, uni: Double): Unit = js.native
  def showGlyph(font: Font, trm: Matrix, gid: Double, uni: Double, wmode: Double): Unit = js.native
  
  def showString(font: Font, trm: Matrix, str: String): Matrix = js.native
  def showString(font: Font, trm: Matrix, str: String, wmode: Double): Matrix = js.native
  
  def walk(walker: TextWalker): Unit = js.native
}
/* static members */
object Text {
  
  @JSImport("mupdf/dist/mupdf", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_text'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
