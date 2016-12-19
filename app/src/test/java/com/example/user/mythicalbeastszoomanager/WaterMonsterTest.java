package com.example.user.mythicalbeastszoomanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/12/2016.
 */
public class WaterMonsterTest {

    WaterMonster waterMonster;

    @Before
    public void before() {
        waterMonster = new waterMonster("Nessie", "Lake Monster", 10000000, 40.00);
    }

    @Test
    public void canGetNameTest() {
        assertEquals("Nessie", waterMonster.getName());
    }

    @Test
    public void canGetSpeciesTest(){
        assertEquals("Lake Monster", waterMonster.getSpecies());
    }

    @Test
    public void canGetAgeTest(){
        assertEquals(10000000, waterMonster.getAge());
    }

    @Test
    public void canGetFoodLevelTest(){
        assertEquals(40.00, 0.01, waterMonster.getFoodLevel());
    }

    @Test
    public void canSetNameTest(){
        waterMonster.setName("Peter");
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



}