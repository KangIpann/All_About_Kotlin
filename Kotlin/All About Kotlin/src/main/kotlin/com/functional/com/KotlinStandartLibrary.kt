package com.functional.com

import java.lang.StringBuilder

// Kata Kunci This fungsi yang menggunakan lambda receiver adalah run, with, dan apply
/*
Cara ini memiliki kekurangan yaitu kita tidak dapat membedakan objek receiver dengan objek yang berada dari luar lingkup fungsi tersebut.
Alih-alih, cara ini lebih ditujukan untuk operasi objek itu sendiri,
seperti memanggil fungsi dan inisialisasi nilai dari anggota yang menjadi bagian dari objek tersebut.
 */
fun main(){
    val buildString = StringBuilder().apply {
        append("Hello")
        append(" Why")
    }
    println(buildString)

    val text = "Hello"
    text.let { value -> //Standart nya variabel nya akan bernama "it"
        val message = "$value Kotlin"
        println(message)
    }
}

/*
Fungsi inilah yang dinamakan sebagai scope function. Beberapa fungsi yang berada di dalamnya antara lain let, run, with, apply, dan also.
Pada dasarnya beberapa fungsi tersebut melakukan tugas yang sama yaitu mengeksekusi blok kode dari dalam sebuah objek.
Yang membedakannya adalah bagaimana objek tersebut tersedia dan seperti apa hasil yang didapat dari seluruh expression yang berada di dalam blok.
 */