package com.bselzer.library.livedata.immutable.nullable

/**
 * Nullable live data for characters.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class NullCharLiveData(defaultValue: Char? = null) : NullImmutableLiveData<Char>(defaultValue)