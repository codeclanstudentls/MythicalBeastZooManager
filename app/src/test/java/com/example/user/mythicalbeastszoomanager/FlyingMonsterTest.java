package com.example.user.mythicalbeastszoomanager;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

/**
 * Created by user on 19/12/2016.
 */
public class FlyingMonsterTest {

    FlyingMonster flyingMonster;

    @Before
    public void before() {
        flyingMonster = new FlyingMonster("Peter", "Griffin", 23, 20.00);
    }

    @Test
    public void canGetNameTest() {
        assertEquals("Peter", flyingMonster.getName());
    }

    @Test
    public void canGetSpeciesTest(){
        assertEquals("Griffin", flyingMonster.getSpecies());
    }

    @Test
    public void canGetAgeTest(){
        assertEquals(23, flyingMonster.getAge());
    }

    @Test
    public void canGetFoodLevelTest(){
        assertEquals(20.00, 0.01, flyingMonster.getFoodLevel());
    }

    @Test
    public void canSetNameTest(){
        flyingMonster.setName("Peter");
        assertEquals("Peter", flyingMonster.getName());
    }

    @Test
    public void canSetSpecies(){
        flyingMonster.setSpecies("Griffin");
        assertEquals("Griffin", flyingMonster.getSpecies());
    }

    @Test
    public void canSetAgeTest(){
        flyingMonster.setAge(32);
        assertEquals(32, flyingMonster.getAge());
    }

    @Test
    public void canSetFoodLevelsTest(){
        flyingMonster.setFoodlevel(50.00);
        assertEquals(50.00, 0.01, flyingMonster.getFoodLevel());
    }

    @Test
    public void animalIsSellableTestFalse(){

        flyingMonster.setAge(3);
        assertEquals(false, flyingMonster.animalIsSellable());


    }

    @Test
    public void animalIsSellableTestTrue(){

        flyingMonster.setAge(1);

        assertEquals(true, flyingMonster.animalIsSellable());



    }



}