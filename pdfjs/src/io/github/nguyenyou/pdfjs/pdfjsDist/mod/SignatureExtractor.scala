package io.github.nguyenyou.pdfjs.pdfjsDist.mod

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.AreContours
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.FontFamily
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Height
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Id
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.InnerMargin
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.KernelSize
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Outlines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist", "SignatureExtractor")
@js.native
open class SignatureExtractor ()
  extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersSignaturedrawMod.SignatureExtractor
/* static members */
object SignatureExtractor {
  
  @JSImport("pdfjs-dist", "SignatureExtractor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist", "SignatureExtractor.__#30@#PARAMETERS")
  @js.native
  val `__Numbersign30@NumbersignPARAMETERS`: KernelSize = js.native
  
  inline def `__Numbersign30@NumbersignbilateralFilter`(buf: Any, width: Any, height: Any, sigmaS: Any, sigmaR: Any, kernelSize: Any): js.Array[js.typedarray.Uint32Array | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#bilateralFilter")(buf.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sigmaS.asInstanceOf[js.Any], sigmaR.asInstanceOf[js.Any], kernelSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.Uint32Array | js.typedarray.Uint8Array]]
  
  inline def `__Numbersign30@NumbersignclockwiseNonZero`(buf: Any, width: Any, i0: Any, j0: Any, i: Any, j: Any, offset: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#clockwiseNonZero")(buf.asInstanceOf[js.Any], width.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], j0.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def `__Numbersign30@NumbersigncounterClockwiseNonZero`(buf: Any, width: Any, i0: Any, j0: Any, i: Any, j: Any, offset: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#counterClockwiseNonZero")(buf.asInstanceOf[js.Any], width.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], j0.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def `__Numbersign30@NumbersigndouglasPeucker`(points: Any): js.Array[Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#douglasPeucker")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | Null]
  
  inline def `__Numbersign30@NumbersigndouglasPeuckerHelper`(points: Any, start: Any, end: Any, output: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#douglasPeuckerHelper")(points.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def `__Numbersign30@NumbersignfindContours`(buf: Any, width: Any, height: Any, threshold: Any): js.Array[Id] = (^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#findContours")(buf.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[js.Array[Id]]
  
  inline def `__Numbersign30@NumbersigngetGrayPixels`(bitmap: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#getGrayPixels")(bitmap.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def `__Numbersign30@NumbersigngetHistogram`(buf: Any): js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#getHistogram")(buf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
  
  inline def `__Numbersign30@NumbersignguessThreshold`(histogram: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#guessThreshold")(histogram.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("pdfjs-dist", "SignatureExtractor.__#30@#neighborIdToIndex")
  @js.native
  val `__Numbersign30@NumbersignneighborIdToIndex`: js.typedarray.Int32Array = js.native
  
  inline def `__Numbersign30@NumbersignneighborIndexToId`(i0: Any, j0: Any, i: Any, j: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#neighborIndexToId")(i0.asInstanceOf[js.Any], j0.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def `__Numbersign30@NumbersigntoUint8`(buf: Any): js.typedarray.Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("__#30@#toUint8")(buf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
  
  inline def compressSignature(param0: Height): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSignature")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def decompressSignature(signatureData: Any): js.Promise[Outlines | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressSignature")(signatureData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Outlines | Null]]
  
  inline def extractContoursFromText(text: Any, param1: FontFamily, pageWidth: Any, pageHeight: Any, rotation: Any, innerMargin: Any): AreContours | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractContoursFromText")(text.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], pageWidth.asInstanceOf[js.Any], pageHeight.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], innerMargin.asInstanceOf[js.Any])).asInstanceOf[AreContours | Null]
  
  inline def process(bitmap: Any, pageWidth: Any, pageHeight: Any, rotation: Any, innerMargin: Any): AreContours | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(bitmap.asInstanceOf[js.Any], pageWidth.asInstanceOf[js.Any], pageHeight.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], innerMargin.asInstanceOf[js.Any])).asInstanceOf[AreContours | Null]
  
  inline def processDrawnLines(param0: InnerMargin): AreContours | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("processDrawnLines")(param0.asInstanceOf[js.Any]).asInstanceOf[AreContours | Null]
}
