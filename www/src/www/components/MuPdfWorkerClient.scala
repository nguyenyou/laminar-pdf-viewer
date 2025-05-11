package www.components

import org.scalajs.dom.Worker
import scala.scalajs.js.typedarray.ArrayBuffer
import org.scalajs.dom.MessageEvent
import scala.scalajs.js
import scala.concurrent.{Future, Promise}
import scala.util.{Success, Failure, Try}
import scala.concurrent.ExecutionContext.Implicits.global
import com.raquo.laminar.api.L.*

// Message types for communication with the worker
sealed trait WorkerMessage
case class WorkerRequest(id: String, messageType: String, payload: js.Any)                 extends WorkerMessage
case class WorkerResponse(id: String, messageType: String, data: js.Any, success: Boolean) extends WorkerMessage
case class WorkerError(id: String, messageType: String, error: String)                     extends WorkerMessage

case class MuPdfWorkerClient(worker: Worker, debug: Boolean = false) {
  private var messageCallbacks     = Map.empty[String, Promise[js.Any]]
  private var messageCounter       = 0
  private val workerInitializedVar = Var(false)
  val workerInitializedSignal      = workerInitializedVar.signal.distinct

  def logger(message: String): Unit = {
    if (debug) {
      println(s"[MuPdfWorkerClient] ${message}")
    }
  }

  def listen(): Unit = {
    logger("Start listen message from worker")
    worker.addEventListener(
      "message",
      (event: MessageEvent) => {
        try {
          handleMessage(event.data.asInstanceOf[js.Dynamic])
        } catch {
          case e: Throwable =>
            println(s"Error handling worker message: ${e.getMessage}")
        }
      }
    )
  }

  private def handleMessage(data: js.Dynamic): Unit = {
    try {
      // Check if we have a callback for this id
      if (!js.isUndefined(data.id)) {
        val id = data.id.asInstanceOf[String]
        if (id == "system") {
          if(!js.isUndefined(data.messageType) && data.messageType.asInstanceOf[String] == "initialization") {
            if(!js.isUndefined(data.success) && data.success.asInstanceOf[Boolean]) {
              workerInitializedVar.set(true)
            }
          }
        } else {
          messageCallbacks.get(id).foreach { promise =>
            if (!js.isUndefined(data.success) && data.success.asInstanceOf[Boolean]) {
              // Success response
              if (!js.isUndefined(data.data)) {
                promise.success(data.data)
              } else {
                promise.success(js.undefined)
              }
            } else {
              // Error response
              val errorMessage = if (!js.isUndefined(data.error)) {
                data.error.asInstanceOf[String]
              } else {
                "Unknown error"
              }
              promise.failure(new Exception(errorMessage))
            }

            // Remove the callback
            messageCallbacks = messageCallbacks - id
          }
        }
      } else {
        // System message or unhandled message
        println(s"Unhandled message: ${js.JSON.stringify(data)}")
      }
    } catch {
      case e: Throwable =>
        println(s"Error parsing message: ${e.getMessage}")
    }
  }

  def terminate(): Unit = {
    // Reject all pending promises
    messageCallbacks.foreach { case (_, promise) =>
      promise.failure(new Exception("Worker terminated"))
    }
    messageCallbacks = Map.empty
    worker.terminate()
  }

  // Generic method to send messages to the worker with a future response
  def sendMessage(messageType: String, payload: js.Any = null): Future[js.Any] = {
    val id = (messageCounter + 1).toString
    logger(s"Send message to worker: ${messageType} with payload: ${js.JSON.stringify(payload)}")
    messageCounter += 1

    val promise = Promise[js.Any]()
    messageCallbacks = messageCallbacks + (id -> promise)

    val message = js.Dynamic.literal(
      id = id,
      messageType = messageType,
      payload = payload
    )

    worker.postMessage(message)
    promise.future
  }

  // Specific methods for different operations
  def openDocument(file: ArrayBuffer): Future[js.Any] = {
    logger(s"[openDocument]: ${file}")
    sendMessage("openDocument", file)
  }

  def getPageCount(): Future[Int] = {
    logger("[getPageCount]")
    sendMessage("getPageCount").map(_.asInstanceOf[Int])
  }

  def renderPage(pageNumber: Int, scale: Double = 1.0): Future[js.Any] = {
    logger(s"[renderPage]: ${pageNumber} with scale: ${scale}")
    val params = js.Dynamic.literal(
      pageNumber = pageNumber,
      scale = scale
    )
    sendMessage("renderPage", params)
  }
}
