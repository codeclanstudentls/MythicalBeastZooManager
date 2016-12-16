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

        animal1 = new Animal("Chicketty", 5, 100.00, 0.00, "Chocobo");
        animal2 = new Animal("Nessie", 10000000, 90.00, 10.00, "Loch Monster");
    }

    @Test
    public void canGetNameTest(){

        assertEquals("Chicketty", animal1.getName());
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
    public void canGetPoopLevel(){

        assertEquals(0.01, 0.01, animal1.getPoop_level());
    }

    @Test
    public void canGetSpeciesNameTest() {

        assertEquals("Chocobo", animal1.getSpeciesName());
    }

    @Test
    public void canSetNameTest(){
        animal1.setName("Chicketty");
        assertEquals("Chicketty", animal1.getName());
    }

    @Test
    public void canSetAgeTest(){
        animal1.setAge(5);
        assertEquals(5, animal1.getAge());
    }

    @Test
    public void canSetSpeciesNameTest(){
        animal1.setSpeciesName("Chocobo");
        assertEquals("Chocobo", animal1.getSpeciesName());
    }

}
