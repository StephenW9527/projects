package com.tom.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        Student stu = new Student("hank",77,99);
        stu.print();
        System.out.println(" Heigest score : "+stu.highest());
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
