package io.github.nguyenyou.pdfjs.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelSize extends StObject {
  
  var kernelSize: Double
  
  var maxDim: Double
  
  var sigmaR: Double
  
  var sigmaSFactor: Double
}
object KernelSize {
  
  inline def apply(kernelSize: Double, maxDim: Double, sigmaR: Double, sigmaSFactor: Double): KernelSize = {
    val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any], maxDim = maxDim.asInstanceOf[js.Any], sigmaR = sigmaR.asInstanceOf[js.Any], sigmaSFactor = sigmaSFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KernelSize] (val x: Self) extends AnyVal {
    
    inline def setKernelSize(value: Double): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
    
    inline def setMaxDim(value: Double): Self = StObject.set(x, "maxDim", value.asInstanceOf[js.Any])
    
    inline def setSigmaR(value: Double): Self = StObject.set(x, "sigmaR", value.asInstanceOf[js.Any])
    
    inline def setSigmaSFactor(value: Double): Self = StObject.set(x, "sigmaSFactor", value.asInstanceOf[js.Any])
  }
}
