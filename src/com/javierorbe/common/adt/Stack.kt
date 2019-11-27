package com.javierorbe.common.adt

open class Stack<E>() : AbstractCollection<E>(), IStack<E> {

    private var first: Node<E>? = null

    /** Copy constructor. */
    constructor(stack: IStack<E>) : this() {
        var current: Node<E>? = null
        for (e in stack) {
            if (first == null) {
                first = Node(e, null)
                current = first
            } else {
                current!!.next = Node(e, null)
                current = current.next
            }
        }
    }

    override fun push(e: E) {
        first = Node(e, first)
        size++
    }

    override fun pop(): E {
        if (isEmpty())
            throw NoSuchElementException("Stack underflow.")
        val e = first?.value
        first = first?.next
        size--
        return e!!
    }

    override fun peek(): E {
        if (isEmpty())
            throw NoSuchElementException("Stack underflow.")
        return first!!.value
    }

    override fun iterator(): Iterator<E> {
        return NodeIterator(first)
    }
}
