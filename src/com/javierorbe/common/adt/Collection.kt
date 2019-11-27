package com.javierorbe.common.adt

interface Collection<E> : Iterable<E> {
    fun isEmpty(): Boolean
    fun size(): Int
}
