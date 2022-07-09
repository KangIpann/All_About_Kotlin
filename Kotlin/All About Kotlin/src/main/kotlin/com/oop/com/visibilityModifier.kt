package com.oop.com

/*
Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.

Private: Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada scope yang sama.

Protected: Hak akses yang cakupannya terbatas pada hirarki kelas. Anggota hanya dapat diakses pada kelas turunannya atau kelas itu sendiri.

Internal: Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat diakses diluar dari modulnya tersebut.
 */

//Private
private var name: String = "Ivan"
class AnimalPrivate(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean){
    fun getName() : String {
        return name
    }
    fun setName(newName: String){
        name = newName
    }
}
//Protected
open class AnimalOpen(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : AnimalOpen(pName,pWeight)
//Internal
internal class AnimalInter(val name: String)

fun main(){
    val mycat = AnimalPrivate("Kirek", 2.5, 2, true)
    println(mycat.getName())
    mycat.setName("Jordan")
    println(mycat.getName())
    val newCat = AnimalInter("Mew")
    println(newCat.name)
}