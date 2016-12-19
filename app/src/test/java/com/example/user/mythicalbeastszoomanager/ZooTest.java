package com.example.user.mythicalbeastszoomanager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class ZooTest {

        Zoo zoo;
      //  Enclosure enclosure1;


    @Before
    public void before() {

//        enclosure1 = new Enclosure("Aquarium", new ArrayList<Animal>());
        zoo = new Zoo("Mysterious and Mythical Beasts Emporium", new ArrayList<Enclosure>());
    }

    @Test
    public void canGetZooNameTest() {
        assertEquals("Mysterious and Mythical Beasts Emporium", zoo.getName());
    }

    @Test
    public void canSetZooNameTest(){
        zoo.setName("Mysterious and Mythical Beasts Emporium");
        assertEquals("Mysterious and Mythical Beasts Emporium", zoo.getName());
    }

    @Test
    public void canAddEnclosureToZooTest(){

    }





    }
