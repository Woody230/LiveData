package com.bselzer.library.livedata.immutable

import com.bselzer.library.livedata.base.SafeMutableLiveData
import com.bselzer.library.livedata.implement.Resettable

/**
 * Live data for primitives and immutable objects.
 * @param Value the type of the value to store
 * @param defaultValue the initial value to store. It is also the value to set upon resetting the instance.
 */
open class ImmutableLiveData<Value>(val defaultValue: Value) : SafeMutableLiveData<Value>(defaultValue), Resettable
{
    /**
     * Set the value to the default value.
     */
    override fun reset()
    {
        value = defaultValue
    }
}