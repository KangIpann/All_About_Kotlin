package com.controlflow.kotlin

fun main(){
    val intList = listOf(1,2,3,null,4,null)
println("With continue")
    for (i in intList){
        if (i == null) continue
        println(i)
    }
    println("With Break")
    for (i in intList){
        if (i == null) break
        println(i)
    }

    /*
    Pada Kotlin, sebuah expression dapat ditandai dengan sebuah label.
    Label pada Kotlin memiliki sebuah identifier yang diikuti dengan tanda @.
    Contoh dari sebuah label adalah foo@ atau bar@.

     */
    println()
    loop@ for (i in 1..10){
        println("Outside Loop")

    for (j in 1..10) {
        println("Inside Loop $j")
        if (j >= 5) break@loop
        }
    }
}