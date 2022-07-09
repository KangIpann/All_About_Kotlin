package com.dataclass.com

fun main(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "Me" to "Ivan",
        "My Crush" to "Orin<3"
    )
    println(capital["My Crush"])
    println(capital.getValue("Me"))
 /* Bedanya cuman di dalam sebuah eksekusi bila
 memakai getValue akan mengeluarkan exception eror.
  Namunn bila menggunakan indexing [] hanya akan
  mengeluarkan null value bila value yang dicari
  tidak ada */
    val keysValue = capital.keys
    val mapValues = capital.values
    println(keysValue)
    println(mapValues)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}