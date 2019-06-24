package com.example.admin.testkotlin

fun main (args: Array<String>){
    val i=10
    val s="i=$i"
    println(s)
    val x="runoob"
    val str="$x.length is ${s.length}"
    println(str)
    val price="""
    ${'$'}9.99
    """
    println(price)
}