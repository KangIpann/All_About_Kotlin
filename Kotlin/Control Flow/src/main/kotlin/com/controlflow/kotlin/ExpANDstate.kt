package com.controlflow.kotlin

fun main(){
//    If sebagai expression
    val open : Int = 10
    val close : Int = 21
    val now : Int = 11
    val statement = if (open <= now) "Office is already open" else "Office is close"
    println(statement)
// Fungsi merupakan Expression
    println(anu(1, 1*5))

}
fun anu(value1: Int, value2: Int) = value1 + value2