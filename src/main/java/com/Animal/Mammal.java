package com.Animal;

public abstract class Mammal extends Animal{
    ///////(ATTRIBUTES)//////////
    private int size = 10;

    ///////(CONSTRUCTORS)//////////

    ///////(METHODS)//////////
    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Mammal reproduce(){
        return new Dog();
    }

    public String Breathe(){
        return "Animal is Breathing";
    }
}
