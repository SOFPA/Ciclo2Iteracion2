/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.uti.service;

import co.edu.uniandes.csw.SOFPA.uti.logic.dto.UTIDTO;
import co.edu.uniandes.csw.SOFPA.uti.logic.dto.UTIPageDTO;
import javax.ejb.embeddable.EJBContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class UTIServiceTest {
    
    public UTIServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createUTI method, of class UTIService.
     */
    @Test
    public void testCreateUTI() throws Exception {
        System.out.println("createUTI");
        UTIDTO uTI = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIService instance = (UTIService)container.getContext().lookup("java:global/classes/UTIService");
        UTIDTO expResult = null;
        UTIDTO result = instance.createUTI(uTI);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUTI method, of class UTIService.
     */
    @Test
    public void testDeleteUTI() throws Exception {
        System.out.println("deleteUTI");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIService instance = (UTIService)container.getContext().lookup("java:global/classes/UTIService");
        instance.deleteUTI(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUTIs method, of class UTIService.
     */
    @Test
    public void testGetUTIs() throws Exception {
        System.out.println("getUTIs");
        Integer page = null;
        Integer maxRecords = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIService instance = (UTIService)container.getContext().lookup("java:global/classes/UTIService");
        UTIPageDTO expResult = null;
        UTIPageDTO result = instance.getUTIs(page, maxRecords);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUTI method, of class UTIService.
     */
    @Test
    public void testGetUTI() throws Exception {
        System.out.println("getUTI");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIService instance = (UTIService)container.getContext().lookup("java:global/classes/UTIService");
        UTIDTO expResult = null;
        UTIDTO result = instance.getUTI(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUTI method, of class UTIService.
     */
    @Test
    public void testUpdateUTI() throws Exception {
        System.out.println("updateUTI");
        Long id = null;
        UTIDTO uTI = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIService instance = (UTIService)container.getContext().lookup("java:global/classes/UTIService");
        instance.updateUTI(id, uTI);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of probarTest method, of class UTIService.
     */
    @Test
    public void testProbarTest() throws Exception {
        System.out.println("probarTest");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UTIService instance = (UTIService)container.getContext().lookup("java:global/classes/UTIService");
        String expResult = "";
        String result = instance.probarTest();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
