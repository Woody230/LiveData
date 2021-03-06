package com.bselzer.library.livedata.immutable.nullsafe

/**
 * Null-safe live data for characters.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class SafeCharLiveData(defaultValue: Char = ' ') : SafeImmutableLiveData<Char>(defaultValue)