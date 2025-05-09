package io.github.nguyenyou.pdfjs.pdfjsDist.mod

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Name
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFWorkerParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist", "PDFWorker")
@js.native
open class PDFWorker ()
  extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFWorker {
  def this(param0: Name) = this()
}
/* static members */
object PDFWorker {
  
  @JSImport("pdfjs-dist", "PDFWorker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist", "PDFWorker.__#58@#fakeWorkerId")
  @js.native
  val `__Numbersign58@NumbersignfakeWorkerId`: Double = js.native
  
  @JSImport("pdfjs-dist", "PDFWorker.__#58@#isWorkerDisabled")
  @js.native
  val `__Numbersign58@NumbersignisWorkerDisabled`: Boolean = js.native
  
  @JSImport("pdfjs-dist", "PDFWorker.__#58@#workerPorts")
  @js.native
  val `__Numbersign58@NumbersignworkerPorts`: Any = js.native
  
  /**
    * @param {PDFWorkerParameters} params - The worker initialization parameters.
    * @returns {PDFWorker}
    */
  inline def fromPort(params: PDFWorkerParameters): io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFWorker = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPort")(params.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFWorker]
}
