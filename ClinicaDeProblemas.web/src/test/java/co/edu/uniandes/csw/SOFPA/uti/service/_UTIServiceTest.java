/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.uti.service;

import co.edu.uniandes.csw.SOFPA.uti.logic.dto.UTIDTO;
import co.edu.uniandes.csw.SOFPA.uti.logic.dto.UTIPageDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class _UTIServiceTest {
    
    public _UTIServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createUTI method, of class _UTIService.
     */
    @Test
    public void testCreateUTI() {
        System.out.println("createUTI");
        UTIDTO uTI = null;
        _UTIService instance = new _UTIServiceImpl();
        UTIDTO expResult = null;
        UTIDTO result = instance.createUTI(uTI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUTI method, of class _UTIService.
     */
    @Test
    public void testDeleteUTI() {
        System.out.println("deleteUTI");
        Long id = null;
        _UTIService instance = new _UTIServiceImpl();
        instance.deleteUTI(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUTIs method, of class _UTIService.
     */
    @Test
    public void testGetUTIs() {
        System.out.println("getUTIs");
        Integer page = null;
        Integer maxRecords = null;
        _UTIService instance = new _UTIServiceImpl();
        UTIPageDTO expResult = null;
        UTIPageDTO result = instance.getUTIs(page, maxRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUTI method, of class _UTIService.
     */
    @Test
    public void testGetUTI() {
        System.out.println("getUTI");
        Long id = null;
        _UTIService instance = new _UTIServiceImpl();
        UTIDTO expResult = null;
        UTIDTO result = instance.getUTI(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUTI method, of class _UTIService.
     */
    @Test
    public void testUpdateUTI() {
        System.out.println("updateUTI");
        Long id = null;
        UTIDTO uTI = null;
        _UTIService instance = new _UTIServiceImpl();
        instance.updateUTI(id, uTI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class _UTIServiceImpl extends _UTIService {
    }
    
}
