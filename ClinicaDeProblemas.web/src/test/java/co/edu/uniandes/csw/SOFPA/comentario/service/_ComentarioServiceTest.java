/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.comentario.service;

import co.edu.uniandes.csw.SOFPA.comentario.logic.dto.ComentarioDTO;
import co.edu.uniandes.csw.SOFPA.comentario.logic.dto.ComentarioPageDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class _ComentarioServiceTest {
    
    public _ComentarioServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createComentario method, of class _ComentarioService.
     */
    @Test
    public void testCreateComentario() {
        System.out.println("createComentario");
        ComentarioDTO comentario = null;
        _ComentarioService instance = new _ComentarioServiceImpl();
        ComentarioDTO expResult = null;
        ComentarioDTO result = instance.createComentario(comentario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteComentario method, of class _ComentarioService.
     */
    @Test
    public void testDeleteComentario() {
        System.out.println("deleteComentario");
        Long id = null;
        _ComentarioService instance = new _ComentarioServiceImpl();
        instance.deleteComentario(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentarios method, of class _ComentarioService.
     */
    @Test
    public void testGetComentarios() {
        System.out.println("getComentarios");
        Integer page = null;
        Integer maxRecords = null;
        _ComentarioService instance = new _ComentarioServiceImpl();
        ComentarioPageDTO expResult = null;
        ComentarioPageDTO result = instance.getComentarios(page, maxRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class _ComentarioService.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        Long id = null;
        _ComentarioService instance = new _ComentarioServiceImpl();
        ComentarioDTO expResult = null;
        ComentarioDTO result = instance.getComentario(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateComentario method, of class _ComentarioService.
     */
    @Test
    public void testUpdateComentario() {
        System.out.println("updateComentario");
        Long id = null;
        ComentarioDTO comentario = null;
        _ComentarioService instance = new _ComentarioServiceImpl();
        instance.updateComentario(id, comentario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class _ComentarioServiceImpl extends _ComentarioService {
    }
    
}
