package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableHWA extends StObject {
  
  var enableHWA: js.UndefOr[Boolean] = js.undefined
}
object EnableHWA {
  
  inline def apply(): EnableHWA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableHWA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableHWA] (val x: Self) extends AnyVal {
    
    inline def setEnableHWA(value: Boolean): Self = StObject.set(x, "enableHWA", value.asInstanceOf[js.Any])
    
    inline def setEnableHWAUndefined: Self = StObject.set(x, "enableHWA", js.undefined)
  }
}
