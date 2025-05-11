/// <reference lib="webworker" />
import type { PDFDocument } from "mupdf";
import * as mupdf from "mupdf"

// Message types matching the Scala implementation
interface WorkerMessage {
  id: string;
  messageType: string;
  payload: any;
}

interface WorkerResponse {
  id: string;
  messageType: string;
  data: any;
  success: boolean;
}

interface WorkerError {
  id: string;
  messageType: string;
  error: string;
  success: boolean;
}

export class MupdfWorker {
  private pdfdocument?: mupdf.Document;

  constructor() {
    this.initializeMupdf();
  }

  initializeMupdf() {
    try {
      this.sendResponse("initialization", null, true);
    } catch (error) {
      console.error("Failed to initialize MuPDF:", error);
      this.sendError("initialization", "Failed to initialize MuPDF");
    }
  }

  // Helper methods for sending responses
  private sendResponse(messageType: string, data: any, success = true, id = "system"): void {
    const response: WorkerResponse = {
      id,
      messageType,
      data,
      success
    };
    postMessage(response);
  }

  public sendError(messageType: string, errorMessage: string, id = "system"): void {
    const error: WorkerError = {
      id,
      messageType,
      error: errorMessage,
      success: false
    };
    postMessage(error);
  }

  // PDF processing methods
  public openDocument(id: string, buffer: ArrayBuffer): void {
    try {
      this.pdfdocument = mupdf.Document.openDocument(
        buffer,
        "application/pdf"
      ) as PDFDocument;
      
      const pageCount = this.pdfdocument.countPages();
      this.sendResponse("openDocument", { pageCount }, true, id);
    } catch (error) {
      const errorMessage = error instanceof Error ? error.message : String(error);
      this.sendError("openDocument", `Failed to open document: ${errorMessage}`, id);
    }
  }

  public getPageCount(id: string): void {
    try {
      if (!this.pdfdocument) throw new Error("Document not loaded");
      const count = this.pdfdocument.countPages();
      this.sendResponse("getPageCount", count, true, id);
    } catch (error) {
      const errorMessage = error instanceof Error ? error.message : String(error);
      this.sendError("getPageCount", errorMessage, id);
    }
  }

  public renderPage(id: string, pageIndex: number = 0, scale: number = 1): void {
    try {
      if (!this.pdfdocument) throw new Error("Document not loaded");

      const page = this.pdfdocument.loadPage(pageIndex);
      const pixmap = page.toPixmap(
        [scale, 0, 0, scale, 0, 0],
        mupdf.ColorSpace.DeviceRGB
      );

      let png = pixmap.asPNG();
      pixmap.destroy();
      
      this.sendResponse("renderPage", png, true, id);
    } catch (error) {
      const errorMessage = error instanceof Error ? error.message : String(error);
      this.sendError("renderPage", `Failed to render page: ${errorMessage}`, id);
    }
  }
}

const engine = new MupdfWorker();  

// Message handler
onmessage = (event) => {
  console.log("Worker received message:", event.data);
  
  try {
    const message = event.data as WorkerMessage;
    const { id, messageType, payload } = message;
    
    // Process message based on type
    switch (messageType) {
      case "openDocument":
        if (payload instanceof ArrayBuffer) {
          engine.openDocument(id, payload);
        } else {
          engine.sendError(messageType, "Invalid payload format for openDocument", id);
        }
        break;
        
      case "getPageCount":
        engine.getPageCount(id);
        break;
        
      case "renderPage":
        if (payload && typeof payload === 'object') {
          const pageNumber = typeof payload.pageNumber === 'number' ? payload.pageNumber : 0;
          const scale = typeof payload.scale === 'number' ? payload.scale : 1.0;
          engine.renderPage(id, pageNumber, scale);
        } else {
          engine.sendError(messageType, "Invalid payload format for renderPage", id);
        }
        break;
        
      default:
        engine.sendError(messageType, `Unknown message type: ${messageType}`, id);
    }
  } catch (error) {
    console.error("Error processing message:", error);
    postMessage({
      id: "error",
      messageType: "error",
      error: "Failed to process message",
      success: false
    });
  }
};

// engine.initializeMupdf();