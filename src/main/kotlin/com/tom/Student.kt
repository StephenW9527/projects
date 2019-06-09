package com.kotlin

import java.util.*

fun main(args: Array<String>) {
//    userInput()

    Student.pass = 50
    val stu = Student("Tommy", 55, 48)
    val stu1 = Student("Hank", 30, 20)
    val stu2 = Student("Jane", 100, 99)
    stu.print()
    stu1.print()
    stu2.print()
    println("Highest socre:${stu.highest()} " )
    val test = 123
    println("Test is :$test")


}

class  Student(var name:String? , var english:Int , var math:Int) {
    companion object {
        @JvmStatic
        var pass = 50
        fun test(){
            println("testing")
        }
    }




    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" + getAverage()+"\t"+
                grading() + "\t"+if(getAverage()>=pass)"PASSED" else "FAILED")
    }

    fun getAverage()= (math+english)/2


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
    fun grading() = when (getAverage()) {
            in 90..100 -> 'A'
            in 80..89 ->'B'
            in 70..79 ->'C'
            in 60..69 ->'D'
            else ->'F'
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

