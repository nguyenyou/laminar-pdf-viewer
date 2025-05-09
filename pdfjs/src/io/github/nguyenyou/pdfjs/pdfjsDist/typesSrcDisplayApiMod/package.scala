package io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod

import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.^
import org.scalajs.dom.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def build: String = ^.asInstanceOf[js.Dynamic].selectDynamic("build").asInstanceOf[String]

inline def getDocument(): PDFDocumentLoadingTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[PDFDocumentLoadingTask]
inline def getDocument(src: DocumentInitParameters): PDFDocumentLoadingTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(src.asInstanceOf[js.Any]).asInstanceOf[PDFDocumentLoadingTask]
inline def getDocument(src: TypedArray): PDFDocumentLoadingTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(src.asInstanceOf[js.Any]).asInstanceOf[PDFDocumentLoadingTask]
inline def getDocument(src: String): PDFDocumentLoadingTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(src.asInstanceOf[js.Any]).asInstanceOf[PDFDocumentLoadingTask]
inline def getDocument(src: js.typedarray.ArrayBuffer): PDFDocumentLoadingTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(src.asInstanceOf[js.Any]).asInstanceOf[PDFDocumentLoadingTask]
inline def getDocument(src: URL): PDFDocumentLoadingTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(src.asInstanceOf[js.Any]).asInstanceOf[PDFDocumentLoadingTask]

inline def isValidExplicitDest(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidExplicitDest")().asInstanceOf[Boolean]
inline def isValidExplicitDest(dest: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidExplicitDest")(dest.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
