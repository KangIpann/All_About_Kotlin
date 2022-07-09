package com.dicoding.kotlin

fun main(){
    val array1 = intArrayOf(1,2,3)
    val mixArray = arrayOf(1,3,"YNTKTS",7,true,9.23)
//    Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan memanfaatkan beberapa fungsi spesifik berikut:
//
//intArrayOf() : IntArray
//
//booleanArrayOf() : BooleanArray
//
//charArrayOf() : CharArray
//
//longArrayOf() : LongArray
//
//shortArrayOf() : ShortArray
//
//byteArrayOf() : ByteArray
    val intArray = intArrayOf(1,23,3)
    println("Array index ke 3 dari IntArray adalah" + intArray[2])
//    notes: Indexing dimulai dari nol 0
//    kita juga bisa mengubahnya
    intArray[2] = 4
    println(intArray[2])

    val intArrayBaru = Array(4,{i -> i*i})
    print(intArrayBaru[0])
    print(intArrayBaru[1])
    print(intArrayBaru[2])
    print(intArrayBaru[3])

}