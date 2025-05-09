package io.github.nguyenyou.pdfjs.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystem) */
trait FileSystem extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystem/name) */
  /* standard dom */
  val name: String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystem/root) */
  /* standard dom */
  val root: FileSystemDirectoryEntry
}
object FileSystem {
  
  inline def apply(name: String, root: FileSystemDirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystem] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: FileSystemDirectoryEntry): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
