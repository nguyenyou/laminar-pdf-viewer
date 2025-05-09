package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersInkdrawMod.InkDrawOutliner
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorInkMod.InkEditor
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInkEditor
  extends StObject
     with Instantiable0[InkEditor] {
  
  var _defaultDrawingOptions: Null = js.native
  
  var _editorType: Double = js.native
  
  var _type: String = js.native
  
  /** @inheritdoc */
  def createDrawerInstance(x: Any, y: Any, parentWidth: Any, parentHeight: Any, rotation: Any): InkDrawOutliner = js.native
  
  /** @inheritdoc */
  def deserializeDraw(pageX: Any, pageY: Any, pageWidth: Any, pageHeight: Any, innerMargin: Any, data: Any): Any = js.native
  
  /** @inheritdoc */
  def getDefaultDrawingOptions(options: Any): Any = js.native
  
  /** @inheritdoc */
  def initialize(l10n: Any, uiManager: Any): Unit = js.native
  
  /** @inheritdoc */
  def typesMap: Any = js.native
}
