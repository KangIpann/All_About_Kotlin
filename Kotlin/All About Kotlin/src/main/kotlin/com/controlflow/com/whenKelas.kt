package com.controlflow.com

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Berat Badan: ")
    val bb = input.nextDouble()
    print("Tinggi badan (cm): ")
    val tb = input.nextDouble()
    print("Jenis Kelamin(L/P): ")
    val jk = input.next()
    println("")

    val tinggiMeter = tb / 100
    val bmi = bb / (tinggiMeter * tinggiMeter)
    if (jk.toLowerCase() == "l") {
        print("Berat badan anda tergolong ")
        when {
            bmi >= 27.0 -> print("Obesitas")
            bmi >= 23 && bmi < 27 -> print("Gemuk")
            bmi >= 17 && bmi <= 23 -> print("Normal")
            bmi < 17 -> print("Kurus")
        }
        println(" sebagai laki laki")
        println("BMI anda adalah = $bmi")
    } else if (jk.toLowerCase() == "p"){
        print("Berat badan anda tergolong ")
        when {
            bmi >= 27.0 -> print("Obesitas")
            bmi >= 25 && bmi < 27 -> print("Gemuk")
            bmi >= 18 && bmi <= 25 -> print("Normal")
            bmi < 18 -> print("Kurus")
        }
        println(" sebagai wanita")
        println("BMI anda adalah = $bmi")
    }
}