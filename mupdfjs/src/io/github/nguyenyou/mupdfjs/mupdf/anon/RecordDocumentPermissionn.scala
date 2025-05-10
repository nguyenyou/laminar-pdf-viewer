package io.github.nguyenyou.mupdfjs.mupdf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<mupdf.mupdf/dist/mupdf.DocumentPermission, number> */
trait RecordDocumentPermissionn extends StObject {
  
  var accessibility: Double
  
  var annotate: Double
  
  var assemble: Double
  
  var copy: Double
  
  var edit: Double
  
  var form: Double
  
  var print: Double
  
  var `print-hq`: Double
}
object RecordDocumentPermissionn {
  
  inline def apply(
    accessibility: Double,
    annotate: Double,
    assemble: Double,
    copy: Double,
    edit: Double,
    form: Double,
    print: Double,
    `print-hq`: Double
  ): RecordDocumentPermissionn = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], annotate = annotate.asInstanceOf[js.Any], assemble = assemble.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any])
    __obj.updateDynamic("print-hq")(`print-hq`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDocumentPermissionn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordDocumentPermissionn] (val x: Self) extends AnyVal {
    
    inline def setAccessibility(value: Double): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAnnotate(value: Double): Self = StObject.set(x, "annotate", value.asInstanceOf[js.Any])
    
    inline def setAssemble(value: Double): Self = StObject.set(x, "assemble", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Double): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: Double): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setForm(value: Double): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setPrint(value: Double): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    inline def `setPrint-hq`(value: Double): Self = StObject.set(x, "print-hq", value.asInstanceOf[js.Any])
  }
}
