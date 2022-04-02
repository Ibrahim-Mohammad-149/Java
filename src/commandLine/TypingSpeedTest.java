package com.CommandLine;

import java.util.*;
import java.util.concurrent.*;
import java.time.*;

public class TypingSpeedTest {
    static String[] phrases = {"Java is the best programming language!","Java is the most popular programming language!","I love Java more than any language!"};

    public static void main(String[] args) throws InterruptedException{

        Random R = new Random();
        int index = 3;
        String phrase = phrases[R.nextInt(index)];
        System.out.printf("%nThe phrase is: %s%n",phrase);

        @SuppressWarnings("unused")
        String user_input;
        double startTime = LocalTime.now().toNanoOfDay();
        Scanner Sc = new Scanner (System.in);
        user_input = Sc.nextLine();
        double endTime = LocalTime.now().toNanoOfDay();

        System.out.println("Calculating Results");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);

        double totalTime = endTime - startTime;
        double time = totalTime/1000000000.0;
        System.out.printf("The total time you took is: %f%n",time);
        Sc.close();
    }
}