import { defineConfig } from "vite";
import tailwindcss from '@tailwindcss/vite'

const IS_PROD = process.env.NODE_ENV == "production";

export default defineConfig({
  plugins: [tailwindcss()],
  base: IS_PROD ? "/laminar-pdf-viewer/" : "/",
  resolve: {
      alias: [
        {
          find: /^scalajs:(.*)$/,
          replacement: `../out/www/${IS_PROD ? 'full' : 'fast'}LinkJS.dest/$1`
        }
      ]
    }
});
