package com.codegym.AnimalEdible.Animal;

import com.codegym.AnimalEdible.Edible.Edible;

public class Chicken extends Animal implements Edible{
    
    @Override
    public String makeSound() {
        return "Cockadooooo";
    }

    @Override
    public String howToEat() {
        return "could be fried!";
    }
}
