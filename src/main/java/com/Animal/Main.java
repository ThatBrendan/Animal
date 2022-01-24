package com.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        ArrayList<Animal>pound = new ArrayList<>();
        pound.add(dog);

        for (Animal a: pound){
            a.eat("Worms");
            System.out.println(a.Breathe());
        }
    }
}
