package com.codegym.FindMaxNestedArray;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.floor(Math.random() * 20));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int[] maxVal = findMax(arr);

        System.out.println("Max value is " + maxVal[0] + " at [" + maxVal[1] + "][" + maxVal[2] + "]");
    }

    public static int[] findMax(int[][] arr) {
        int max = 0, index1 = 0, index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        int[] maxVal = {max, index1, index2};
        return maxVal;
    }
}
