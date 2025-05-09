package io.github.nguyenyou.pdfjs.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcInterfacesMod {
  
  @JSImport("pdfjs-dist/types/src/interfaces", "IPDFStream")
  @js.native
  open class IPDFStream () extends StObject {
    
    /**
      * Cancels all opened reader and closes all their opened requests.
      * @param {Object} reason - the reason for cancelling
      */
    def cancelAllRequests(reason: js.Object): Unit = js.native
    
    /**
      * Gets a reader for the entire PDF data.
      * @returns {IPDFStreamReader}
      */
    def getFullReader(): IPDFStreamReader = js.native
    
    /**
      * Gets a reader for the range of the PDF data.
      *
      * NOTE: Currently this method is only expected to be invoked *after*
      * the `IPDFStreamReader.prototype.headersReady` promise has resolved.
      *
      * @param {number} begin - the start offset of the data.
      * @param {number} end - the end offset of the data.
      * @returns {IPDFStreamRangeReader}
      */
    def getRangeReader(begin: Double, end: Double): IPDFStreamRangeReader = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/interfaces", "IPDFStreamRangeReader")
  @js.native
  open class IPDFStreamRangeReader () extends StObject {
    
    /**
      * Cancels all pending read requests and closes the stream.
      * @param {Object} reason
      */
    def cancel(reason: js.Object): Unit = js.native
    
    /**
      * Gets ability of the stream to progressively load binary data.
      * @type {boolean}
      */
    def isStreamingSupported: Boolean = js.native
    
    /**
      * Sets or gets the progress callback. The callback can be useful when the
      * isStreamingSupported property of the object is defined as false.
      * The callback is called with one parameter: an object with the loaded
      * property.
      */
    var onProgress: Any = js.native
    
    /**
      * Requests a chunk of the binary data. The method returns the promise, which
      * is resolved into object with properties "value" and "done". If the done
      * is set to true, then the stream has reached its end, otherwise the value
      * contains binary data. Cancelled requests will be resolved with the done is
      * set to true.
      * @returns {Promise}
      */
    def read(): js.Promise[Any] = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/interfaces", "IPDFStreamReader")
  @js.native
  open class IPDFStreamReader () extends StObject {
    
    /**
      * Cancels all pending read requests and closes the stream.
      * @param {Object} reason
      */
    def cancel(reason: js.Object): Unit = js.native
    
    /**
      * Gets PDF binary data length. It is defined after the headersReady promise
      * is resolved.
      * @type {number} The data length (or 0 if unknown).
      */
    def contentLength: Double = js.native
    
    /**
      * Gets the Content-Disposition filename. It is defined after the headersReady
      * promise is resolved.
      * @type {string|null} The filename, or `null` if the Content-Disposition
      *                     header is missing/invalid.
      */
    def filename: String | Null = js.native
    
    /**
      * Gets a promise that is resolved when the headers and other metadata of
      * the PDF data stream are available.
      * @type {Promise}
      */
    def headersReady: js.Promise[Any] = js.native
    
    /**
      * Gets ability of the stream to handle range requests. It is defined after
      * the headersReady promise is resolved. Rejected when the reader is cancelled
      * or an error occurs.
      * @type {boolean}
      */
    def isRangeSupported: Boolean = js.native
    
    /**
      * Gets ability of the stream to progressively load binary data. It is defined
      * after the headersReady promise is resolved.
      * @type {boolean}
      */
    def isStreamingSupported: Boolean = js.native
    
    /**
      * Sets or gets the progress callback. The callback can be useful when the
      * isStreamingSupported property of the object is defined as false.
      * The callback is called with one parameter: an object with the loaded and
      * total properties.
      */
    var onProgress: Any = js.native
    
    /**
      * Requests a chunk of the binary data. The method returns the promise, which
      * is resolved into object with properties "value" and "done". If the done
      * is set to true, then the stream has reached its end, otherwise the value
      * contains binary data. Cancelled requests will be resolved with the done is
      * set to true.
      * @returns {Promise}
      */
    def read(): js.Promise[Any] = js.native
  }
}
