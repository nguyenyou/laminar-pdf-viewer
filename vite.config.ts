import { defineConfig } from "vite";
import tailwindcss from "@tailwindcss/vite";
import { resolve } from 'path';

const IS_PROD = process.env.NODE_ENV == "production";

export default defineConfig({
  plugins: [tailwindcss()],
  base: IS_PROD ? "/laminar-pdf-viewer/" : "/",
  worker: {
    format: "es",
  },
  optimizeDeps: {
    exclude: ["mupdf"], // Exclude mupdf from pre-bundling
  },
  build: {
    target: "esnext",
    rollupOptions: {
      input: {
        main: resolve(__dirname, "index.html"),
        worker: resolve(__dirname, "workers/mupdf.worker.ts"),
      },
    },
  },
  resolve: {
    alias: [
      {
        find: /^scalajs:(.*)$/,
        replacement: `./out/www/${IS_PROD ? "full" : "fast"}LinkJS.dest/$1`,
      }
    ],
  }
});
