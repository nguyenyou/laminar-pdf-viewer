package io.github.nguyenyou.comlink.comlink

import io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.Endpoint
import io.github.nguyenyou.comlink.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUmdNodeAdapterMod {
  
  @JSImport("comlink/dist/umd/node-adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nep: NodeEndpoint): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nep.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  
  @js.native
  trait NodeEndpoint extends StObject {
    
    def off(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def off(`type`: String, listener: EventListenerOrEventListenerObject, options: js.Object): Unit = js.native
    
    def on(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def on(`type`: String, listener: EventListenerOrEventListenerObject, options: js.Object): Unit = js.native
    
    def postMessage(message: Any): Unit = js.native
    def postMessage(message: Any, transfer: js.Array[Any]): Unit = js.native
    
    var start: js.UndefOr[js.Function0[Unit]] = js.native
  }
}
