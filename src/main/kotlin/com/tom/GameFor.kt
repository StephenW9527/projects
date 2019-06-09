package com.tom

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for(i in 1..4) {
        print("Please insert a number (${i}/4): ")
        var num = scanner.nextInt()
        println("第${i}次   $num")
        if (num >secret){
            println("lower")
        }else if (num < secret ){
            println("hight")
        }else{
            println("bingo!! the secret number is $num")
            break;
        }
    }
}