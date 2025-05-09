package io.github.nguyenyou.pdfjs.pdfjsDist.mod

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Element
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.TextDivs
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayXfaLayerMod.XfaLayerParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist", "XfaLayer")
@js.native
open class XfaLayer ()
  extends io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayXfaLayerMod.XfaLayer
/* static members */
object XfaLayer {
  
  @JSImport("pdfjs-dist", "XfaLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Render the XFA layer.
    *
    * @param {XfaLayerParameters} parameters
    */
  inline def render(parameters: XfaLayerParameters): TextDivs = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(parameters.asInstanceOf[js.Any]).asInstanceOf[TextDivs]
  
  inline def setAttributes(param0: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAttributes")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setupStorage(html: Any, id: Any, element: Any, storage: Any, intent: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupStorage")(html.asInstanceOf[js.Any], id.asInstanceOf[js.Any], element.asInstanceOf[js.Any], storage.asInstanceOf[js.Any], intent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Update the XFA layer.
    *
    * @param {XfaLayerParameters} parameters
    */
  inline def update(parameters: XfaLayerParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
