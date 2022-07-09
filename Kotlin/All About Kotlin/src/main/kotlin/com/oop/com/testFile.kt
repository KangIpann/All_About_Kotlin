package com.oop.com

class Bird(override val numberOfAngle: Int) : IFly{
    override fun fly() {
        val range = 1..numberOfAngle
        val check = when(numberOfAngle){
            1 -> println("I Fly with an angle")
            in range -> println("I Fly with some angle")
            else -> println("I fly without an angle")
        }
        println(check)
    }
}
fun main(){
    val manuk = Bird(2)
    manuk.fly()
//    Module
    com.dicoding.utils.sayHello()
}