package com.codegym.CombineArr;

import java.util.Arrays;

public class CombineArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1,0};
        int[] combineArr = combineArr(arr1, arr2);
        System.out.println(Arrays.toString(combineArr));
    }

    public static int[] combineArr(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] newArr = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            newArr[i + size1] = arr2[i];
        }
        return newArr;
    }
}
