package com.Animal;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    public void testEat(){
        Dog testDog = new Dog();
        testDog.eat("Worm");
        assertEquals(12,testDog.getSize(),"The dog did not gain the right weight");
    }
}
