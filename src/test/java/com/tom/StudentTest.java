package com.tom;

import com.tom.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestScoreTest(){
        Student student = new Student("Hank",60,80);
        Assertions.assertEquals(80,student.highest());
    }

    @Test
    public void averageTest(){
        Student student = new Student("Hank" , 70 , 70);
        Assertions.assertEquals(70,student.getAverage());
    }
}
