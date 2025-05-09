package io.github.nguyenyou.pdfjs.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSON extends StObject {
  
  /**
    * Converts a JavaScript Object Notation (JSON) string into an object.
    * @param text A valid JSON string.
    * @param reviver A function that transforms the results. This function is called for each member of the object.
    * If a member contains nested objects, the nested objects are transformed before the parent object is.
    */
  /* standard es5 */
  def parse(text: String): Any = js.native
  def parse(text: String, reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): Any = js.native
  
  /**
    * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
    * @param value A JavaScript value, usually an object or array, to be converted.
    * @param replacer A function that transforms the results.
    * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
    */
  /* standard es5 */
  def stringify(value: Any): String = js.native
  def stringify(value: Any, replacer: js.Array[Double | String]): String = js.native
  def stringify(value: Any, replacer: js.Array[Double | String], space: String): String = js.native
  def stringify(value: Any, replacer: js.Array[Double | String], space: Double): String = js.native
  def stringify(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String = js.native
  def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: String
  ): String = js.native
  def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: Double
  ): String = js.native
  def stringify(value: Any, replacer: Null, space: String): String = js.native
  def stringify(value: Any, replacer: Null, space: Double): String = js.native
  def stringify(value: Any, replacer: Unit, space: String): String = js.native
  def stringify(value: Any, replacer: Unit, space: Double): String = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: String = js.native
}
