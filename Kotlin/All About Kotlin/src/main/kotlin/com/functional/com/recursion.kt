package com.functional.com
fun main(){
    println("Factorial is: ${factorial2(9)}")
    println("Factorial is: ${factorial3(9)}")
}
fun factorial(n: Int): Int {
    return if (n == 1){
        n
    } else{
        var result = 1
        for (i in 1..n){
            result *= i
        }
        result
    }
}
fun factorial2(n: Int): Int {
    return if (n == 1){
        n
    } else{
        n * factorial2(n -1)
    }
}

//Tailrec tidak bisa digunakan di dalam blok try catch finally
tailrec fun factorial3(n: Int, result: Int = 1): Int{
    val newResult = n * result
    return if (n == 1){
        newResult
    } else {
        factorial3(n - 1, newResult)
    }
}
