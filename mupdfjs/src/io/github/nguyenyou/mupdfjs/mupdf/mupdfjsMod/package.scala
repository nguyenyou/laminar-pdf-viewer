package io.github.nguyenyou.mupdfjs.mupdf.mupdfjsMod

import io.github.nguyenyou.mupdfjs.mupdf.mupdfjsMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def disableICC(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableICC")().asInstanceOf[Unit]

inline def enableICC(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableICC")().asInstanceOf[Unit]

inline def installLoadFontFunction(
  f: js.Function2[
  /* name */ String, 
  /* script */ String, 
  io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.Buffer | Null
]
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installLoadFontFunction")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setUserCSS(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserCSS")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
