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

package co.edu.uniandes.csw.SOFPA.opinion.persistence;

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


import co.edu.uniandes.csw.SOFPA.opinion.logic.dto.OpinionPageDTO;
import co.edu.uniandes.csw.SOFPA.opinion.logic.dto.OpinionDTO;
import co.edu.uniandes.csw.SOFPA.opinion.persistence.api.IOpinionPersistence;
import co.edu.uniandes.csw.SOFPA.opinion.persistence.entity.OpinionEntity;
import co.edu.uniandes.csw.SOFPA.opinion.persistence.converter.OpinionConverter;
import static co.edu.uniandes.csw.SOFPA.util._TestUtil.*;

@RunWith(Arquillian.class)
public class OpinionPersistenceTest {

	public static final String DEPLOY = "Prueba";

	@Deployment
	public static WebArchive createDeployment() {
		return ShrinkWrap.create(WebArchive.class, DEPLOY + ".war")
				.addPackage(OpinionPersistence.class.getPackage())
				.addPackage(OpinionEntity.class.getPackage())
				.addPackage(IOpinionPersistence.class.getPackage())
                .addPackage(OpinionDTO.class.getPackage())
                .addPackage(OpinionConverter.class.getPackage())
				.addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml")
                .addAsWebInfResource("META-INF/beans.xml", "beans.xml");
	}

	@Inject
	private IOpinionPersistence opinionPersistence;

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
		em.createQuery("delete from OpinionEntity").executeUpdate();
	}

	private List<OpinionEntity> data=new ArrayList<OpinionEntity>();

	private void insertData() {
		for(int i=0;i<3;i++){
			OpinionEntity entity=new OpinionEntity();
			entity.setName(generateRandom(String.class));
			entity.setContenido(generateRandom(String.class));
			entity.setCalificacion(generateRandom(Integer.class));
			entity.setDificultadEjercicios(generateRandom(String.class));
			entity.setSolucionDudas(generateRandom(Integer.class));
			entity.setFueDeAyuda(generateRandom(Boolean.class));
			em.persist(entity);
			data.add(entity);
		}
	}
	
	@Test
	public void createOpinionTest(){
		OpinionDTO dto=new OpinionDTO();
		dto.setName(generateRandom(String.class));
		dto.setContenido(generateRandom(String.class));
		dto.setCalificacion(generateRandom(Integer.class));
		dto.setDificultadEjercicios(generateRandom(String.class));
		dto.setSolucionDudas(generateRandom(Integer.class));
		dto.setFueDeAyuda(generateRandom(Boolean.class));
		
		OpinionDTO result=opinionPersistence.createOpinion(dto);
		
		Assert.assertNotNull(result);
		
		OpinionEntity entity=em.find(OpinionEntity.class, result.getId());
		
		Assert.assertEquals(dto.getName(), entity.getName());
		Assert.assertEquals(dto.getContenido(), entity.getContenido());
		Assert.assertEquals(dto.getCalificacion(), entity.getCalificacion());
		Assert.assertEquals(dto.getDificultadEjercicios(), entity.getDificultadEjercicios());
		Assert.assertEquals(dto.getSolucionDudas(), entity.getSolucionDudas());
		Assert.assertEquals(dto.getFueDeAyuda(), entity.getFueDeAyuda());
	}
	
	@Test
	public void getOpinionsTest(){
		List<OpinionDTO> list=opinionPersistence.getOpinions();
		Assert.assertEquals(list.size(), data.size());
        for(OpinionDTO dto:list){
        	boolean found=false;
            for(OpinionEntity entity:data){
            	if(dto.getId().equals(entity.getId())){
                	found=true;
                }
            }
            Assert.assertTrue(found);
        }
	}
	
	@Test
	public void getOpinionTest(){
		OpinionEntity entity=data.get(0);
		OpinionDTO dto=opinionPersistence.getOpinion(entity.getId());
        Assert.assertNotNull(dto);
		Assert.assertEquals(entity.getName(), dto.getName());
		Assert.assertEquals(entity.getContenido(), dto.getContenido());
		Assert.assertEquals(entity.getCalificacion(), dto.getCalificacion());
		Assert.assertEquals(entity.getDificultadEjercicios(), dto.getDificultadEjercicios());
		Assert.assertEquals(entity.getSolucionDudas(), dto.getSolucionDudas());
		Assert.assertEquals(entity.getFueDeAyuda(), dto.getFueDeAyuda());
        
	}
	
	@Test
	public void deleteOpinionTest(){
		OpinionEntity entity=data.get(0);
		opinionPersistence.deleteOpinion(entity.getId());
        OpinionEntity deleted=em.find(OpinionEntity.class, entity.getId());
        Assert.assertNull(deleted);
	}
	
	@Test
	public void updateOpinionTest(){
		OpinionEntity entity=data.get(0);
		
		OpinionDTO dto=new OpinionDTO();
		dto.setId(entity.getId());
		dto.setName(generateRandom(String.class));
		dto.setContenido(generateRandom(String.class));
		dto.setCalificacion(generateRandom(Integer.class));
		dto.setDificultadEjercicios(generateRandom(String.class));
		dto.setSolucionDudas(generateRandom(Integer.class));
		dto.setFueDeAyuda(generateRandom(Boolean.class));
		
		
		opinionPersistence.updateOpinion(dto);
		
		
		OpinionEntity resp=em.find(OpinionEntity.class, entity.getId());
		
		Assert.assertEquals(dto.getName(), resp.getName());	
		Assert.assertEquals(dto.getContenido(), resp.getContenido());	
		Assert.assertEquals(dto.getCalificacion(), resp.getCalificacion());	
		Assert.assertEquals(dto.getDificultadEjercicios(), resp.getDificultadEjercicios());	
		Assert.assertEquals(dto.getSolucionDudas(), resp.getSolucionDudas());	
		Assert.assertEquals(dto.getFueDeAyuda(), resp.getFueDeAyuda());	
	}
	
	@Test
	public void getOpinionPaginationTest(){
		//Page 1
		OpinionPageDTO dto1=opinionPersistence.getOpinions(1,2);
        Assert.assertNotNull(dto1);
        Assert.assertEquals(dto1.getRecords().size(),2);
        Assert.assertEquals(dto1.getTotalRecords().longValue(),3L);
        //Page 2
        OpinionPageDTO dto2=opinionPersistence.getOpinions(2,2);
        Assert.assertNotNull(dto2);
        Assert.assertEquals(dto2.getRecords().size(),1);
        Assert.assertEquals(dto2.getTotalRecords().longValue(),3L);
        
        for(OpinionDTO dto:dto1.getRecords()){
        	boolean found=false;	
            for(OpinionEntity entity:data){
            	if(dto.getId().equals(entity.getId())){
                	found=true;
                }
            }
            Assert.assertTrue(found);
        }
        
        for(OpinionDTO dto:dto2.getRecords()){
        	boolean found=false;
            for(OpinionEntity entity:data){
            	if(dto.getId().equals(entity.getId())){
                	found=true;
                }
            }
            Assert.assertTrue(found);
        }
	}
	
}