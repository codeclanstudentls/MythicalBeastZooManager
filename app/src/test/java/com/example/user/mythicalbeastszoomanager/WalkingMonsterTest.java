package com.example.user.mythicalbeastszoomanager;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;


/**
 * Created by user on 19/12/2016.
 */
public class WalkingMonsterTest {

    WalkingMonster walkingMonster;

    @Before
    public void before() {
        walkingMonster = new WalkingMonster("Fluffy", "Tribble", 1, 50.00);
    }

    @Test
    public void canGetNameTest(){
        assertEquals("Fluffy", walkingMonster.getName());
    }

    @Test
    public void canGetSpeciesTest(){
        assertEquals("Tribble", walkingMonster.getSpecies());
    }

    @Test
    public void canGetAgeTest(){
       assertEquals(1, walkingMonster.getAge());
    }

    @Test 
    public void canGetFoodLevelTest(){
       assertEquals(50.00, 0.01, walkingMonster.getFoodLevel());
    }

    @Test 
    public void canSetFoodLevelTest(){ 
        walkingMonster.setFoodlevel(10.00); 
        assertEquals(10.00, 0.01, walkingMonster.getFoodLevel()); 
    }   

    @Test 
    public void canSetNameTest(){ 
        walkingMonster.setName("Fluffy"); 
        assertEquals("Fluffy", walkingMonster.getName()); 
    }  

    @Test 
    public void canSetSpeciesTest(){ 
        walkingMonster.setSpecies("Tribble"); 
        assertEquals("Tribble", walkingMonster.getSpecies()); 
    }  

    @Test 
    public void canSetAgeTest(){ 
        walkingMonster.setAge(5); 
        assertEquals(5, walkingMonster.getAge()); 
    } 

}
