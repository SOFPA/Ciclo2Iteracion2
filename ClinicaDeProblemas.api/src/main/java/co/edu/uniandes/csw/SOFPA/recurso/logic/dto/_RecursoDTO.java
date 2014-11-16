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

package co.edu.uniandes.csw.SOFPA.recurso.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _RecursoDTO {

	

	private String name;
	

	private Long id;
	

	private String tema;
	

	private String dificultad;
	

	private String tipo;
	

	private Boolean avalado;
	

	private Integer semestre;
	

	private String materia;
	

	private String url;



	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}


	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}


	public String getTema() {
		return tema;
	}
 
	public void setTema(String tema) {
		this.tema = tema;
	}


	public String getDificultad() {
		return dificultad;
	}
 
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}


	public String getTipo() {
		return tipo;
	}
 
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Boolean getAvalado() {
		return avalado;
	}
 
	public void setAvalado(Boolean avalado) {
		this.avalado = avalado;
	}


	public Integer getSemestre() {
		return semestre;
	}
 
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}


	public String getMateria() {
		return materia;
	}
 
	public void setMateria(String materia) {
		this.materia = materia;
	}


	public String getUrl() {
		return url;
	}
 
	public void setUrl(String url) {
		this.url = url;
	}
	
}