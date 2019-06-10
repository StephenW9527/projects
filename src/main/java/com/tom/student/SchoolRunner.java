package com.tom.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {


        Student.pass=50;
        Student stu = new Student("Hank",55,19);
        Student stu1 = new Student("Eric",30,40);
        Student stu2 = new Student("Jane",60,40);
        GradeatedStudent gStu = new GradeatedStudent("Jack",65, 65 ,60);


        stu.print();
        stu1.print();
        stu2.print();
        gStu.print();

//        System.out.println(" Heigest score : "+stu.highest());
//        userInput();
    }

    private static void userInput() {
        System.out.print("Please enter student's name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Please insert eng score:");
        int english = sc.nextInt();


        System.out.print("Please insert math score:");
        int math = sc.nextInt();

        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println(" Heigest score : "+stu.highest());
    }
}
