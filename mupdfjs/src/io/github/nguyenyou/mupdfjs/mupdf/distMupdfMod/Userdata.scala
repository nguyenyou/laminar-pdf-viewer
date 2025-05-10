package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Userdata[B] extends StObject {
  
  def destroy(): Unit
  
  var pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any
}
object Userdata {
  
  inline def apply[B](
    destroy: () => Unit,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any
  ): Userdata[B] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userdata[B]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Userdata[?], B] (val x: Self & Userdata[B]) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setPointer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<B> */ Any
    ): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}
