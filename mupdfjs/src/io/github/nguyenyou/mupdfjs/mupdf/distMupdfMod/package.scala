package io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Matrix = js.Tuple6[Double, Double, Double, Double, Double, Double]

type Rect = js.Tuple4[Double, Double, Double, Double]

inline def disableICC(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableICC")().asInstanceOf[Unit]

inline def enableICC(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableICC")().asInstanceOf[Unit]

inline def installLoadFontFunction(f: js.Function2[/* name */ String, /* script */ String, Buffer | Null]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installLoadFontFunction")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setUserCSS(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserCSS")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** The types that can be automatically converted into a Buffer object */
type AnyBuffer = Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | String

type Color = js.Array[Double] | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.FreeTextCallout
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.FreeTextTypeWriter
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.LineArrow
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.LineDimension
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.PloyLine
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.PolygonCloud
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.PolygonDimension
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.StampImage
  - `io.github.nguyenyou.mupdfjs`.mupdf.mupdfStrings.StampSnapshot
*/
type PDFAnnotationIntent = _PDFAnnotationIntent | Null

type PDFObjectPath = js.Array[Double | String | PDFObject]

type Point = js.Tuple2[Double, Double]

type Quad = js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]
