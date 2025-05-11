import "./style.css";

// @ts-ignore
import { Main } from "./out/www/fullLinkJS.dest/main.js";

const mupdfWorkerUrl = new URL("./workers/mupdf.worker", import.meta.url).toString()
console.log("mupdfjs worker url", mupdfWorkerUrl)

const worker = new Worker(mupdfWorkerUrl, {
  type: "module",
});

Main.run(worker)

