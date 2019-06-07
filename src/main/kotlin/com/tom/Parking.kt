package com.tom

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(2018,12,25,8,0,0)

    val leave = LocalDateTime.of(2018,12,25,10,0,0)

    var car = Car("AAA-0001",enter)
    car.leave = leave    //會呼叫setter
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println("${hours*30}元" )
}

class  Car(val id:String , val enter:LocalDateTime){
    var leave: LocalDateTime? = null
        set(value) {
            if(enter.isBefore(value))
                field = value  //field代表leave值  但不能寫this.leave 會不斷呼叫setter
        }

    fun duration() =
         Duration.between(enter,leave).toMinutes()

}