package com.dicoding.kotlin

fun main(){
//    Contoh Variable null
    val text : String? = null
//    Cara mengelola variable null menggunakan if
    if (text != null){
        println(text.length)
    }
//    Cara mengelola variable null menggunakan safe call (?.)
    println(text?.length)
//    Cara menetapkan value dari null variable
//    Elvis Operator (?:)
    val TextLength = text?.length ?: 7
//    Atau if else
    val textLength = if (text != null) {
        text.length
    } else 7
//    non null assertion
    val text2: String? = null
    val textLength2 = text!!.length
//    non null assertion memaksa sebuah variable null menjadi non null
}