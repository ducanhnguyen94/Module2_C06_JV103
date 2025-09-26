package com.codegym.var_const;

public class CodingConvention {
    public static void main(String[] args) {
        // 1. camelCase Rule -> use to declare variable, function
        String myfullname = "Nguyen Duc Anh"; // not applying camelCase rule
        String myFullName = "Nguyen Duc Anh"; // applying camelCase rule - correct

        // 2. SNAKE_CASE -> use to declare constant
        final int maxSpeedCity = 4; // not applying SNAkE_CASE
        final int MAX_SPEED_CITY = 6; // applying SNAKE_CASE

        // 3. PascalCase -> use to declare class
        // public class MyClass {};
    }
}
