package com.codegym.CheckPrime;

import java.util.Scanner;

public class CheckPrime {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an integer greater than 1: ");
        int num = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
            if (count > 2) {
                System.out.println(num + " is not a primitive number!");
                break;
            }
        }

        if (count == 2) System.out.println(num + " is a primitive number!");
    }
}
