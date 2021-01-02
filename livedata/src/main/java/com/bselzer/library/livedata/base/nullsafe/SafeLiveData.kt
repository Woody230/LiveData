package com.bselzer.library.livedata.base.nullsafe

import androidx.lifecycle.LiveData

/**
 * A null-safe version of live data.
 * @param Value the type of the value to store
 * @param initialValue the initial value to store to replace the default null
 */
open class SafeLiveData<Value>(initialValue: Value) : LiveData<Value>(initialValue)
{
    override fun getValue(): Value
    {
        val value = super.getValue()
        requireNotNull(value)
        return value
    }

    // Override with a non-nullable parameter.
    @Suppress
    override fun setValue(value: Value)
    {
        super.setValue(value)
    }

    // Override with a non-nullable parameter.
    @Suppress
    override fun postValue(value: Value)
    {
        super.postValue(value)
    }
}