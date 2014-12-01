/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.uti.master.service;

import co.edu.uniandes.csw.SOFPA.uti.master.logic.dto.UTIMasterDTO;
import javax.ejb.embeddable.EJBContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class UTIMasterServiceTest {
    
    public UTIMasterServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createUTI method, of class UTIMasterService.
     */
    @Test
    public void testCreateUTI() throws Exception {
        System.out.println("createUTI");
        UTIMasterDTO uti = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIMasterService instance = (UTIMasterService)container.getContext().lookup("java:global/classes/UTIMasterService");
        UTIMasterDTO expResult = null;
        UTIMasterDTO result = instance.createUTI(uti);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUTI method, of class UTIMasterService.
     */
    @Test
    public void testDeleteUTI() throws Exception {
        System.out.println("deleteUTI");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIMasterService instance = (UTIMasterService)container.getContext().lookup("java:global/classes/UTIMasterService");
        instance.deleteUTI(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUTI method, of class UTIMasterService.
     */
    @Test
    public void testGetUTI() throws Exception {
        System.out.println("getUTI");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIMasterService instance = (UTIMasterService)container.getContext().lookup("java:global/classes/UTIMasterService");
        UTIMasterDTO expResult = null;
        UTIMasterDTO result = instance.getUTI(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUTI method, of class UTIMasterService.
     */
    @Test
    public void testUpdateUTI() throws Exception {
        System.out.println("updateUTI");
        Long id = null;
        UTIMasterDTO uti = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIMasterService instance = (UTIMasterService)container.getContext().lookup("java:global/classes/UTIMasterService");
        instance.updateUTI(id, uti);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
