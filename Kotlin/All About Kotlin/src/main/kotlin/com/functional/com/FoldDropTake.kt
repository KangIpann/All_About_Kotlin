package com.functional.com
val numbers = listOf(1,2,3,4,5,6)
//Fold
val fold = numbers.fold(10){current, item->
    println("Current $current")
    println("item $item")
    println()
    current + item

}
val foldRight = numbers.foldRight(10){item, current->
    println("Current $current")
    println("item $item")
    println()
    current + item

}
//Drop
val drop = numbers.drop(3)
val dropLast = numbers.dropLast(3)
//Take pada dasarnya mirip dengan drop yaitu menyaring item pada collection
val take = numbers.take(3)
val takeLast = numbers.takeLast(3)
fun main(){
    println("Fold final result: $fold")
//    Perbedaan Fold right terdapat pada proses iterasi dimulai dari index terakhir
//    dan Posisi parameter akan dimulai dari kanan
    println("Fold final result (Right): $foldRight")
    println()
//    Drop
    println("Dari list $numbers kita memangkas 3 angka awal menjadi $drop")
    println("Dari list $numbers kita memangkas 3 angka akhir menjadi $dropLast")
    println()
//    Take
    println("Dari list $numbers kita menyaring 3 angka akhir menjadi $take")
    println("Dari list $numbers kita menyaring 3 angka awal menjadi $takeLast")
}
