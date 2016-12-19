package com.example.user.mythicalbeastszoomanager;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/12/2016.
 */

public class AviaryTest {

    Aviary aviary;
    FlyingMonster flyingMonster;

    @Before
    public void before(){

        aviary = new Aviary("Flappy-Bird Land");
        flyingMonster = new FlyingMonster("Peter", "Griffin", 30, 60.00);

    }

    @Test
    public void canAddFlyableToAviaryTest(){
        aviary.addFlyableToAviary(flyingMonster);
        assertEquals(1, aviary.numberOfAnimals());
    }

    @Test
    public void canRemoveFlyableTest(){
        aviary.addFlyableToAviary(flyingMonster);
        aviary.removeFlyableFromAviary(flyingMonster);
        assertEquals(0, aviary.numberOfAnimals());
    }

    @Test
    public void canCountNumberOfFlyers(){

    }


}
