package com.controlflow.com

//Penulisan tanpa lambda
//val comparator = object :Runnable{
//    override fun run(){
//
//    }
//}
//Penulisan dengan lambda

fun main(){
    message()
    printMessage("Hello")
    val Length = messageLength("AAnu")
    println("Message length $Length")
}
val messageLength = {length : String -> length.length}
val printMessage = {message: String -> println(message)}
val message = { println("Hello This is Lambda") }