package io.github.nguyenyou.mupdfjs.mupdf

import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.BlendMode
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.ColorSpaceType
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.DocumentPermission
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.FontCJKLanguage
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.FontSimpleEncoding
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.LineCap
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.LineJoin
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.LinkDestType
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationBorderEffect
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationBorderStyle
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationLineEndingStyle
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PDFAnnotationType
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.PageBox
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod.SelectMode
import io.github.nguyenyou.mupdfjs.mupdf.distMupdfMod._PDFAnnotationIntent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mupdfStrings {
  
  @js.native
  sealed trait `3D`
    extends StObject
       with PDFAnnotationType
  inline def `3D`: `3D` = "3D".asInstanceOf[`3D`]
  
  @js.native
  sealed trait `Adobe-CNS1`
    extends StObject
       with FontCJKLanguage
  inline def `Adobe-CNS1`: `Adobe-CNS1` = "Adobe-CNS1".asInstanceOf[`Adobe-CNS1`]
  
  @js.native
  sealed trait `Adobe-GB1`
    extends StObject
       with FontCJKLanguage
  inline def `Adobe-GB1`: `Adobe-GB1` = "Adobe-GB1".asInstanceOf[`Adobe-GB1`]
  
  @js.native
  sealed trait `Adobe-Japan1`
    extends StObject
       with FontCJKLanguage
  inline def `Adobe-Japan1`: `Adobe-Japan1` = "Adobe-Japan1".asInstanceOf[`Adobe-Japan1`]
  
  @js.native
  sealed trait `Adobe-Korea1`
    extends StObject
       with FontCJKLanguage
  inline def `Adobe-Korea1`: `Adobe-Korea1` = "Adobe-Korea1".asInstanceOf[`Adobe-Korea1`]
  
  @js.native
  sealed trait ArtBox
    extends StObject
       with PageBox
  inline def ArtBox: ArtBox = "ArtBox".asInstanceOf[ArtBox]
  
  @js.native
  sealed trait BGR
    extends StObject
       with ColorSpaceType
  inline def BGR: BGR = "BGR".asInstanceOf[BGR]
  
  @js.native
  sealed trait Bevel
    extends StObject
       with LineJoin
  inline def Bevel: Bevel = "Bevel".asInstanceOf[Bevel]
  
  @js.native
  sealed trait Beveled
    extends StObject
       with PDFAnnotationBorderStyle
  inline def Beveled: Beveled = "Beveled".asInstanceOf[Beveled]
  
  @js.native
  sealed trait BleedBox
    extends StObject
       with PageBox
  inline def BleedBox: BleedBox = "BleedBox".asInstanceOf[BleedBox]
  
  @js.native
  sealed trait Butt
    extends StObject
       with LineCap
       with PDFAnnotationLineEndingStyle
  inline def Butt: Butt = "Butt".asInstanceOf[Butt]
  
  @js.native
  sealed trait CMYK
    extends StObject
       with ColorSpaceType
  inline def CMYK: CMYK = "CMYK".asInstanceOf[CMYK]
  
  @js.native
  sealed trait Caret
    extends StObject
       with PDFAnnotationType
  inline def Caret: Caret = "Caret".asInstanceOf[Caret]
  
  @js.native
  sealed trait Circle
    extends StObject
       with PDFAnnotationLineEndingStyle
       with PDFAnnotationType
  inline def Circle: Circle = "Circle".asInstanceOf[Circle]
  
  @js.native
  sealed trait ClosedArrow
    extends StObject
       with PDFAnnotationLineEndingStyle
  inline def ClosedArrow: ClosedArrow = "ClosedArrow".asInstanceOf[ClosedArrow]
  
  @js.native
  sealed trait Cloudy
    extends StObject
       with PDFAnnotationBorderEffect
  inline def Cloudy: Cloudy = "Cloudy".asInstanceOf[Cloudy]
  
  @js.native
  sealed trait Color
    extends StObject
       with BlendMode
  inline def Color: Color = "Color".asInstanceOf[Color]
  
  @js.native
  sealed trait ColorBurn
    extends StObject
       with BlendMode
  inline def ColorBurn: ColorBurn = "ColorBurn".asInstanceOf[ColorBurn]
  
  @js.native
  sealed trait ColorDodge
    extends StObject
       with BlendMode
  inline def ColorDodge: ColorDodge = "ColorDodge".asInstanceOf[ColorDodge]
  
  @js.native
  sealed trait CropBox
    extends StObject
       with PageBox
  inline def CropBox: CropBox = "CropBox".asInstanceOf[CropBox]
  
  @js.native
  sealed trait Cyrillic
    extends StObject
       with FontSimpleEncoding
  inline def Cyrillic: Cyrillic = "Cyrillic".asInstanceOf[Cyrillic]
  
  @js.native
  sealed trait Darken
    extends StObject
       with BlendMode
  inline def Darken: Darken = "Darken".asInstanceOf[Darken]
  
  @js.native
  sealed trait Dashed
    extends StObject
       with PDFAnnotationBorderStyle
  inline def Dashed: Dashed = "Dashed".asInstanceOf[Dashed]
  
  @js.native
  sealed trait Diamond
    extends StObject
       with PDFAnnotationLineEndingStyle
  inline def Diamond: Diamond = "Diamond".asInstanceOf[Diamond]
  
  @js.native
  sealed trait Difference
    extends StObject
       with BlendMode
  inline def Difference: Difference = "Difference".asInstanceOf[Difference]
  
  @js.native
  sealed trait Exclusion
    extends StObject
       with BlendMode
  inline def Exclusion: Exclusion = "Exclusion".asInstanceOf[Exclusion]
  
  @js.native
  sealed trait FileAttachment
    extends StObject
       with PDFAnnotationType
  inline def FileAttachment: FileAttachment = "FileAttachment".asInstanceOf[FileAttachment]
  
  @js.native
  sealed trait Fit
    extends StObject
       with LinkDestType
  inline def Fit: Fit = "Fit".asInstanceOf[Fit]
  
  @js.native
  sealed trait FitB
    extends StObject
       with LinkDestType
  inline def FitB: FitB = "FitB".asInstanceOf[FitB]
  
  @js.native
  sealed trait FitBH
    extends StObject
       with LinkDestType
  inline def FitBH: FitBH = "FitBH".asInstanceOf[FitBH]
  
  @js.native
  sealed trait FitBV
    extends StObject
       with LinkDestType
  inline def FitBV: FitBV = "FitBV".asInstanceOf[FitBV]
  
  @js.native
  sealed trait FitH
    extends StObject
       with LinkDestType
  inline def FitH: FitH = "FitH".asInstanceOf[FitH]
  
  @js.native
  sealed trait FitR
    extends StObject
       with LinkDestType
  inline def FitR: FitR = "FitR".asInstanceOf[FitR]
  
  @js.native
  sealed trait FitV
    extends StObject
       with LinkDestType
  inline def FitV: FitV = "FitV".asInstanceOf[FitV]
  
  @js.native
  sealed trait FreeText
    extends StObject
       with PDFAnnotationType
  inline def FreeText: FreeText = "FreeText".asInstanceOf[FreeText]
  
  @js.native
  sealed trait FreeTextCallout
    extends StObject
       with _PDFAnnotationIntent
  inline def FreeTextCallout: FreeTextCallout = "FreeTextCallout".asInstanceOf[FreeTextCallout]
  
  @js.native
  sealed trait FreeTextTypeWriter
    extends StObject
       with _PDFAnnotationIntent
  inline def FreeTextTypeWriter: FreeTextTypeWriter = "FreeTextTypeWriter".asInstanceOf[FreeTextTypeWriter]
  
  @js.native
  sealed trait Gray
    extends StObject
       with ColorSpaceType
  inline def Gray: Gray = "Gray".asInstanceOf[Gray]
  
  @js.native
  sealed trait Greek
    extends StObject
       with FontSimpleEncoding
  inline def Greek: Greek = "Greek".asInstanceOf[Greek]
  
  @js.native
  sealed trait HardLight
    extends StObject
       with BlendMode
  inline def HardLight: HardLight = "HardLight".asInstanceOf[HardLight]
  
  @js.native
  sealed trait Highlight
    extends StObject
       with PDFAnnotationType
  inline def Highlight: Highlight = "Highlight".asInstanceOf[Highlight]
  
  @js.native
  sealed trait Hue
    extends StObject
       with BlendMode
  inline def Hue: Hue = "Hue".asInstanceOf[Hue]
  
  @js.native
  sealed trait Indexed
    extends StObject
       with ColorSpaceType
  inline def Indexed: Indexed = "Indexed".asInstanceOf[Indexed]
  
  @js.native
  sealed trait Ink
    extends StObject
       with PDFAnnotationType
  inline def Ink: Ink = "Ink".asInstanceOf[Ink]
  
  @js.native
  sealed trait Inset
    extends StObject
       with PDFAnnotationBorderStyle
  inline def Inset: Inset = "Inset".asInstanceOf[Inset]
  
  @js.native
  sealed trait Lab
    extends StObject
       with ColorSpaceType
  inline def Lab: Lab = "Lab".asInstanceOf[Lab]
  
  @js.native
  sealed trait Latin
    extends StObject
       with FontSimpleEncoding
  inline def Latin: Latin = "Latin".asInstanceOf[Latin]
  
  @js.native
  sealed trait Lighten
    extends StObject
       with BlendMode
  inline def Lighten: Lighten = "Lighten".asInstanceOf[Lighten]
  
  @js.native
  sealed trait Line
    extends StObject
       with PDFAnnotationType
  inline def Line: Line = "Line".asInstanceOf[Line]
  
  @js.native
  sealed trait LineArrow
    extends StObject
       with _PDFAnnotationIntent
  inline def LineArrow: LineArrow = "LineArrow".asInstanceOf[LineArrow]
  
  @js.native
  sealed trait LineDimension
    extends StObject
       with _PDFAnnotationIntent
  inline def LineDimension: LineDimension = "LineDimension".asInstanceOf[LineDimension]
  
  @js.native
  sealed trait Link
    extends StObject
       with PDFAnnotationType
  inline def Link: Link = "Link".asInstanceOf[Link]
  
  @js.native
  sealed trait Luminosity
    extends StObject
       with BlendMode
  inline def Luminosity: Luminosity = "Luminosity".asInstanceOf[Luminosity]
  
  @js.native
  sealed trait MediaBox
    extends StObject
       with PageBox
  inline def MediaBox: MediaBox = "MediaBox".asInstanceOf[MediaBox]
  
  @js.native
  sealed trait Miter
    extends StObject
       with LineJoin
  inline def Miter: Miter = "Miter".asInstanceOf[Miter]
  
  @js.native
  sealed trait MiterXPS
    extends StObject
       with LineJoin
  inline def MiterXPS: MiterXPS = "MiterXPS".asInstanceOf[MiterXPS]
  
  @js.native
  sealed trait Movie
    extends StObject
       with PDFAnnotationType
  inline def Movie: Movie = "Movie".asInstanceOf[Movie]
  
  @js.native
  sealed trait Multiply
    extends StObject
       with BlendMode
  inline def Multiply: Multiply = "Multiply".asInstanceOf[Multiply]
  
  @js.native
  sealed trait None
    extends StObject
       with ColorSpaceType
       with PDFAnnotationBorderEffect
       with PDFAnnotationLineEndingStyle
  inline def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait Normal
    extends StObject
       with BlendMode
  inline def Normal: Normal = "Normal".asInstanceOf[Normal]
  
  @js.native
  sealed trait OpenArrow
    extends StObject
       with PDFAnnotationLineEndingStyle
  inline def OpenArrow: OpenArrow = "OpenArrow".asInstanceOf[OpenArrow]
  
  @js.native
  sealed trait Overlay
    extends StObject
       with BlendMode
  inline def Overlay: Overlay = "Overlay".asInstanceOf[Overlay]
  
  @js.native
  sealed trait PloyLine
    extends StObject
       with _PDFAnnotationIntent
  inline def PloyLine: PloyLine = "PloyLine".asInstanceOf[PloyLine]
  
  @js.native
  sealed trait PolyLine
    extends StObject
       with PDFAnnotationType
  inline def PolyLine: PolyLine = "PolyLine".asInstanceOf[PolyLine]
  
  @js.native
  sealed trait Polygon
    extends StObject
       with PDFAnnotationType
  inline def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait PolygonCloud
    extends StObject
       with _PDFAnnotationIntent
  inline def PolygonCloud: PolygonCloud = "PolygonCloud".asInstanceOf[PolygonCloud]
  
  @js.native
  sealed trait PolygonDimension
    extends StObject
       with _PDFAnnotationIntent
  inline def PolygonDimension: PolygonDimension = "PolygonDimension".asInstanceOf[PolygonDimension]
  
  @js.native
  sealed trait Popup
    extends StObject
       with PDFAnnotationType
  inline def Popup: Popup = "Popup".asInstanceOf[Popup]
  
  @js.native
  sealed trait PrinterMark
    extends StObject
       with PDFAnnotationType
  inline def PrinterMark: PrinterMark = "PrinterMark".asInstanceOf[PrinterMark]
  
  @js.native
  sealed trait Projection
    extends StObject
       with PDFAnnotationType
  inline def Projection: Projection = "Projection".asInstanceOf[Projection]
  
  @js.native
  sealed trait RClosedArrow
    extends StObject
       with PDFAnnotationLineEndingStyle
  inline def RClosedArrow: RClosedArrow = "RClosedArrow".asInstanceOf[RClosedArrow]
  
  @js.native
  sealed trait RGB
    extends StObject
       with ColorSpaceType
  inline def RGB: RGB = "RGB".asInstanceOf[RGB]
  
  @js.native
  sealed trait ROpenArrow
    extends StObject
       with PDFAnnotationLineEndingStyle
  inline def ROpenArrow: ROpenArrow = "ROpenArrow".asInstanceOf[ROpenArrow]
  
  @js.native
  sealed trait Redact
    extends StObject
       with PDFAnnotationType
  inline def Redact: Redact = "Redact".asInstanceOf[Redact]
  
  @js.native
  sealed trait RichMedia
    extends StObject
       with PDFAnnotationType
  inline def RichMedia: RichMedia = "RichMedia".asInstanceOf[RichMedia]
  
  @js.native
  sealed trait Round
    extends StObject
       with LineCap
       with LineJoin
  inline def Round: Round = "Round".asInstanceOf[Round]
  
  @js.native
  sealed trait Saturation
    extends StObject
       with BlendMode
  inline def Saturation: Saturation = "Saturation".asInstanceOf[Saturation]
  
  @js.native
  sealed trait Screen
    extends StObject
       with BlendMode
       with PDFAnnotationType
  inline def Screen: Screen = "Screen".asInstanceOf[Screen]
  
  @js.native
  sealed trait Separation
    extends StObject
       with ColorSpaceType
  inline def Separation: Separation = "Separation".asInstanceOf[Separation]
  
  @js.native
  sealed trait Slash
    extends StObject
       with PDFAnnotationLineEndingStyle
  inline def Slash: Slash = "Slash".asInstanceOf[Slash]
  
  @js.native
  sealed trait SoftLight
    extends StObject
       with BlendMode
  inline def SoftLight: SoftLight = "SoftLight".asInstanceOf[SoftLight]
  
  @js.native
  sealed trait Solid
    extends StObject
       with PDFAnnotationBorderStyle
  inline def Solid: Solid = "Solid".asInstanceOf[Solid]
  
  @js.native
  sealed trait Sound
    extends StObject
       with PDFAnnotationType
  inline def Sound: Sound = "Sound".asInstanceOf[Sound]
  
  @js.native
  sealed trait Square
    extends StObject
       with LineCap
       with PDFAnnotationLineEndingStyle
       with PDFAnnotationType
  inline def Square: Square = "Square".asInstanceOf[Square]
  
  @js.native
  sealed trait Squiggly
    extends StObject
       with PDFAnnotationType
  inline def Squiggly: Squiggly = "Squiggly".asInstanceOf[Squiggly]
  
  @js.native
  sealed trait Stamp
    extends StObject
       with PDFAnnotationType
  inline def Stamp: Stamp = "Stamp".asInstanceOf[Stamp]
  
  @js.native
  sealed trait StampImage
    extends StObject
       with _PDFAnnotationIntent
  inline def StampImage: StampImage = "StampImage".asInstanceOf[StampImage]
  
  @js.native
  sealed trait StampSnapshot
    extends StObject
       with _PDFAnnotationIntent
  inline def StampSnapshot: StampSnapshot = "StampSnapshot".asInstanceOf[StampSnapshot]
  
  @js.native
  sealed trait StrikeOut
    extends StObject
       with PDFAnnotationType
  inline def StrikeOut: StrikeOut = "StrikeOut".asInstanceOf[StrikeOut]
  
  @js.native
  sealed trait Text
    extends StObject
       with PDFAnnotationType
  inline def Text: Text = "Text".asInstanceOf[Text]
  
  @js.native
  sealed trait TrapNet
    extends StObject
       with PDFAnnotationType
  inline def TrapNet: TrapNet = "TrapNet".asInstanceOf[TrapNet]
  
  @js.native
  sealed trait Triangle
    extends StObject
       with LineCap
  inline def Triangle: Triangle = "Triangle".asInstanceOf[Triangle]
  
  @js.native
  sealed trait TrimBox
    extends StObject
       with PageBox
  inline def TrimBox: TrimBox = "TrimBox".asInstanceOf[TrimBox]
  
  @js.native
  sealed trait Underline
    extends StObject
       with PDFAnnotationBorderStyle
       with PDFAnnotationType
  inline def Underline: Underline = "Underline".asInstanceOf[Underline]
  
  @js.native
  sealed trait Watermark
    extends StObject
       with PDFAnnotationType
  inline def Watermark: Watermark = "Watermark".asInstanceOf[Watermark]
  
  @js.native
  sealed trait Widget
    extends StObject
       with PDFAnnotationType
  inline def Widget: Widget = "Widget".asInstanceOf[Widget]
  
  @js.native
  sealed trait XYZ
    extends StObject
       with LinkDestType
  inline def XYZ: XYZ = "XYZ".asInstanceOf[XYZ]
  
  @js.native
  sealed trait accessibility
    extends StObject
       with DocumentPermission
  inline def accessibility: accessibility = "accessibility".asInstanceOf[accessibility]
  
  @js.native
  sealed trait annotate
    extends StObject
       with DocumentPermission
  inline def annotate: annotate = "annotate".asInstanceOf[annotate]
  
  @js.native
  sealed trait any_document extends StObject
  inline def any_document: any_document = "any_document".asInstanceOf[any_document]
  
  @js.native
  sealed trait any_page extends StObject
  inline def any_page: any_page = "any_page".asInstanceOf[any_page]
  
  @js.native
  sealed trait assemble
    extends StObject
       with DocumentPermission
  inline def assemble: assemble = "assemble".asInstanceOf[assemble]
  
  @js.native
  sealed trait chars
    extends StObject
       with SelectMode
  inline def chars: chars = "chars".asInstanceOf[chars]
  
  @js.native
  sealed trait copy
    extends StObject
       with DocumentPermission
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait edit
    extends StObject
       with DocumentPermission
  inline def edit: edit = "edit".asInstanceOf[edit]
  
  @js.native
  sealed trait form
    extends StObject
       with DocumentPermission
  inline def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait fz_buffer extends StObject
  inline def fz_buffer: fz_buffer = "fz_buffer".asInstanceOf[fz_buffer]
  
  @js.native
  sealed trait fz_colorspace extends StObject
  inline def fz_colorspace: fz_colorspace = "fz_colorspace".asInstanceOf[fz_colorspace]
  
  @js.native
  sealed trait fz_device extends StObject
  inline def fz_device: fz_device = "fz_device".asInstanceOf[fz_device]
  
  @js.native
  sealed trait fz_display_list extends StObject
  inline def fz_display_list: fz_display_list = "fz_display_list".asInstanceOf[fz_display_list]
  
  @js.native
  sealed trait fz_document_writer extends StObject
  inline def fz_document_writer: fz_document_writer = "fz_document_writer".asInstanceOf[fz_document_writer]
  
  @js.native
  sealed trait fz_font extends StObject
  inline def fz_font: fz_font = "fz_font".asInstanceOf[fz_font]
  
  @js.native
  sealed trait fz_image extends StObject
  inline def fz_image: fz_image = "fz_image".asInstanceOf[fz_image]
  
  @js.native
  sealed trait fz_link extends StObject
  inline def fz_link: fz_link = "fz_link".asInstanceOf[fz_link]
  
  @js.native
  sealed trait fz_outline_iterator extends StObject
  inline def fz_outline_iterator: fz_outline_iterator = "fz_outline_iterator".asInstanceOf[fz_outline_iterator]
  
  @js.native
  sealed trait fz_path extends StObject
  inline def fz_path: fz_path = "fz_path".asInstanceOf[fz_path]
  
  @js.native
  sealed trait fz_pixmap extends StObject
  inline def fz_pixmap: fz_pixmap = "fz_pixmap".asInstanceOf[fz_pixmap]
  
  @js.native
  sealed trait fz_shade extends StObject
  inline def fz_shade: fz_shade = "fz_shade".asInstanceOf[fz_shade]
  
  @js.native
  sealed trait fz_stext_page extends StObject
  inline def fz_stext_page: fz_stext_page = "fz_stext_page".asInstanceOf[fz_stext_page]
  
  @js.native
  sealed trait fz_stream extends StObject
  inline def fz_stream: fz_stream = "fz_stream".asInstanceOf[fz_stream]
  
  @js.native
  sealed trait fz_stroke_state extends StObject
  inline def fz_stroke_state: fz_stroke_state = "fz_stroke_state".asInstanceOf[fz_stroke_state]
  
  @js.native
  sealed trait fz_text extends StObject
  inline def fz_text: fz_text = "fz_text".asInstanceOf[fz_text]
  
  @js.native
  sealed trait ja
    extends StObject
       with FontCJKLanguage
  inline def ja: ja = "ja".asInstanceOf[ja]
  
  @js.native
  sealed trait ko
    extends StObject
       with FontCJKLanguage
  inline def ko: ko = "ko".asInstanceOf[ko]
  
  @js.native
  sealed trait lines
    extends StObject
       with SelectMode
  inline def lines: lines = "lines".asInstanceOf[lines]
  
  @js.native
  sealed trait pdf_annot extends StObject
  inline def pdf_annot: pdf_annot = "pdf_annot".asInstanceOf[pdf_annot]
  
  @js.native
  sealed trait pdf_graft_map extends StObject
  inline def pdf_graft_map: pdf_graft_map = "pdf_graft_map".asInstanceOf[pdf_graft_map]
  
  @js.native
  sealed trait pdf_obj extends StObject
  inline def pdf_obj: pdf_obj = "pdf_obj".asInstanceOf[pdf_obj]
  
  @js.native
  sealed trait print
    extends StObject
       with DocumentPermission
  inline def print: print = "print".asInstanceOf[print]
  
  @js.native
  sealed trait `print-hq`
    extends StObject
       with DocumentPermission
  inline def `print-hq`: `print-hq` = "print-hq".asInstanceOf[`print-hq`]
  
  @js.native
  sealed trait words
    extends StObject
       with SelectMode
  inline def words: words = "words".asInstanceOf[words]
  
  @js.native
  sealed trait `zh-CN`
    extends StObject
       with FontCJKLanguage
  inline def `zh-CN`: `zh-CN` = "zh-CN".asInstanceOf[`zh-CN`]
  
  @js.native
  sealed trait `zh-HK`
    extends StObject
       with FontCJKLanguage
  inline def `zh-HK`: `zh-HK` = "zh-HK".asInstanceOf[`zh-HK`]
  
  @js.native
  sealed trait `zh-Hans`
    extends StObject
       with FontCJKLanguage
  inline def `zh-Hans`: `zh-Hans` = "zh-Hans".asInstanceOf[`zh-Hans`]
  
  @js.native
  sealed trait `zh-Hant`
    extends StObject
       with FontCJKLanguage
  inline def `zh-Hant`: `zh-Hant` = "zh-Hant".asInstanceOf[`zh-Hant`]
  
  @js.native
  sealed trait `zh-TW`
    extends StObject
       with FontCJKLanguage
  inline def `zh-TW`: `zh-TW` = "zh-TW".asInstanceOf[`zh-TW`]
}
