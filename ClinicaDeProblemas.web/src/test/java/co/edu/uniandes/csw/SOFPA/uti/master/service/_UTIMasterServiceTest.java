/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.uti.master.service;

import co.edu.uniandes.csw.SOFPA.uti.master.logic.dto.UTIMasterDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class _UTIMasterServiceTest {
    
    public _UTIMasterServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createUTI method, of class _UTIMasterService.
     */
    @Test
    public void testCreateUTI() {
        System.out.println("createUTI");
        UTIMasterDTO uti = null;
        _UTIMasterService instance = new _UTIMasterServiceImpl();
        UTIMasterDTO expResult = null;
        UTIMasterDTO result = instance.createUTI(uti);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUTI method, of class _UTIMasterService.
     */
    @Test
    public void testDeleteUTI() {
        System.out.println("deleteUTI");
        Long id = null;
        _UTIMasterService instance = new _UTIMasterServiceImpl();
        instance.deleteUTI(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUTI method, of class _UTIMasterService.
     */
    @Test
    public void testGetUTI() {
        System.out.println("getUTI");
        Long id = null;
        _UTIMasterService instance = new _UTIMasterServiceImpl();
        UTIMasterDTO expResult = null;
        UTIMasterDTO result = instance.getUTI(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUTI method, of class _UTIMasterService.
     */
    @Test
    public void testUpdateUTI() {
        System.out.println("updateUTI");
        Long id = null;
        UTIMasterDTO uti = null;
        _UTIMasterService instance = new _UTIMasterServiceImpl();
        instance.updateUTI(id, uti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class _UTIMasterServiceImpl extends _UTIMasterService {
    }
    
}
