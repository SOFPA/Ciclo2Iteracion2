/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.opinion.service;

import co.edu.uniandes.csw.SOFPA.opinion.logic.dto.OpinionDTO;
import co.edu.uniandes.csw.SOFPA.opinion.logic.dto.OpinionPageDTO;
import javax.ejb.embeddable.EJBContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class OpinionServiceTest {
    
    public OpinionServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createOpinion method, of class OpinionService.
     */
    @Test
    public void testCreateOpinion() throws Exception {
        System.out.println("createOpinion");
        OpinionDTO opinion = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OpinionService instance = (OpinionService)container.getContext().lookup("java:global/classes/OpinionService");
        OpinionDTO expResult = null;
        OpinionDTO result = instance.createOpinion(opinion);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteOpinion method, of class OpinionService.
     */
    @Test
    public void testDeleteOpinion() throws Exception {
        System.out.println("deleteOpinion");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OpinionService instance = (OpinionService)container.getContext().lookup("java:global/classes/OpinionService");
        instance.deleteOpinion(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpinions method, of class OpinionService.
     */
    @Test
    public void testGetOpinions() throws Exception {
        System.out.println("getOpinions");
        Integer page = null;
        Integer maxRecords = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OpinionService instance = (OpinionService)container.getContext().lookup("java:global/classes/OpinionService");
        OpinionPageDTO expResult = null;
        OpinionPageDTO result = instance.getOpinions(page, maxRecords);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpinion method, of class OpinionService.
     */
    @Test
    public void testGetOpinion() throws Exception {
        System.out.println("getOpinion");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OpinionService instance = (OpinionService)container.getContext().lookup("java:global/classes/OpinionService");
        OpinionDTO expResult = null;
        OpinionDTO result = instance.getOpinion(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateOpinion method, of class OpinionService.
     */
    @Test
    public void testUpdateOpinion() throws Exception {
        System.out.println("updateOpinion");
        Long id = null;
        OpinionDTO opinion = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OpinionService instance = (OpinionService)container.getContext().lookup("java:global/classes/OpinionService");
        instance.updateOpinion(id, opinion);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
