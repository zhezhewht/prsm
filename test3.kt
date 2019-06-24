package com.example.admin.testkotlin

fun main (args:Array<String>){
   /* var a=1
    var b=2
    var max=a
    if (a<b) max=b
    println(max)
    val items= setOf("apple","banana","kiwi")
    when{
        "orage" in items -> println("juicy")
        "apple" in items -> print("apple is fine too")
    }*/
    var x=0
    when (x){
        0,1 -> println("x==0 or x==1")
        else -> println("otherwise")
    }

    when(x){
        1-> println("x==1")
        2-> println("x==2")
        else->{
            println("x 不是1，也不是2")
        }
    }

    when (x){
        in 0..10 -> println("x 在改区间范围内")
        else -> println("x 不在改区间内")
    }


}