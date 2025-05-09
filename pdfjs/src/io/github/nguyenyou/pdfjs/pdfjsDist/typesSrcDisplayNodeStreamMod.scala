package io.github.nguyenyou.pdfjs.pdfjsDist

import org.scalajs.dom.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayNodeStreamMod {
  
  @JSImport("pdfjs-dist/types/src/display/node_stream", "PDFNodeStream")
  @js.native
  open class PDFNodeStream protected () extends StObject {
    def this(source: Any) = this()
    
    var _fullRequestReader: PDFNodeStreamFsFullReader | Null = js.native
    
    def _progressiveDataLength: Double = js.native
    
    var _rangeRequestReaders: js.Array[Any] = js.native
    
    def cancelAllRequests(reason: Any): Unit = js.native
    
    def getFullReader(): PDFNodeStreamFsFullReader = js.native
    
    def getRangeReader(start: Any, end: Any): PDFNodeStreamFsRangeReader | Null = js.native
    
    var source: Any = js.native
    
    var url: URL = js.native
  }
  
  @js.native
  trait PDFNodeStreamFsFullReader extends StObject {
    
    var _contentLength: Any = js.native
    
    var _disableRange: Any = js.native
    
    var _done: Boolean = js.native
    
    def _error(reason: Any): Unit = js.native
    
    var _filename: Any = js.native
    
    var _headersCapability: Any = js.native
    
    var _isRangeSupported: Boolean = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    var _loaded: Double = js.native
    
    var _rangeChunkSize: Any = js.native
    
    var _readCapability: Any = js.native
    
    var _readableStream: Any = js.native
    
    def _setReadableStream(readableStream: Any): Unit = js.native
    
    var _storedError: Any = js.native
    
    var _url: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def contentLength: Any = js.native
    
    def filename: Any = js.native
    
    def headersReady: Any = js.native
    
    def isRangeSupported: Boolean = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onProgress: Any = js.native
    
    def read(): Any = js.native
  }
  
  @js.native
  trait PDFNodeStreamFsRangeReader extends StObject {
    
    var _done: Boolean = js.native
    
    def _error(reason: Any): Unit = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    var _loaded: Double = js.native
    
    var _readCapability: Any = js.native
    
    var _readableStream: Any = js.native
    
    def _setReadableStream(readableStream: Any): Unit = js.native
    
    var _storedError: Any = js.native
    
    var _url: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onProgress: Any = js.native
    
    def read(): Any = js.native
  }
}
