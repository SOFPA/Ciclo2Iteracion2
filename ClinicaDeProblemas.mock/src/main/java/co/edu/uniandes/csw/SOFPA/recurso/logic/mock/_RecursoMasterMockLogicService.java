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

package co.edu.uniandes.csw.SOFPA.recurso.logic.mock;
import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.csw.SOFPA.recurso.logic.dto.RecursoDTO;
import co.edu.uniandes.csw.SOFPA.recurso.logic.api.IRecursoLogicService;
import co.edu.uniandes.csw.SOFPA.recurso.master.logic.api._IRecursoMasterLogicService;
import co.edu.uniandes.csw.SOFPA.recurso.master.logic.dto.RecursoMasterDTO;
import co.edu.uniandes.csw.SOFPA.comentario.logic.api.IComentarioLogicService;
import co.edu.uniandes.csw.SOFPA.comentario.logic.dto.ComentarioDTO;
import javax.inject.Inject;


public abstract class _RecursoMasterMockLogicService implements _IRecursoMasterLogicService {

    protected static ArrayList<RecursoMasterDTO> recursoMasterDtosList = new ArrayList<RecursoMasterDTO>() ;
    @Inject
    protected IComentarioLogicService comentarioPersistance;
    @Inject
    protected IRecursoLogicService recursoPersistance;

    public RecursoMasterDTO createMasterRecurso(RecursoMasterDTO recurso) {

        recursoPersistance.createRecurso(recurso.getRecursoEntity());
        for (ComentarioDTO dto : recurso.getCreatecomentario()) {
            comentarioPersistance.createComentario(dto);
        }
        recursoMasterDtosList.add(recurso);
        return recurso;
    }

    public RecursoMasterDTO getMasterRecurso(Long id) {
        for (RecursoMasterDTO recursoMasterDTO : recursoMasterDtosList) {
            if (recursoMasterDTO.getRecursoEntity().getId() == id) {
                return recursoMasterDTO;
            }
        }

        return null;
    }

    public void deleteMasterRecurso(Long id) {
        for (RecursoMasterDTO recursoMasterDTO : recursoMasterDtosList) {
            if (recursoMasterDTO.getRecursoEntity().getId() == id) {

                for (ComentarioDTO dto : recursoMasterDTO.getCreatecomentario()) {
                    comentarioPersistance.deleteComentario(dto.getId());
                }
                recursoPersistance.deleteRecurso(recursoMasterDTO.getId());
                recursoMasterDtosList.remove(recursoMasterDTO);
            }
        }

    }

    public void updateMasterRecurso(RecursoMasterDTO recurso) {

        // update Comentario
        if (recurso.getUpdatecomentario() != null) {
            for (ComentarioDTO dto : recurso.getUpdatecomentario()) {
                comentarioPersistance.updateComentario(dto);
            }
        }
        // persist new Comentario
        if (recurso.getCreatecomentario() != null) {
            for (ComentarioDTO dto : recurso.getCreatecomentario()) {
                ComentarioDTO persistedComentarioDTO = comentarioPersistance.createComentario(dto);
                dto = persistedComentarioDTO;
            }
        }
        // delete Comentario
        if (recurso.getDeletecomentario() != null) {
            for (ComentarioDTO dto : recurso.getDeletecomentario()) {

                comentarioPersistance.deleteComentario(dto.getId());
            }
        }
    }
}