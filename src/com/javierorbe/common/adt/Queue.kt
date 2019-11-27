package com.javierorbe.common.adt

open class Queue<E>() : AbstractCollection<E>(), IQueue<E> {

    private var first: Node<E>? = null
    private var last: Node<E>? = null

    /** Copy constructor. */
    constructor(queue: IQueue<E>) : this() {
        var current: Node<E>? = null
        for (e in queue) {
            if (first == null) {
                first = Node(e, null)
            } else {
                current!!.next = Node(e, null)
                current = current.next
            }
        }
        last = current
    }

    override fun enqueue(e: E) {
        val newLast = Node(e, null)
        if (isEmpty()) {
            first = newLast
        } else {
            last!!.next = newLast
        }
        last = newLast
        size++
    }

    override fun dequeue(): E {
        val e = first!!.value
        first = first!!.next
        size--
        return e
    }

    override fun iterator(): Iterator<E> {
        return NodeIterator(first)
    }
}
