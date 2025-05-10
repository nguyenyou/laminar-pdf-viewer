package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("$libmupdf_device")
  @js.native
  def libmupdfDevice: Any = js.native
  
  inline def libmupdfDevice_=(x: Any): Unit = js.Dynamic.global.updateDynamic("$libmupdf_device")(x.asInstanceOf[js.Any])
  
  inline def libmupdfLoadFontFile(
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'char'> */ Any,
    script: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pointer<'char'> */ Any
  ): Any = (js.Dynamic.global.applyDynamic("$libmupdf_load_font_file")(name.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSGlobal("$libmupdf_path_walk")
  @js.native
  def libmupdfPathWalk: Any = js.native
  
  inline def libmupdfPathWalk_=(x: Any): Unit = js.Dynamic.global.updateDynamic("$libmupdf_path_walk")(x.asInstanceOf[js.Any])
  
  inline def libmupdfStmClose(ptr: Double): Unit = js.Dynamic.global.applyDynamic("$libmupdf_stm_close")(ptr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def libmupdfStmRead(ptr: Double, pos: Double, addr: Double, size: Double): Double = (js.Dynamic.global.applyDynamic("$libmupdf_stm_read")(ptr.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], addr.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def libmupdfStmSeek(ptr: Double, pos: Double, offset: Double, whence: Double): Double = (js.Dynamic.global.applyDynamic("$libmupdf_stm_seek")(ptr.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], whence.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("$libmupdf_text_walk")
  @js.native
  def libmupdfTextWalk: Any = js.native
  
  inline def libmupdfTextWalk_=(x: Any): Unit = js.Dynamic.global.updateDynamic("$libmupdf_text_walk")(x.asInstanceOf[js.Any])
  
  @JSGlobal("$libmupdf_wasm_Module")
  @js.native
  def libmupdfWasmModule: Any = js.native
  
  inline def libmupdfWasmModule_=(x: Any): Unit = js.Dynamic.global.updateDynamic("$libmupdf_wasm_Module")(x.asInstanceOf[js.Any])
}
