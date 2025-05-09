package io.github.nguyenyou.pdfjs.std

import org.scalajs.dom.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Defines the `TReturn` type used for built-in iterators produced by `Array`, `Map`, `Set`, and others.
  * This is `undefined` when `strictBuiltInIteratorReturn` is `true`; otherwise, this is `any`.
  */
type BuiltinIteratorReturn = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type ErrorCallback = js.Function1[/* err */ DOMException, Unit]

type FileSystemEntriesCallback = js.Function1[/* entries */ js.Array[FileSystemEntry], Unit]

type FileSystemEntryCallback = js.Function1[/* entry */ FileSystemEntry, Unit]

type FunctionStringCallback = js.Function1[/* data */ String, Unit]

type WeakKey = /* import warning: importer.ImportType#apply Failed type conversion: std.WeakKeyTypes['object'] */ js.Any
