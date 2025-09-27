package com.codegym.RemoveElement;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,1,7,8,9,10};
        System.out.println("Enter a number needed to be removed: ");
        int removeNum = scanner.nextInt();
        num = removeEl(removeNum, num);
        System.out.println(Arrays.toString(num));
    }

    public static int[] removeEl(int num, int[] arr) {
        int index = 0;
        boolean valid = true;
        while (valid) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    arr[i] = 0;
                    index = i;
                    valid = true;
                    break;
                } else valid = false;
            }
            if (valid) {
                for (int i = index; i < arr.length - 1; i++) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
