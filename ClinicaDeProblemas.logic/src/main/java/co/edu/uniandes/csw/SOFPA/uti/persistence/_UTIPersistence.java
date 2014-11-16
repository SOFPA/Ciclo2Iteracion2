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

package co.edu.uniandes.csw.SOFPA.uti.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.uniandes.csw.SOFPA.uti.logic.dto.UTIDTO;
import co.edu.uniandes.csw.SOFPA.uti.logic.dto.UTIPageDTO;
import co.edu.uniandes.csw.SOFPA.uti.persistence.api._IUTIPersistence;
import co.edu.uniandes.csw.SOFPA.uti.persistence.converter.UTIConverter;
import co.edu.uniandes.csw.SOFPA.uti.persistence.entity.UTIEntity;

public abstract class _UTIPersistence implements _IUTIPersistence {

  	@PersistenceContext(unitName="ClinicaDeProblemasPU")
 
	protected EntityManager entityManager;
	
	public UTIDTO createUTI(UTIDTO uTI) {
		UTIEntity entity=UTIConverter.persistenceDTO2Entity(uTI);
		entityManager.persist(entity);
		return UTIConverter.entity2PersistenceDTO(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<UTIDTO> getUTIs() {
		Query q = entityManager.createQuery("select u from UTIEntity u");
		return UTIConverter.entity2PersistenceDTOList(q.getResultList());
	}

	@SuppressWarnings("unchecked")
	public UTIPageDTO getUTIs(Integer page, Integer maxRecords) {
		Query count = entityManager.createQuery("select count(u) from UTIEntity u");
		Long regCount = 0L;
		regCount = Long.parseLong(count.getSingleResult().toString());
		Query q = entityManager.createQuery("select u from UTIEntity u");
		if (page != null && maxRecords != null) {
		    q.setFirstResult((page-1)*maxRecords);
		    q.setMaxResults(maxRecords);
		}
		UTIPageDTO response = new UTIPageDTO();
		response.setTotalRecords(regCount);
		response.setRecords(UTIConverter.entity2PersistenceDTOList(q.getResultList()));
		return response;
	}

	public UTIDTO getUTI(Long id) {
		return UTIConverter.entity2PersistenceDTO(entityManager.find(UTIEntity.class, id));
	}

	public void deleteUTI(Long id) {
		UTIEntity entity=entityManager.find(UTIEntity.class, id);
		entityManager.remove(entity);
	}

	public void updateUTI(UTIDTO detail) {
		UTIEntity entity=entityManager.merge(UTIConverter.persistenceDTO2Entity(detail));
		UTIConverter.entity2PersistenceDTO(entity);
	}

}