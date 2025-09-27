package com.codegym.SumOfTwoCornerLineNestedArray;

import java.util.Arrays;

public class SumOfCorner {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.floor(Math.random() * 9));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            sum2 += arr[i][i];
        }

        System.out.println("Sum 1 is " + sum1 + " and sum 2 is " + sum2);
    }
}
