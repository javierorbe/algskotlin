package com.javierorbe.common.adt

interface IStack<E> : Collection<E> {
    fun push(e: E)
    fun pop(): E
    fun peek(): E
}
