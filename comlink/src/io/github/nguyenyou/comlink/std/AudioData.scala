package io.github.nguyenyou.comlink.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData) */
trait AudioData
  extends StObject
     with _Transferable {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/allocationSize) */
  /* standard dom */
  def allocationSize(options: AudioDataCopyToOptions): Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/close) */
  /* standard dom */
  def close(): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/copyTo) */
  /* standard dom */
  def copyTo(destination: AllowSharedBufferSource, options: AudioDataCopyToOptions): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/duration) */
  /* standard dom */
  val duration: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format) */
  /* standard dom */
  val format: AudioSampleFormat | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfChannels) */
  /* standard dom */
  val numberOfChannels: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfFrames) */
  /* standard dom */
  val numberOfFrames: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/sampleRate) */
  /* standard dom */
  val sampleRate: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/timestamp) */
  /* standard dom */
  val timestamp: Double
}
object AudioData {
  
  inline def apply(
    allocationSize: AudioDataCopyToOptions => Double,
    close: () => Unit,
    copyTo: (AllowSharedBufferSource, AudioDataCopyToOptions) => Unit,
    duration: Double,
    numberOfChannels: Double,
    numberOfFrames: Double,
    sampleRate: Double,
    timestamp: Double
  ): AudioData = {
    val __obj = js.Dynamic.literal(allocationSize = js.Any.fromFunction1(allocationSize), close = js.Any.fromFunction0(close), copyTo = js.Any.fromFunction2(copyTo), duration = duration.asInstanceOf[js.Any], numberOfChannels = numberOfChannels.asInstanceOf[js.Any], numberOfFrames = numberOfFrames.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], format = null)
    __obj.asInstanceOf[AudioData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioData] (val x: Self) extends AnyVal {
    
    inline def setAllocationSize(value: AudioDataCopyToOptions => Double): Self = StObject.set(x, "allocationSize", js.Any.fromFunction1(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCopyTo(value: (AllowSharedBufferSource, AudioDataCopyToOptions) => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction2(value))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: AudioSampleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFrames(value: Double): Self = StObject.set(x, "numberOfFrames", value.asInstanceOf[js.Any])
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
