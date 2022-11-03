package com.tugasKelas.com

import com.dicoding.utils.pow
import java.util.Scanner

fun pangkat(a : Double, b : Double) : Double{
    val result: Double = pow(a,b)
    return result
}
fun main() {
    val input = Scanner(System.`in`)
    print("Masukan Angka ")
    val angka = input.nextDouble()
    print("Masukan Pangkat ")
    val pangkat = input.nextDouble()
    println(pangkat(angka, pangkat))
}