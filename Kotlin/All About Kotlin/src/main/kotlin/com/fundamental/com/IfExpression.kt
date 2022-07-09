package com.fundamental.com

fun main(){
    val open = 7
    val closed = 21
    val hours = 22

    if (open < hours && hours < closed){
        println("Coffeshop is opened!")
    } else if (closed > hours && open < hours){
        println("Coffeshop is opened!")
    } else if(open == hours){
        println("Wait a minute. Coffeshop will be open")
    } else if (open > hours || closed < hours){
        println("Coffeshop is closed!")
    }
}
