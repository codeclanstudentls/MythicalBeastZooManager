package com.example.user.mythicalbeastszoomanager;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/12/2016.
 */

public class CageTest  {

    Cage cage;
    WalkingMonster walkingMonster;

    @Before
    public void before(){


        cage = new Cage("Mammal Land");
        walkingMonster = new WalkingMonster("Fluffy", "Tribble", 1, 20.00);

    }


    @Test
    public void canAddMammalableToCageTest(){
        cage.addMammalableToCage(walkingMonster);
        assertEquals(1, cage.numberOfAnimals());
    }

    @Test
    public void canRemoveMammalableTest(){
        cage.addMammalableToCage(walkingMonster);
        cage.removeMammalableFromCage(walkingMonster);
        assertEquals(0, cage.numberOfAnimals());
    }


}
