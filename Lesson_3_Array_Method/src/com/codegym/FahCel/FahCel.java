package com.codegym.FahCel;

import java.util.Scanner;

public class FahCel {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        double Cel, Fah;
        do {
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("YOUR OPTION: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter F:");
                    Fah = scanner.nextDouble();
                    Cel = fahToCel(Fah);
                    System.out.println("C: " + Cel);
                    break;
                case 2:
                    System.out.println("Enter C: ");
                    Cel = scanner.nextDouble();
                    Fah = celToFah(Cel);
                    System.out.println("F: " + Fah);
                    break;
                case 0:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Not an option! Please try again");
                    break;
            }
        } while (choice != 0);
    }

    public static double fahToCel(double Fah) {
        return (Fah - 32) * 5 / 9;
    }

    public static double celToFah(double Cel) {
        return Cel * 9 / 5 + 32;
    }
}
