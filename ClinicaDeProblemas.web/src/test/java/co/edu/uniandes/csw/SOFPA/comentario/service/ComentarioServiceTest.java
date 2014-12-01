/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.comentario.service;

import co.edu.uniandes.csw.SOFPA.comentario.logic.dto.ComentarioDTO;
import co.edu.uniandes.csw.SOFPA.comentario.logic.dto.ComentarioPageDTO;
import javax.ejb.embeddable.EJBContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class ComentarioServiceTest {
    
    public ComentarioServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createComentario method, of class ComentarioService.
     */
    @Test
    public void testCreateComentario() throws Exception {
        System.out.println("createComentario");
        ComentarioDTO comentario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ComentarioService instance = (ComentarioService)container.getContext().lookup("java:global/classes/ComentarioService");
        ComentarioDTO expResult = null;
        ComentarioDTO result = instance.createComentario(comentario);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteComentario method, of class ComentarioService.
     */
    @Test
    public void testDeleteComentario() throws Exception {
        System.out.println("deleteComentario");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ComentarioService instance = (ComentarioService)container.getContext().lookup("java:global/classes/ComentarioService");
        instance.deleteComentario(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentarios method, of class ComentarioService.
     */
    @Test
    public void testGetComentarios() throws Exception {
        System.out.println("getComentarios");
        Integer page = null;
        Integer maxRecords = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ComentarioService instance = (ComentarioService)container.getContext().lookup("java:global/classes/ComentarioService");
        ComentarioPageDTO expResult = null;
        ComentarioPageDTO result = instance.getComentarios(page, maxRecords);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class ComentarioService.
     */
    @Test
    public void testGetComentario() throws Exception {
        System.out.println("getComentario");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ComentarioService instance = (ComentarioService)container.getContext().lookup("java:global/classes/ComentarioService");
        ComentarioDTO expResult = null;
        ComentarioDTO result = instance.getComentario(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateComentario method, of class ComentarioService.
     */
    @Test
    public void testUpdateComentario() throws Exception {
        System.out.println("updateComentario");
        Long id = null;
        ComentarioDTO comentario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ComentarioService instance = (ComentarioService)container.getContext().lookup("java:global/classes/ComentarioService");
        instance.updateComentario(id, comentario);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
