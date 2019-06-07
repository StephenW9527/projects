package com.tom

fun main(args: Array<String>) {


    var s:String? = "abcde"
//    s=null
    println(s?.length)
    println(s?.get(2))
    println(s?.substring(2,4))

    val h = Human("Hank",66.5f,1.7f)
    println(h.bmi())

    val score = 88
    println(score > 60)

    val c:Char = 'A'
    println(c.toInt() >=65)

//    h.hello()
//    var age :Int =25
//    age = age.plus(1)
//    println(age)


}

class Human(var name:String , var weight:Float , var height:Float){
    init {
        println("test$weight")
    }
//    constructor(name:String , weight: Float,height: Float):this(weight, height)


    fun hello(){
        println("Hello Kotlin!!")
    }
    fun bmi() :Float {
        var bmi = weight/(height*height)
        return bmi
    }

}

