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

package co.edu.uniandes.csw.SOFPA.usuario.master.persistence.entity;

import co.edu.uniandes.csw.SOFPA.contacto.persistence.entity.ContactoEntity;
import co.edu.uniandes.csw.SOFPA.usuario.persistence.entity.UsuarioEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn; 
import org.eclipse.persistence.annotations.JoinFetch;

@Entity
@IdClass(UsuariocontactoEntityId.class)
@NamedQueries({
    @NamedQuery(name = "UsuariocontactoEntity.getByMasterId", query = "SELECT  u FROM UsuariocontactoEntity u WHERE u.usuarioId=:usuarioId"),
    @NamedQuery(name = "UsuariocontactoEntity.deleteUsuariocontactoEntity", query = "DELETE FROM UsuariocontactoEntity u WHERE u.usuarioId=:usuarioId and  u.contactoId=:contactoId")
})
public class UsuariocontactoEntity implements Serializable {

    @Id
    @Column(name = "usuarioId")
    private Long usuarioId;
    @Id
    @Column(name = "contactoId")
    private Long contactoId;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "usuarioId", referencedColumnName = "id")
    @JoinFetch
    private ContactoEntity usuarioIdEntity;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "contactoId", referencedColumnName = "id")
    @JoinFetch
    private ContactoEntity contactoIdEntity; 

    public UsuariocontactoEntity() {
    }

    public UsuariocontactoEntity(Long usuarioId, Long contactoId) {
        this.usuarioId =usuarioId;
        this.contactoId = contactoId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getContactoId() {
        return contactoId;
    }

    public void setContactoId(Long contactoId) {
        this.contactoId = contactoId;
    }

    public ContactoEntity getUsuarioIdEntity() {
        return usuarioIdEntity;
    }

    public void setUsuarioIdEntity(ContactoEntity usuarioIdEntity) {
        this.usuarioIdEntity = usuarioIdEntity;
    }

    public ContactoEntity getContactoIdEntity() {
        return contactoIdEntity;
    }

    public void setContactoIdEntity(ContactoEntity contactoIdEntity) {
        this.contactoIdEntity = contactoIdEntity;
    }

}
