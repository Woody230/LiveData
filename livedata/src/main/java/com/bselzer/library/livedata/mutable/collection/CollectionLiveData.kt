package com.bselzer.library.livedata.mutable.collection

import com.bselzer.library.livedata.base.implement.Resettable
import com.bselzer.library.livedata.base.nullsafe.SafeMutableLiveData

/**
 * Null-safe live data for collections.
 * @param Element the type of value stored in the collection
 * @param Enumerable the type of collection
 * @param defaultValue the default value to set upon reset
 * @param initialValue the initial value to store
 */
open class CollectionLiveData<Element, Enumerable : Collection<Element>>(initialValue: Enumerable, protected val defaultValue: Enumerable) :
    SafeMutableLiveData<Enumerable>(initialValue), Resettable
{
    /**
     * Set the value to the default value.
     */
    override fun reset()
    {
        value = defaultValue
    }
}