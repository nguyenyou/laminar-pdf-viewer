import "./style.css";

// @ts-ignore
import { Main } from "./out/www/fullLinkJS.dest/main.js";

const worker = new Worker(new URL("./workers/mupdf.worker", import.meta.url), {
  type: "module",
});

Main.run(worker)