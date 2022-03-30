package com.CommandLine;

import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class LinkOpener {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("What do website do you want to open (Enter 5 if you choose the 5th option):\n1. YouTube\n2. Google\n3. Bing\n4. FaceBook\n5. ENTER THE URL: ");
        int choice = Sc.nextInt();

        switch (choice) {
            case 1:
                try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://www.youtube.com");
                    ((Desktop) desktop).browse(oURL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://www.google.com");
                    ((Desktop) desktop).browse(oURL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 3:
                try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://www.bing.com");
                    ((Desktop) desktop).browse(oURL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 4:
                try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://www.facebook.com");
                    ((Desktop) desktop).browse(oURL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;


            case 5:
                System.out.print("\nEnter the URL: ");
                String URL = Sc.next();

                try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI(URL);
                    ((Desktop) desktop).browse(oURL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

    }
}
