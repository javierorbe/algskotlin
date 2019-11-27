package com.javierorbe.common

import com.javierorbe.common.adt.ArrayStack
import com.javierorbe.common.adt.Bag
import com.javierorbe.common.adt.IBag
import com.javierorbe.common.adt.IStack

fun main() {
    val bag: IBag<Int> = Bag()
    bag.add(2)
    bag.add(5)
    for (i in bag) {
        println(i)
    }
    val s: IStack<Int> = ArrayStack()
}
