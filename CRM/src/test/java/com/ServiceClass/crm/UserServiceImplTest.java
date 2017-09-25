/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ServiceClass.crm;

import com.models.crm.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario HP
 */
public class UserServiceImplTest {
    
    public UserServiceImplTest() {
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
     * Test of saveUser method, of class UserServiceImpl.
     */
    @Test
    public void testSaveUser() {
        System.out.println("saveUser");
        User u = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.saveUser(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserServiceImpl.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User u = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.updateUser(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserServiceImpl.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        User u = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.deleteUser(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
