package io.github.nguyenyou.comlink.std

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageData
import org.scalajs.dom.MessagePort
import org.scalajs.dom.RTCDataChannel
import org.scalajs.dom.ReadableStream
import org.scalajs.dom.SVGImageElement
import org.scalajs.dom.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllowSharedBufferSource = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView

/**
  * Defines the `TReturn` type used for built-in iterators produced by `Array`, `Map`, `Set`, and others.
  * This is `undefined` when `strictBuiltInIteratorReturn` is `true`; otherwise, this is `any`.
  */
type BuiltinIteratorReturn = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.comlink`.std.HTMLOrSVGImageElement
  - org.scalajs.dom.HTMLVideoElement
  - org.scalajs.dom.HTMLCanvasElement
  - `io.github.nguyenyou.comlink`.std.ImageBitmap
  - `io.github.nguyenyou.comlink`.std.OffscreenCanvas
  - `io.github.nguyenyou.comlink`.std.VideoFrame
*/
type CanvasImageSource = _CanvasImageSource | HTMLOrSVGImageElement | HTMLVideoElement | HTMLCanvasElement

type EventListener = js.Function1[/* evt */ Event, Unit]

type EventListenerOrEventListenerObject = EventListener | EventListenerObject

/**
  * Exclude from T those types that are assignable to U
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends U ? never : T
  }}}
  */
type Exclude[T, U] = T

type Float32List = js.typedarray.Float32Array | js.Array[GLfloat]

type GLbitfield = Double

type GLboolean = Boolean

type GLclampf = Double

type GLenum = Double

type GLfloat = Double

type GLint = Double

type GLint64 = Double

type GLintptr = Double

type GLsizei = Double

type GLsizeiptr = Double

type GLuint = Double

type GLuint64 = Double

type HTMLOrSVGImageElement = HTMLImageElement | SVGImageElement

type Int32List = js.typedarray.Int32Array | js.Array[GLint]

/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.comlink`.std.OffscreenCanvasRenderingContext2D
  - `io.github.nguyenyou.comlink`.std.ImageBitmapRenderingContext
  - org.scalajs.dom.WebGLRenderingContext
  - `io.github.nguyenyou.comlink`.std.WebGL2RenderingContext
*/
type OffscreenRenderingContext = _OffscreenRenderingContext | WebGLRenderingContext

/**
  * Construct a type with the properties of T except for those in type K.
  */
type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

/**
  * From T, pick a set of properties whose keys are in the union K
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in K ]: T[P]}
  }}}
  */
type Pick[T, K /* <: /* keyof T */ String */] = T

/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.comlink`.std.ImageBitmap
  - org.scalajs.dom.ImageData
  - org.scalajs.dom.HTMLImageElement
  - org.scalajs.dom.HTMLCanvasElement
  - org.scalajs.dom.HTMLVideoElement
  - `io.github.nguyenyou.comlink`.std.OffscreenCanvas
  - `io.github.nguyenyou.comlink`.std.VideoFrame
*/
type TexImageSource = _TexImageSource | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement

/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.comlink`.std.OffscreenCanvas
  - `io.github.nguyenyou.comlink`.std.ImageBitmap
  - org.scalajs.dom.MessagePort
  - `io.github.nguyenyou.comlink`.std.MediaSourceHandle
  - org.scalajs.dom.ReadableStream[scala.Any]
  - `io.github.nguyenyou.comlink`.std.WritableStream[scala.Any]
  - `io.github.nguyenyou.comlink`.std.TransformStream[scala.Any, scala.Any]
  - `io.github.nguyenyou.comlink`.std.AudioData
  - `io.github.nguyenyou.comlink`.std.VideoFrame
  - org.scalajs.dom.RTCDataChannel
  - js.typedarray.ArrayBuffer
*/
type Transferable = _Transferable | ReadableStream[Any] | WritableStream[Any] | (TransformStream[Any, Any]) | MessagePort | RTCDataChannel | js.typedarray.ArrayBuffer

type Uint32List = js.typedarray.Uint32Array | js.Array[GLuint]
