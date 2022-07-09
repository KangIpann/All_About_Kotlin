package com.functional.com
fun main(){
    val fullName = getFullName(first = "Anu")
    println(fullName)
}
fun getFullName(
    first: String = "Tolong",
    second: String = "Isikan",
    third : String = "Nama",
    fourth : String = "Mu") : String{
    return "$first $second $third $fourth"
}