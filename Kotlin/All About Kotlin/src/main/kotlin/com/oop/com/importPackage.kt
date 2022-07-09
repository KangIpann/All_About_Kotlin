package com.oop.com

import kotlin.random.Random
import kotlin.math.PI
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar
import com.dicoding.utils.*
fun main() {
    val something = Random(1).nextInt(1, 1100)
    println(something)
    println(PI)
    println(cosinus(120.0))
    println(akar(9.0))
    sayHello()
    println(factorial(4.0))
    println(pow(3.0, 2.0))
    println(PI)
    println(areaOfCircle(13.0))
    /*
    Dengan memanggil fungsi areaOfCircle() maka kita menggunakan seluruh fungsi dan
    variabel yang berada pada package com.dicoding.oop.utils, sehingga import package
    cukup dilakukan dengan menggunakan tanda bintang (*).
     */
}