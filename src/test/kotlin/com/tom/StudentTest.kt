package com.tom

import com.kotlin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun hightestTest(){
        val student = Student("Hank",78,65)
        Assertions.assertEquals(78,student.highest())
    }
    @Test
    fun averageTest(){
        val student = Student("Hank",80,90)
        Assertions.assertEquals((90+80)/2,student.getAverage())
    }

     @Test
     fun gradingTest(){
         val student = Student("Hank",80,90)
         Assertions.assertEquals('B',student.grading())
     }
}