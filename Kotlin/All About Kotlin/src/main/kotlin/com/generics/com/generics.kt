package com.generics.com
fun main(){
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
    
}
class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}