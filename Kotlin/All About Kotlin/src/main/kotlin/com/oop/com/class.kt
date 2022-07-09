package com.oop.com

class Animal(var name: String,
             var weight: Double,
             var age: Int,
             var isMamal: Boolean
) {
    var habits: String = "turu"
        get() {
            println("Habits telah di get")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
    fun eat(){
        println("$name makan!")
    }
    fun sleep(){
        println("$name TIDOOOOOOOR!")
    }
//    ExtensionProperty

}

class AnimalSitoke{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}
val kewanku = Animal(
    "satir",
    66.1,
    100,
    true
)

val Animal.getAnimalInfo:String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMamal}"

fun main(){
    kewanku.eat()
    println("Tak kenalno. Iki kewanku jenenge ${kewanku.name} bobote ${kewanku.weight} umure wis ${kewanku.age}. Lek kon takok de e mamalia po duduk. de e ki jane mamal. rill ${kewanku.isMamal}")
//    ---PROPERTIES---
//    getter
    println("Nama: ${kewanku.name}")
//    setter
    kewanku.name = "sengklek"
    println("Jenenge maleh: ${kewanku.name}")
    val kelakuan = kewanku.habits
    println("Kelakuan e $kelakuan")
    kewanku.habits = "mangan"
    println("Saiki kewanku sik ${kewanku.habits}")
}