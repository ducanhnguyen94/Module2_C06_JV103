package com.codegym.FindMin;

public class FindMin {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,-9,8,9,10};
        int min = findMin(num);
        System.out.println("Min: " + min);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i <= min) min = i;
        }
        return min;
    }
}
