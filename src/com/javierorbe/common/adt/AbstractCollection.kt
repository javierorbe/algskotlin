package com.javierorbe.common.adt

abstract class AbstractCollection<E> : Collection<E> {

    var size = 0

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun size(): Int {
        return size
    }
}
