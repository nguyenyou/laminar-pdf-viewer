package io.github.nguyenyou.mupdfjs.mupdf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filename extends StObject {
  
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var modificationDate: js.UndefOr[js.Date] = js.undefined
}
object Filename {
  
  inline def apply(): Filename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setModificationDate(value: js.Date): Self = StObject.set(x, "modificationDate", value.asInstanceOf[js.Any])
    
    inline def setModificationDateUndefined: Self = StObject.set(x, "modificationDate", js.undefined)
  }
}
