package com.tugasKelas.com.classObject

import java.util.Scanner

class Barang(Bnama: String = "Sabun",Bharga : Double = 10000.0,Bjumlah: Double = 1.0,Bdiskon: Double = 10.0)

{   var nama : String = ""
    var harga : Double = 0.0
    var jumlah : Double = 0.0
    var diskon : Double = 0.0

    init {
        this.nama = Bnama
        this.harga = Bharga
        this.jumlah = Bjumlah
        this.diskon = Bdiskon
    }

    fun tampil(){
        println("""
            Nama Barang = $nama
            Harga Barang = $harga
            Jumlah Barang = $jumlah
            Diskon = $diskon%
        """.trimIndent())
    }
    fun hitungTotal() : Double{
        diskon = (100 - diskon) / 100
        val sum = harga * jumlah * diskon
        return sum
    }
}

fun main() {
    val input = Scanner(System.`in`)
    print("Apakah Anda Ingin Menginputkan Barang? (Y/N) ")
    val confirmation = input.next()
    if (confirmation.toLowerCase() == "y"){
        print("Masukan Nama barang = ")
        val namaBarBaru = input.next()
        print("Masukan Harga barang = ")
        val hargaBarBaru = input.nextDouble()
        print("Masukan Jumlah barang = ")
        val jumlahBarBaru = input.nextDouble()
        print("Masukan Diskon barang (%) = ")
        val diskonBarBaru = input.nextDouble()
        val barangBaru = Barang(Bnama = namaBarBaru, Bharga = hargaBarBaru, Bjumlah = jumlahBarBaru, Bdiskon = diskonBarBaru)
        barangBaru.tampil()
        println("Harga total barang ${barangBaru.hitungTotal()}")
    } else if (confirmation.toLowerCase() == "n"){
        val barang = Barang()
        barang.tampil()
        println("Harga total barang ${barang.hitungTotal()}")
    } else {
        println("MASUKAN INPUT DENGAN BENAR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    }
}