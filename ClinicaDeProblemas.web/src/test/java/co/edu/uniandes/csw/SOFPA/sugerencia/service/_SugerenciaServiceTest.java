/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.sugerencia.service;

import co.edu.uniandes.csw.SOFPA.sugerencia.logic.dto.SugerenciaDTO;
import co.edu.uniandes.csw.SOFPA.sugerencia.logic.dto.SugerenciaPageDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class _SugerenciaServiceTest {
    
    public _SugerenciaServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createSugerencia method, of class _SugerenciaService.
     */
    @Test
    public void testCreateSugerencia() {
        System.out.println("createSugerencia");
        SugerenciaDTO sugerencia = null;
        _SugerenciaService instance = new _SugerenciaServiceImpl();
        SugerenciaDTO expResult = null;
        SugerenciaDTO result = instance.createSugerencia(sugerencia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSugerencia method, of class _SugerenciaService.
     */
    @Test
    public void testDeleteSugerencia() {
        System.out.println("deleteSugerencia");
        Long id = null;
        _SugerenciaService instance = new _SugerenciaServiceImpl();
        instance.deleteSugerencia(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugerencias method, of class _SugerenciaService.
     */
    @Test
    public void testGetSugerencias() {
        System.out.println("getSugerencias");
        Integer page = null;
        Integer maxRecords = null;
        _SugerenciaService instance = new _SugerenciaServiceImpl();
        SugerenciaPageDTO expResult = null;
        SugerenciaPageDTO result = instance.getSugerencias(page, maxRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugerencia method, of class _SugerenciaService.
     */
    @Test
    public void testGetSugerencia() {
        System.out.println("getSugerencia");
        Long id = null;
        _SugerenciaService instance = new _SugerenciaServiceImpl();
        SugerenciaDTO expResult = null;
        SugerenciaDTO result = instance.getSugerencia(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSugerencia method, of class _SugerenciaService.
     */
    @Test
    public void testUpdateSugerencia() {
        System.out.println("updateSugerencia");
        Long id = null;
        SugerenciaDTO sugerencia = null;
        _SugerenciaService instance = new _SugerenciaServiceImpl();
        instance.updateSugerencia(id, sugerencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class _SugerenciaServiceImpl extends _SugerenciaService {
    }
    
}
