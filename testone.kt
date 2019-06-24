package com.example.admin.testkotlin
import java.lang.Integer.parseInt
import java.util.*

fun test(){

}
fun vars(vararg v:Int){
    for (vt in v){
        println(vt)
    }
}
fun sum (a:Int,b:Int):Int{
    return a+b
}
fun getStringLength (obj:Any):Int?{
    if (obj is String){
        return obj.length
    }
    return null
}

fun main(args: Array<String>){
    /*vars(1,2,3,4,5)
    println(sum(1,4))*/
    val sumLambda:(Int,Int)->Int={x,y->x+y}
    println(sumLambda(1,4))
    /*val a:Int=1
    val b=1
    val c:Int
    c=1*/

    var x=4
    x+=1

    var a=1
    val s1="a is $a"

   /* a=2
    val s2="${s1.replace("is","was")},but now is $a"
    println(s2);
    println(s1)*/
    /*println(a)
    println(b)
    println(c)*/
    println(x)



    var age:String?="1"
    //抛出空指针异常
    //var ages=age!!.toInt()
    //不做处理返回null
    val ages1=age?.toInt()

    val ages2=age?.toInt()?:-1
    //println(ages)
    /*println(ages1)
    println(ages2)*/
   /* if (args.size<2){
        println("two integers expected")
        return
    }
    val s=parseInt(args[0])
    val y= parseInt(args[1])

    if (x!=null && y!=null){
        println(s*y)
    }*/

    var s="hahhahah"
    println(getStringLength(s))

    for (i in 1..5) print(i)

    for (i in 1..5 step 2) println(i)

    for (i in 4 downTo 1 step 2) println(i)

    println("请输入一个整数：")
    val scannerX=Scanner(System.`in`)
    val o=scannerX.next().toString()
    println("请输入另一个数：")
    val scannerY=Scanner(System.`in`)
    val y=scannerY.next().toString()
    val u= parseInt(o)* parseInt(y)!!.toInt()
    println("两数乘积："+u.toString())
}