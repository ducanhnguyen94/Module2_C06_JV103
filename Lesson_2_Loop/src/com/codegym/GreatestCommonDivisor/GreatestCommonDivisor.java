package com.codegym.GreatestCommonDivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, min, gcd = 1;

        System.out.println("Enter a: ");
        a = scanner.nextInt();

        System.out.println("Enter b: ");
        b = scanner.nextInt();

        if (a >= b) min = b;
        else min = a;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > gcd) gcd = i;
            }
        }

        System.out.println("GCD is : " + gcd);
    }
}
