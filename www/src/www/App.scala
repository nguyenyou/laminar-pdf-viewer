package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

import scala.scalajs.LinkingInfo.developmentMode
import org.scalajs.dom
import scala.scalajs.js.typedarray.ArrayBuffer
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scalajs.js.Thenable.Implicits.*
//import io.github.nguyenyou.mupdfjs.models.Foo
import scala.scalajs.js.JSConverters.JSRichIterableOnce
import scalajs.js
import io.github.nguyenyou.laminar.pdfjs.PdfViewer

val demoUrl = if (developmentMode) {
  ""
} else {
  "/laminar-pdf-viewer"
}

case class App() {
  def apply(): HtmlElement = {
    // mupdfWorker.postMessage("Hello from main thread")

    div(
      PdfViewer(
        urlSignal = Val(s"${demoUrl}/pdf/compressed.tracemonkey-pldi-09.pdf")
      )()
//       div("hi worker"),
//       Button(
//         _.onClick --> Observer { _ =>
//           // mupdfWorker.postMessage("Say hello from main thread")
//           // val messagex = Seq("Bob", "Hi Hi").toJSArray
//           // val huhu = MyObject(1, "Hi Hi")
          

//           dom.fetch("/pdf/compressed.tracemonkey-pldi-09.pdf").toFuture.flatMap { response =>
//             if (!response.ok) {
//               throw Exception(s"Failed to fetch PDF: ${response.statusText}")
//             }
//             response.arrayBuffer()
//           }.onComplete {
//             case Failure(_) =>
//               ()
//             case Success(value) =>
// //              println("Send array buffer to worker")
// //              println(value)
//               // mupdfWorker.postMessage(value)
//           }
//         }
//       )("Click me")
    )
  }
}
