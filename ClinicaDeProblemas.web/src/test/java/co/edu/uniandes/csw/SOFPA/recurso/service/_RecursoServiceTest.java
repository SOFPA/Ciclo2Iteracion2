/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.recurso.service;

import co.edu.uniandes.csw.SOFPA.recurso.logic.dto.RecursoDTO;
import co.edu.uniandes.csw.SOFPA.recurso.logic.dto.RecursoPageDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class _RecursoServiceTest {
    
    public _RecursoServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createRecurso method, of class _RecursoService.
     */
    @Test
    public void testCreateRecurso() {
        System.out.println("createRecurso");
        RecursoDTO recurso = null;
        _RecursoService instance = new _RecursoServiceImpl();
        RecursoDTO expResult = null;
        RecursoDTO result = instance.createRecurso(recurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRecurso method, of class _RecursoService.
     */
    @Test
    public void testDeleteRecurso() {
        System.out.println("deleteRecurso");
        Long id = null;
        _RecursoService instance = new _RecursoServiceImpl();
        instance.deleteRecurso(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecursos method, of class _RecursoService.
     */
    @Test
    public void testGetRecursos() {
        System.out.println("getRecursos");
        Integer page = null;
        Integer maxRecords = null;
        _RecursoService instance = new _RecursoServiceImpl();
        RecursoPageDTO expResult = null;
        RecursoPageDTO result = instance.getRecursos(page, maxRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecurso method, of class _RecursoService.
     */
    @Test
    public void testGetRecurso() {
        System.out.println("getRecurso");
        Long id = null;
        _RecursoService instance = new _RecursoServiceImpl();
        RecursoDTO expResult = null;
        RecursoDTO result = instance.getRecurso(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRecurso method, of class _RecursoService.
     */
    @Test
    public void testUpdateRecurso() {
        System.out.println("updateRecurso");
        Long id = null;
        RecursoDTO recurso = null;
        _RecursoService instance = new _RecursoServiceImpl();
        instance.updateRecurso(id, recurso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class _RecursoServiceImpl extends _RecursoService {
    }
    
}
