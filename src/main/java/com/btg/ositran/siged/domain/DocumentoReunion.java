/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author consultor_jti15
 */

@Entity
@Table(name="documentoreunion")
public class DocumentoReunion implements Serializable{
   @Id 
   @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DOCUMENTOREUNION_SEQ")
   @SequenceGenerator(name="DOCUMENTOREUNION_SEQ",sequenceName="DOCUMENTOREUNION_SEQ",initialValue=1,allocationSize=1)
   @Basic(optional=false)
   @Column(name="idDocumentoReunion")
   private Integer idDocumentoReunion;
   
   @Column(name="idDocumento")
   private Integer idDocumento;
   
   @Column(name="usuarioCreacion")
   private Integer usuarioCreacion;
   
   @Column(name="usuarioModificacion")
   private Integer usuarioModificacion;
   
   @Column(name="nombres")
   private String nombres;
   
   @Column(name="tipo")
   private String tipo;

   @Column(name="estado")
   private String estado;
   
   @Column(name="fechaCreacion")
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaCreacion;
   
   @Column(name="fechaModificacion")
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaModificacion;

    public Integer getIdDocumentoReunion() {
        return idDocumentoReunion;
    }

    public void setIdDocumentoReunion(Integer idDocumentoReunion) {
        this.idDocumentoReunion = idDocumentoReunion;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Integer getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(Integer usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Integer getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(Integer usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
