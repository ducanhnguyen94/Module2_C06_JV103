package com.codegym.FindAllMin;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] num = new int[20];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) Math.floor((Math.random() + 1) * 10);
        }

        System.out.println(Arrays.toString(num));

        findMin(num);
    }

   
    public static void findMin(int[] arr) {
        int min = arr[0];
        int[] index = {0};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == min) {
                int[] newIndex = new int[index.length + 1];
                for (int j = 0; j < index.length; j++) {
                    newIndex[j] = index[j];
                }
                newIndex[index.length] = i;
                index = newIndex;
            } else if (arr[i] < min) {
                min = arr[i];
                index = new int[1];
                index[0] = i;
            }
        }
        System.out.println("Min value is " + min + " at index " + Arrays.toString(index));
    }
}
