package com.tugasKelas.com.classObject

import java.util.*

fun kalkulatorTambah(a : Double , b : Double) : Double{
    val sum = a + b
    return sum
}
fun kalkulatorKurang(a : Double , b : Double) : Double{
    val sum = a - b
    return sum
}
fun kalkulatorKali(a : Double , b : Double) : Double{
    val sum = a * b
    return sum
}
fun kalkulatorBagi(a : Double , b : Double) : Double{
    val sum = a / b
    return sum
}
fun main() {
    var loop = true
    while (loop){
        println("Selamat Datang Di Aplikasi Kalkulator Sederhana")
        println("Kamu dapat memilih operasi Penjumlahan,Pengurangan,Perkalian,dan Pembagian ")
        val input = Scanner(System.`in`)
        print("""
        ---Pilih Operasi Aritmatika---
        1|Penjumlahan
        2|Pengurangan
        3|Perkalian
        4|Pembagian
        Pilihan Kamu : 
    """.trimIndent() )
        val pilihan = input.next()
        print("Masukan angka pertama : ")
        val angka1 = input.nextDouble()
        print("Masukan angka kedua : ")
        val angka2 = input.nextDouble()
        when (pilihan){
            "1" -> println("Hasil dari penjumalahn $angka1 dan $angka2 adalah ${kalkulatorTambah(angka1,angka2)}")
            "2" -> println("Hasil dari pengurangan $angka1 dan $angka2 adalah ${kalkulatorKurang(angka1,angka2)}")
            "3" -> println("Hasil dari perkalian $angka1 dan $angka2 adalah ${kalkulatorKali(angka1,angka2)}")
            "4" -> println("Hasil dari pembagian $angka1 dan $angka2 adalah ${kalkulatorBagi(angka1,angka2)}")
            else -> {
                println("Input Tidak Benar")
                println("-------Mengulangi Kalkulator-------")
                println()
                continue
            }
        }
        print("Ingin mengulangi kalkulator? (Y/N) ")
        val confirmation = input.next()
        if (confirmation.toLowerCase() == "y"){
            println()
            continue
        } else if (confirmation.toLowerCase() == "n"){
            println("Baiklah. Semoga harimu menyenangkan!")
            loop = false
        }
    }
}