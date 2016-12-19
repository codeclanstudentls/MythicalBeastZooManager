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
        waterMonster = new WaterMonster("Nessie", "Lake Monster", 10000000, 40.00);
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
        waterMonster.setName("Nessie");
        assertEquals("Nessie", waterMonster.getName());
    }

    @Test
    public void canSetSpecies(){
        waterMonster.setSpecies("Lake Monster");
        assertEquals("Nessie", waterMonster.getSpecies());
    }

    @Test
    public void canSetAgeTest(){
        waterMonster.setAge(2000000);
        assertEquals(2000000, waterMonster.getAge());
    }

    @Test
    public void canSetFoodLevelsTest(){
        waterMonster.setFoodlevel(20.00);
        assertEquals(20.00, 0.01, waterMonster.getFoodLevel());
    }



}