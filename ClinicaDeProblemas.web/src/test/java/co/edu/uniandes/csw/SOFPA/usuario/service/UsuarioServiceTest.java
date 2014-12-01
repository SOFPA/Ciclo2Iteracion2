/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.SOFPA.usuario.service;

import co.edu.uniandes.csw.SOFPA.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SOFPA.usuario.logic.dto.UsuarioPageDTO;
import javax.ejb.embeddable.EJBContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class UsuarioServiceTest {
    
    public UsuarioServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createUsuario method, of class UsuarioService.
     */
    @Test
    public void testCreateUsuario() throws Exception {
        System.out.println("createUsuario");
        UsuarioDTO usuario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioService instance = (UsuarioService)container.getContext().lookup("java:global/classes/UsuarioService");
        UsuarioDTO expResult = null;
        UsuarioDTO result = instance.createUsuario(usuario);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUsuario method, of class UsuarioService.
     */
    @Test
    public void testDeleteUsuario() throws Exception {
        System.out.println("deleteUsuario");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioService instance = (UsuarioService)container.getContext().lookup("java:global/classes/UsuarioService");
        instance.deleteUsuario(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarios method, of class UsuarioService.
     */
    @Test
    public void testGetUsuarios() throws Exception {
        System.out.println("getUsuarios");
        Integer page = null;
        Integer maxRecords = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioService instance = (UsuarioService)container.getContext().lookup("java:global/classes/UsuarioService");
        UsuarioPageDTO expResult = null;
        UsuarioPageDTO result = instance.getUsuarios(page, maxRecords);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class UsuarioService.
     */
    @Test
    public void testGetUsuario() throws Exception {
        System.out.println("getUsuario");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioService instance = (UsuarioService)container.getContext().lookup("java:global/classes/UsuarioService");
        UsuarioDTO expResult = null;
        UsuarioDTO result = instance.getUsuario(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUsuario method, of class UsuarioService.
     */
    @Test
    public void testUpdateUsuario() throws Exception {
        System.out.println("updateUsuario");
        Long id = null;
        UsuarioDTO usuario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioService instance = (UsuarioService)container.getContext().lookup("java:global/classes/UsuarioService");
        instance.updateUsuario(id, usuario);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteId method, of class UsuarioService.
     */
    @Test
    public void testGetClienteId() throws Exception {
        System.out.println("getClienteId");
        String name = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioService instance = (UsuarioService)container.getContext().lookup("java:global/classes/UsuarioService");
        String expResult = "";
        String result = instance.getClienteId(name);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientebyName method, of class UsuarioService.
     */
    @Test
    public void testGetClientebyName() throws Exception {
        System.out.println("getClientebyName");
        String name = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioService instance = (UsuarioService)container.getContext().lookup("java:global/classes/UsuarioService");
        UsuarioDTO expResult = null;
        UsuarioDTO result = instance.getClientebyName(name);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
