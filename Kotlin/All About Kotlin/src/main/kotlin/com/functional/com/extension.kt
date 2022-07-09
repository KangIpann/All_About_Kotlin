package com.functional.com
fun main(){
    10.printInt()
    println("12 Dibagi 3 adalah = ${12.divineThree()}")
    println(10.slice)

}
val Int.slice: Int
    get() = this / 2

fun Int.divineThree():Int {
    return this / 3
}

fun Int.printInt(){
    println("Value is $this")
}
