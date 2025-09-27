package com.codegym.PassStudent;

import java.util.Scanner;

public class PassStudent {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] grade = new double[30];
        for (int i = 0; i < grade.length; i++) {
            System.out.println("Enter grade of Student " + (i+1) + " :");
            grade[i] = scanner.nextDouble();
        }
        announcePass(grade);
    }

    public static void announcePass(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                System.out.println("Student " + (i+1) + " pass!");
            }
        }
    }
}
