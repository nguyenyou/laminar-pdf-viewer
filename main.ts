import "./style.css";

import { Main } from "scalajs:main.js";

const worker = new Worker(new URL("./workers/mupdf.worker", import.meta.url), {
  type: "module",
});
Main.run(worker)