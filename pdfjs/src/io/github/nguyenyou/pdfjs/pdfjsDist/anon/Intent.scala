package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intent extends StObject {
  
  /**
    * - Determines the optional content groups that
    * are visible by default; valid values are:
    * - 'display' (viewable groups).
    * - 'print' (printable groups).
    * - 'any' (all groups).
    * The default value is 'display'.
    */
  var intent: js.UndefOr[String] = js.undefined
}
object Intent {
  
  inline def apply(): Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Intent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Intent] (val x: Self) extends AnyVal {
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
  }
}
