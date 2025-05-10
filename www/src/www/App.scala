package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

import scala.scalajs.LinkingInfo.developmentMode
import org.scalajs.dom.Worker

val demoUrl = if (developmentMode) {
  ""
} else {
  "/laminar-pdf-viewer"
}

case class App(
  mupdfWorker: Worker
) {
  def apply(): HtmlElement = {
    div(
      div("hi worker"),
      Button(
        _.onClick --> Observer { _ =>
          mupdfWorker.postMessage("Say hello from main thread")
        }
      )("Click me")
    )
  }
}
