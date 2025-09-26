package com.codegym.BMICalculator;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("BMI Calculator");
        Scanner scanner = new Scanner(System.in);

        double height, weight, bmi;

        System.out.println("Enter height (in meter): ");
        height = scanner.nextDouble();

        System.out.println("Enter weight (in kilogram): ");
        weight = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.println("Your bmi is: " + bmi);

        if (bmi < 18.5) System.out.println("You are Underweight!");
        else if (bmi < 25.0) System.out.println("You are Normal!");
        else if (bmi < 30.0) System.out.println("You are Overweight!");
        else System.out.println("You are Obese!");
    }
}
