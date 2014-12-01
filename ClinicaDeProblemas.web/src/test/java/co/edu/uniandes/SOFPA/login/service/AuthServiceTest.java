/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.SOFPA.login.service;

import javax.ejb.embeddable.EJBContainer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class AuthServiceTest {
    
    public AuthServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLogedUserStack method, of class AuthService.
     */
    @Test
    public void testGetLogedUserStack() throws Exception {
        System.out.println("getLogedUserStack");
        HttpServletRequest req = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AuthService instance = (AuthService)container.getContext().lookup("java:global/classes/AuthService");
        String expResult = "";
        String result = instance.getLogedUserStack(req);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class AuthService.
     */
    @Test
    public void testLogout() throws Exception {
        System.out.println("logout");
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AuthService instance = (AuthService)container.getContext().lookup("java:global/classes/AuthService");
        String expResult = "";
        String result = instance.logout(req, res);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogedUser method, of class AuthService.
     */
    @Test
    public void testGetLogedUser() throws Exception {
        System.out.println("getLogedUser");
        HttpServletRequest req = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AuthService instance = (AuthService)container.getContext().lookup("java:global/classes/AuthService");
        String expResult = "";
        String result = instance.getLogedUser(req);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
