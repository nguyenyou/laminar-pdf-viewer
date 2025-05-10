package io.github.nguyenyou.mupdfjs.mupdf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationDate extends StObject {
  
  var creationDate: js.Date
  
  var filename: String
  
  var mimetype: String
  
  var modificationDate: js.Date
  
  var size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'char'> */ Any
}
object CreationDate {
  
  inline def apply(
    creationDate: js.Date,
    filename: String,
    mimetype: String,
    modificationDate: js.Date,
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'char'> */ Any
  ): CreationDate = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], modificationDate = modificationDate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreationDate] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setModificationDate(value: js.Date): Self = StObject.set(x, "modificationDate", value.asInstanceOf[js.Any])
    
    inline def setSize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'char'> */ Any
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
