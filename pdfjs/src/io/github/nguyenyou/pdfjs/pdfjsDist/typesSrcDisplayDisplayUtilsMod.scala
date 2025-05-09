package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.Rotation
import io.github.nguyenyou.pdfjs.pdfjsDist.pdfjsDistStrings.httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayDisplayUtilsMod {
  
  @JSImport("pdfjs-dist/types/src/display/display_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/display/display_utils", "OutputScale")
  @js.native
  open class OutputScale () extends StObject {
    
    /**
      * @returns {boolean} Returns `true` if scaling was limited,
      *   `false` otherwise.
      */
    def limitCanvas(width: Any, height: Any, maxPixels: Any, maxDim: Any): Boolean = js.native
    
    /**
      * @type {boolean} Returns `true` when scaling is required, `false` otherwise.
      */
    def scaled: Boolean = js.native
    
    /**
      * @type {number} Horizontal scale.
      */
    var sx: Double = js.native
    
    /**
      * @type {number} Vertical scale.
      */
    var sy: Double = js.native
    
    /**
      * @type {boolean} Returns `true` when scaling is symmetric,
      *   `false` otherwise.
      */
    def symmetric: Boolean = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/display_utils", "PDFDateString")
  @js.native
  open class PDFDateString () extends StObject
  /* static members */
  object PDFDateString {
    
    @JSImport("pdfjs-dist/types/src/display/display_utils", "PDFDateString")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/display_utils", "PDFDateString.__#2@#regex")
    @js.native
    val `__Numbersign2@Numbersignregex`: Any = js.native
    
    /**
      * Convert a PDF date string to a JavaScript `Date` object.
      *
      * The PDF date string format is described in section 7.9.4 of the official
      * PDF 32000-1:2008 specification. However, in the PDF 1.7 reference (sixth
      * edition) Adobe describes the same format including a trailing apostrophe.
      * This syntax in incorrect, but Adobe Acrobat creates PDF files that contain
      * them. We ignore all apostrophes as they are not necessary for date parsing.
      *
      * Moreover, Adobe Acrobat doesn't handle changing the date to universal time
      * and doesn't use the user's time zone (effectively ignoring the HH' and mm'
      * parts of the date string).
      *
      * @param {string} input
      * @returns {Date|null}
      */
    inline def toDateObject(input: String): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateObject")(input.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
  }
  
  @JSImport("pdfjs-dist/types/src/display/display_utils", "PageViewport")
  @js.native
  open class PageViewport protected () extends StObject {
    /**
      * @param {PageViewportParameters}
      */
    def this(param0: PageViewportParameters) = this()
    
    def clone(param0: PageViewportCloneParameters): PageViewport = js.native
    
    /**
      * Converts viewport coordinates to the PDF location. For examples, useful
      * for converting canvas pixel location into PDF one.
      * @param {number} x - The x-coordinate.
      * @param {number} y - The y-coordinate.
      * @returns {Array} Array containing `x`- and `y`-coordinates of the
      *   point in the PDF coordinate space.
      * @see {@link convertToViewportPoint}
      */
    def convertToPdfPoint(x: Double, y: Double): js.Array[Any] = js.native
    
    /**
      * Converts PDF point to the viewport coordinates. For examples, useful for
      * converting PDF location into canvas pixel coordinates.
      * @param {number} x - The x-coordinate.
      * @param {number} y - The y-coordinate.
      * @returns {Array} Array containing `x`- and `y`-coordinates of the
      *   point in the viewport coordinate space.
      * @see {@link convertToPdfPoint}
      * @see {@link convertToViewportRectangle}
      */
    def convertToViewportPoint(x: Double, y: Double): js.Array[Any] = js.native
    
    /**
      * Converts PDF rectangle to the viewport coordinates.
      * @param {Array} rect - The xMin, yMin, xMax and yMax coordinates.
      * @returns {Array} Array containing corresponding coordinates of the
      *   rectangle in the viewport coordinate space.
      * @see {@link convertToViewportPoint}
      */
    def convertToViewportRectangle(rect: js.Array[Any]): js.Array[Any] = js.native
    
    var height: Double = js.native
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
    
    /**
      * The original, un-scaled, viewport dimensions.
      * @type {Object}
      */
    def rawDims: js.Object = js.native
    
    var rotation: Double = js.native
    
    var scale: Double = js.native
    
    var transform: js.Array[Double] = js.native
    
    var userUnit: Double = js.native
    
    var viewBox: js.Array[Double] = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/display_utils", "PixelsPerInch")
  @js.native
  open class PixelsPerInch () extends StObject
  /* static members */
  object PixelsPerInch {
    
    @JSImport("pdfjs-dist/types/src/display/display_utils", "PixelsPerInch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/display_utils", "PixelsPerInch.CSS")
    @js.native
    def CSS: Double = js.native
    inline def CSS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CSS")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/display_utils", "PixelsPerInch.PDF")
    @js.native
    def PDF: Double = js.native
    inline def PDF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDF")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/display_utils", "PixelsPerInch.PDF_TO_CSS_UNITS")
    @js.native
    def PDF_TO_CSS_UNITS: Double = js.native
    inline def PDF_TO_CSS_UNITS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDF_TO_CSS_UNITS")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("pdfjs-dist/types/src/display/display_utils", "RenderingCancelledException")
  @js.native
  open class RenderingCancelledException protected ()
    extends StObject
       with /* x */ StringDictionary[Any] {
    def this(msg: Any) = this()
    def this(msg: Any, extraDelay: Double) = this()
    
    var extraDelay: Double = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/display_utils", "SVG_NS")
  @js.native
  val SVG_NS: httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg = js.native
  
  @JSImport("pdfjs-dist/types/src/display/display_utils", "StatTimer")
  @js.native
  open class StatTimer () extends StObject {
    
    var started: Any = js.native
    
    def time(name: Any): Unit = js.native
    
    def timeEnd(name: Any): Unit = js.native
    
    var times: js.Array[Any] = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/display_utils", "SupportedImageMimeTypes")
  @js.native
  val SupportedImageMimeTypes: js.Array[String] = js.native
  
  inline def deprecated(details: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fetchData(url: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchData")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fetchData(url: Any, `type`: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchData")(url.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def getColorValues(colors: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorValues")(colors.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getCurrentTransform(ctx: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentTransform")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getCurrentTransformInverse(ctx: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentTransformInverse")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getFilenameFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilenameFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPdfFilenameFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPdfFilenameFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPdfFilenameFromUrl(url: String, defaultFilename: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPdfFilenameFromUrl")(url.asInstanceOf[js.Any], defaultFilename.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRGB(color: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRGB")(color.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getXfaPageViewport(xfaPage: Any, param1: Rotation): PageViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("getXfaPageViewport")(xfaPage.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[PageViewport]
  
  inline def isDataScheme(url: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataScheme")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPdfFile(filename: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPdfFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidFetchUrl(url: Any, baseUrl: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidFetchUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def noContextMenu(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noContextMenu")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLayerDimensions(div: HTMLDivElement, viewport: PageViewport): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLayerDimensions")(div.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setLayerDimensions(div: HTMLDivElement, viewport: PageViewport, mustFlip: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLayerDimensions")(div.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any], mustFlip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setLayerDimensions(div: HTMLDivElement, viewport: PageViewport, mustFlip: Boolean, mustRotate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLayerDimensions")(div.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any], mustFlip.asInstanceOf[js.Any], mustRotate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setLayerDimensions(div: HTMLDivElement, viewport: PageViewport, mustFlip: Unit, mustRotate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLayerDimensions")(div.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any], mustFlip.asInstanceOf[js.Any], mustRotate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stopEvent(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait PageViewportCloneParameters extends StObject {
    
    /**
      * - If true, the x-axis will not be flipped.
      * The default value is `false`.
      */
    var dontFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - The horizontal, i.e. x-axis, offset.
      * The default value is `this.offsetX`.
      */
    var offsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * - The vertical, i.e. y-axis, offset.
      * The default value is `this.offsetY`.
      */
    var offsetY: js.UndefOr[Double] = js.undefined
    
    /**
      * - The rotation, in degrees, overriding the one
      * in the cloned viewport. The default value is `this.rotation`.
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * - The scale, overriding the one in the cloned
      * viewport. The default value is `this.scale`.
      */
    var scale: js.UndefOr[Double] = js.undefined
  }
  object PageViewportCloneParameters {
    
    inline def apply(): PageViewportCloneParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageViewportCloneParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageViewportCloneParameters] (val x: Self) extends AnyVal {
      
      inline def setDontFlip(value: Boolean): Self = StObject.set(x, "dontFlip", value.asInstanceOf[js.Any])
      
      inline def setDontFlipUndefined: Self = StObject.set(x, "dontFlip", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  trait PageViewportParameters extends StObject {
    
    /**
      * - If true, the y-axis will not be flipped.
      * The default value is `false`.
      */
    var dontFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - The horizontal, i.e. x-axis, offset. The
      * default value is `0`.
      */
    var offsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * - The vertical, i.e. y-axis, offset. The
      * default value is `0`.
      */
    var offsetY: js.UndefOr[Double] = js.undefined
    
    /**
      * - The rotation, in degrees, of the viewport.
      */
    var rotation: Double
    
    /**
      * - The scale of the viewport.
      */
    var scale: Double
    
    /**
      * - The size of units.
      */
    var userUnit: Double
    
    /**
      * - The xMin, yMin, xMax and
      * yMax coordinates.
      */
    var viewBox: js.Array[Double]
  }
  object PageViewportParameters {
    
    inline def apply(rotation: Double, scale: Double, userUnit: Double, viewBox: js.Array[Double]): PageViewportParameters = {
      val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], userUnit = userUnit.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageViewportParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageViewportParameters] (val x: Self) extends AnyVal {
      
      inline def setDontFlip(value: Boolean): Self = StObject.set(x, "dontFlip", value.asInstanceOf[js.Any])
      
      inline def setDontFlipUndefined: Self = StObject.set(x, "dontFlip", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setUserUnit(value: Double): Self = StObject.set(x, "userUnit", value.asInstanceOf[js.Any])
      
      inline def setViewBox(value: js.Array[Double]): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxVarargs(value: Double*): Self = StObject.set(x, "viewBox", js.Array(value*))
    }
  }
}
