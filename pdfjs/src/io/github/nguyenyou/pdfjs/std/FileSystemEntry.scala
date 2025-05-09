package io.github.nguyenyou.pdfjs.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry) */
@js.native
trait FileSystemEntry extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/filesystem) */
  /* standard dom */
  val filesystem: FileSystem = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/fullPath) */
  /* standard dom */
  val fullPath: String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/getParent) */
  /* standard dom */
  def getParent(): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback, errorCallback: ErrorCallback): Unit = js.native
  def getParent(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/isDirectory) */
  /* standard dom */
  val isDirectory: Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/isFile) */
  /* standard dom */
  val isFile: Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/name) */
  /* standard dom */
  val name: String = js.native
}
