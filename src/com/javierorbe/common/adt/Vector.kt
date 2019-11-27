package com.javierorbe.common.adt

open class Vector<E>(initialCapacity: Int) : AbstractCollection<E>() {

    protected var data: Array<E?>

    init {
        @Suppress("UNCHECKED_CAST")
        data = arrayOfNulls<Any>(initialCapacity) as Array<E?>
    }

    constructor() : this(10)

    fun get(index: Int): E {
        return data[index]!!
    }

    fun add(e: E) {
        if (size == data.size) {
            resize(size * 2)
        }
        data[size++] = e
    }

    fun remove(index: Int) {
        data[index] = null
        size--
    }

    fun set(index: Int, e: E) {
        data[index] = e
    }

    override fun iterator(): Iterator<E> {
        return ArrayIterator<E>(data)
    }

    private fun resize(capacity: Int) {
        @Suppress("UNCHECKED_CAST")
        val newData: Array<E?> = arrayOfNulls<Any>(capacity) as Array<E?>
        System.arraycopy(data, 0, newData, 0, size)
        data = newData
    }
}
