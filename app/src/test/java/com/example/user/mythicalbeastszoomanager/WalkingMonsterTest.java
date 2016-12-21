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
    public void canSetNameTest(){
        walkingMonster.setName("Fluffy");
        assertEquals("Fluffy", walkingMonster.getName());
    }

    @Test
    public void canSetSpecies(){
        walkingMonster.setSpecies("Tribble");
        assertEquals("Tribble", walkingMonster.getSpecies());
    }

    @Test
    public void canSetAgeTest(){
        walkingMonster.setAge(3);
        assertEquals(3, walkingMonster.getAge());
    }

    @Test
    public void canSetFoodLevelsTest(){
        walkingMonster.setFoodlevel(20.00);
        assertEquals(20.00, 0.01, walkingMonster.getFoodLevel());
    }

    @Test
    public void animalIsEatingTest(){
        walkingMonster.animalEating("Space Dust");
    }

    @Test
    public void animalCanPoopTest(){
        walkingMonster.animalPooping();
    }


    @Test
    public void animalIsSellableTestFalse(){

        walkingMonster.setAge(3);
        assertEquals(false, walkingMonster.animalIsSellable());


    }

    @Test
    public void animalIsSellableTestTrue(){

        walkingMonster.setAge(1);

        assertEquals(true, walkingMonster.animalIsSellable());

    }

}
