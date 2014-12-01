/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.usuario.service;

import co.edu.uniandes.csw.SOFPA.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SOFPA.usuario.logic.dto.UsuarioPageDTO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class _UsuarioServiceTest {
    
    public _UsuarioServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createUsuario method, of class _UsuarioService.
     */
    @Test
    public void testCreateUsuario() {
        System.out.println("createUsuario");
        UsuarioDTO usuario = null;
        _UsuarioService instance = new _UsuarioServiceImpl();
        UsuarioDTO expResult = null;
        UsuarioDTO result = instance.createUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUsuario method, of class _UsuarioService.
     */
    @Test
    public void testDeleteUsuario() {
        System.out.println("deleteUsuario");
        Long id = null;
        _UsuarioService instance = new _UsuarioServiceImpl();
        instance.deleteUsuario(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarios method, of class _UsuarioService.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        Integer page = null;
        Integer maxRecords = null;
        _UsuarioService instance = new _UsuarioServiceImpl();
        UsuarioPageDTO expResult = null;
        UsuarioPageDTO result = instance.getUsuarios(page, maxRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class _UsuarioService.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Long id = null;
        _UsuarioService instance = new _UsuarioServiceImpl();
        UsuarioDTO expResult = null;
        UsuarioDTO result = instance.getUsuario(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUsuario method, of class _UsuarioService.
     */
    @Test
    public void testUpdateUsuario() {
        System.out.println("updateUsuario");
        Long id = null;
        UsuarioDTO usuario = null;
        _UsuarioService instance = new _UsuarioServiceImpl();
        instance.updateUsuario(id, usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class _UsuarioServiceImpl extends _UsuarioService {
    }
    
}
