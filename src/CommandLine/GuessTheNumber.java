package com.CommandLine;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main (String[] args) {
        Scanner Sc = new Scanner (System.in);
        Random R = new Random ();

        int num = R.nextInt(100);
        System.out.println(num);

        System.out.print("Guess a number between 0 and 100: ");
        int guess = Sc.nextInt();

        while (guess!=num) {
            if(guess > num) {
                System.out.println("The number you guessed is too high!\n");
                System.out.print("Guess a number between 0 and 100: ");
                guess = Sc.nextInt();

            }
            else {
                System.out.println("The number you guessed is too low!\n");
                System.out.print("Guess a number between 0 and 100: ");
                guess = Sc.nextInt();
            }
        }

        System.out.printf("You guessed the number! The number was: %d",num);
        Sc.close();
    }
}