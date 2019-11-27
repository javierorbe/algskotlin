package com.javierorbe.common.adt

class Bag<E> : AbstractCollection<E>(), IBag<E> {

    private var first: Node<E>? = null

    override fun add(e: E) {
        first = Node(e, first)
        size++
    }

    override fun iterator(): Iterator<E> {
        return NodeIterator(first)
    }
}
