package com.oop.com

 /*
 Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program. Pada
 Kotlin semua exception bersifat Unchecked, yang artinya exception terjadi karena
 kesalahan pada kode kita. Berikut ini beberapa contoh Unchecked Exception yang sering
  mengganggu jalannya program kita:

ArithmeticException
ArithmeticException merupakan exception yang terjadi karena kita membagi suatu
bilangan dengan nilai nol. Berikut merupakan contoh kode yang dapat membangkitkan
ArithmeticException.
fun main() {
    val someValue = 6
    println(someValue / 0)
}

/*
output:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
*/
NumberFormatException
NumberFormatException disebabkan karena terjadi kesalahan dalam format angka. Sebagai
contoh, kita akan mengubah sebuah nilai String menjadi Integer tetapi nilai String
yang akan kita ubah tidak memiliki format angka yang benar, sehingga dapat
membangkitkan NumberFormatException. Berikut contoh kodenya:

fun main() {
    val someStringValue = "18.0"
    println(someStringValue.toInt())
}

/*
output:
    Exception in thread "main" java.lang.NumberFormatException: For input string: "18.0"
*/

NullPointerException
Dan yang terakhir adalah NullPointerException atau NPE. Walaupun Kotlin memiliki
operator Null Safety, NPE tetap bisa saja terjadi. NPE terjadi karena sebuah variabel
atau objek memiliki nilai null, padahal seharusnya objek atau variabel tersebut
tidak boleh null. Berikut contoh kasus yang dapat menyebabkan NullPointerException:
fun main() {
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}

/*
output:
    Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
*/
  */
