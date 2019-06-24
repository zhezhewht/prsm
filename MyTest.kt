package com.example.admin.testkotlin

import android.os.TestLooperManager
import org.jetbrains.annotations.TestOnly
import javax.security.auth.Subject

public class MyTest constructor(name:String){

    var url:String="http://www.runoob.com"
    var country:String ="CN"
    var siteName=name
    init {
        println("初始化网站名称：${name}")
    }
    fun printTest(){
        println("我是类函数")
    }

    class Nested{
        var ot:MyTest= MyTest("jack")

        fun foo()=2
    }
    inner class Inner{
        fun foo()= country
        fun innerTest(){
            var o=this@MyTest
            println("内部类可以引用外部类成员")
        }
    }
}

fun main(args: Array<String>) {
    val runoob=MyTest("菜鸟")
    val demo=MyTest.Nested();
    println(demo.foo())
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
    val demo2=MyTest("zhang").Inner();
    demo2.innerTest()
}