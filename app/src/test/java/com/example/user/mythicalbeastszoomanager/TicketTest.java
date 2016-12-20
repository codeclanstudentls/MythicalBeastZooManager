package com.example.user.mythicalbeastszoomanager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 20/12/2016.
 */
public class TicketTest {

    Ticket ticket;

    @Before
    public void before() {
        ticket = new Ticket(20);
    }

    @Test
    public void getPriceTest(){
        assertEquals(20.00, 0.01, ticket.getPrice());
    }

    @Test
    public void setPriceTest(){
        ticket.setPrice(10.00);
        assertEquals(10.00, 0.01, ticket.getPrice());
    } // don't think this test actually tests that a price can be set as I have the price in the @Before?


}
