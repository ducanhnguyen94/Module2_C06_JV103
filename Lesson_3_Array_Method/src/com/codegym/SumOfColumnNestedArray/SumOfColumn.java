package com.codegym.SumOfColumnNestedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfColumn {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.floor(Math.random() * 20));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int column;
        do {
            System.out.println("Enter a column(1-3): ");
            column = scanner.nextInt();
        } while (column < 1 || column > arr[0].length);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column - 1];
        }

        System.out.println("Sum of " + column + " is: " + sum);

    }
}
