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

package co.edu.uniandes.csw.SOFPA.recurso.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.inject.Inject;

import co.edu.uniandes.csw.SOFPA.recurso.logic.api.IRecursoLogicService;
import co.edu.uniandes.csw.SOFPA.recurso.logic.dto.RecursoDTO;
import co.edu.uniandes.csw.SOFPA.recurso.logic.dto.RecursoPageDTO;


public abstract class _RecursoService {

	@Inject
	protected IRecursoLogicService recursoLogicService;
	
	@POST
	public RecursoDTO createRecurso(RecursoDTO recurso){
		return recursoLogicService.createRecurso(recurso);
	}
	
	@DELETE
	@Path("{id}")
	public void deleteRecurso(@PathParam("id") Long id){
		recursoLogicService.deleteRecurso(id);
	}
	
	@GET
	public RecursoPageDTO getRecursos(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords){
		return recursoLogicService.getRecursos(page, maxRecords);
	}
	
	@GET
	@Path("{id}")
	public RecursoDTO getRecurso(@PathParam("id") Long id){
		return recursoLogicService.getRecurso(id);
	}
	
	@PUT
	public void updateRecurso(@PathParam("id") Long id, RecursoDTO recurso){
		recursoLogicService.updateRecurso(recurso);
	}
	
}