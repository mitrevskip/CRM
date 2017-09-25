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
public class RolesTest {
    
    public RolesTest() {
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
     * Test of getRoleID method, of class Roles.
     */
    @Test
    public void testGetRoleID() {
        System.out.println("getRoleID");
        Roles instance = new Roles();
        int expResult = 0;
        int result = instance.getRoleID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoleID method, of class Roles.
     */
    @Test
    public void testSetRoleID() {
        System.out.println("setRoleID");
        int roleID = 0;
        Roles instance = new Roles();
        instance.setRoleID(roleID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
