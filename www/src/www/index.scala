package www

import com.raquo.laminar.api.L.*
import org.scalajs.dom

import www.components.ThemeProvider
import io.github.nguyenyou.laminar.pdfjs.PdfConfig
@main
def main(): Unit = {
  PdfConfig.setWorkerUrl()
  val container = dom.document.getElementById("app")

  render(container, ThemeProvider()(App()()))
}
