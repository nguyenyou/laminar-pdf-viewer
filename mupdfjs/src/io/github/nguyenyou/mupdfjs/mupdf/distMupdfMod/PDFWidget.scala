package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mupdf/dist/mupdf", "PDFWidget")
@js.native
open class PDFWidget protected () extends PDFAnnotation {
  def this(
    doc: PDFDocument,
    pointer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'pdf_annot'> */ Any
  ) = this()
  
  def getFieldFlags(): Double = js.native
  
  def getFieldType(): String = js.native
  
  def getLabel(): String = js.native
  
  def getMaxLen(): Double = js.native
  
  def getName(): String = js.native
  
  def getOptions(): js.Array[String] = js.native
  def getOptions(isExport: Boolean): js.Array[String] = js.native
  
  def getValue(): String = js.native
  
  def isButton(): Boolean = js.native
  
  def isCheckbox(): Boolean = js.native
  
  def isChoice(): Boolean = js.native
  
  def isComb(): Boolean = js.native
  
  def isComboBox(): Boolean = js.native
  
  def isListBox(): Boolean = js.native
  
  def isMultiline(): Boolean = js.native
  
  def isPassword(): Boolean = js.native
  
  def isPushButton(): Boolean = js.native
  
  def isRadioButton(): Boolean = js.native
  
  def isReadOnly(): Boolean = js.native
  
  def isText(): Boolean = js.native
  
  def setChoiceValue(value: String): Unit = js.native
  
  def setTextValue(value: String): Unit = js.native
  
  def toggle(): Unit = js.native
}
/* static members */
object PDFWidget {
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.BTN_FIELD_IS_NO_TOGGLE_TO_OFF")
  @js.native
  val BTN_FIELD_IS_NO_TOGGLE_TO_OFF: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.BTN_FIELD_IS_PUSHBUTTON")
  @js.native
  val BTN_FIELD_IS_PUSHBUTTON: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.BTN_FIELD_IS_RADIO")
  @js.native
  val BTN_FIELD_IS_RADIO: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.CH_FIELD_IS_COMBO")
  @js.native
  val CH_FIELD_IS_COMBO: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.CH_FIELD_IS_EDIT")
  @js.native
  val CH_FIELD_IS_EDIT: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.CH_FIELD_IS_MULTI_SELECT")
  @js.native
  val CH_FIELD_IS_MULTI_SELECT: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.CH_FIELD_IS_SORT")
  @js.native
  val CH_FIELD_IS_SORT: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.FIELD_IS_NO_EXPORT")
  @js.native
  val FIELD_IS_NO_EXPORT: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.FIELD_IS_READ_ONLY")
  @js.native
  val FIELD_IS_READ_ONLY: /* 1 */ Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.FIELD_IS_REQUIRED")
  @js.native
  val FIELD_IS_REQUIRED: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.TX_FIELD_IS_COMB")
  @js.native
  val TX_FIELD_IS_COMB: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.TX_FIELD_IS_MULTILINE")
  @js.native
  val TX_FIELD_IS_MULTILINE: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.TX_FIELD_IS_PASSWORD")
  @js.native
  val TX_FIELD_IS_PASSWORD: Double = js.native
  
  @JSImport("mupdf/dist/mupdf", "PDFWidget.WIDGET_TYPES")
  @js.native
  val WIDGET_TYPES: js.Array[String] = js.native
}
