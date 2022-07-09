package com.fundamental.com

fun main(){
    val numberInt : Int = 92
    val IntToString = numberInt.toString()
    println("Integer = $numberInt to String is $IntToString")
//    Cara mengonversi menggunakan NamaVariable.to(jenis tipe data)
//    Number di kotlin bisa juga dituliskan dengan underscore supaya readable
    val readable = 1_000_000
    println(readable)
}