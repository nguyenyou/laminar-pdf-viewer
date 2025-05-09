package www

import com.raquo.laminar.api.L.*
import org.scalajs.dom

@main
def main(): Unit = {
    val container = dom.document.getElementById("app")
    val app = div(
        h1("Hello, world!"),
        p("This is a test"),
    )
    render(container, app)
}