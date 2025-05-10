package io.github.nguyenyou.comlink.comlink

import io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.MessageType
import io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.WireValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comlinkStrings {
  
  @js.native
  sealed trait APPLY
    extends StObject
       with MessageType
  inline def APPLY: APPLY = "APPLY".asInstanceOf[APPLY]
  
  @js.native
  sealed trait CONSTRUCT
    extends StObject
       with MessageType
  inline def CONSTRUCT: CONSTRUCT = "CONSTRUCT".asInstanceOf[CONSTRUCT]
  
  @js.native
  sealed trait ENDPOINT
    extends StObject
       with MessageType
  inline def ENDPOINT: ENDPOINT = "ENDPOINT".asInstanceOf[ENDPOINT]
  
  @js.native
  sealed trait GET
    extends StObject
       with MessageType
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HANDLER
    extends StObject
       with WireValueType
  inline def HANDLER: HANDLER = "HANDLER".asInstanceOf[HANDLER]
  
  @js.native
  sealed trait PROXY
    extends StObject
       with WireValueType
  inline def PROXY: PROXY = "PROXY".asInstanceOf[PROXY]
  
  @js.native
  sealed trait RAW
    extends StObject
       with WireValueType
  inline def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @js.native
  sealed trait RELEASE
    extends StObject
       with MessageType
  inline def RELEASE: RELEASE = "RELEASE".asInstanceOf[RELEASE]
  
  @js.native
  sealed trait SET
    extends StObject
       with MessageType
  inline def SET: SET = "SET".asInstanceOf[SET]
  
  @js.native
  sealed trait THROW
    extends StObject
       with WireValueType
  inline def THROW: THROW = "THROW".asInstanceOf[THROW]
}
