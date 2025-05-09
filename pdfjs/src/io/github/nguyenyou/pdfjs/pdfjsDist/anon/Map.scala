package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var hash: Any
  
  var map: Any
  
  var transfer: Any
}
object Map {
  
  inline def apply(hash: Any, map: Any, transfer: Any): Map = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    inline def setHash(value: Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setTransfer(value: Any): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
  }
}
