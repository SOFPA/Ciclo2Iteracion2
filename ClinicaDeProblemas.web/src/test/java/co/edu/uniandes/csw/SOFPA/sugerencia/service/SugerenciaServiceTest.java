/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.sugerencia.service;

import co.edu.uniandes.csw.SOFPA.sugerencia.logic.dto.SugerenciaDTO;
import co.edu.uniandes.csw.SOFPA.sugerencia.logic.dto.SugerenciaPageDTO;
import javax.ejb.embeddable.EJBContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class SugerenciaServiceTest {
    
    public SugerenciaServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createSugerencia method, of class SugerenciaService.
     */
    @Test
    public void testCreateSugerencia() throws Exception {
        System.out.println("createSugerencia");
        SugerenciaDTO sugerencia = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SugerenciaService instance = (SugerenciaService)container.getContext().lookup("java:global/classes/SugerenciaService");
        SugerenciaDTO expResult = null;
        SugerenciaDTO result = instance.createSugerencia(sugerencia);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSugerencia method, of class SugerenciaService.
     */
    @Test
    public void testDeleteSugerencia() throws Exception {
        System.out.println("deleteSugerencia");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SugerenciaService instance = (SugerenciaService)container.getContext().lookup("java:global/classes/SugerenciaService");
        instance.deleteSugerencia(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugerencias method, of class SugerenciaService.
     */
    @Test
    public void testGetSugerencias() throws Exception {
        System.out.println("getSugerencias");
        Integer page = null;
        Integer maxRecords = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SugerenciaService instance = (SugerenciaService)container.getContext().lookup("java:global/classes/SugerenciaService");
        SugerenciaPageDTO expResult = null;
        SugerenciaPageDTO result = instance.getSugerencias(page, maxRecords);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugerencia method, of class SugerenciaService.
     */
    @Test
    public void testGetSugerencia() throws Exception {
        System.out.println("getSugerencia");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SugerenciaService instance = (SugerenciaService)container.getContext().lookup("java:global/classes/SugerenciaService");
        SugerenciaDTO expResult = null;
        SugerenciaDTO result = instance.getSugerencia(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSugerencia method, of class SugerenciaService.
     */
    @Test
    public void testUpdateSugerencia() throws Exception {
        System.out.println("updateSugerencia");
        Long id = null;
        SugerenciaDTO sugerencia = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SugerenciaService instance = (SugerenciaService)container.getContext().lookup("java:global/classes/SugerenciaService");
        instance.updateSugerencia(id, sugerencia);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
