package com.javierorbe.common.adt

/**
 * Double-ended queue.
 */
interface IDeque<E> : Collection<E> {
    fun pushFirst(e: E)
    fun pushLast(e: E)
    fun popFirst(): E
    fun popLast(): E
}
