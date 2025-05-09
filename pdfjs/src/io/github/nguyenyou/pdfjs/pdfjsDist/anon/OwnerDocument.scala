package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalajs.dom.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerDocument extends StObject {
  
  var enableHWA: js.UndefOr[Boolean] = js.undefined
  
  var ownerDocument: js.UndefOr[Document] = js.undefined
}
object OwnerDocument {
  
  inline def apply(): OwnerDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnerDocument] (val x: Self) extends AnyVal {
    
    inline def setEnableHWA(value: Boolean): Self = StObject.set(x, "enableHWA", value.asInstanceOf[js.Any])
    
    inline def setEnableHWAUndefined: Self = StObject.set(x, "enableHWA", js.undefined)
    
    inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
  }
}
