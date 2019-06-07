package com.tom

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
//    val scanner = Scanner(System.`in`)
    var num = 0
    while (num != secret) {
        print("Please insert a number:")
//        num = scanner.nextInt()

        num = readLine()!!.toInt()  //kotlin readLine()可以類似scanner的用途
        if(num > secret){
            println("lower")
        }else if( num < secret){
            println("higher")
        }else{
            println("bingo!! the secret number is $secret")
        }

    }
}