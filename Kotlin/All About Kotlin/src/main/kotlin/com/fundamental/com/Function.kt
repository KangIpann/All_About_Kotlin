package com.fundamental.com
//Function pada Kotlin ber return
//fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
//    return result
//}

//Function pada Kotlin non return
//fun functionName(param1: Type1, param2: Type2, ...): Unit {

//}

fun bio(name:String,age:String):Unit{
    println("Namamu adalah $name dan umurmu sekarang adalah $age.")
}
fun bio2(name:String,age:String):String{
    return "Namamu adalah $name dan umurmu sekarang adalah $age."
}
fun main(){
    val bio3 = bio2("Ivan","18")
    println(bio3)
    bio("Orin","16")
}