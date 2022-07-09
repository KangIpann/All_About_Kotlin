package com.functional.com

import java.lang.IllegalArgumentException

fun main(){
    val me = "Ivan"
    setWord(me)
    setWord2("Orin")
    println(sum(1,23,4))
}
//Function inside Function
fun setWord(message:String){
    fun printMessage(text: String){
        println(text)
    }
    printMessage(message)
}
fun setWord2(message:String){
    fun printMessage(){
        println(message)
    }
    printMessage()
}
fun sum(valueA:Int,valueB:Int,valueC:Int): Int{
    fun cekAngka(value:Int){
        if (value == 0){
            throw IllegalArgumentException("Value must be higher than 0")
        }
    }
    cekAngka(valueA)
    cekAngka(valueB)
    cekAngka(valueC)

    return valueA+valueB+valueC
}
//inner fun with extension
fun sum2(valueA:Int,valueB:Int,valueC:Int): Int{
    fun Int.cekAngka(){
        if (this == 0){
            throw IllegalArgumentException("Value must be higher than 0")
        }
    }
    valueA.cekAngka()
    valueB.cekAngka()
    valueC.cekAngka()

    return valueA+valueB+valueC
}