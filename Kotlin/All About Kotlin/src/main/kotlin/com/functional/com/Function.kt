package com.functional.com

typealias Arithmetic = (Int, Int) -> Int
typealias dontknow = ((Int, Int) -> Int)?

val sum2: dontknow = {valueA, valueB  -> valueA + valueB }
val sum: Arithmetic = {valueA, valueB  -> valueA + valueB }
val multiply: Arithmetic = {valueA, valueB -> valueA * valueB}

fun main(){
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20,20)

    val sumResult2 = sum(10, 10)
    val multiplyResult2 = multiply(20,20)
    
    val dontknowF = sum2?.invoke(10, 20)

    println(sumResult)
    println(multiplyResult)
    println(sumResult2)
    println(multiplyResult2)
    println(dontknowF)
}