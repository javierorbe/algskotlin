package com.javierorbe.common.adt

interface IBag<E> : Collection<E> {
    fun add(e: E)
}
