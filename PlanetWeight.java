package com.CommandLine;

import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {

        //Weight should be entered as a double, e.g if your weight is 60, you sould enter 60.0

        Scanner Sc = new Scanner(System.in);
        System.out.print("What is your weight (kg): ");
        double weight = Sc.nextDouble();

        System.out.println("Your weight on Earth is: " + weight + "(obviously)");

        double moonWeight = weight * .166;
        System.out.println("Your weight on Moon is: " + moonWeight);

        double mercuryWeight = weight * .378;
        System.out.println("Your weight on Mercury is: " + mercuryWeight);

        double jupiterWeight = weight * 2.364;
        System.out.println("Your weight on the Jupiter is: " + jupiterWeight);
    }
}
