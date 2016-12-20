package com.example.user.mythicalbeastszoomanager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;
/**
 * Created by user on 20/12/2016.
 */
public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(1);
    }

    @Test
    public void visitorNumberTest(){

        assertEquals(1, visitor.getNumber(1));
    }

    @Test
    public void setVisitorNumberTest(){
        visitor.setNumber(1);
        assertEquals(1, visitor.getNumber(1));


    }
}
