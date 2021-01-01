package com.bselzer.library.livedata.immutable

/**
 * Live data for strings.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class StringLiveData(defaultValue: String = "") : ImmutableLiveData<String>(defaultValue)