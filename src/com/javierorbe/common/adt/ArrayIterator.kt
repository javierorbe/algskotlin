package com.javierorbe.common.adt

internal class ArrayIterator<E>(private val array: Array<E?>, private val size: Int) : Iterator<E> {

    private var index = 0

    constructor(array: Array<E?>) : this(array, array.size)

    override fun hasNext(): Boolean {
        return index < size
    }

    override fun next(): E {
        return array[index]!!
    }
}
