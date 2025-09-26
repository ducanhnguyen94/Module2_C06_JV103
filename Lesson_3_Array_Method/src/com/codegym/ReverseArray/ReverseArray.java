package com.codegym.ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10,11};
    
        int size = num.length;

        for (int i = 0; i < size / 2; i++) {
            int temp = num[i];
            num[i] = num[size - 1 - i];
            num[size - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(num));
    }
}
