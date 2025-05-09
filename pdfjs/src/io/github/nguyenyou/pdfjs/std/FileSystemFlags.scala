package io.github.nguyenyou.pdfjs.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemFlags extends StObject {
  
  /* standard dom */
  var create: js.UndefOr[Boolean] = js.undefined
  
  /* standard dom */
  var exclusive: js.UndefOr[Boolean] = js.undefined
}
object FileSystemFlags {
  
  inline def apply(): FileSystemFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemFlags] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
  }
}
