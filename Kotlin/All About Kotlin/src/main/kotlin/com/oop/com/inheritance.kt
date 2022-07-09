package com.oop.com

//Inhertiance
//Parent class
// Mewarisi kelas harus menggunakan parent class dengan format open class
open class animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){
    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}
//class myCat mewarisi class animal dengan cara menggunakan tanda : setelah parameter
class myCat(pName : String, furColor : String, pWeight:Double, pAge : Int,pNumberOfFeet : Int, pIsCarnivore : Boolean ) : animal(pName, pWeight, pAge, pIsCarnivore){
    fun playWithHuman(){
        println("$name bermain bersama Manusia !")
    }
    override fun eat(){
        println("$name sedang makan iwak")
    }
    override fun sleep(){
        println("$name sedang tidur di bantal")
    }
}
fun main(){
    val ivanscat = myCat("Meong", "White", 3.4, 4,4,true)

    ivanscat.playWithHuman()
    ivanscat.eat()
    ivanscat.sleep()
}