package com.oop.com

class Ivan(private var name : String){
    fun eat(){
        println("$name lagi makan")
    }
    fun eat(typeFood : String){
        println("$name lagi makan $typeFood")
    }
    fun eat(typeFood : String,quantity: Int){
        println("$name lagi makan $typeFood $quantity porsi")
    }
    fun sleep() {
        println("$name tidur!")
    }
}
class Calculator{
    fun add(value1: Int, value2: Int) = value1 + value2
    fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
    fun add(value1: Double, value2: Double) = value1 + value2
    fun add(value1: Float, value2: Float) = value1 + value2

    fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
}
fun main(){
    val me = Ivan("Ivan")
    me.eat()
    me.eat("Sate")
    me.eat("Sate", 2)

    val calc = Calculator()

    println(calc.add(2, 4))
    println(calc.add(2.5, 2.2))
    println(calc.add(6f, 7f))
    println(calc.add(1, 2, 3))

    println(calc.min(9, 2))
    println(calc.min(17.2, 18.3))

}