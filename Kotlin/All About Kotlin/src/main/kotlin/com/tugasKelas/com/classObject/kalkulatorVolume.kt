package com.tugasKelas.com.classObject

import java.util.*
fun volumeKubus(a : Double ) : Double{
    val sum = a * a * a
    return sum
}
fun volumeBalok(a : Double , b : Double , c : Double) : Double{
    val sum = a * b * c
    return sum
}
fun luasPersegi(a : Double) : Double{
    val sum = a * a
    return sum
}
fun luasPersegiPanjang(a : Double , b : Double) : Double{
    val sum = a * b
    return sum
}
fun main() {
    var loop = true
    while (loop){
        println("Selamat Datang Di Aplikasi Kalkulator Volume Sederhana")
        println("Kamu dapat memilih operasi perhitungan Volume Kubus/Balok dan Luas Persegi/Persegi Panjang")
        val input = Scanner(System.`in`)
        print("""
        ---Pilih Operasi Aritmatika---
        1|Volume Kubus
        2|Volume Balok
        3|Luas Persegi
        4|Luas Persegi Panjang
        Pilihan Kamu : 
    """.trimIndent() )
        val pilihan = input.next()

        when (pilihan){
            "1" ->{
                print("Masukan panjang rusuk kubus : ")
                val angka1 = input.nextDouble()
                println("Hasil volume kubus dari panjang rusuk $angka1 adalah ${volumeKubus(angka1)}")
            }
            "2" ->{
                print("Masukan lebar balok: ")
                val angka1 = input.nextDouble()
                print("Masukan panjang balok: ")
                val angka2 = input.nextDouble()
                print("Masukan tinggi balok: ")
                val angka3 = input.nextDouble()
                println("Hasil volume balok dari panjang $angka1,lebar $angka2, tinggi $angka3 adalah ${volumeBalok(angka1,angka2,angka3)}")
            }
            "3" -> {
                print("Masukan panjang sisi persegi : ")
                val angka1 = input.nextDouble()
                println("Hasil luas persegi dari panjang sisi $angka1 adalah ${luasPersegi(angka1)}")
            }
            "4" -> {
                print("Masukan panjang persegi panjang : ")
                val angka1 = input.nextDouble()
                print("Masukan lebar persegi panjang : ")
                val angka2 = input.nextDouble()
                println("Hasil luas persegi panjang dari panjang $angka1 dan lebar $angka2 adalah ${luasPersegiPanjang(angka1,angka2)}")
            }
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
        } else {
            println("Input Tidak Benar!")
            println("Mematikan Kalkulator")
            break
        }
    }
}