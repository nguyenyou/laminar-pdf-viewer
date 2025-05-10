package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfStrings.fz_outline_iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "OutlineIterator")
@js.native
open class OutlineIterator ()
  extends StObject
     with Userdata[fz_outline_iterator] {
  
  def delete(): Double = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def down(): Double = js.native
  
  def insert(item: OutlineItem): Double = js.native
  
  def item(): OutlineItem | Null = js.native
  
  def next(): Double = js.native
  
  /* CompleteClass */
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any = js.native
  
  def prev(): Double = js.native
  
  def up(): Double = js.native
  
  def update(item: OutlineItem): Unit = js.native
}
/* static members */
object OutlineIterator {
  
  @JSImport("mupdf/dist/mupdf", "OutlineIterator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mupdf/dist/mupdf", "OutlineIterator.RESULT_AT_EMPTY")
  @js.native
  val RESULT_AT_EMPTY: /* 1 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "OutlineIterator.RESULT_AT_ITEM")
  @js.native
  val RESULT_AT_ITEM: /* 0 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "OutlineIterator.RESULT_DID_NOT_MOVE")
  @js.native
  val RESULT_DID_NOT_MOVE: /* -1 */ Double = js.native
  
  inline def _drop(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'fz_outline_iterator'> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
