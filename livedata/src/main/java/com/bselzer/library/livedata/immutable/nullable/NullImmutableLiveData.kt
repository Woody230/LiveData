package com.bselzer.library.livedata.immutable.nullable

import com.bselzer.library.livedata.base.nullable.NullMutableLiveData

/**
 * Nullable live data for primitives and immutable objects.
 * @param Value the type of the value to store
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class NullImmutableLiveData<Value>(defaultValue: Value?) : NullMutableLiveData<Value>(defaultValue, defaultValue)