package com.javierorbe.common.adt

class ArrayStack<E>(initialCapacity: Int) : Vector<E>(initialCapacity), IStack<E> {

    constructor() : this(10)

    override fun push(e: E) {
        add(e)
    }

    override fun pop(): E {
        val e = peek()
        remove(size - 1)
        return e
    }

    override fun peek(): E {
        return get(0)
    }

    override fun iterator(): Iterator<E> {
        return ReverseArrayIterator()
    }

    private inner class ReverseArrayIterator : Iterator<E> {
        private var index = size

        override fun hasNext(): Boolean {
            return size > 0
        }

        override fun next(): E {
            return data[--index]!!
        }
    }
}
