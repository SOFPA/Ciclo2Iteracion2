/* ========================================================================
 * Copyright 2014 SOFPA
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 SOFPA

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201410152247

*/

package co.edu.uniandes.csw.SOFPA.sugerencia.persistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.*;


import co.edu.uniandes.csw.SOFPA.sugerencia.logic.dto.SugerenciaPageDTO;
import co.edu.uniandes.csw.SOFPA.sugerencia.logic.dto.SugerenciaDTO;
import co.edu.uniandes.csw.SOFPA.sugerencia.persistence.api.ISugerenciaPersistence;
import co.edu.uniandes.csw.SOFPA.sugerencia.persistence.entity.SugerenciaEntity;
import co.edu.uniandes.csw.SOFPA.sugerencia.persistence.converter.SugerenciaConverter;
import static co.edu.uniandes.csw.SOFPA.util._TestUtil.*;

@RunWith(Arquillian.class)
public class SugerenciaPersistenceTest {

	public static final String DEPLOY = "Prueba";

	@Deployment
	public static WebArchive createDeployment() {
		return ShrinkWrap.create(WebArchive.class, DEPLOY + ".war")
				.addPackage(SugerenciaPersistence.class.getPackage())
				.addPackage(SugerenciaEntity.class.getPackage())
				.addPackage(ISugerenciaPersistence.class.getPackage())
                .addPackage(SugerenciaDTO.class.getPackage())
                .addPackage(SugerenciaConverter.class.getPackage())
				.addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml")
                .addAsWebInfResource("META-INF/beans.xml", "beans.xml");
	}

	@Inject
	private ISugerenciaPersistence sugerenciaPersistence;

	@PersistenceContext
	private EntityManager em;

	@Inject
	UserTransaction utx;

	@Before
	public void configTest() {
		System.out.println("em: " + em);
		try {
			utx.begin();
			clearData();
			insertData();
			utx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				utx.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	private void clearData() {
		em.createQuery("delete from SugerenciaEntity").executeUpdate();
	}

	private List<SugerenciaEntity> data=new ArrayList<SugerenciaEntity>();

	private void insertData() {
		for(int i=0;i<3;i++){
			SugerenciaEntity entity=new SugerenciaEntity();
			entity.setName(generateRandom(String.class));
			entity.setObsevacion(generateRandom(String.class));
			entity.setTema(generateRandom(String.class));
			entity.setLogin(generateRandom(String.class));
			entity.setCodigo(generateRandom(Integer.class));
			entity.setCarrera(generateRandom(String.class));
			em.persist(entity);
			data.add(entity);
		}
	}
	
	@Test
	public void createSugerenciaTest(){
		SugerenciaDTO dto=new SugerenciaDTO();
		dto.setName(generateRandom(String.class));
		dto.setObsevacion(generateRandom(String.class));
		dto.setTema(generateRandom(String.class));
		dto.setLogin(generateRandom(String.class));
		dto.setCodigo(generateRandom(Integer.class));
		dto.setCarrera(generateRandom(String.class));
		
		SugerenciaDTO result=sugerenciaPersistence.createSugerencia(dto);
		
		Assert.assertNotNull(result);
		
		SugerenciaEntity entity=em.find(SugerenciaEntity.class, result.getId());
		
		Assert.assertEquals(dto.getName(), entity.getName());
		Assert.assertEquals(dto.getObsevacion(), entity.getObsevacion());
		Assert.assertEquals(dto.getTema(), entity.getTema());
		Assert.assertEquals(dto.getLogin(), entity.getLogin());
		Assert.assertEquals(dto.getCodigo(), entity.getCodigo());
		Assert.assertEquals(dto.getCarrera(), entity.getCarrera());
	}
	
	@Test
	public void getSugerenciasTest(){
		List<SugerenciaDTO> list=sugerenciaPersistence.getSugerencias();
		Assert.assertEquals(list.size(), data.size());
        for(SugerenciaDTO dto:list){
        	boolean found=false;
            for(SugerenciaEntity entity:data){
            	if(dto.getId().equals(entity.getId())){
                	found=true;
                }
            }
            Assert.assertTrue(found);
        }
	}
	
	@Test
	public void getSugerenciaTest(){
		SugerenciaEntity entity=data.get(0);
		SugerenciaDTO dto=sugerenciaPersistence.getSugerencia(entity.getId());
        Assert.assertNotNull(dto);
		Assert.assertEquals(entity.getName(), dto.getName());
		Assert.assertEquals(entity.getObsevacion(), dto.getObsevacion());
		Assert.assertEquals(entity.getTema(), dto.getTema());
		Assert.assertEquals(entity.getLogin(), dto.getLogin());
		Assert.assertEquals(entity.getCodigo(), dto.getCodigo());
		Assert.assertEquals(entity.getCarrera(), dto.getCarrera());
        
	}
	
	@Test
	public void deleteSugerenciaTest(){
		SugerenciaEntity entity=data.get(0);
		sugerenciaPersistence.deleteSugerencia(entity.getId());
        SugerenciaEntity deleted=em.find(SugerenciaEntity.class, entity.getId());
        Assert.assertNull(deleted);
	}
	
	@Test
	public void updateSugerenciaTest(){
		SugerenciaEntity entity=data.get(0);
		
		SugerenciaDTO dto=new SugerenciaDTO();
		dto.setId(entity.getId());
		dto.setName(generateRandom(String.class));
		dto.setObsevacion(generateRandom(String.class));
		dto.setTema(generateRandom(String.class));
		dto.setLogin(generateRandom(String.class));
		dto.setCodigo(generateRandom(Integer.class));
		dto.setCarrera(generateRandom(String.class));
		
		
		sugerenciaPersistence.updateSugerencia(dto);
		
		
		SugerenciaEntity resp=em.find(SugerenciaEntity.class, entity.getId());
		
		Assert.assertEquals(dto.getName(), resp.getName());	
		Assert.assertEquals(dto.getObsevacion(), resp.getObsevacion());	
		Assert.assertEquals(dto.getTema(), resp.getTema());	
		Assert.assertEquals(dto.getLogin(), resp.getLogin());	
		Assert.assertEquals(dto.getCodigo(), resp.getCodigo());	
		Assert.assertEquals(dto.getCarrera(), resp.getCarrera());	
	}
	
	@Test
	public void getSugerenciaPaginationTest(){
		//Page 1
		SugerenciaPageDTO dto1=sugerenciaPersistence.getSugerencias(1,2);
        Assert.assertNotNull(dto1);
        Assert.assertEquals(dto1.getRecords().size(),2);
        Assert.assertEquals(dto1.getTotalRecords().longValue(),3L);
        //Page 2
        SugerenciaPageDTO dto2=sugerenciaPersistence.getSugerencias(2,2);
        Assert.assertNotNull(dto2);
        Assert.assertEquals(dto2.getRecords().size(),1);
        Assert.assertEquals(dto2.getTotalRecords().longValue(),3L);
        
        for(SugerenciaDTO dto:dto1.getRecords()){
        	boolean found=false;	
            for(SugerenciaEntity entity:data){
            	if(dto.getId().equals(entity.getId())){
                	found=true;
                }
            }
            Assert.assertTrue(found);
        }
        
        for(SugerenciaDTO dto:dto2.getRecords()){
        	boolean found=false;
            for(SugerenciaEntity entity:data){
            	if(dto.getId().equals(entity.getId())){
                	found=true;
                }
            }
            Assert.assertTrue(found);
        }
	}
	
}