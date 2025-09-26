package com.codegym.DrawGeometry;

import java.util.Scanner;

public class DrawGeometry {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----- DRAW GEOMETRY -----");
        int choice;
        do {
            System.out.println("1. Draw a triangle");
            System.out.println("2. Draw a rectangle");
            System.out.println("3. Draw a square");
            System.out.println("0. Exit");
            System.out.println("--- YOUR OPTION ---");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("--- TRIANGLE ---");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("--- RECTANGLE ---");
                    for (int i = 0; i <= 3; i++) {
                        for (int j = 0; j <= 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("--- SQUARE ---");    
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= 5; j++) {
                            System.out.print("*  ");
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
