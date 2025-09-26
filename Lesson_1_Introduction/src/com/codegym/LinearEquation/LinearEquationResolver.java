package com.codegym.LinearEquation;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Equation is 'ax + b = c. Please enter constants a, b ,c: ");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scanner.nextInt();

        System.out.println("Enter b:");
        int b = scanner.nextInt();

        System.out.println("Enter c:");
        int c = scanner.nextInt();

        if (a != 0) {
            int x = (c-b)/a;
            System.out.println("x value is: " + x);
        } else {
            if (b == c) System.out.println("Equation has infitity x value.");
            else System.out.println("Equation has no x value.");
        }
    }
}
