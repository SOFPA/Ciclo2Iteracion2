/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.recurso.master.service;

import co.edu.uniandes.csw.SOFPA.recurso.master.logic.dto.RecursoMasterDTO;
import javax.ejb.embeddable.EJBContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class RecursoMasterServiceTest {
    
    public RecursoMasterServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createRecurso method, of class RecursoMasterService.
     */
    @Test
    public void testCreateRecurso() throws Exception {
        System.out.println("createRecurso");
        RecursoMasterDTO recurso = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RecursoMasterService instance = (RecursoMasterService)container.getContext().lookup("java:global/classes/RecursoMasterService");
        RecursoMasterDTO expResult = null;
        RecursoMasterDTO result = instance.createRecurso(recurso);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRecurso method, of class RecursoMasterService.
     */
    @Test
    public void testDeleteRecurso() throws Exception {
        System.out.println("deleteRecurso");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RecursoMasterService instance = (RecursoMasterService)container.getContext().lookup("java:global/classes/RecursoMasterService");
        instance.deleteRecurso(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecurso method, of class RecursoMasterService.
     */
    @Test
    public void testGetRecurso() throws Exception {
        System.out.println("getRecurso");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RecursoMasterService instance = (RecursoMasterService)container.getContext().lookup("java:global/classes/RecursoMasterService");
        RecursoMasterDTO expResult = null;
        RecursoMasterDTO result = instance.getRecurso(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRecurso method, of class RecursoMasterService.
     */
    @Test
    public void testUpdateRecurso() throws Exception {
        System.out.println("updateRecurso");
        Long id = null;
        RecursoMasterDTO recurso = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RecursoMasterService instance = (RecursoMasterService)container.getContext().lookup("java:global/classes/RecursoMasterService");
        instance.updateRecurso(id, recurso);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
