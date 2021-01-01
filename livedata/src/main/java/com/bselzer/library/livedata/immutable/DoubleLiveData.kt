package com.bselzer.library.livedata.immutable

/**
 * Live data for doubles.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class DoubleLiveData(defaultValue: Double = 0.0) : ImmutableLiveData<Double>(defaultValue)