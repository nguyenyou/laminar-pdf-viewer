package io.github.nguyenyou.mupdfjs.mupdf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedFiles extends StObject {
  
  var attachedFiles: js.UndefOr[Boolean] = js.undefined
  
  var cleanPages: js.UndefOr[Boolean] = js.undefined
  
  var embeddedFiles: js.UndefOr[Boolean] = js.undefined
  
  var hiddenText: js.UndefOr[Boolean] = js.undefined
  
  var javascript: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[Boolean] = js.undefined
  
  var redactImages: js.UndefOr[Double] = js.undefined
  
  var redactions: js.UndefOr[Boolean] = js.undefined
  
  var removeLinks: js.UndefOr[Boolean] = js.undefined
  
  var resetFields: js.UndefOr[Boolean] = js.undefined
  
  var resetResponses: js.UndefOr[Boolean] = js.undefined
  
  var thumbnails: js.UndefOr[Boolean] = js.undefined
  
  var xmlMetadata: js.UndefOr[Boolean] = js.undefined
}
object AttachedFiles {
  
  inline def apply(): AttachedFiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedFiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachedFiles] (val x: Self) extends AnyVal {
    
    inline def setAttachedFiles(value: Boolean): Self = StObject.set(x, "attachedFiles", value.asInstanceOf[js.Any])
    
    inline def setAttachedFilesUndefined: Self = StObject.set(x, "attachedFiles", js.undefined)
    
    inline def setCleanPages(value: Boolean): Self = StObject.set(x, "cleanPages", value.asInstanceOf[js.Any])
    
    inline def setCleanPagesUndefined: Self = StObject.set(x, "cleanPages", js.undefined)
    
    inline def setEmbeddedFiles(value: Boolean): Self = StObject.set(x, "embeddedFiles", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedFilesUndefined: Self = StObject.set(x, "embeddedFiles", js.undefined)
    
    inline def setHiddenText(value: Boolean): Self = StObject.set(x, "hiddenText", value.asInstanceOf[js.Any])
    
    inline def setHiddenTextUndefined: Self = StObject.set(x, "hiddenText", js.undefined)
    
    inline def setJavascript(value: Boolean): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
    
    inline def setJavascriptUndefined: Self = StObject.set(x, "javascript", js.undefined)
    
    inline def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRedactImages(value: Double): Self = StObject.set(x, "redactImages", value.asInstanceOf[js.Any])
    
    inline def setRedactImagesUndefined: Self = StObject.set(x, "redactImages", js.undefined)
    
    inline def setRedactions(value: Boolean): Self = StObject.set(x, "redactions", value.asInstanceOf[js.Any])
    
    inline def setRedactionsUndefined: Self = StObject.set(x, "redactions", js.undefined)
    
    inline def setRemoveLinks(value: Boolean): Self = StObject.set(x, "removeLinks", value.asInstanceOf[js.Any])
    
    inline def setRemoveLinksUndefined: Self = StObject.set(x, "removeLinks", js.undefined)
    
    inline def setResetFields(value: Boolean): Self = StObject.set(x, "resetFields", value.asInstanceOf[js.Any])
    
    inline def setResetFieldsUndefined: Self = StObject.set(x, "resetFields", js.undefined)
    
    inline def setResetResponses(value: Boolean): Self = StObject.set(x, "resetResponses", value.asInstanceOf[js.Any])
    
    inline def setResetResponsesUndefined: Self = StObject.set(x, "resetResponses", js.undefined)
    
    inline def setThumbnails(value: Boolean): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setXmlMetadata(value: Boolean): Self = StObject.set(x, "xmlMetadata", value.asInstanceOf[js.Any])
    
    inline def setXmlMetadataUndefined: Self = StObject.set(x, "xmlMetadata", js.undefined)
  }
}
