package com.functional.com
fun main(){
    val numbers = 1.rangeTo(10)
    val numbers2 = 1.rangeTo(20)
    val evenNumber = numbers.filter(::isEvenNumber)
//    Selain itu, kita juga bisa mereferensikan sebuah extensions function.
//    Caranya dengan ikut menyertakan objek yang menjadi receivernya sebelum operator :: seperti berikut:
    val evenNumber2 = numbers2.filter(Int::isEvenNumber2)
    print(" $evenNumber")
    println()
    print(" $evenNumber2")
    println()
    println(::message.name)
    println(::message.get())
    println(::message.set("Arialdo"))
    println(::message.get())
    println(::immuutable.name)
}
//Property reference
var message = "Ivan"
val immuutable = "Unknown"
val sumCount:(Int, Int) -> Int = ::count
fun count(valueA: Int, valueB: Int):Int{
    return valueA + valueB
}
//Kode di atas ditulis dengan mekanisme Reflection
//yang berarti seperangkat fitur bahasa dan library yang memungkinkan kita untuk mengamati struktur kode dari proyek yang sedang kita kerjakan secara langsung.

//Function References
fun isEvenNumber(number : Int) = number % 2 == 0
//    Selain itu, kita juga bisa mereferensikan sebuah extensions function.
//    Caranya dengan ikut menyertakan objek yang menjadi receivernya sebelum operator :: seperti berikut:
fun Int.isEvenNumber2() = this % 2 == 0