package com.codegym.CountChar;

import java.util.Scanner;

public class CountChar {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String string = "Forever and ever";
        System.out.println("Enter a character: ");
        String letter = scanner.nextLine();
        char character = letter.charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Character " + letter +" appears " + count + " times in the string!");
        
    }
}
