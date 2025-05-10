import path from "node:path";
import { createRequire } from "node:module";
import { defineConfig, normalizePath } from "vite";
import { viteStaticCopy } from "vite-plugin-static-copy";

const require = createRequire(import.meta.url);
const pdfjsDistPath = path.dirname(require.resolve("pdfjs-dist/package.json"));

const standardFontsDir = normalizePath(path.join(pdfjsDistPath,"standard_fonts"));
const cMapsDir = normalizePath(path.join(pdfjsDistPath, 'cmaps'));

// https://vite.dev/config/
export default defineConfig({
  plugins: [
    viteStaticCopy({
      targets: [
        {
          src: standardFontsDir,
          dest: "",
        },
        {
          src: cMapsDir,
          dest: "",
        },
      ],
    }),
  ],
});
