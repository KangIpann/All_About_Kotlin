package com.generics.com
abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)
fun main() {
    val carList = listOf<Any>(Car(100), Car(130))
    val vehicleList = carList

    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle
}
//Covariant
interface ListCO<out E> : Collection<E>{
    operator fun get(index: Int): E
}
//Contravariant
interface Comparable<in T>{
    operator fun compareTo(other: T): Int
}