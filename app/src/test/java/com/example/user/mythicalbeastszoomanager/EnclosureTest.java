package com.example.user.mythicalbeastszoomanager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class EnclosureTest {

    Enclosure enclosure;
    Animal animal;


    @Before
    public void before(){

//        animal = new Animal("Nessie", 10000000, 90.00, 10.00, "Loch Monster");
        enclosure = new Enclosure("Aquarium", new ArrayList<Animal>());

    }

    @Test
    public void enclosureHasNameTest(){
            assertEquals("Aquarium", enclosure.getName());

    }

    @Test
    public void canSetEnclosureNameTest(){
        enclosure.setName("Aquarium");
        assertEquals("Aquarium", enclosure.getName());
    }

    @Test
    public void canAddAnimalToEnclosureTest(){
        enclosure.addAnimalToCage(animal);
        assertEquals(1, enclosure.getNumberOfAnimalsInEnclosure());
    }

    @Test
    public void canRemoveAllAnimalsFromAnEnclosure(){
        enclosure.removeAllAnimalsFromEnclosure();
        assertEquals(0, enclosure.getNumberOfAnimalsInEnclosure());
    }

    @Test
    public void canRemoveAnimalFromEnclosureByObjectTest(){
        enclosure.removeAnimalFromEnclosureByObject("Nessie");
        assertEquals("Nessie", animal.getName());
    }
}
