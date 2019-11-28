package com.javierorbe.common.adt

internal class DoubleNodeIterator<E>(first: DoubleNode<E>?) : Iterator<E> {

    private var current: DoubleNode<E>? = first

    override fun hasNext(): Boolean {
        return current != null
    }

    override fun next(): E {
        val e = current!!.value;
        current = current?.next
        return e
    }
}