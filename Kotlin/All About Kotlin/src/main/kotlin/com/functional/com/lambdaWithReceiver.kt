package com.functional.com

import java.lang.StringBuilder
fun main(){
    println(buildString())
    val message = buildString2 {
        append("Hello")
        append(" Its")
        append(" DSL")
    }
    println(message)
}
//Contoh bila tidak menggunakan DSL
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello")
    stringBuilder.append(" From")
    stringBuilder.append(" Lambda")
    stringBuilder.append(" Kotlin")
    return  stringBuilder.toString()
}
//Dengan DSL. Contoh membuat Lambda dengan Receiver
fun buildString2(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}
/*
Apa itu DSL? DSL adalah sebuah bahasa komputer yang dikhususkan untuk domain aplikasi tertentu.
Ia berbeda dengan general-purpose language yang bisa diterapkan di semua domain aplikasi.
Dengan DSL, kita bisa menuliskan kode lebih ringkas dan ekspresif.
Contoh sistem yang menerapkan DSL adalah Gradle dan sistem database yang berbasis SQL.


Seperti yang Anda lihat, kita sebagai client bisa menggunakan suatu fungsi yang kompleks cukup dengan menggunakan fungsi append yang dipanggil di dalam block buildString.
Anda tidak perlu tahu bagaimana proses buildString di baliknya, yang terpenting adalah hasilnya sesuai dengan yang diharapkan.
Ini merupakan salah satu konsep dasar untuk membuat kode yang lebih simpel seperti yang diterapkan pada Gradle KTS dan Jetpack Compose.
 */