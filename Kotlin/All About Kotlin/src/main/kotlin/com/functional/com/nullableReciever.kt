package com.functional.com
fun main(){
    val value: Int? = null

    println(value?.slice2)
    println(value.slice)
}
val Int?.slice:Int
    get() = if(this == null) 0 else this.div(2)

val Int.slice2: Int
    get() = this?.div(2) ?:0