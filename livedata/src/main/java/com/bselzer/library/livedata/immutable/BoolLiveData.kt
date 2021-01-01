package com.bselzer.library.livedata.immutable

/**
 * Live data for booleans.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class BoolLiveData(defaultValue: Boolean = false) : ImmutableLiveData<Boolean>(defaultValue)