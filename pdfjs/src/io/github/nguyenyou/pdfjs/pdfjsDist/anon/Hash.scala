package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: String
  
  var map: io.github.nguyenyou.pdfjs.std.Map[Any, Any]
  
  var transfer: js.Array[Any]
}
object Hash {
  
  inline def apply(hash: String, map: io.github.nguyenyou.pdfjs.std.Map[Any, Any], transfer: js.Array[Any]): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setMap(value: io.github.nguyenyou.pdfjs.std.Map[Any, Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setTransfer(value: js.Array[Any]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferVarargs(value: Any*): Self = StObject.set(x, "transfer", js.Array(value*))
  }
}
