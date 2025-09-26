package com.codegym.Loop;

import java.util.Scanner;

public class For {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Enter an Integer:");
        int input = scanner.nextInt();
        System.out.println("Multiplication table of " + input + ":");
        for (int i = 1; i <= 10; i++) {
            int result = i * input;
            System.out.println(i + " x " + input + " = " + result);
        }
        
    }
}
