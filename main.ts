import "./style.css";

// @ts-ignore
import { Main } from "./out/www/fullLinkJS.dest/main.js";

const mupdfWorkerUrl = new URL("./workers/mupdf.worker", import.meta.url)
console.log("mupdfjs worker url", mupdfWorkerUrl.toString())

const worker = new Worker(mupdfWorkerUrl, {
  type: "module",
});

Main.run(worker)

