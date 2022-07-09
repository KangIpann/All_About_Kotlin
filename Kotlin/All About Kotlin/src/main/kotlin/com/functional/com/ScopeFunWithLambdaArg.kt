package com.functional.com

// let menggunakan argumen it
/*
Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null. Contohnya seperti di bawah ini
 */
fun main(){
    val message: String? = null
//    Dengan menggunakan fungsi length akan mengurangi penggunaan safe call / "?"
    message?.let{
        val length = it.length * 2
        val text = "text length $length"
        println(text)

    } ?: run { //menggunakan elvis operator dan run function
        val text = "message is null"
        println(text) //mengembalikan nilai Unit
    }
//    Tanpa menggunaan fungsi let
    val messageNoLet: String? = null
    val length = messageNoLet?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

//    Fungsi Also dengan argumen it
//    Also juga sama seperti Apply pada This
    val textAlso = "Hello Kotlin"
    val result = textAlso.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")
}