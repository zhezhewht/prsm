package com.example.admin.testkotlin

class person {
    var lastName:String="zhang"
    get()=field.toUpperCase()
    set
    var no:Int=100
    get() = field
    set(value) {
        if (value<10){
            field=value
        }else{
            field=-1
        }
    }

    var heiht:Float =145.4f
    private set
}

fun main(args: Array<String>) {
    var p:person= person()
    p.lastName="wang"

    println("lastName:${p.lastName}")

    p.no=9

    println("no:${p.no}")

    p.no=20
    println("no:${p.no}")
}