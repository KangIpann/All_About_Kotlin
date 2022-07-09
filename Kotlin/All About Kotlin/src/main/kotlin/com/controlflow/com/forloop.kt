package com.controlflow.kotlin

fun main(){
    val ranges = 1.rangeTo(19) step 4
    for (i in ranges){
        println("Value is $i")
    }
    println("Value with index")
    for ((index, value) in ranges.withIndex()){
        println("value $value is in position " + (index+1))
    }
    println("For Each")
    ranges.forEachIndexed{index,value ->
        println("value is $value in index $index")

    }
}