package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Done
import io.github.nguyenyou.pdfjs.std.ReadableStreamDefaultReader
import org.scalajs.dom.AbortController
import org.scalajs.dom.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayFetchStreamMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStream * / any */ @JSImport("pdfjs-dist/types/src/display/fetch_stream", "PDFFetchStream")
  @js.native
  open class PDFFetchStream protected () extends StObject {
    def this(source: Any) = this()
    
    var _fullRequestReader: PDFFetchStreamReader | Null = js.native
    
    def _progressiveDataLength: Double = js.native
    
    var _rangeRequestReaders: js.Array[Any] = js.native
    
    var _responseOrigin: Null = js.native
    
    def cancelAllRequests(reason: Any): Unit = js.native
    
    def getFullReader(): PDFFetchStreamReader = js.native
    
    def getRangeReader(begin: Any, end: Any): PDFFetchStreamRangeReader | Null = js.native
    
    var headers: Headers = js.native
    
    var isHttp: Boolean = js.native
    
    var source: Any = js.native
  }
  
  /** @implements {IPDFStreamRangeReader} */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStreamRangeReader * / any */ @js.native
  trait PDFFetchStreamRangeReader extends StObject {
    
    var _abortController: AbortController = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    var _loaded: Double = js.native
    
    var _readCapability: Any = js.native
    
    var _reader: ReadableStreamDefaultReader[js.typedarray.Uint8Array] | Null = js.native
    
    var _stream: Any = js.native
    
    var _withCredentials: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onProgress: Any = js.native
    
    def read(): js.Promise[Done] = js.native
  }
  
  /** @implements {IPDFStreamReader} */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStreamReader * / any */ @js.native
  trait PDFFetchStreamReader extends StObject {
    
    var _abortController: AbortController = js.native
    
    var _contentLength: Any = js.native
    
    var _disableRange: Any = js.native
    
    var _filename: String | Null = js.native
    
    var _headersCapability: Any = js.native
    
    var _isRangeSupported: Boolean = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    var _loaded: Double = js.native
    
    var _rangeChunkSize: Any = js.native
    
    var _reader: ReadableStreamDefaultReader[js.typedarray.Uint8Array] | Null = js.native
    
    var _stream: Any = js.native
    
    var _withCredentials: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def contentLength: Any = js.native
    
    def filename: String | Null = js.native
    
    def headersReady: Any = js.native
    
    def isRangeSupported: Boolean = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onProgress: Any = js.native
    
    def read(): js.Promise[Done] = js.native
  }
}
