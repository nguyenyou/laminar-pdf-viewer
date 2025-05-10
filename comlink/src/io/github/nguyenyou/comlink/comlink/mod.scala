package io.github.nguyenyou.comlink.comlink

import io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.Endpoint
import io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.EventSource
import io.github.nguyenyou.comlink.comlink.distUmdProtocolMod.PostMessageWithOrigin
import io.github.nguyenyou.comlink.std.Map
import io.github.nguyenyou.comlink.std.Omit
import io.github.nguyenyou.comlink.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("comlink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("comlink", "createEndpoint")
  @js.native
  val createEndpoint: js.Symbol = js.native
  
  inline def expose(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("expose")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def expose(obj: Any, ep: Endpoint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expose")(obj.asInstanceOf[js.Any], ep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expose(obj: Any, ep: Endpoint, allowedOrigins: js.Array[String | js.RegExp]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expose")(obj.asInstanceOf[js.Any], ep.asInstanceOf[js.Any], allowedOrigins.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expose(obj: Any, ep: Unit, allowedOrigins: js.Array[String | js.RegExp]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expose")(obj.asInstanceOf[js.Any], ep.asInstanceOf[js.Any], allowedOrigins.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("comlink", "finalizer")
  @js.native
  val finalizer: js.Symbol = js.native
  
  inline def proxy[T /* <: js.Object */](obj: T): T & ProxyMarked = ^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(obj.asInstanceOf[js.Any]).asInstanceOf[T & ProxyMarked]
  
  @JSImport("comlink", "proxyMarker")
  @js.native
  val proxyMarker: js.Symbol = js.native
  
  @JSImport("comlink", "releaseProxy")
  @js.native
  val releaseProxy: js.Symbol = js.native
  
  inline def transfer[T](obj: T, transfers: js.Array[Transferable]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(obj.asInstanceOf[js.Any], transfers.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("comlink", "transferHandlers")
  @js.native
  val transferHandlers: Map[String, TransferHandler[Any, Any]] = js.native
  
  inline def windowEndpoint(w: PostMessageWithOrigin): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("windowEndpoint")(w.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def windowEndpoint(w: PostMessageWithOrigin, context: EventSource): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("windowEndpoint")(w.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
  inline def windowEndpoint(w: PostMessageWithOrigin, context: EventSource, targetOrigin: String): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("windowEndpoint")(w.asInstanceOf[js.Any], context.asInstanceOf[js.Any], targetOrigin.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
  inline def windowEndpoint(w: PostMessageWithOrigin, context: Unit, targetOrigin: String): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("windowEndpoint")(w.asInstanceOf[js.Any], context.asInstanceOf[js.Any], targetOrigin.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
  
  inline def wrap[T](ep: Endpoint): Remote[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(ep.asInstanceOf[js.Any]).asInstanceOf[Remote[T]]
  inline def wrap[T](ep: Endpoint, target: Any): Remote[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(ep.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Remote[T]]
  
  type Local[T] = (Omit[LocalObject[T], /* keyof comlink.comlink.ProxyMethods */ String]) & (/* import warning: importer.ImportType#apply Failed type conversion: T extends (args : infer TArguments): infer TReturn ? (args : {[ I in keyof TArguments ]: comlink.comlink.ProxyOrClone<TArguments[I]>}): comlink.comlink.MaybePromise<comlink.comlink.UnproxyOrClone<comlink.comlink.Unpromisify<TReturn>>> : unknown */ js.Any)
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: comlink.comlink.LocalProperty<T[P]>}
    }}}
    */
  @js.native
  trait LocalObject[T] extends StObject
  
  /**
    * Takes the raw type of a property as a remote thread would see it through a proxy (e.g. when passed in as a function
    * argument) and returns the type that the local thread has to supply.
    *
    * This is the inverse of `RemoteProperty<T>`.
    *
    * Note: This needs to be its own type alias, otherwise it will not distribute over unions. See
    * https://www.typescriptlang.org/docs/handbook/advanced-types.html#distributive-conditional-types
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Function | comlink.comlink.ProxyMarked ? comlink.comlink.Local<T> : comlink.comlink.Unpromisify<T>
    }}}
    */
  type LocalProperty[T] = Local[T]
  
  /**
    * Expresses that a type can be either a sync or async.
    */
  type MaybePromise[T] = js.Promise[T] | T
  
  /**
    * Takes a type and wraps it in a Promise, if it not already is one.
    * This is to avoid `Promise<Promise<T>>`.
    *
    * This is the inverse of `Unpromisify<T>`.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Promise<unknown> ? T : std.Promise<T>
    }}}
    */
  type Promisify[T] = T
  
  @js.native
  trait ProxyMarked extends StObject
  
  @js.native
  trait ProxyMethods extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends comlink.comlink.ProxyMarked ? comlink.comlink.Remote<T> : T
    }}}
    */
  type ProxyOrClone[T] = T
  
  type Remote[T] = RemoteObject[T] & (/* import warning: importer.ImportType#apply Failed type conversion: T extends (args : infer TArguments): infer TReturn ? (args : {[ I in keyof TArguments ]: comlink.comlink.UnproxyOrClone<TArguments[I]>}): comlink.comlink.Promisify<comlink.comlink.ProxyOrClone<comlink.comlink.Unpromisify<TReturn>>> : unknown */ js.Any) & ProxyMethods
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: comlink.comlink.RemoteProperty<T[P]>}
    }}}
    */
  @js.native
  trait RemoteObject[T] extends StObject
  
  /**
    * Takes the raw type of a remote property and returns the type that is visible to the local thread on the proxy.
    *
    * Note: This needs to be its own type alias, otherwise it will not distribute over unions.
    * See https://www.typescriptlang.org/docs/handbook/advanced-types.html#distributive-conditional-types
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Function | comlink.comlink.ProxyMarked ? comlink.comlink.Remote<T> : comlink.comlink.Promisify<T>
    }}}
    */
  type RemoteProperty[T] = T
  
  trait TransferHandler[T, S] extends StObject {
    
    /**
      * Gets called for every value to determine whether this transfer handler
      * should serialize the value, which includes checking that it is of the right
      * type (but can perform checks beyond that as well).
      */
    def canHandle(value: Any): /* is T */ Boolean
    
    /**
      * Gets called to deserialize an incoming value that was serialized in the
      * other thread with this transfer handler (known through the name it was
      * registered under).
      */
    def deserialize(value: S): T
    
    /**
      * Gets called with the value if `canHandle()` returned `true` to produce a
      * value that can be sent in a message, consisting of structured-cloneable
      * values and/or transferrable objects.
      */
    def serialize(value: T): js.Tuple2[S, js.Array[Transferable]]
  }
  object TransferHandler {
    
    inline def apply[T, S](
      canHandle: Any => /* is T */ Boolean,
      deserialize: S => T,
      serialize: T => js.Tuple2[S, js.Array[Transferable]]
    ): TransferHandler[T, S] = {
      val __obj = js.Dynamic.literal(canHandle = js.Any.fromFunction1(canHandle), deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
      __obj.asInstanceOf[TransferHandler[T, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransferHandler[?, ?], T, S] (val x: Self & (TransferHandler[T, S])) extends AnyVal {
      
      inline def setCanHandle(value: Any => /* is T */ Boolean): Self = StObject.set(x, "canHandle", js.Any.fromFunction1(value))
      
      inline def setDeserialize(value: S => T): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setSerialize(value: T => js.Tuple2[S, js.Array[Transferable]]): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Takes a type that may be Promise and unwraps the Promise type.
    * If `P` is not a Promise, it returns `P`.
    *
    * This is the inverse of `Promisify<T>`.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P extends std.Promise<infer T> ? T : P
    }}}
    */
  type Unpromisify[P] = P
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends / * Inlined comlink.comlink.RemoteObject<comlink.comlink.ProxyMarked> * /
  {} ? comlink.comlink.Local<T> : T
    }}}
    */
  type UnproxyOrClone[T] = T
}
