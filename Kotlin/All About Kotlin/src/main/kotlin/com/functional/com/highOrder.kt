package com.functional.com
fun main(){
    printResult(10, sum5)
    printResult(20){ value ->
        value+value
    }
}
fun printResult(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}

var sum5: (Int) -> Int = { value -> value + value }
/*
Konsep ini dinamakan sebagai Higher-Order Function,
yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter,
menjadikan tipe kembalian, ataupun keduanya. Yang perlu diperhatikan adalah,
jika argumen terakhir dari fungsi merupakan sebuah lambda expression,
maka lambda expression tersebut ditempatkan di luar parenthesis
seperti pada contoh kode di atas.

 Sebelumnya

 */