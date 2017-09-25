/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models.crm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Petar
 */
public class ReservationsTest {
    
    public ReservationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getReservationID method, of class Reservations.
     */
    @Test
    public void testGetReservationID() {
        System.out.println("getReservationID");
        Reservations instance = new Reservations();
        int expResult = 0;
        int result = instance.getReservationID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservationID method, of class Reservations.
     */
    @Test
    public void testSetReservationID() {
        System.out.println("setReservationID");
        int reservationID = 0;
        Reservations instance = new Reservations();
        instance.setReservationID(reservationID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
