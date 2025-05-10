package io.github.nguyenyou.mupdfjs.worker

import scala.annotation.unused
import scala.scalajs.js.annotation.JSGlobalScope
import scala.scalajs.js

val MUPDF_LOADED = "MUPDF_LOADED"

case class MupdfWorker() {
  def initializeMupdf(): Unit = {
    try {
      WorkerGlobal.postMessage(MUPDF_LOADED)
    } catch {
      case e: Throwable =>
        println(e)
    }
  }
}

@js.native
@JSGlobalScope
object WorkerGlobal extends js.Object {

  def addEventListener(
      @unused `type`: String,
      @unused f: js.Function
  ): Unit = js.native

  def postMessage(
      @unused data: js.Any
  ): Unit = js.native

}

@main def main(): Unit = {
    println("mupdfjs-worker loaded!")
    WorkerGlobal.postMessage(MUPDF_LOADED)
}


