package com.javierorbe.common.adt

/** Double-linked node. */
internal class DoubleNode<E>(val value: E, var prev: DoubleNode<E>?, var next: DoubleNode<E>?)
