package com.controlflow.kotlin

fun main(){
    val rangeInt = 1..34 step 3
//    Cara mengetahui step menggunakan (rangeInt.step)
    rangeInt.forEach{
        print("$it ")
    }
    println()
    val rangeNew = 1.rangeTo(23)
    val downRange = 23.downTo(1) step 3

    if (6 !in downRange){
        println("Value 6 isn't in range")
    } else{
        println("Value 6 is in range")
    }
// Char Range
    val rangeChar = 'A'.rangeTo('F')

}