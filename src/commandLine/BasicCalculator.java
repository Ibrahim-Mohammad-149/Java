package com.CommandLine;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        while(true) {
            int num1;
            int num2;
            int choice;
            int sum;

            Scanner Sc = new Scanner(System.in);

            //Second Number
            System.out.print("\nEnter the first number: ");
            num1 = Sc.nextInt();

            //First Number
            System.out.print("Enter the second number: ");
            num2 = Sc.nextInt();

            //Operation
            System.out.print("\nEnter the operation you want to perform:\n1)Add\n2)Subtract\n3)Multiply\n4)Divide\n5)Find LCM\n6)Find HCF ");
            choice = Sc.nextInt();

            if (choice == 1) {
                sum = num1 + num2;
                System.out.print(num1 + "+" + num2 + "=" + sum);
            } else if (choice == 2) {
                sum = num1 - num2;
                System.out.print(num1 + "-" + num2 + "=" + sum);
            } else if (choice == 3) {
                sum = num1 * num2;
                System.out.print(num1 + "*" + num2 + "=" + sum);
            } else if (choice == 4) {
                sum = num1 / num2;
                System.out.print(num1 + "/" + num2 + "=" + sum);
            } else if(choice==5) {
                lcm();
            }
            else if(choice==6) {
                hcf();
            }
            else {
                System.out.print("Invalid Option!, Try Again!");

            }
            Sc.close();
        }
    }
    //LCM
    public static int lcm() {
        int num1;
        int num2;
        int lcm;

        Scanner Sc = new Scanner(System.in);

        //Num1
        System.out.print("Enter the first number: ");
        num1 = Sc.nextInt();

        //Num2
        System.out.print("Enter the second number: ");
        num2 = Sc.nextInt();

        //LCM
        if(num1>num2) {
            lcm = num1;
        }
        else {
            lcm = num2;
        }
        Sc.close();
        while(true) {
            if( lcm % num1 == 0 && lcm % num2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            ++lcm;
        }
        return lcm;
    }
    //HCF
    public static int hcf() {
        int num1;
        int num2;
        int hcf = 1;

        Scanner Sc = new Scanner(System.in);

        //Num1
        System.out.print("Enter the first number: ");
        num1 = Sc.nextInt();

        //Num2
        System.out.print("Enter the second number: ");
        num2 = Sc.nextInt();

        //HCF
        for (int i=1; i<=num1 &&i <= num2;++i) {

            if (num1%i==0 && num2%i==0)
                hcf = i;
        }
        System.out.printf("The HCF of %d and %d is: %d",num1,num2,hcf);
        Sc.close();
        return hcf;
    }
}