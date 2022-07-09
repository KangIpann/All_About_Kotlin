package com.oop.com

import kotlin.reflect.KProperty
class AnimalD{
    var name: Any by delegateAny()
    var weight: Any by delegateAny()
    var age: Any by delegateAny()
}
class Aku{
    var name: Any by delegateAny()
    var weight: Any by delegateAny()
    var age: Any by delegateAny()

}
class Dia{
    var name: Any by delegateAny()
    var weight: Any by delegateAny()
    var age: Any by delegateAny()


}

class delegateAny{
    private var value: Any  = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : Any{
        println("Fungsi ini sama seperti getter untuk property ${property.name} pada kelas $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
        println("Fungsi ini sama seperti setter untuk merubah property ${property.name} pada kelas $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}
fun main(){
    val kewan = AnimalD()
    kewan.name = "Singo"
    kewan.age = 100
    kewan.weight = 90.2
    println("Jenenge ${kewan.name}")
    println("Umure ${kewan.age}")
    println("Bobote ${kewan.weight}")

}