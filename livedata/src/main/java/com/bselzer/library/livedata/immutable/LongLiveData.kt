package com.bselzer.library.livedata.immutable

/**
 * Live data for longs.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class LongLiveData(defaultValue: Long = 0L) : ImmutableLiveData<Long>(defaultValue)