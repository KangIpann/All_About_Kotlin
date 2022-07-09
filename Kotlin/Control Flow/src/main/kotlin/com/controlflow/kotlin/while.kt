package com.controlflow.kotlin

fun main(){
    var counter = 1
    do{
        println("DO WHILE $counter")
        counter++

    } while (counter <= 7)
    while (counter <= 10){
        println("LOOP $counter")
        counter++
    }

}