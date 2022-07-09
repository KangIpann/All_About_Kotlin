package com.generics.com
/*
Dalam penerapan generic, kita bisa membatasi tipe apa saja yang dapat digunakan
sebagai parameter. Untuk menentukkan batasan tersebut, bisa dengan menambahkan
tanda titik dua (:) setelah tipe parameter yang kemudian diikuti oleh tipe yang
akan dijadikan batasan. Contohnya seperti berikut:
 */
fun main(){
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Double>()
//    val numbers3 = ListNumber<String>() EROR
    val list = listOf(1,2,3,4,5)
    list.sumNumber()
    val names = listOf("dicoding", "academy")
//    names.sumNumber() // error : inferred type String is not a subtype of Number

}

fun <T : Number> kotlin.collections.List<T>.sumNumber() : T {
    TODO("Not yet implemented")
}

class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}