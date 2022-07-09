package com.functional.com

import java.lang.StringBuilder


fun main(){
    val text = "Hello"
    //Run menggunakan receiver this
    val resultRun = text.run {
        val from = this
        val to = this.replace("Hello","Kotlin")
        "replace text from $from to $to. New value from text is $to"
    }
    println("result : $resultRun")

    val message = "Hello Kotlin!"
    //With menggunakan receiver this
    val resultWith = with(message){
        println("value is $this")
        println("with length ${this.length}")
        "First character is ${this[0]}" +
            " and last character is ${this[this.length - 1]}"
        //Fungsi with sendiri disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan nilai kembalian.
    }
    println(resultWith)
//    apply menggunakan receiver this
//    Contoh dibawah adalah tanpa menggunakan fungsi apply
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")
//    Contoh dibawah adalah menggunakan fungsi apply
    val messageApply = StringBuilder().apply {
        append("Hello ")
        append("Orin!")
    }
    println("Tanpa Menggunakan Apply = ${builder.toString()}")
    println("Dengan Menggunakan Apply = ${messageApply.toString()}")
}
