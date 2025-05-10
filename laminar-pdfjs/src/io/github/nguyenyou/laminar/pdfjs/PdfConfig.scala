package io.github.nguyenyou.laminar.pdfjs

import io.github.nguyenyou.pdfjs.pdfjsDist.mod
import io.github.nguyenyou.pdfjs.pdfjsDist.mod.version

import scalajs.js

object PdfConfig {
  private val PdfjsVersion = version

  private val defaultWorkerUrl = s"https://cdn.jsdelivr.net/npm/pdfjs-dist@${PdfjsVersion}/build/pdf.worker.min.mjs"

  def setWorkerUrl(url: String = defaultWorkerUrl): Unit = {
    mod.^.asInstanceOf[js.Dynamic].selectDynamic("GlobalWorkerOptions").updateDynamic("workerSrc")(url) // scalafix:ok
  }
}
