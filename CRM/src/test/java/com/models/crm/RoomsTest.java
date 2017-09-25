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
public class RoomsTest {
    
    public RoomsTest() {
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
     * Test of getRoomID method, of class Rooms.
     */
    @Test
    public void testGetRoomID() {
        System.out.println("getRoomID");
        Rooms instance = new Rooms();
        int expResult = 0;
        int result = instance.getRoomID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomID method, of class Rooms.
     */
    @Test
    public void testSetRoomID() {
        System.out.println("setRoomID");
        int roomID = 0;
        Rooms instance = new Rooms();
        instance.setRoomID(roomID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Rooms.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Rooms instance = new Rooms();
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Rooms.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        Rooms instance = new Rooms();
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomName method, of class Rooms.
     */
    @Test
    public void testGetRoomName() {
        System.out.println("getRoomName");
        Rooms instance = new Rooms();
        String expResult = "";
        String result = instance.getRoomName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomName method, of class Rooms.
     */
    @Test
    public void testSetRoomName() {
        System.out.println("setRoomName");
        String roomName = "";
        Rooms instance = new Rooms();
        instance.setRoomName(roomName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Rooms.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Rooms instance = new Rooms();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Rooms.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Rooms instance = new Rooms();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
