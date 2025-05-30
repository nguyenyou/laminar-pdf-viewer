package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Begin
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.DisableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayTransportStreamMod {
  
  @JSImport("pdfjs-dist/types/src/display/transport_stream", "PDFDataTransportStream")
  @js.native
  open class PDFDataTransportStream protected ()
    extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcInterfacesMod.IPDFStream {
    def this(pdfDataRangeTransport: Any, param1: DisableStream) = this()
    
    var _contentDispositionFilename: Any = js.native
    
    var _contentLength: Any = js.native
    
    var _fullRequestReader: Any = js.native
    
    var _isRangeSupported: Boolean = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    def _onProgress(evt: Any): Unit = js.native
    
    def _onProgressiveDone(): Unit = js.native
    
    def _onReceiveData(param0: Begin): Unit = js.native
    
    var _pdfDataRangeTransport: Any = js.native
    
    def _progressiveDataLength: Any = js.native
    
    var _progressiveDone: Any = js.native
    
    var _queuedChunks: js.Array[Any] = js.native
    
    var _rangeReaders: js.Array[Any] = js.native
    
    def _removeRangeReader(reader: Any): Unit = js.native
    
    def cancelAllRequests(reason: Any): Unit = js.native
    
    def getRangeReader(begin: Any, end: Any): PDFDataTransportStreamRangeReader | Null = js.native
  }
  
  type IPDFStream = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcInterfacesMod.IPDFStream
  
  type IPDFStreamRangeReader = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcInterfacesMod.IPDFStreamRangeReader
  
  type IPDFStreamReader = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcInterfacesMod.IPDFStreamReader
  
  /** @implements {IPDFStreamRangeReader} */
  @js.native
  trait PDFDataTransportStreamRangeReader
    extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcInterfacesMod.IPDFStreamRangeReader {
    
    var _begin: Any = js.native
    
    var _done: Boolean = js.native
    
    var _end: Any = js.native
    
    def _enqueue(chunk: Any): Unit = js.native
    
    var _queuedChunk: Any = js.native
    
    var _requests: js.Array[Any] = js.native
    
    var _stream: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
  }
  
  /** @implements {IPDFStreamReader} */
  @js.native
  trait PDFDataTransportStreamReader
    extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcInterfacesMod.IPDFStreamReader {
    
    var _done: Boolean = js.native
    
    def _enqueue(chunk: Any): Unit = js.native
    
    var _filename: Any = js.native
    
    var _headersReady: js.Promise[Unit] = js.native
    
    var _loaded: Double = js.native
    
    var _queuedChunks: Any = js.native
    
    var _requests: js.Array[Any] = js.native
    
    var _stream: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def progressiveDone(): Unit = js.native
  }
}
