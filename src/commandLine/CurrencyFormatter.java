package com.CommandLine;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyFormatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double payment = scanner.nextDouble();

        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String u = us.format(payment);
        String i = india.format(payment);
        String c = china.format(payment) ;
        String f = france.format(payment);

        System.out.println("US: " +u );
        System.out.println("India: " + i );
        System.out.println("China: " + c);
        System.out.println("France: " + f);
    }
}
