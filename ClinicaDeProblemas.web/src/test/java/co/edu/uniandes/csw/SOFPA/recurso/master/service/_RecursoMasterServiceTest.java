/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.recurso.master.service;

import co.edu.uniandes.csw.SOFPA.recurso.master.logic.dto.RecursoMasterDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class _RecursoMasterServiceTest {
    
    public _RecursoMasterServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createRecurso method, of class _RecursoMasterService.
     */
    @Test
    public void testCreateRecurso() {
        System.out.println("createRecurso");
        RecursoMasterDTO recurso = null;
        _RecursoMasterService instance = new _RecursoMasterServiceImpl();
        RecursoMasterDTO expResult = null;
        RecursoMasterDTO result = instance.createRecurso(recurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRecurso method, of class _RecursoMasterService.
     */
    @Test
    public void testDeleteRecurso() {
        System.out.println("deleteRecurso");
        Long id = null;
        _RecursoMasterService instance = new _RecursoMasterServiceImpl();
        instance.deleteRecurso(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecurso method, of class _RecursoMasterService.
     */
    @Test
    public void testGetRecurso() {
        System.out.println("getRecurso");
        Long id = null;
        _RecursoMasterService instance = new _RecursoMasterServiceImpl();
        RecursoMasterDTO expResult = null;
        RecursoMasterDTO result = instance.getRecurso(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRecurso method, of class _RecursoMasterService.
     */
    @Test
    public void testUpdateRecurso() {
        System.out.println("updateRecurso");
        Long id = null;
        RecursoMasterDTO recurso = null;
        _RecursoMasterService instance = new _RecursoMasterServiceImpl();
        instance.updateRecurso(id, recurso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class _RecursoMasterServiceImpl extends _RecursoMasterService {
    }
    
}
