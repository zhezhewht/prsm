package com.example.admin.testkotlin

class People () {
    var lastName:String="zhang"
       get() = field.toUpperCase()//将变量赋值后转换为大写
       set
    var no: Int =100
      get() = field
      set(value) {
          if (value<10) {
              field=value
          }else{
              field=-1
          }
      }
    var heiht:Float =145.4f
      private set
}

fun main(args: Array<String>) {
    var p:People= People()

    p.lastName="wang"
    println("lastName:${p.lastName}")

    p.no=9
    println("no:${p.no}")

    println("height:${p.heiht}")
}