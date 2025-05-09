package io.github.nguyenyou.laminar.pdfjs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

case class Viewer() {
  def apply(): HtmlElement = {
    div(
      "Hello, world!",
      Button()("Click me")
    )
  }
}
