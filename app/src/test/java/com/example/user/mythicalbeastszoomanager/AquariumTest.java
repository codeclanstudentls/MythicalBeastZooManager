package com.example.user.mythicalbeastszoomanager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;
/**
 * Created by user on 19/12/2016.
 */
public class AquariumTest  {

    Aquarium aquarium;
    WaterMonster waterMonster;

    @Before
    public void before(){


        aquarium = new Aquarium("WaterWorld");
        waterMonster = new WaterMonster("Nessie", "Lake Monster", 100000, 100.00);

    }


    @Test
    public void canAddSwimmableToAquariumTest(){
        aquarium.addSwimmableToAquarium(waterMonster);
        assertEquals(1, aquarium.numberOfAnimals());
    }

    @Test
    public void canRemoveSwimmableTest(){
        aquarium.addSwimmableToAquarium(waterMonster);
        aquarium.removeSwimmableFromAquarium(waterMonster);
        assertEquals(0, aquarium.numberOfAnimals());
    }

    @Test
    public void animalIsSellableTestFalse(){

        waterMonster.setAge(100000);
        assertEquals(false, waterMonster.animalIsSellable());


    }

    @Test
    public void animalIsSellableTestTrue(){

        waterMonster.setAge(1);

        assertEquals(true, waterMonster.animalIsSellable());



    }


}
