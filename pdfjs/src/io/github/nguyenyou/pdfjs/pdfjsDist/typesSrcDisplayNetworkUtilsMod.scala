package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.AllowRangeRequests
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.DisableRange
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcSharedUtilMod.ResponseException
import org.scalajs.dom.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayNetworkUtilsMod {
  
  @JSImport("pdfjs-dist/types/src/display/network_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHeaders(isHttp: Any, httpHeaders: Any): Headers = (^.asInstanceOf[js.Dynamic].applyDynamic("createHeaders")(isHttp.asInstanceOf[js.Any], httpHeaders.asInstanceOf[js.Any])).asInstanceOf[Headers]
  
  inline def createResponseError(status: Any, url: Any): ResponseException = (^.asInstanceOf[js.Dynamic].applyDynamic("createResponseError")(status.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[ResponseException]
  
  inline def extractFilenameFromHeader(responseHeaders: Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFilenameFromHeader")(responseHeaders.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getResponseOrigin(url: Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponseOrigin")(url.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def validateRangeRequestCapabilities(param0: DisableRange): AllowRangeRequests = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRangeRequestCapabilities")(param0.asInstanceOf[js.Any]).asInstanceOf[AllowRangeRequests]
  
  inline def validateResponseStatus(status: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateResponseStatus")(status.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
