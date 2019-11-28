package com.javierorbe.common.adt

class Deque<E> : AbstractCollection<E>(), IDeque<E> {

    private var first: DoubleNode<E>? = null
    private var last: DoubleNode<E>? = null

    override fun pushFirst(e: E) {
        first = DoubleNode(e, null, first)
        if (last == null) {
            last = first
        }
        size++
    }

    override fun pushLast(e: E) {
        last = DoubleNode(e, last, null)
        size++
    }

    override fun popFirst(): E {
        if (first == null)
            throw NoSuchElementException()

        val e = first!!.value
        first = first?.next
        size--
        return e
    }

    override fun popLast(): E {
        if (last == null)
            throw NoSuchElementException();

        val e = last!!.value
        last = last?.prev
        size--
        return e
    }

    override fun iterator(): Iterator<E> {
        return DoubleNodeIterator(first)
    }
}
