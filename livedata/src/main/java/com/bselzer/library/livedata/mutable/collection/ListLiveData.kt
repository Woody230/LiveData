package com.bselzer.library.livedata.mutable.collection

/**
 * Null-safe live data for lists.
 * A [comparator] can be set to maintain a sorted list.
 * @param Element the type of value stored in the list
 * @param defaultValue the default value to set upon reset
 * @param initialValue the initial value to store
 */
open class ListLiveData<Element>(initialValue: List<Element> = emptyList(), defaultValue: List<Element> = emptyList()) :
    CollectionLiveData<Element, List<Element>>(initialValue, defaultValue)
{
    /**
     * The comparator used to sort the list.
     */
    var comparator: Comparator<Element>? = null
        set(value)
        {
            field = value

            // Sort the list with the new comparator.
            this.value = this.value
        }

    /**
     * Sorts the list with the [comparator] and then sets the [value]. If there are active observers, the value will be dispatched to them.
     *
     * This method must be called from the main thread. If you need set a value from a background
     * thread, you can use [postValue]
     *
     * @param value the new list
     */
    override fun setValue(value: List<Element>)
    {
        super.setValue(value.sort())
    }

    /**
     * Posts a task to a main thread to sort the list with the [comparator] and then set the [value]. So if you have the following code
     * executed on the main thread:
     *
     * liveData.postValue("a");
     *
     * liveData.setValue("b");
     *
     * The value "b" would be set at first and later the main thread would override it with
     * the value "a".
     * If you called this method multiple times before the main thread executed a posted task, only
     * the last value would be dispatched.
     *
     * @param value the new list
     */
    override fun postValue(value: List<Element>)
    {
        super.postValue(value.sort())
    }

    /**
     * Sort the list with the [comparator] if it exists.
     * @return the sorted list
     */
    private fun List<Element>.sort(): List<Element>
    {
        return comparator?.let { comparator ->
            this.sortedWith(comparator)
        } ?: this
    }
}