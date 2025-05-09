package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorFreetextMod.FreeTextEditor
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFreeTextEditor
  extends StObject
     with Instantiable1[/* params */ Any, FreeTextEditor] {
  
  @JSName("__#18@#deserializeContent")
  def `__Numbersign18@NumbersigndeserializeContent`(content: Any): Any = js.native
  
  @JSName("__#18@#getNodeContent")
  def `__Numbersign18@NumbersigngetNodeContent`(node: Any): Any = js.native
  
  var _defaultColor: Null = js.native
  
  var _defaultFontSize: Double = js.native
  
  var _editorType: Double = js.native
  
  var _freeTextDefaultContent: String = js.native
  
  var _internalPadding: Double = js.native
  
  def _keyboardManager: Any = js.native
  
  var _type: String = js.native
  
  /** @inheritdoc */
  def defaultPropertiesToUpdate: js.Array[js.Array[Any]] = js.native
  
  /** @inheritdoc */
  def deserialize(data: Any, parent: Any, uiManager: Any): js.Promise[AnnotationEditor | Null] = js.native
  
  /** @inheritdoc */
  def initialize(l10n: Any, uiManager: Any): Unit = js.native
  
  /** @inheritdoc */
  def updateDefaultParams(`type`: Any, value: Any): Unit = js.native
}
