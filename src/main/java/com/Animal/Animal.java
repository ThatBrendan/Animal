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
    public abstract void eat(String food);

    public void sleep(int time) {

    }
    public abstract Animal reproduce();

    public abstract String Breathe();

    public int getAnimalLegs(){
        return animalLegs;
    }

    public int getAnimalAge() {
        return animalYears;
    }

    public void setAnimalYears(int animalYears) {
        this.animalYears = animalYears;
    }
}
