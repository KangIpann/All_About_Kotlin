package com.functional.com
val index = listOf<Int>(2,5,4,8)
val total = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
val simmilar = listOf<Int>(1,4,7,2,3,56,1,3,5,1,3,5,2,1)
data class Item(val key: String, val value: Any)

val items = listOf(
    Item("1","Kotlin"),
    Item("2","Anu"),
    Item("3","Is"),
    Item("2","Awesome"),
    Item("1","Mbuh"),
    Item("3","Oposih"),
    Item("4","lah"),
    Item("1","ngeod")
)
val distinctItems = items.distinctBy { it.key }
val text = listOf("A","AA","BBB","BBB","CCCC","CCCC","DDDDD","DDDDD")
val word = "QWERTY"
//Slice memulai pemotongan dari index menggunakan range
val slice = total.slice(3..6 step 2)
val sliceVar = total.slice(index)
//distinct untuk memfilter setiap value yang sama
val filter = simmilar.distinct()
val distinct = text.distinctBy {
    it.length
}
//chunked
val chunked = word.chunked(3)
val chunkedTransform = word.chunked(3){
    it.toString().toLowerCase()
}
fun main(){
    println(slice)
    println(sliceVar)
    println(filter)
    distinctItems.forEach{
        println("${it.key} with value ${it.value}")
    }
    println(distinct)
//    chunked
    println(chunked)
    println(chunkedTransform)
}