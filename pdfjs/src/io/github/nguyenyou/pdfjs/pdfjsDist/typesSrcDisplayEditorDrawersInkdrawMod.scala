package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Bbox
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Line
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Path
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PathDTransform
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PathDTransformorigin
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PathRoot
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PathTransform
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.PathTransformTransformorigin
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Paths
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Points
import io.github.nguyenyou.pdfjs.pdfjsDist.anon.RootClass
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayEditorDrawersOutlineMod.Outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorDrawersInkdrawMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/drawers/inkdraw", "InkDrawOutline")
  @js.native
  open class InkDrawOutline () extends Outline {
    
    def build(
      lines: Any,
      parentWidth: Any,
      parentHeight: Any,
      parentScale: Any,
      rotation: Any,
      thickness: Any,
      innerMargin: Any
    ): Unit = js.native
    
    def defaultProperties: PathRoot = js.native
    
    def defaultSVGProperties: Bbox = js.native
    
    def getPathResizedSVGProperties(param0: js.Tuple4[Any, Any, Any, Any]): PathDTransform = js.native
    
    def getPathResizingSVGProperties(param0: js.Tuple4[Any, Any, Any, Any]): PathTransformTransformorigin = js.native
    
    def getPathTranslatedSVGProperties(param0: js.Tuple2[Any, Any], parentDimensions: Any): PathDTransformorigin = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeLastElement(): Path = js.native
    
    def rotationTransform: String = js.native
    
    def serialize(param0: js.Tuple4[Any, Any, Any, Any], isForCopying: Any): Points = js.native
    
    def setLastElement(element: Any): Path = js.native
    
    def thickness: Any = js.native
    
    def updateParentDimensions(param0: js.Tuple2[Any, Any], scale: Any): Any = js.native
    
    def updateProperty(name: Any, value: Any): Any = js.native
    
    def updateRotation(rotation: Any): PathTransform = js.native
    
    def viewBox: Any = js.native
  }
  /* static members */
  object InkDrawOutline {
    
    @JSImport("pdfjs-dist/types/src/display/editor/drawers/inkdraw", "InkDrawOutline")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserialize(pageX: Any, pageY: Any, pageWidth: Any, pageHeight: Any, innerMargin: Any, param5: Paths): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(pageX.asInstanceOf[js.Any], pageY.asInstanceOf[js.Any], pageWidth.asInstanceOf[js.Any], pageHeight.asInstanceOf[js.Any], innerMargin.asInstanceOf[js.Any], param5.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/drawers/inkdraw", "InkDrawOutliner")
  @js.native
  open class InkDrawOutliner protected () extends StObject {
    def this(x: Any, y: Any, parentWidth: Any, parentHeight: Any, rotation: Any, thickness: Any) = this()
    
    def add(x: Any, y: Any): Path | Null = js.native
    
    def defaultSVGProperties: RootClass = js.native
    
    def end(x: Any, y: Any): Path | Null = js.native
    
    def getLastElement(): js.UndefOr[Line] = js.native
    
    def getOutlines(parentWidth: Any, parentHeight: Any, scale: Any, innerMargin: Any): InkDrawOutline = js.native
    
    def isCancellable(): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeLastElement(): Path = js.native
    
    def setLastElement(element: Any): Path = js.native
    
    def startNew(x: Any, y: Any, parentWidth: Any, parentHeight: Any, rotation: Any): Null = js.native
    
    def toSVGPath(): String = js.native
    
    def updateProperty(name: Any, value: Any): Unit = js.native
  }
}
