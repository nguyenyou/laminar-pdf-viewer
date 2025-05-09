package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorSignatureMod.SignatureEditor
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSignatureEditor
  extends StObject
     with Instantiable0[SignatureEditor] {
  
  var _defaultDrawingOptions: Null = js.native
  
  var _editorType: Double = js.native
  
  var _type: String = js.native
  
  def computeTelemetryFinalData(data: Any): HasAltText = js.native
  
  /** @inheritdoc */
  def deserializeDraw(pageX: Any, pageY: Any, pageWidth: Any, pageHeight: Any, innerMargin: Any, data: Any): Any = js.native
  
  /** @inheritdoc */
  def getDefaultDrawingOptions(options: Any): Any = js.native
  
  /** @inheritdoc */
  def initialize(l10n: Any, uiManager: Any): Unit = js.native
  
  def typesMap: Any = js.native
}
