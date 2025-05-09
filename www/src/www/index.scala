package www

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import io.github.nguyenyou.laminar.pdfjs.Viewer
import io.github.nguyenyou.laminar.pdfjs.Config

@main
def main(): Unit = {
    Config.setWorkerUrl()
    val container = dom.document.getElementById("app")
    val viewer = Viewer(
        urlSignal = Val("/pdf/compressed.tracemonkey-pldi-09.pdf")
    )
    val app = div(
        h1("Hello, world!"),
        p("This is a test"),
        viewer()
    )
    render(container, app)
}
