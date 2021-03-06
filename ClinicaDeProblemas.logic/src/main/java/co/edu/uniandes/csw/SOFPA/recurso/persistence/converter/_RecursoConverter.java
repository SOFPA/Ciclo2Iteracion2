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

package co.edu.uniandes.csw.SOFPA.recurso.persistence.converter;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


import co.edu.uniandes.csw.SOFPA.recurso.logic.dto.RecursoDTO;
import co.edu.uniandes.csw.SOFPA.recurso.persistence.entity.RecursoEntity;

public abstract class _RecursoConverter {

	public static RecursoDTO entity2PersistenceDTO(RecursoEntity entity){
		if (entity != null) {
			RecursoDTO dto = new RecursoDTO();
					dto.setName(entity.getName());
					dto.setId(entity.getId());
					dto.setTema(entity.getTema());
					dto.setDificultad(entity.getDificultad());
					dto.setTipo(entity.getTipo());
					dto.setAvalado(entity.getAvalado());
					dto.setSemestre(entity.getSemestre());
					dto.setMateria(entity.getMateria());
					dto.setUrl(entity.getUrl());
			return dto;
		}else{
			return null;
		}
	}
	
	public static RecursoEntity persistenceDTO2Entity(RecursoDTO dto){
		if(dto!=null){
			RecursoEntity entity=new RecursoEntity();
					entity.setName(dto.getName());
			
					entity.setId(dto.getId());
			
					entity.setTema(dto.getTema());
			
					entity.setDificultad(dto.getDificultad());
			
					entity.setTipo(dto.getTipo());
			
					entity.setAvalado(dto.getAvalado());
			
					entity.setSemestre(dto.getSemestre());
			
					entity.setMateria(dto.getMateria());
			
					entity.setUrl(dto.getUrl());
			
			return entity;
		}else {
			return null;
		}
	}
	
	public static List<RecursoDTO> entity2PersistenceDTOList(List<RecursoEntity> entities){
		List<RecursoDTO> dtos=new ArrayList<RecursoDTO>();
		for(RecursoEntity entity:entities){
			dtos.add(entity2PersistenceDTO(entity));
		}
		return dtos;
	}
	
	public static List<RecursoEntity> persistenceDTO2EntityList(List<RecursoDTO> dtos){
		List<RecursoEntity> entities=new ArrayList<RecursoEntity>();
		for(RecursoDTO dto:dtos){
			entities.add(persistenceDTO2Entity(dto));
		}
		return entities;
	}
}