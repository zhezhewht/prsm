package com.example.admin.testkotlin

fun main() {
    val items= listOf("apple","banana","kiwi")
   for (item in items){
       println(item)
   }
    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }

    var x=5
    while (x>0){
        println(x--)
    }
    println("------------")
    var y=5
    do {
        println(y--)
    }while (y>0)

    for (i in 1..10){
        if (i==3) continue
        println(i)
        if (i>5) break
    }
    println("------------------")

    loop@ for (i in 1..10){
        for (j in 1..10){
            println("*")
            break@loop
        }
    }


}