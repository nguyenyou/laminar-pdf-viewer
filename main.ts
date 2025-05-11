import "./style.css";

import { Main } from "scalajs:main.js";

const worker = new Worker(new URL("./workers/mupdf.worker", import.meta.url), {
  type: "module",
});
worker.onmessage = (event) => {
  console.log("worker", event)
}
console.log("HELLO", worker)
Main.run(worker)