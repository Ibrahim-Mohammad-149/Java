package com.CommandLine;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String reverse = new StringBuffer(word).reverse().toString();

        if (word.equals(reverse))
            System.out.printf("\n%s IS a palindrome",word);
        else
            System.out.printf("\n%s is NOT a palindrome",word);

    }
}
