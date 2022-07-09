package com.oop.com

class AnimalNew3(Name: String, Weight: Double, Age: Int){
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean
    init {
        this.weight = if (Weight <= 0.1 ) 0.2 else Weight
        this.name =Name
        this.age = if (Age <= 0) 1 else Age
        this.isMammal = false
    }
//    Secondary Constructor
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}
fun main(){
    val dicodingCat = AnimalNew3("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = AnimalNew3("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")

}
