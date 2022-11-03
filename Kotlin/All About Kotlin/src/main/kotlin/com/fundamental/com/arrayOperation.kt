package com.fundamental.com

fun main() {
    val siswa: Array<String> = arrayOf("Bagasena", "Oryza", "Hakim")
    val bagasena : String = siswa[0]
    val oryza : String = siswa[1]
    val hakim : String = siswa[2]
    println("Index ke 0 = $bagasena")
    println("Index ke 1 = $oryza")
    println("Index ke 2 = $hakim")
    siswa.set(0, "Rusdi")
    val rusdi : String = siswa[0]
    println("Index ke 0 setelah diubah = $rusdi")

    println("Menggunakan For")
    for (seret in siswa){
        print(" $seret")
    }
}