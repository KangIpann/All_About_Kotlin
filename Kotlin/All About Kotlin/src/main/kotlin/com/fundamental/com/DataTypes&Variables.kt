package com.fundamental.com
fun main(){
    //Before Identifier
    //var identifier: Type = initialization
    var company: String = "Dicoding"
    //Var adalah jenis variable yang bisa diubah
    //Contoh
    company = "Yo nda tau"
    val anu: String = "Gimana to"
    //Val adalah jenis variable yang tidak bisa diubah
    //Contoh
    //anu = "heh"
    println("VAL AND VAR")
    val valueA = 90
    val valueB = 89
    println(company + " " + anu)
    println(valueA + valueB)

    //Variable
    //Char
    //Char adalah sebuah string yang tunggal
    var char = 'A'
    var i = 1
    println("=====CHAR + INCREMENT=====")
    println("Char " + i++ + char++)
    println("Char " + i++ + char++)
    println("Char " + i++ + char++)
    println("Char " + i++ + char++)
    println("Char " + i++ + char++)
    println("Char " + i++ + char++)
    println("Char " + i++ + char++)
    println("Char " + i++ + char++)
    println("Char " + i++ + char++)
//    String and Indexing
    val nama = "Ivan"
    val inisial = nama[0]
    val statement = "Kotlin is \"Awesome!\""
    println("Halo nama saya $nama. Berinisial $inisial.$statement")
    for (char in nama){
        print("$char ")
    }
    println()
//    Raw String """
    println("""
        Aku
        Gatau
        Aku
        Siapa
    """.trimIndent())


}
