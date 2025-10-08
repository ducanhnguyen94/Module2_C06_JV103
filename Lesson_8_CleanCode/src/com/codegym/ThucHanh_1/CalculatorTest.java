package com.codegym.ThucHanh_1;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
        System.out.println("Enter operator: ");
        String operatorStr = scanner.nextLine();
        char operator = operatorStr.charAt(0);

        System.out.println("Enter first operand: ");
        int firstOperand = scanner.nextInt();
      
        System.out.println("Enter second operand: ");
        int secondOperand = scanner.nextInt();

        Calculator calculator = new Calculator();

        int result = Calculator.calculate(firstOperand, secondOperand, operator);

        System.out.println(result);

   }
}
