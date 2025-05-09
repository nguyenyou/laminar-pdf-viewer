package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Callback
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.DisableFontFace
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.StyleElement
import io.github.nguyenyou.pdfjs.std.FontFace
import io.github.nguyenyou.pdfjs.std.Set
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayFontLoaderMod {
  
  @JSImport("pdfjs-dist/types/src/display/font_loader", "FontFaceObject")
  @js.native
  open class FontFaceObject protected () extends StObject {
    def this(translatedData: Any) = this()
    
    var _inspectFont: Any = js.native
    
    var compiledGlyphs: Any = js.native
    
    def createFontFaceRule(): String | Null = js.native
    
    def createNativeFontFace(): FontFace | Null = js.native
    
    def getPathGenerator(objs: Any, character: Any): Any = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/font_loader", "FontLoader")
  @js.native
  open class FontLoader protected () extends StObject {
    def this(param0: StyleElement) = this()
    
    var _document: Document = js.native
    
    def _loadTestFont: Any = js.native
    
    def _prepareFontLoadEvent(font: Any, request: Any): Unit = js.native
    
    def _queueLoadingCallback(callback: Any): Callback = js.native
    
    def addNativeFontFace(nativeFontFace: Any): Unit = js.native
    
    def bind(font: Any): js.Promise[Unit] = js.native
    
    def clear(): Unit = js.native
    
    def insertRule(rule: Any): Unit = js.native
    
    def isFontLoadingAPISupported: Any = js.native
    
    def isSyncFontLoadingSupported: Any = js.native
    
    def loadSystemFont(param0: DisableFontFace): js.Promise[Unit] = js.native
    
    var loadTestFontId: js.UndefOr[Double] = js.native
    
    var loadingRequests: js.UndefOr[js.Array[Any]] = js.native
    
    var nativeFontFaces: Set[Any] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeNativeFontFace(nativeFontFace: Any): Unit = js.native
    
    var styleElement: HTMLStyleElement | Null = js.native
  }
}
