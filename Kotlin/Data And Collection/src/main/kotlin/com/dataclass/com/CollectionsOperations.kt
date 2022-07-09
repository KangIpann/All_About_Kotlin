package com.dataclass.com

fun main(){
//    Filter and filterNot()
    val numberList = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val bilanganGenap = numberList.filter { it % 2 == 0 }
    val bilanganGanjil = numberList.filterNot { it % 2 == 0 }
//    Map
    val dikaliLima  = numberList.map {it * 5}
    //    find() & firstOrNull & lastOrNull
    val firstOddNumber =  numberList.find { it % 3 == 0 }
    val firstOrNull = numberList.firstOrNull{it % 2 == 1}
    val lastOrNull = numberList.lastOrNull{it % 2 == 1}
    val ivanChar = listOf<Char>('I','V','A','N')
//    fist() & last()
    val morethan10 = numberList.first{it < 10}
    val findlast = numberList.last{it > 1}
//    sum()
    val total = numberList.sum()
//    sorted
    val urutanAlpha = ivanChar.sorted()
    val kebalikan = ivanChar.sortedDescending()
    println("Bilangan Genap : $bilanganGenap")
    println("Bilangan Ganjil : $bilanganGanjil")
    println("Kelipatan 5 : $dikaliLima")
//    Count()
    println("Jumlah Number pada List : ${numberList.count()}")
    println("Jumlah numberList berkeliatan 3 : ${numberList.count{it % 3 == 0}}")
//    find() & firstOrNull print func
    println(firstOddNumber)
    println(firstOrNull)
    println(lastOrNull)
    println(morethan10)
    println(findlast)
    println("Total Penjumlahan Angka List = $total")
    println(urutanAlpha)
    println(kebalikan)
}