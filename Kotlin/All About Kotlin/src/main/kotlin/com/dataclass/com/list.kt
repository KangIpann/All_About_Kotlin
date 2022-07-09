package com.dataclass.com

import javax.xml.crypto.Data


fun main(){
    val numberList : List<Int> = listOf(1,54,2,31,2)
    val charList = listOf('a','b','v')
    val randomList = listOf(1,2,3.2,"Anu", 'k',true, DataUser("mbuh",1))
    val muttable = mutableListOf<Any>(123,43,41,34.2)
    muttable.add('d')
    muttable.add(1,2)
    muttable[4] = true
    muttable.removeAt(0)
    println(randomList[2])
}