package com.javierorbe.common.adt

interface IQueue<E> : Collection<E> {
    fun enqueue(e: E)
    fun dequeue(): E
}
