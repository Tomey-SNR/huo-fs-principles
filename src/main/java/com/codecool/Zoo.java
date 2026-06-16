package com.codecool;

import com.codecool.animal.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        // We create a list that can hold any object that IS-A Animal.
        List<Animal> animals = new ArrayList<>();

        // We add specific types of animals to the same list.
        animals.add(new Lion("Leo", 5));
        animals.add(new Parrot("Polly", 2));
        animals.add(new Lion("Zelda", 7));

        System.out.println("Welcome to the Zoo! It's morning feeding time...");

        // --- Task 8
        // TODO: Let's hear all the animals! Create a loop that iterates over the 'animals' list.
        //  Inside the loop, get each animal's name and then call its makeSound() method.

        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": ");
            animal.makeSound();
        }

        System.out.println("\nFeeding time is over.");
    }
}
