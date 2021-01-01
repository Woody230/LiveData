package com.bselzer.library.livedata.immutable

/**
 * Live data for floats.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class FloatLiveData(defaultValue: Float = 0f) : ImmutableLiveData<Float>(defaultValue)