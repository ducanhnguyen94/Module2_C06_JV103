package com.codegym.PrintRectangle;

import java.util.Scanner;

public class PrintRectangle {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----- PRINT RECTANGLE -----");
        int choice;
        do {
            System.out.println("1. Draw rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("--- YOUR OPTION ---");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("--- RECTANGLE ---");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("--- SQUARE TRIANGLE ---");

                    System.out.println("-- TOP LEFT --");
                    for (int i = 6; i >= 1 ; i--) {
                        for (int j = i; j >= 1; j--) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    System.out.println("-- TOP RIGHT --");
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 6; j > i; j--) {
                            System.out.print(" ");
                            System.out.print(" ");
                        }
                        for (int g = i; g >= 1; g--) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    System.out.println("-- BOTTEM LEFT --");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    System.out.println("-- BOTTOM RIGHT --");
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                            System.out.print(" ");
                        }
                        for (int g = 6; g >= i; g--) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("--- ISOSCELES TRIANGLE ---");    
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    for (int i = 4; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.out.println("--- EXIT ---");    
                    break;
                default:
                    System.out.println("Not an option! Please try again!");    
                    break;
            }
        } while (choice != 0);
    }
}
