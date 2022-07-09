package com.oop.com
fun main(){
    val myPet = AnimalNew("Asu", 0.1, 0, false)
    println("Nama: ${myPet.name}, Berat: ${myPet.weight}Kg, Umur: ${myPet.age}, mamalia: ${myPet.isMammal}")
}
class AnimalNew(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean
    init {
        weight = if (pWeight <= 0.1 ) 0.2 else pWeight
         name = pName
         age = if (pAge <= 0) 1 else pAge
         isMammal = pIsMammal
    }
}
class AnimalNew2(Name: String, Weight: Double, Age: Int){
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean
    init {
        this.weight = if (Weight <= 0.1 ) 0.2 else Weight
        this.name =Name
        this.age = if (Age <= 0) 1 else Age
        this.isMammal = true
    }
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

//class Animal(var name: String,
//             var weight: Double,
//             var age: Int,
//             var isMamal: Boolean
//)
//Parameter di dalam class termasuk Primary constructor
//Dimana kita harus mengirim nilai pada pembuatan objek dari class AnimalNew
//Kita juga bisa menambahkan nilai deafult dari Primary Constructor supaya kita bisa mengirim nilai yang kosong saja
/*
Kata kunci this tersebut merujuk kepada suatu kelas dimana jika kita menggunakannya diikuti dengan nama properti maka kita menunjuk pada properti yang terdapat pada kelas tersebut.
Dengan begitu, tidak akan ada ambiguitas walaupun kita menggunakan penamaan yang sama antara properti dan parameter primary constructor.
 */