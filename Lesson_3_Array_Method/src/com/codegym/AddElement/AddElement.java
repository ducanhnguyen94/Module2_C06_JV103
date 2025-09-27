package com.codegym.AddElement;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println("Enter value: ");
        int addVal = scanner.nextInt();
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        num = addEl(addVal, index, num);
        System.out.println(Arrays.toString(num));
    }

    public static int[] addEl(int num, int id, int[] arr) {
        int size = arr.length;
        int[] newArr = new int[size+1];
        for (int i = 0; i < id; i++) {
            newArr[i] = arr[i];
        }
        newArr[id] = num;
        for (int i = id; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }
}
