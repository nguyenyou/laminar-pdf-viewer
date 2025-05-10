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

    console.log("countPages", this.pdfdocument.countPages());

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

const engine = new MupdfWorker();

onmessage = (event) => {
  console.log("onmessage", event);
  const data = event.data
  if(data?.data?.name === "openDocument") {
    if(data?.data?.args?.length > 0 && data?.data?.args[0] instanceof ArrayBuffer) {
      engine.loadDocument(data.data.args[0]);
    }
  }
};

postMessage("Ai Assistant: Hi there! How can I help you today?");
