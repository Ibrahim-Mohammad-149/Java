package com.CommandLine;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String reverse = new StringBuffer(A).reverse().toString();

        if (A.equals(reverse))
            System.out.println("Yes");
        else
            System.out.println("No");
            
    }
}
