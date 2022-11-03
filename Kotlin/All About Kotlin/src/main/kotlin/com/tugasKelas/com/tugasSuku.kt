package com.tugasKelas.com

fun main() {
    println("Menggunakan While Loops")

    val batas = 10
    var sukuPertama = 5
    var counter =  1
    while (batas >= counter){
        println("$sukuPertama  -  adalah suku ke $counter" )
        sukuPertama += 6
        counter++
    }

    println("Menggunakan For Loops")
    val sukuAwal = 5
    val selisih = 6
    val banyak = 10
    for (i in sukuAwal..sukuAwal + selisih * banyak - 1 step 6) {
        print("$i ")
    }


}