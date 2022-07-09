package com.controlflow.kotlin
//ENUM SEPERTI ARRAY YANG BERBENTUK CONSTANT
fun main(){
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

//    val cNameRED : CName = CName.RED
//    println(cNameRED)

    val test : Color = Color.RED
//    println(test)
    val color : Array<Color> = enumValues()
    color.forEach { color -> println("There is a $color") }
    val color3: Color = enumValueOf("BLUE")
    println("There is one " + Color.valueOf("GREEN") + " and $color3")
    val colorPosition : Color = Color.GREEN
    println("$colorPosition Position is ${colorPosition.ordinal}")
}

enum class Color(val value: Int){
//    RED(0xFF0000){
//                 override fun printValue(){
//                     println("value of RED is $value")
//                 }
//                 },
//    GREEN(0x00FF00){
//        override fun printValue() {
//            println("value of GREEN is $value")
//        }
//    },
//    BLUE(0x0000FF){
//        override fun printValue() {
//            println("value of BLUE is $value")
//        }
//    };
//
//    abstract fun printValue()
    BLUE(0x0000FF),
    RED(0xFF0000),
    GREEN(0x00FF00)
}
enum class Color2(val value: Int){
    //    RED(0xFF0000){
//                 override fun printValue(){
//                     println("value of RED is $value")
//                 }
//                 },
//    GREEN(0x00FF00){
//        override fun printValue() {
//            println("value of GREEN is $value")
//        }
//    },
//    BLUE(0x0000FF){
//        override fun printValue() {
//            println("value of BLUE is $value")
//        }
//    };
//
//    abstract fun printValue()
    ANU(0x0000FF),
    ANUN(0xFF0000),
    ANUNN(0x00FF00)
}

enum class CName{
    RED,GREEN,BLUE

}
