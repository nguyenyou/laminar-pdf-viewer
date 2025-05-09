package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorStampMod.StampEditor
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStampEditor
  extends StObject
     with Instantiable1[/* params */ Any, StampEditor] {
  
  var _editorType: Double = js.native
  
  var _type: String = js.native
  
  def computeTelemetryFinalData(data: Any): HasAltText = js.native
  
  /** @inheritdoc */
  def deserialize(data: Any, parent: Any, uiManager: Any): js.Promise[AnnotationEditor | Null] = js.native
  
  /** @inheritdoc */
  def initialize(l10n: Any, uiManager: Any): Unit = js.native
  
  /** @inheritdoc */
  def isHandlingMimeForPasting(mime: Any): Boolean = js.native
  
  /** @inheritdoc */
  def paste(item: Any, parent: Any): Unit = js.native
}
