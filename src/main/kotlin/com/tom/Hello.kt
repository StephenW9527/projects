package com.tom

fun main(args: Array<String>) {

    val h = Human()
    h.hello()
    var age :Int =25
    age = age.plus(1)
    println(age)
}

class Human{
    fun hello(){
        println("Hello Kotlin!!")
    }
}