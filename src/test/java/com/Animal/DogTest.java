package com.Animal;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    @Test
    public void testEat(){
        Dog testDog = new Dog();
        testDog.eat("Worm");
        assertEquals(11,testDog.getSize(),"The dog did not gain the right weight");
        testDog.reproduce();
        testDog.Breathe();
    }
}
