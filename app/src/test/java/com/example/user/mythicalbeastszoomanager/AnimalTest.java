package com.example.user.mythicalbeastszoomanager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class AnimalTest{
    Animal animal1;
    Animal animal2;


    @Before
    public void before(){

        animal1 = new Animal("Chocobo", 5, 100.00);
        animal2 = new Animal("Tribble", 1, 90.00);
    }

    @Test
    public void canGetNameTest(){
        assertEquals("Chocobo", animal1.getName());
    }

    @Test
    public void canGetAgeTest(){
        assertEquals(5, animal1.getAge());
    }

    @Test
    public void canGetFoodLevelTest(){
        assertEquals(100.00, 0.01, animal1.getFood_level());
    }

    @Test
    public void canSetNameTest(){
        animal1.setName("Chocobo");
        assertEquals("Chocobo", animal1.getName());
    }

    @Test
    public void canSetAge(){
        animal1.setAge(5);
        assertEquals(5, animal1.getAge());
    }

}
