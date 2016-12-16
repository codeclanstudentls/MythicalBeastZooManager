package com.example.user.mythicalbeastszoomanager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class EnclosureTest {

    Enclosure enclosure1;
    Animal animal;


    @Before
    public void before(){

        animal = new Animal("Nessie", 10000000, 90.00, 10.00, "Loch Monster");
        enclosure1 = new Enclosure("Aquarium", new ArrayList<Animal>());


    }

    @Test
    public void enclosureHasNameTest(){
            assertEquals("Aquarium", enclosure1.getName());

    }

    @Test
    public void canAddAnimalToEnclosureTest(){
        enclosure1.addAnimalToCage(animal);
        assertEquals(1, enclosure1.getNumberOfAnimalsInEnclosure());
    }

    @Test
    public void canRemoveAllAnimalsFromAnEnclosure(){

        assertEquals(0, enclosure1.getNumberOfAnimalsInEnclosure());
    }

    @Test
    public void canRemoveAnimalFromEnclosureByObjectTest(){
        enclosure1.removeAnimalFromEnclosureByObject("Nessie");
        assertEquals("Nessie", animal.getName());
    }
}
