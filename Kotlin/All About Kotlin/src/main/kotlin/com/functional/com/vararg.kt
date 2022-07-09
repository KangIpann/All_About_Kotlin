package com.functional.com
fun main(){
//    Array juga bisa dimasukan kedalam parameter vararg
    val numberArray = intArrayOf(12,34,5,2)
    val number = totalAngka(123,432,122,321,21,24,124,*numberArray,124,231,2)
    val numberSize = getSize(123,432,122,321,21,24,124,124,231,2)
    val namaku = namaPanjang("Arialdo", "Rivandi")
    println("Total angka dari number adalah = $number")
    println("Size dari Number adalah = $numberSize")
    println(namaku)
}
fun namaPanjang(vararg nama:String) : String {
    return "Namamu adalah ${nama.toString()}"
}
fun totalAngka(vararg number:Int) : Int {
    return number.sum()
}

fun getSize(vararg number:Int) : Int {
    return number.size
}

fun <T> asList (vararg input : T) : List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}