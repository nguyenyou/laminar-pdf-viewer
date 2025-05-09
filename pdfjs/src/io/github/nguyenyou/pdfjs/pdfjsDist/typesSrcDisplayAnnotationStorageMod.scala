package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Hash
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Ids
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Readonlymapnullhashtransf
import io.github.nguyenyou.pdfjs.pdfjsDist.pdfjsDistStrings._empty
import io.github.nguyenyou.pdfjs.std.MapIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayAnnotationStorageMod {
  
  @JSImport("pdfjs-dist/types/src/display/annotation_storage", "AnnotationStorage")
  @js.native
  open class AnnotationStorage () extends StObject {
    
    def editorStats: Any = js.native
    
    /**
      * Get the value for a given key.
      * @param {string} key
      * @returns {Object}
      */
    def getRawValue(key: String): js.Object = js.native
    
    /**
      * Get the value for a given key if it exists, or return the default value.
      * @param {string} key
      * @param {Object} defaultValue
      * @returns {Object}
      */
    def getValue(key: String, defaultValue: js.Object): js.Object = js.native
    
    /**
      * Check if the storage contains the given key.
      * @param {string} key
      * @returns {boolean}
      */
    def has(key: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[MapIterator[js.Tuple2[Any, Any]]] = js.native
    
    /**
      * @returns {{ids: Set<string>, hash: string}}
      */
    def modifiedIds: Ids = js.native
    
    var onAnnotationEditor: Any = js.native
    
    var onResetModified: Any = js.native
    
    var onSetModified: Any = js.native
    
    /**
      * @returns {PrintAnnotationStorage}
      */
    def print: PrintAnnotationStorage = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Remove a value from the storage.
      * @param {string} key
      */
    def remove(key: String): Unit = js.native
    
    def resetModified(): Unit = js.native
    
    def resetModifiedIds(): Unit = js.native
    
    /**
      * PLEASE NOTE: Only intended for usage within the API itself.
      * @ignore
      */
    def serializable: Readonlymapnullhashtransf | Hash = js.native
    
    /**
      * Set the value for a given key
      * @param {string} key
      * @param {Object} value
      */
    def setValue(key: String, value: js.Object): Unit = js.native
    
    def size: Double = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/annotation_storage", "PrintAnnotationStorage")
  @js.native
  open class PrintAnnotationStorage protected () extends AnnotationStorage {
    def this(parent: Any) = this()
  }
  
  /* Inlined std.Readonly<{  map :null,   hash :'',   transfer :undefined}> */
  object SerializableEmpty {
    
    @JSImport("pdfjs-dist/types/src/display/annotation_storage", "SerializableEmpty.hash")
    @js.native
    val hash: _empty = js.native
    
    @JSImport("pdfjs-dist/types/src/display/annotation_storage", "SerializableEmpty.map")
    @js.native
    val map: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/annotation_storage", "SerializableEmpty.transfer")
    @js.native
    val transfer: /* undefined */ Any = js.native
  }
}
