package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcSharedUtilMod.AbortException
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcSharedUtilMod.InvalidPDFException
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcSharedUtilMod.PasswordException
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcSharedUtilMod.ResponseException
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcSharedUtilMod.UnknownErrorException
import io.github.nguyenyou.pdfjs.std.JSON
import org.scalajs.dom.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcSharedMessageHandlerMod {
  
  @JSImport("pdfjs-dist/types/src/shared/message_handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/shared/message_handler", "MessageHandler")
  @js.native
  open class MessageHandler protected () extends StObject {
    def this(sourceName: Any, targetName: Any, comObj: Any) = this()
    
    var actionHandler: Any = js.native
    
    var callbackCapabilities: Any = js.native
    
    var callbackId: Double = js.native
    
    var comObj: Any = js.native
    
    def destroy(): Unit = js.native
    
    def on(actionName: Any, handler: Any): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Sends a message to the comObj to invoke the action with the supplied data.
      * @param {string} actionName - Action to call.
      * @param {JSON} data - JSON data to send.
      * @param {Array} [transfers] - List of transfers/ArrayBuffers.
      */
    def send(actionName: String, data: JSON): Unit = js.native
    def send(actionName: String, data: JSON, transfers: js.Array[Any]): Unit = js.native
    
    /**
      * Sends a message to the comObj to invoke the action with the supplied data.
      * Expects that the other side will callback with the response.
      * @param {string} actionName - Action to call.
      * @param {JSON} data - JSON data to send.
      * @param {Array} [transfers] - List of transfers/ArrayBuffers.
      * @returns {Promise} Promise to be resolved with response data.
      */
    def sendWithPromise(actionName: String, data: JSON): js.Promise[Any] = js.native
    def sendWithPromise(actionName: String, data: JSON, transfers: js.Array[Any]): js.Promise[Any] = js.native
    
    /**
      * Sends a message to the comObj to invoke the action with the supplied data.
      * Expect that the other side will callback to signal 'start_complete'.
      * @param {string} actionName - Action to call.
      * @param {JSON} data - JSON data to send.
      * @param {Object} queueingStrategy - Strategy to signal backpressure based on
      *                 internal queue.
      * @param {Array} [transfers] - List of transfers/ArrayBuffers.
      * @returns {ReadableStream} ReadableStream to read data in chunks.
      */
    def sendWithStream(actionName: String, data: JSON, queueingStrategy: js.Object): ReadableStream[Any] = js.native
    def sendWithStream(actionName: String, data: JSON, queueingStrategy: js.Object, transfers: js.Array[Any]): ReadableStream[Any] = js.native
    
    var sourceName: Any = js.native
    
    var streamControllers: Any = js.native
    
    var streamId: Double = js.native
    
    var streamSinks: Any = js.native
    
    var targetName: Any = js.native
  }
  
  inline def wrapReason(ex: Any): PasswordException | UnknownErrorException | InvalidPDFException | ResponseException | AbortException = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapReason")(ex.asInstanceOf[js.Any]).asInstanceOf[PasswordException | UnknownErrorException | InvalidPDFException | ResponseException | AbortException]
}
