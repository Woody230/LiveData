package com.bselzer.library.livedata.immutable

/**
 * Live data for characters.
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class CharLiveData(defaultValue: Char = ' ') : ImmutableLiveData<Char>(defaultValue)