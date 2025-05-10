import "./style.css";

// @ts-ignore
import { Main } from "scalajs:main.js";
// declare type for scalajs:main.js


const worker = new Worker(new URL("./workers/mupdf.worker", import.meta.url), {
  type: "module",
});
Main.run(worker)