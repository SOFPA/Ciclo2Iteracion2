/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.opinion.service;

import co.edu.uniandes.csw.SOFPA.opinion.logic.dto.OpinionDTO;
import co.edu.uniandes.csw.SOFPA.opinion.logic.dto.OpinionPageDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class _OpinionServiceTest {
    
    public _OpinionServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createOpinion method, of class _OpinionService.
     */
    @Test
    public void testCreateOpinion() {
        System.out.println("createOpinion");
        OpinionDTO opinion = null;
        _OpinionService instance = new _OpinionServiceImpl();
        OpinionDTO expResult = null;
        OpinionDTO result = instance.createOpinion(opinion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteOpinion method, of class _OpinionService.
     */
    @Test
    public void testDeleteOpinion() {
        System.out.println("deleteOpinion");
        Long id = null;
        _OpinionService instance = new _OpinionServiceImpl();
        instance.deleteOpinion(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpinions method, of class _OpinionService.
     */
    @Test
    public void testGetOpinions() {
        System.out.println("getOpinions");
        Integer page = null;
        Integer maxRecords = null;
        _OpinionService instance = new _OpinionServiceImpl();
        OpinionPageDTO expResult = null;
        OpinionPageDTO result = instance.getOpinions(page, maxRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpinion method, of class _OpinionService.
     */
    @Test
    public void testGetOpinion() {
        System.out.println("getOpinion");
        Long id = null;
        _OpinionService instance = new _OpinionServiceImpl();
        OpinionDTO expResult = null;
        OpinionDTO result = instance.getOpinion(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateOpinion method, of class _OpinionService.
     */
    @Test
    public void testUpdateOpinion() {
        System.out.println("updateOpinion");
        Long id = null;
        OpinionDTO opinion = null;
        _OpinionService instance = new _OpinionServiceImpl();
        instance.updateOpinion(id, opinion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class _OpinionServiceImpl extends _OpinionService {
    }
    
}
