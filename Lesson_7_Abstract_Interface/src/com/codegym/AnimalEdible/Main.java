package com.codegym.AnimalEdible;

import com.codegym.AnimalEdible.Animal.Chicken;
import com.codegym.AnimalEdible.Animal.Tiger;
import com.codegym.AnimalEdible.Fruit.Apple;
import com.codegym.AnimalEdible.Fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        Orange orange = new Orange();
        Apple apple = new Apple();

        System.out.println(tiger.makeSound());
        System.out.println(chicken.makeSound());
        System.out.println(chicken.howToEat());
        System.out.println(apple.howToEat());
        System.out.println(orange.howToEat());

    }
}
