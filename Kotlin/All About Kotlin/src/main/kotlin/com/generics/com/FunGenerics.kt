package com.generics.com

//fun <T> List<T>.slice(indices: Iterable<Int>): List <T> {

//}
fun main(){
    val numbers = (1.rangeTo(100)).toList()
    print(numbers.slice(0..9))
}