package io.github.nguyenyou.comlink.comlink

import io.github.nguyenyou.comlink.comlink.comlinkStrings.APPLY
import io.github.nguyenyou.comlink.comlink.comlinkStrings.CONSTRUCT
import io.github.nguyenyou.comlink.comlink.comlinkStrings.ENDPOINT
import io.github.nguyenyou.comlink.comlink.comlinkStrings.GET
import io.github.nguyenyou.comlink.comlink.comlinkStrings.HANDLER
import io.github.nguyenyou.comlink.comlink.comlinkStrings.RAW
import io.github.nguyenyou.comlink.comlink.comlinkStrings.RELEASE
import io.github.nguyenyou.comlink.comlink.comlinkStrings.SET
import io.github.nguyenyou.comlink.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.comlink.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUmdProtocolMod {
  
  trait ApplyMessage
    extends StObject
       with Message {
    
    var argumentList: js.Array[WireValue]
    
    var id: js.UndefOr[MessageID] = js.undefined
    
    var path: js.Array[String]
    
    var `type`: APPLY
  }
  object ApplyMessage {
    
    inline def apply(argumentList: js.Array[WireValue], path: js.Array[String]): ApplyMessage = {
      val __obj = js.Dynamic.literal(argumentList = argumentList.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("APPLY")
      __obj.asInstanceOf[ApplyMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyMessage] (val x: Self) extends AnyVal {
      
      inline def setArgumentList(value: js.Array[WireValue]): Self = StObject.set(x, "argumentList", value.asInstanceOf[js.Any])
      
      inline def setArgumentListVarargs(value: WireValue*): Self = StObject.set(x, "argumentList", js.Array(value*))
      
      inline def setId(value: MessageID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setType(value: APPLY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConstructMessage
    extends StObject
       with Message {
    
    var argumentList: js.Array[WireValue]
    
    var id: js.UndefOr[MessageID] = js.undefined
    
    var path: js.Array[String]
    
    var `type`: CONSTRUCT
  }
  object ConstructMessage {
    
    inline def apply(argumentList: js.Array[WireValue], path: js.Array[String]): ConstructMessage = {
      val __obj = js.Dynamic.literal(argumentList = argumentList.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("CONSTRUCT")
      __obj.asInstanceOf[ConstructMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructMessage] (val x: Self) extends AnyVal {
      
      inline def setArgumentList(value: js.Array[WireValue]): Self = StObject.set(x, "argumentList", value.asInstanceOf[js.Any])
      
      inline def setArgumentListVarargs(value: WireValue*): Self = StObject.set(x, "argumentList", js.Array(value*))
      
      inline def setId(value: MessageID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setType(value: CONSTRUCT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Endpoint
    extends StObject
       with EventSource {
    
    def postMessage(message: Any): Unit = js.native
    def postMessage(message: Any, transfer: js.Array[Transferable]): Unit = js.native
    
    var start: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  trait EndpointMessage
    extends StObject
       with Message {
    
    var id: js.UndefOr[MessageID] = js.undefined
    
    var `type`: ENDPOINT
  }
  object EndpointMessage {
    
    inline def apply(): EndpointMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ENDPOINT")
      __obj.asInstanceOf[EndpointMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointMessage] (val x: Self) extends AnyVal {
      
      inline def setId(value: MessageID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setType(value: ENDPOINT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventSource extends StObject {
    
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: js.Object): Unit = js.native
    
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: js.Object): Unit = js.native
  }
  
  trait GetMessage
    extends StObject
       with Message {
    
    var id: js.UndefOr[MessageID] = js.undefined
    
    var path: js.Array[String]
    
    var `type`: GET
  }
  object GetMessage {
    
    inline def apply(path: js.Array[String]): GetMessage = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GET")
      __obj.asInstanceOf[GetMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetMessage] (val x: Self) extends AnyVal {
      
      inline def setId(value: MessageID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setType(value: GET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandlerWireValue
    extends StObject
       with WireValue {
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var `type`: HANDLER
    
    var value: Any
  }
  object HandlerWireValue {
    
    inline def apply(name: String, value: Any): HandlerWireValue = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("HANDLER")
      __obj.asInstanceOf[HandlerWireValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandlerWireValue] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: HANDLER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.comlink`.comlink.distUmdProtocolMod.GetMessage
    - `io.github.nguyenyou.comlink`.comlink.distUmdProtocolMod.SetMessage
    - `io.github.nguyenyou.comlink`.comlink.distUmdProtocolMod.ApplyMessage
    - `io.github.nguyenyou.comlink`.comlink.distUmdProtocolMod.ConstructMessage
    - `io.github.nguyenyou.comlink`.comlink.distUmdProtocolMod.EndpointMessage
    - `io.github.nguyenyou.comlink`.comlink.distUmdProtocolMod.ReleaseMessage
  */
  trait Message extends StObject
  object Message {
    
    inline def ApplyMessage(argumentList: js.Array[WireValue], path: js.Array[String]): io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.ApplyMessage = {
      val __obj = js.Dynamic.literal(argumentList = argumentList.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("APPLY")
      __obj.asInstanceOf[io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.ApplyMessage]
    }
    
    inline def ConstructMessage(argumentList: js.Array[WireValue], path: js.Array[String]): io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.ConstructMessage = {
      val __obj = js.Dynamic.literal(argumentList = argumentList.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("CONSTRUCT")
      __obj.asInstanceOf[io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.ConstructMessage]
    }
    
    inline def EndpointMessage(): io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.EndpointMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ENDPOINT")
      __obj.asInstanceOf[io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.EndpointMessage]
    }
    
    inline def GetMessage(path: js.Array[String]): io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.GetMessage = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GET")
      __obj.asInstanceOf[io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.GetMessage]
    }
    
    inline def ReleaseMessage(): io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.ReleaseMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RELEASE")
      __obj.asInstanceOf[io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.ReleaseMessage]
    }
    
    inline def SetMessage(path: js.Array[String], value: WireValue): io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.SetMessage = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET")
      __obj.asInstanceOf[io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.SetMessage]
    }
  }
  
  type MessageID = String
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.GET
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.SET
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.APPLY
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.CONSTRUCT
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.ENDPOINT
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.RELEASE
  */
  trait MessageType extends StObject
  object MessageType {
    
    inline def APPLY: io.github.nguyenyou.comlink.comlink.comlinkStrings.APPLY = "APPLY".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.APPLY]
    
    inline def CONSTRUCT: io.github.nguyenyou.comlink.comlink.comlinkStrings.CONSTRUCT = "CONSTRUCT".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.CONSTRUCT]
    
    inline def ENDPOINT: io.github.nguyenyou.comlink.comlink.comlinkStrings.ENDPOINT = "ENDPOINT".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.ENDPOINT]
    
    inline def GET: io.github.nguyenyou.comlink.comlink.comlinkStrings.GET = "GET".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.GET]
    
    inline def RELEASE: io.github.nguyenyou.comlink.comlink.comlinkStrings.RELEASE = "RELEASE".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.RELEASE]
    
    inline def SET: io.github.nguyenyou.comlink.comlink.comlinkStrings.SET = "SET".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.SET]
  }
  
  @js.native
  trait PostMessageWithOrigin extends StObject {
    
    def postMessage(message: Any, targetOrigin: String): Unit = js.native
    def postMessage(message: Any, targetOrigin: String, transfer: js.Array[Transferable]): Unit = js.native
  }
  
  trait RawWireValue
    extends StObject
       with WireValue {
    
    var id: js.UndefOr[String] = js.undefined
    
    var `type`: RAW
  }
  object RawWireValue {
    
    inline def apply(): RawWireValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RAW")
      __obj.asInstanceOf[RawWireValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawWireValue] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setType(value: RAW): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReleaseMessage
    extends StObject
       with Message {
    
    var id: js.UndefOr[MessageID] = js.undefined
    
    var `type`: RELEASE
  }
  object ReleaseMessage {
    
    inline def apply(): ReleaseMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RELEASE")
      __obj.asInstanceOf[ReleaseMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReleaseMessage] (val x: Self) extends AnyVal {
      
      inline def setId(value: MessageID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setType(value: RELEASE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetMessage
    extends StObject
       with Message {
    
    var id: js.UndefOr[MessageID] = js.undefined
    
    var path: js.Array[String]
    
    var `type`: SET
    
    var value: WireValue
  }
  object SetMessage {
    
    inline def apply(path: js.Array[String], value: WireValue): SetMessage = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET")
      __obj.asInstanceOf[SetMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetMessage] (val x: Self) extends AnyVal {
      
      inline def setId(value: MessageID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setType(value: SET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: WireValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.comlink`.comlink.distUmdProtocolMod.RawWireValue
    - `io.github.nguyenyou.comlink`.comlink.distUmdProtocolMod.HandlerWireValue
  */
  trait WireValue extends StObject
  object WireValue {
    
    inline def HandlerWireValue(name: String, value: Any): io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.HandlerWireValue = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("HANDLER")
      __obj.asInstanceOf[io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.HandlerWireValue]
    }
    
    inline def RawWireValue(): io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.RawWireValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RAW")
      __obj.asInstanceOf[io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.RawWireValue]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.RAW
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.PROXY
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.THROW
    - `io.github.nguyenyou.comlink`.comlink.comlinkStrings.HANDLER
  */
  trait WireValueType extends StObject
  object WireValueType {
    
    inline def HANDLER: io.github.nguyenyou.comlink.comlink.comlinkStrings.HANDLER = "HANDLER".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.HANDLER]
    
    inline def PROXY: io.github.nguyenyou.comlink.comlink.comlinkStrings.PROXY = "PROXY".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.PROXY]
    
    inline def RAW: io.github.nguyenyou.comlink.comlink.comlinkStrings.RAW = "RAW".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.RAW]
    
    inline def THROW: io.github.nguyenyou.comlink.comlink.comlinkStrings.THROW = "THROW".asInstanceOf[io.github.nguyenyou.comlink.comlink.comlinkStrings.THROW]
  }
}
