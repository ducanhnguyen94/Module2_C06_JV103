package com.codegym.FindIndex;

import java.util.Scanner;

public class FindIndex {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Enter a number for its index: ");
        int inputNumber = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == inputNumber) {
                index = i;
                break;
            }
        }
        if (index == -1) System.out.println(inputNumber + " is not in array!");
        else System.out.println("Index of " + inputNumber + " is: " + index);
    
    }
}
