
package io.github.nguyenyou.mupdfjs.models

import scala.scalajs.js.typedarray.ArrayBuffer
import scala.scalajs.js
import js.JSConverters._
import scala.scalajs.js.annotation._

case class Message(id: String, msg: String, data: Option[ArrayBuffer] = None)

type MupdfMessage = (id: String, msg: String)

//
//@js.native
//trait MyObject extends js.Object {
//  val foo: js.UndefOr[Int] = js.native
//  val bar: js.UndefOr[ArrayBuffer] = js.native
//}
//
//object MyObject {
//  def apply(foo: Option[Int], bar: Option[ArrayBuffer]): MyObject =
//    js.Dynamic.literal(foo = foo, bar = bar).asInstanceOf[MyObject]
//}

// @ScalaJSDefined
//class Foo extends js.Object {
//  val x: Int = 4
//  val y: Int = x + 1
//  val z: ArrayBuffer = None
//}
