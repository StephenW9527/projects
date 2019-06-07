package com.tom.guess;

import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i ;
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Please enter a number:");
            int num = scanner.nextInt();
            System.out.println("第"+i+"次:" + num);
            if(num == -1){
                break;
            }
        }
        System.out.println("結束");
    }
}