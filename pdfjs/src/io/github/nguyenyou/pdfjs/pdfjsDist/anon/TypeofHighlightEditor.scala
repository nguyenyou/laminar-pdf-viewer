package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorHighlightMod.HighlightEditor
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHighlightEditor
  extends StObject
     with Instantiable1[/* params */ Any, HighlightEditor] {
  
  @JSName("__#24@#endHighlight")
  def `__Numbersign24@NumbersignendHighlight`(parent: Any, event: Any): Unit = js.native
  
  @JSName("__#24@#highlightMove")
  def `__Numbersign24@NumbersignhighlightMove`(parent: Any, event: Any): Unit = js.native
  
  @JSName("__#24@#rotateBbox")
  def `__Numbersign24@NumbersignrotateBbox`(param0: js.Tuple4[Any, Any, Any, Any], angle: Any): js.Array[Any] = js.native
  
  var _defaultColor: Null = js.native
  
  var _defaultOpacity: Double = js.native
  
  var _defaultThickness: Double = js.native
  
  var _editorType: Double = js.native
  
  var _freeHighlight: Null = js.native
  
  var _freeHighlightClipId: String = js.native
  
  var _freeHighlightId: Double = js.native
  
  def _keyboardManager: Any = js.native
  
  var _type: String = js.native
  
  def computeTelemetryFinalData(data: Any): NumberOfColors = js.native
  
  def defaultPropertiesToUpdate: js.Array[js.Array[Double | Null]] = js.native
  
  /** @inheritdoc */
  def deserialize(data: Any, parent: Any, uiManager: Any): js.Promise[AnnotationEditor | Null] = js.native
  
  /** @inheritdoc */
  def initialize(l10n: Any, uiManager: Any): Unit = js.native
  
  def startHighlighting(parent: Any, isLTR: Any, param2: Target): Unit = js.native
  
  /** @inheritdoc */
  def updateDefaultParams(`type`: Any, value: Any): Unit = js.native
}
