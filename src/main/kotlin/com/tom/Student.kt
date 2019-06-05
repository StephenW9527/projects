package com.kotlin

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Student("Tom", 58, 99)
    stu.print()
    println("Highest socre:${stu.highest()} " )
    val test = 123
    println("Test is :$test")


}

class  Student(var name:String? , var english:Int , var math:Int) {
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" + "AVG:"+(math+english)/2)
    }
    fun nameCheck(){
        println(name?.length)
    }
    fun highest():Int{
       var max = if (english > math) {
           println("english:")
           english
       } else {
           println("math:")
           math
       }
        return max
    }


}



private fun userInput() {
    val sc = Scanner(System.`in`)
    print("Please enter student's name:")
//    var name = sc.next()
    var name = null
    print("Please enter student's eng score:")
    var english = sc.nextInt()
    print("Please enter student's math score:")
    var math = sc.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}

