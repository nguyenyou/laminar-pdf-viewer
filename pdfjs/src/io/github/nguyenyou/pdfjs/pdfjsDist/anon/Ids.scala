package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import io.github.nguyenyou.pdfjs.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ids extends StObject {
  
  var hash: String
  
  var ids: Set[String]
}
object Ids {
  
  inline def apply(hash: String, ids: Set[String]): Ids = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ids] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setIds(value: Set[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
  }
}
