package com.bselzer.library.livedata.immutable.nullable

import androidx.lifecycle.MutableLiveData
import com.bselzer.library.livedata.base.implement.Resettable


/**
 * Nullable live data for primitives and immutable objects.
 * @param Value the type of the value to store
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class NullImmutableLiveData<Value>(val defaultValue: Value?) : MutableLiveData<Value>(defaultValue), Resettable
{
    /**
     * Set the value to the default value.
     */
    override fun reset()
    {
        value = defaultValue
    }
}