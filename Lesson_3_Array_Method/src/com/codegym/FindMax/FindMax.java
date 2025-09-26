package com.codegym.FindMax;

import java.util.Scanner;

public class FindMax {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        do {
            System.out.println("Enter size (3-20): ");
            size = scanner.nextInt();
            if (size < 3 || size > 20) {
                System.out.println("Invalid size! Please try again!");
            }
        } while (size < 3 || 20 < size);
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter value at " + i + ": ");
            num[i] = scanner.nextInt();
        }

        int max = 0;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (num[i] >= max) {
                max = num[i];
                index = i;
            }
        }

        System.out.println("Max is " + max + " at index " + index);
    }
}
