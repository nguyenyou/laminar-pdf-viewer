package io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Name
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcSharedMessageHandlerMod.MessageHandler
import org.scalajs.dom.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "PDFWorker")
@js.native
open class PDFWorker () extends StObject {
  def this(param0: Name) = this()
  
  def _initialize(): Unit = js.native
  
  def _initializeFromPort(port: Any): Unit = js.native
  
  var _messageHandler: MessageHandler | Null = js.native
  
  var _port: Any = js.native
  
  var _readyCapability: Any = js.native
  
  def _setupFakeWorker(): Unit = js.native
  
  var _webWorker: Worker | Null = js.native
  
  /**
    * Destroys the worker instance.
    */
  def destroy(): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  /**
    * The current MessageHandler-instance.
    * @type {MessageHandler}
    */
  def messageHandler: MessageHandler = js.native
  
  var name: Any = js.native
  
  /**
    * The current `workerPort`, when it exists.
    * @type {Worker}
    */
  def port: Worker = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * Promise for worker initialization completion.
    * @type {Promise<void>}
    */
  def promise: js.Promise[Unit] = js.native
  
  var verbosity: Double = js.native
}
/* static members */
object PDFWorker {
  
  @JSImport("pdfjs-dist/types/src/display/api", "PDFWorker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/display/api", "PDFWorker.__#58@#fakeWorkerId")
  @js.native
  val `__Numbersign58@NumbersignfakeWorkerId`: Double = js.native
  
  @JSImport("pdfjs-dist/types/src/display/api", "PDFWorker.__#58@#isWorkerDisabled")
  @js.native
  val `__Numbersign58@NumbersignisWorkerDisabled`: Boolean = js.native
  
  @JSImport("pdfjs-dist/types/src/display/api", "PDFWorker.__#58@#workerPorts")
  @js.native
  val `__Numbersign58@NumbersignworkerPorts`: Any = js.native
  
  /**
    * @param {PDFWorkerParameters} params - The worker initialization parameters.
    * @returns {PDFWorker}
    */
  inline def fromPort(params: PDFWorkerParameters): PDFWorker = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPort")(params.asInstanceOf[js.Any]).asInstanceOf[PDFWorker]
}
