package com.bselzer.library.livedata.immutable

/**
 * Live data for integers.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class IntLiveData(defaultValue: Int = 0) : ImmutableLiveData<Int>(defaultValue)