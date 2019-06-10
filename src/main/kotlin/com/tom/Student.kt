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

    val gstu = GraduatedStudent("Jack",60, 60,60)
    gstu.print()
    println("Highest socre:${stu.highest()} " )
    val test = 123
    println("Test is :$test")


}
class  GraduatedStudent(name: String? , english: Int,math: Int,var thesis:Int) : Student(name,english,math){
    companion object {
        val pass = 70 //子類別身上自己的屬性
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() =
        if(getAverage() > pass) "PASS" else "FAILED"

}






open class  Student(var name:String? , var english:Int , var math:Int) {
    companion object {
        @JvmStatic
        var pass = 50
        fun test(){
            println("testing")
        }
    }




   open fun print(){
       println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
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

    open fun passOrFailed()= if(getAverage() > pass) "PASS" else "FAILED"

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

