/// <reference lib="webworker" />
import type { PDFDocument } from "mupdf";
import * as mupdf from "mupdf"

export const MUPDF_LOADED = "MUPDF_LOADED";

export class MupdfWorker {
  private pdfdocument?: mupdf.Document;

  constructor() {
    this.initializeMupdf();
  }

  private initializeMupdf() {
    try {
      postMessage(MUPDF_LOADED);
    } catch (error) {
      console.error("Failed to initialize MuPDF:", error);
    }
  }

  // ===> Here you can create methods <===
  // ===> that call statics and methods <===
  // ===> from mupdf (in ./node_modules/mupdf/dist/mupdf.js) <===

  loadDocument(document: ArrayBuffer): boolean {

    this.pdfdocument = mupdf.Document.openDocument(
      document,
      "application/pdf"
    ) as PDFDocument;

    return true;
  }

  renderPageAsImage(pageIndex:number = 0, scale:number = 1): Uint8Array {
    if (!this.pdfdocument) throw new Error("Document not loaded");

    const page = this.pdfdocument.loadPage(pageIndex);

    const pixmap = page.toPixmap(
      [scale, 0, 0, scale, 0, 0],
      mupdf.ColorSpace.DeviceRGB
    );

    let png = pixmap.asPNG();
    pixmap.destroy();
    return png;
  }

  getPageCount(): number {
    if (!this.pdfdocument) throw new Error("Document not loaded");

    return this.pdfdocument.countPages();
  }
}

onmessage = (event) => {
  console.log("onmessage", event);
};

postMessage("Hello from worker");