package com.dataclass.com

fun main(){
    val integerSet = setOf<Int>(1,4,6,2,5,2,2)
    val integerSet2 = setOf<Int>(1,4,6,2,5,2)
    val integerSet3 = setOf<Int>(7,9,4)
    val uni1and3 = integerSet.union(integerSet3)
    val intersect1and3 = integerSet.intersect(integerSet3)

//    Set juga bisa dibuat muttable seperti list dengan menambahkan mutbaleSetOf
    val mutableSet = mutableSetOf<Int>(1,4,5,12,3,4,4)
    println(integerSet == integerSet2)
    println(5 in integerSet)
    println(uni1and3)
    println(intersect1and3)

    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
println(mutableSet)
}