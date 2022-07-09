package com.controlflow.kotlin

import kotlin.random.Random

fun main (){
    val value = 9

    val check = when (value){
//        !is Int ->{
//            println("The value is Integer")
//        }
        6 -> {
            println("Six")
            "Value is $value"
        }
        7 ->{
            println("Seven")
            "Value is $value"
        }
        8 ->{
            println("Eight")
            "Value is $value"
        }

        else -> {
            println("Not Found")
            "The value is not in the data"
        }
    }
    val number = 55
    val range = 10..100
    val rangeCheck = when(number){
        in range -> println("Your number is in range")
        !in range -> println("Your number is not in range")
        else -> println("Unkown input")
    }
    println(check)
    println(rangeCheck)

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> {
            println(50 * regis)

        }

        in 51..100 -> {
            println(100 * regis)

        }
        else -> println(regis)
    }

}

fun getRegisterNumber() = Random.nextInt(100)