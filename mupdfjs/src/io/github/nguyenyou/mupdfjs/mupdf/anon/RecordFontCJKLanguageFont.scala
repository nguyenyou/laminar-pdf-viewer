package io.github.nguyenyou.mupdfjs.mupdf.anon

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.FontCJKOrdering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<mupdf.mupdf/dist/mupdf.FontCJKLanguage, mupdf.mupdf/dist/mupdf.FontCJKOrdering> */
trait RecordFontCJKLanguageFont extends StObject {
  
  var `Adobe-CNS1`: FontCJKOrdering
  
  var `Adobe-GB1`: FontCJKOrdering
  
  var `Adobe-Japan1`: FontCJKOrdering
  
  var `Adobe-Korea1`: FontCJKOrdering
  
  var ja: FontCJKOrdering
  
  var ko: FontCJKOrdering
  
  var `zh-CN`: FontCJKOrdering
  
  var `zh-HK`: FontCJKOrdering
  
  var `zh-Hans`: FontCJKOrdering
  
  var `zh-Hant`: FontCJKOrdering
  
  var `zh-TW`: FontCJKOrdering
}
object RecordFontCJKLanguageFont {
  
  inline def apply(
    `Adobe-CNS1`: FontCJKOrdering,
    `Adobe-GB1`: FontCJKOrdering,
    `Adobe-Japan1`: FontCJKOrdering,
    `Adobe-Korea1`: FontCJKOrdering,
    ja: FontCJKOrdering,
    ko: FontCJKOrdering,
    `zh-CN`: FontCJKOrdering,
    `zh-HK`: FontCJKOrdering,
    `zh-Hans`: FontCJKOrdering,
    `zh-Hant`: FontCJKOrdering,
    `zh-TW`: FontCJKOrdering
  ): RecordFontCJKLanguageFont = {
    val __obj = js.Dynamic.literal(ja = ja.asInstanceOf[js.Any], ko = ko.asInstanceOf[js.Any])
    __obj.updateDynamic("Adobe-CNS1")(`Adobe-CNS1`.asInstanceOf[js.Any])
    __obj.updateDynamic("Adobe-GB1")(`Adobe-GB1`.asInstanceOf[js.Any])
    __obj.updateDynamic("Adobe-Japan1")(`Adobe-Japan1`.asInstanceOf[js.Any])
    __obj.updateDynamic("Adobe-Korea1")(`Adobe-Korea1`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-HK")(`zh-HK`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-Hans")(`zh-Hans`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-Hant")(`zh-Hant`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-TW")(`zh-TW`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFontCJKLanguageFont]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordFontCJKLanguageFont] (val x: Self) extends AnyVal {
    
    inline def `setAdobe-CNS1`(value: FontCJKOrdering): Self = StObject.set(x, "Adobe-CNS1", value.asInstanceOf[js.Any])
    
    inline def `setAdobe-GB1`(value: FontCJKOrdering): Self = StObject.set(x, "Adobe-GB1", value.asInstanceOf[js.Any])
    
    inline def `setAdobe-Japan1`(value: FontCJKOrdering): Self = StObject.set(x, "Adobe-Japan1", value.asInstanceOf[js.Any])
    
    inline def `setAdobe-Korea1`(value: FontCJKOrdering): Self = StObject.set(x, "Adobe-Korea1", value.asInstanceOf[js.Any])
    
    inline def setJa(value: FontCJKOrdering): Self = StObject.set(x, "ja", value.asInstanceOf[js.Any])
    
    inline def setKo(value: FontCJKOrdering): Self = StObject.set(x, "ko", value.asInstanceOf[js.Any])
    
    inline def `setZh-CN`(value: FontCJKOrdering): Self = StObject.set(x, "zh-CN", value.asInstanceOf[js.Any])
    
    inline def `setZh-HK`(value: FontCJKOrdering): Self = StObject.set(x, "zh-HK", value.asInstanceOf[js.Any])
    
    inline def `setZh-Hans`(value: FontCJKOrdering): Self = StObject.set(x, "zh-Hans", value.asInstanceOf[js.Any])
    
    inline def `setZh-Hant`(value: FontCJKOrdering): Self = StObject.set(x, "zh-Hant", value.asInstanceOf[js.Any])
    
    inline def `setZh-TW`(value: FontCJKOrdering): Self = StObject.set(x, "zh-TW", value.asInstanceOf[js.Any])
  }
}
