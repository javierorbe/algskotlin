package com.javierorbe.common.adt

internal class NodeIterator<E>(first: Node<E>?) : Iterator<E> {
    private var current: Node<E>? = first

    override fun hasNext(): Boolean {
        return current != null
    }

    override fun next(): E {
        val e: E = current!!.value
        current = current?.next
        return e
    }
}
