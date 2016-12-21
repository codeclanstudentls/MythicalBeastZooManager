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
        Visitor visitor;
        Enclosure enclosure;


    @Before
    public void before() {

//        enclosure = new Enclosure("Aquarium", new ArrayList<Animal>());
        zoo = new Zoo("Mysterious and Mythical Beasts Emporium", new ArrayList<Enclosure>(), new ArrayList<Visitor>());
        visitor = new Visitor(1);
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
        zoo.addEnclosureToZoo(enclosure);
        assertEquals(1, zoo.getNumberOfEnclosuresInZoo());

    }

    @Test
    public void canRemoveEnclosureTest(){
        zoo.addEnclosureToZoo(enclosure);
        zoo.removeEnclosureFromZoo();
        assertEquals(0, zoo.getNumberOfEnclosuresInZoo());
    }

    @Test
    public void canAddVisitorToZooTest(){
        zoo.addVisitorToZoo(visitor);
        assertEquals(1, zoo.numberOfVisitors());
    }

    @Test
    public void canRemoveVisitorTest(){
        zoo.addVisitorToZoo(visitor);
        zoo.removeVisitorFromZoo(visitor);
        assertEquals(0, zoo.numberOfVisitors());


    }





    }
