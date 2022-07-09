package com.oop.com

import java.lang.Exception

fun main(){
    val someNullVal : String? = null
    lateinit var someMustNotNullVal: String

    try {
        someMustNotNullVal = someNullVal!!
        println(someMustNotNullVal)
    } catch (e: Exception){
        someMustNotNullVal = "Nilai nya null"
        println(someMustNotNullVal)
    }finally {
        println(someMustNotNullVal)
    }
        val someStringValue: String? = null
        var someIntValue: Int = 0

        try {
            someIntValue = someStringValue!!.toInt()
        } catch (e: NullPointerException) {
            someIntValue = 0
        } catch (e: NumberFormatException) {
            someIntValue = -1
        } finally {
            when(someIntValue){
                0 -> println("Catch block NullPointerException terpanggil !")
                -1 -> println("Catch block NumberFormatException terpanggil !")
                else -> println(someIntValue)
            }
        }

}