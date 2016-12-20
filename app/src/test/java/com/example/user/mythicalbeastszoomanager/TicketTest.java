package com.example.user.mythicalbeastszoomanager;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 20/12/2016.
 */


public class TicketTest {
    Ticket ticket;

    @Before
    public void before(){
        ticket = new Ticket(new Visitor[50]);
    }

    @Test
    public void zooHasTickets(){
        assertEquals(50, ticket.numberOfTickets());
    }
}

