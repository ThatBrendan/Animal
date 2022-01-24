package com.Animal;

public abstract class Animal {
    ///////(ATTRIBUTES)//////////

    private int animalLegs;
    private int animalYears;

    //////(CONSTRUCTORS)///////

    public Animal() {
        animalLegs = 4;
        animalYears = 12;
    }

    ////////(METHODS)/////////
    public static void eat(String food) {
        System.out.println("Worm eaten");
    }

    public void sleep(int time) {

    }
    public abstract Animal reproduce();

    public int getAnimalLegs(){
        return animalLegs;
    }

    public int getAnimalAge() {
        return animalYears;
    }
}
