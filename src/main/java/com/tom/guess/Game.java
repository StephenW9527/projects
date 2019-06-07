package com.tom.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num != secret) {

            System.out.print("Please insert a number:");
            num = sc.nextInt();
            if(num > secret){
                System.out.println("lower");
            }else if(num < secret){
                System.out.println("higher");
            }else {
                System.out.println("bingo!!  the secret number is " + secret);
            }
        }
    }
}