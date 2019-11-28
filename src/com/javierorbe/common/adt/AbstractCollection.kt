package com.javierorbe.common.adt

abstract class AbstractCollection<E> : Collection<E> {

    protected var size = 0

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun size(): Int {
        return size
    }

    override fun contains(e: E): Boolean {
        for (other in this)
            if (other == e)
                return true
        return false
    }
}
