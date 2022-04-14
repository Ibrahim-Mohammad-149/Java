package com.CommandLine;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int num = Sc.nextInt();

        for (int i=1;i<=10;i++) {
            System.out.printf("%d x %d = %d%n",num,i,num*i);
        }

        Sc.close();
    }
}