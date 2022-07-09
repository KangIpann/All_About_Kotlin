package com.dataclass.com

//    Cara Penggunaan dan Cara penulisan
    class User(val name : String, val age : Int){
    //        Cara menuliskan class seperti data class
    override fun toString(): String {
        return "User(name=$name, age=$age)"
        }
//    Cara Menambahkan fungsi equal supaya value dapat dibandingkan
    override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as User

    if (name != other.name) return false
    if (age != other.age) return false

    return true
}

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
    }
    data class DataUser(val name : String, val age : Int)

    fun main(){
        val user = User(" Ivan" , 17)
        val dataUser = DataUser(" Ivan", 17)

        val dataUser1 = DataUser("nrohmen", 17)
        val dataUser2 = DataUser("nrohmen", 17)
        val dataUser3 = DataUser("dimas", 24)
        val dataUser4 = dataUser.copy(age = 42)

//        val name = dataUser.component1()
//        val age = dataUser.component2()
        val (name, age) = dataUser

        println()
        println(user)
        println(dataUser)

        println()
        println(dataUser1.equals(dataUser2))
        println(dataUser1.equals(dataUser3))
        println()
        println(dataUser4)
        println()
        println("My name is $name, I am $age years old")
        println()
        val userData = UserData("Ivan", 22)
        userData.intro()
        }
    data class UserData(val name : String, val age : Int){
        fun intro(){
            println("My name is $name, I am $age years old")
        }
    }
