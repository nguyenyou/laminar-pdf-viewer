package io.github.nguyenyou.pdfjs.pdfjsDist

import io.github.nguyenyou.pdfjs.pdfjsDist.anon.AccessibilityManager
import io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayAnnotationStorageMod.AnnotationStorage
import io.github.nguyenyou.pdfjs.std.Map
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayAnnotationLayerMod {
  
  @JSImport("pdfjs-dist/types/src/display/annotation_layer", "AnnotationLayer")
  @js.native
  open class AnnotationLayer protected () extends StObject {
    def this(param0: AccessibilityManager) = this()
    
    var _annotationEditorUIManager: Any = js.native
    
    /**
      * Add link annotations to the annotation layer.
      *
      * @param {Array<Object>} annotations
      * @param {IPDFLinkService} linkService
      * @memberof AnnotationLayer
      */
    def addLinkAnnotations(annotations: js.Array[js.Object], linkService: IPDFLinkService): js.Promise[Unit] = js.native
    
    var div: Any = js.native
    
    def getEditableAnnotation(id: Any): Any = js.native
    
    def getEditableAnnotations(): js.Array[Any] = js.native
    
    def hasEditableAnnotations(): Boolean = js.native
    
    var page: Any = js.native
    
    var popupShow: js.UndefOr[js.Array[Any]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Render a new annotation layer with all annotation elements.
      *
      * @param {AnnotationLayerParameters} params
      * @memberof AnnotationLayer
      */
    def render(params: AnnotationLayerParameters): js.Promise[Unit] = js.native
    
    /**
      * Update the annotation elements on existing annotation layer.
      *
      * @param {AnnotationLayerParameters} viewport
      * @memberof AnnotationLayer
      */
    def update(param0: AnnotationLayerParameters): Unit = js.native
    
    var viewport: Any = js.native
    
    var zIndex: Double = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/annotation_layer", "FreeTextAnnotationElement")
  @js.native
  open class FreeTextAnnotationElement protected ()
    extends StObject
       with AnnotationElement {
    def this(parameters: Any) = this()
    
    var annotationEditorType: Double = js.native
    
    var textContent: Any = js.native
    
    var textPosition: Any = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/annotation_layer", "HighlightAnnotationElement")
  @js.native
  open class HighlightAnnotationElement protected ()
    extends StObject
       with AnnotationElement {
    def this(parameters: Any) = this()
    
    var annotationEditorType: Double = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/annotation_layer", "InkAnnotationElement")
  @js.native
  open class InkAnnotationElement protected ()
    extends StObject
       with AnnotationElement {
    def this(parameters: Any) = this()
    
    var annotationEditorType: Double = js.native
    
    var containerClassName: String = js.native
    
    var svgElementName: String = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/annotation_layer", "StampAnnotationElement")
  @js.native
  open class StampAnnotationElement protected ()
    extends StObject
       with AnnotationElement {
    def this(parameters: Any) = this()
    
    var annotationEditorType: Double = js.native
  }
  
  type AnnotationEditorUIManager = Any
  
  @js.native
  trait AnnotationElement extends StObject {
    
    def _commonActions: Any = js.native
    
    /**
      * Create an empty container for the annotation's HTML element.
      *
      * @private
      * @param {boolean} ignoreBorder
      * @memberof AnnotationElement
      * @returns {HTMLElement} A section element.
      */
    /* private */ var _createContainer: Any = js.native
    
    /**
      * Create a popup for the annotation's HTML element. This is used for
      * annotations that do not have a Popup entry in the dictionary, but
      * are of a type that works with popups (such as Highlight annotations).
      *
      * @private
      * @memberof AnnotationElement
      */
    /* private */ var _createPopup: Any = js.native
    
    /**
      * Create quadrilaterals from the annotation's quadpoints.
      *
      * @private
      * @memberof AnnotationElement
      */
    /* private */ var _createQuadrilaterals: Any = js.native
    
    def _dispatchEventFromSandbox(actions: Any, jsEvent: Any): Unit = js.native
    
    def _editOnDoubleClick(): Unit = js.native
    
    var _fieldObjects: Any = js.native
    
    /**
      * @private
      * @returns {Array}
      */
    /* private */ var _getElementsByName: Any = js.native
    
    def _isEditable: Any = js.native
    
    def _setDefaultPropertiesFromJS(element: Any): Unit = js.native
    
    def addHighlightArea(): Unit = js.native
    
    var annotationStorage: Any = js.native
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    var data: Any = js.native
    
    var downloadManager: Any = js.native
    
    var enableScripting: Any = js.native
    
    /**
      * Get the HTML element(s) which can trigger a popup when clicked or hovered.
      *
      * @public
      * @memberof AnnotationElement
      * @returns {Array<HTMLElement>|HTMLElement} An array of elements or an
      *          element.
      */
    def getElementsToTriggerPopup(): js.Array[HTMLElement] | HTMLElement = js.native
    
    var hasJSActions: Any = js.native
    
    def hasPopupData: Boolean = js.native
    
    def height: Double = js.native
    
    def hide(): Unit = js.native
    
    var imageResourcesPath: Any = js.native
    
    var isRenderable: Boolean = js.native
    
    var layer: Any = js.native
    
    var linkService: Any = js.native
    
    var parent: Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Render the annotation's HTML element(s).
      *
      * @public
      * @memberof AnnotationElement
      */
    def render(): Unit = js.native
    
    var renderForms: Any = js.native
    
    def resetEdited(): Unit = js.native
    
    def setRotation(angle: Any): Unit = js.native
    def setRotation(angle: Any, container: HTMLElement): Unit = js.native
    
    def show(): Unit = js.native
    
    var svgFactory: Any = js.native
    
    def updateEdited(params: Any): Unit = js.native
    
    def width: Double = js.native
  }
  
  trait AnnotationElementParameters extends StObject {
    
    var annotationStorage: js.UndefOr[AnnotationStorage] = js.undefined
    
    var data: js.Object
    
    var downloadManager: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IDownloadManager */ Any
      ] = js.undefined
    
    var enableScripting: js.UndefOr[Boolean] = js.undefined
    
    var fieldObjects: js.UndefOr[js.Object] = js.undefined
    
    var hasJSActions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - Path for image resources, mainly
      * for annotation icons. Include trailing slash.
      */
    var imageResourcesPath: js.UndefOr[String] = js.undefined
    
    var layer: HTMLDivElement
    
    var linkService: IPDFLinkService
    
    var renderForms: Boolean
    
    var svgFactory: js.Object
  }
  object AnnotationElementParameters {
    
    inline def apply(
      data: js.Object,
      layer: HTMLDivElement,
      linkService: IPDFLinkService,
      renderForms: Boolean,
      svgFactory: js.Object
    ): AnnotationElementParameters = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], linkService = linkService.asInstanceOf[js.Any], renderForms = renderForms.asInstanceOf[js.Any], svgFactory = svgFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationElementParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationElementParameters] (val x: Self) extends AnyVal {
      
      inline def setAnnotationStorage(value: AnnotationStorage): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDownloadManager(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IDownloadManager */ Any
      ): Self = StObject.set(x, "downloadManager", value.asInstanceOf[js.Any])
      
      inline def setDownloadManagerUndefined: Self = StObject.set(x, "downloadManager", js.undefined)
      
      inline def setEnableScripting(value: Boolean): Self = StObject.set(x, "enableScripting", value.asInstanceOf[js.Any])
      
      inline def setEnableScriptingUndefined: Self = StObject.set(x, "enableScripting", js.undefined)
      
      inline def setFieldObjects(value: js.Object): Self = StObject.set(x, "fieldObjects", value.asInstanceOf[js.Any])
      
      inline def setFieldObjectsUndefined: Self = StObject.set(x, "fieldObjects", js.undefined)
      
      inline def setHasJSActions(value: Boolean): Self = StObject.set(x, "hasJSActions", value.asInstanceOf[js.Any])
      
      inline def setHasJSActionsUndefined: Self = StObject.set(x, "hasJSActions", js.undefined)
      
      inline def setImageResourcesPath(value: String): Self = StObject.set(x, "imageResourcesPath", value.asInstanceOf[js.Any])
      
      inline def setImageResourcesPathUndefined: Self = StObject.set(x, "imageResourcesPath", js.undefined)
      
      inline def setLayer(value: HTMLDivElement): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLinkService(value: IPDFLinkService): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
      
      inline def setRenderForms(value: Boolean): Self = StObject.set(x, "renderForms", value.asInstanceOf[js.Any])
      
      inline def setSvgFactory(value: js.Object): Self = StObject.set(x, "svgFactory", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnnotationLayerParameters extends StObject {
    
    var accessibilityManager: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_text_accessibility.TextAccessibilityManager */ Any
      ] = js.undefined
    
    var annotationCanvasMap: js.UndefOr[Map[String, HTMLCanvasElement]] = js.undefined
    
    var annotationEditorUIManager: js.UndefOr[AnnotationEditorUIManager] = js.undefined
    
    var annotationStorage: js.UndefOr[AnnotationStorage] = js.undefined
    
    var annotations: js.Array[Any]
    
    var div: HTMLDivElement
    
    var downloadManager: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IDownloadManager */ Any
      ] = js.undefined
    
    /**
      * - Enable embedded script execution.
      */
    var enableScripting: js.UndefOr[Boolean] = js.undefined
    
    var fieldObjects: js.UndefOr[StringDictionary[js.Array[js.Object]] | Null] = js.undefined
    
    /**
      * - Some fields have JS actions.
      * The default value is `false`.
      */
    var hasJSActions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - Path for image resources, mainly
      * for annotation icons. Include trailing slash.
      */
    var imageResourcesPath: js.UndefOr[String] = js.undefined
    
    var linkService: IPDFLinkService
    
    var page: PDFPageProxy
    
    var renderForms: Boolean
    
    var structTreeLayer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_struct_tree_layer_builder.StructTreeLayerBuilder */ Any
      ] = js.undefined
    
    var viewport: PageViewport
  }
  object AnnotationLayerParameters {
    
    inline def apply(
      annotations: js.Array[Any],
      div: HTMLDivElement,
      linkService: IPDFLinkService,
      page: PDFPageProxy,
      renderForms: Boolean,
      viewport: PageViewport
    ): AnnotationLayerParameters = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], linkService = linkService.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], renderForms = renderForms.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationLayerParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationLayerParameters] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityManager(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_text_accessibility.TextAccessibilityManager */ Any
      ): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityManagerUndefined: Self = StObject.set(x, "accessibilityManager", js.undefined)
      
      inline def setAnnotationCanvasMap(value: Map[String, HTMLCanvasElement]): Self = StObject.set(x, "annotationCanvasMap", value.asInstanceOf[js.Any])
      
      inline def setAnnotationCanvasMapUndefined: Self = StObject.set(x, "annotationCanvasMap", js.undefined)
      
      inline def setAnnotationEditorUIManager(value: AnnotationEditorUIManager): Self = StObject.set(x, "annotationEditorUIManager", value.asInstanceOf[js.Any])
      
      inline def setAnnotationEditorUIManagerUndefined: Self = StObject.set(x, "annotationEditorUIManager", js.undefined)
      
      inline def setAnnotationStorage(value: AnnotationStorage): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
      
      inline def setAnnotations(value: js.Array[Any]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsVarargs(value: Any*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDownloadManager(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IDownloadManager */ Any
      ): Self = StObject.set(x, "downloadManager", value.asInstanceOf[js.Any])
      
      inline def setDownloadManagerUndefined: Self = StObject.set(x, "downloadManager", js.undefined)
      
      inline def setEnableScripting(value: Boolean): Self = StObject.set(x, "enableScripting", value.asInstanceOf[js.Any])
      
      inline def setEnableScriptingUndefined: Self = StObject.set(x, "enableScripting", js.undefined)
      
      inline def setFieldObjects(value: StringDictionary[js.Array[js.Object]]): Self = StObject.set(x, "fieldObjects", value.asInstanceOf[js.Any])
      
      inline def setFieldObjectsNull: Self = StObject.set(x, "fieldObjects", null)
      
      inline def setFieldObjectsUndefined: Self = StObject.set(x, "fieldObjects", js.undefined)
      
      inline def setHasJSActions(value: Boolean): Self = StObject.set(x, "hasJSActions", value.asInstanceOf[js.Any])
      
      inline def setHasJSActionsUndefined: Self = StObject.set(x, "hasJSActions", js.undefined)
      
      inline def setImageResourcesPath(value: String): Self = StObject.set(x, "imageResourcesPath", value.asInstanceOf[js.Any])
      
      inline def setImageResourcesPathUndefined: Self = StObject.set(x, "imageResourcesPath", js.undefined)
      
      inline def setLinkService(value: IPDFLinkService): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
      
      inline def setPage(value: PDFPageProxy): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRenderForms(value: Boolean): Self = StObject.set(x, "renderForms", value.asInstanceOf[js.Any])
      
      inline def setStructTreeLayer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_struct_tree_layer_builder.StructTreeLayerBuilder */ Any
      ): Self = StObject.set(x, "structTreeLayer", value.asInstanceOf[js.Any])
      
      inline def setStructTreeLayerUndefined: Self = StObject.set(x, "structTreeLayer", js.undefined)
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  type IDownloadManager = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IDownloadManager */ Any
  
  type IPDFLinkService = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IPDFLinkService */ Any
  
  type PDFPageProxy = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayApiMod.PDFPageProxy
  
  type PageViewport = io.github.nguyenyou.pdfjs.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport
  
  type StructTreeLayerBuilder = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_struct_tree_layer_builder.StructTreeLayerBuilder */ Any
  
  type TextAccessibilityManager = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_text_accessibility.TextAccessibilityManager */ Any
}
