/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="referenciaarchivo")
/**
 *
 * @author jbengoa
 */
public class ReferenciaArchivo implements java.io.Serializable{
        @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="REFERENCIAARCHIVO_SEQ")
	@SequenceGenerator(name="REFERENCIAARCHIVO_SEQ",sequenceName="REFERENCIAARCHIVO_SEQ",initialValue=1,allocationSize=1)
	@Basic(optional=false)
	@Column(name="idRefArc")
	private Integer idRefArc;

        @JoinColumn(name="iddocumento",referencedColumnName="iddocumento", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private Documento documento;
        
        @JoinColumn(name="iddocumentoreferencia",referencedColumnName="iddocumento", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private Documento documentoReferencia;

        public Documento getDocumentoReferencia() {
            return documentoReferencia;
        }

        public void setDocumentoReferencia(Documento documentoReferencia) {
            this.documentoReferencia = documentoReferencia;
        }
        
	@Column(name="iddocumentoreferencia")
	private Integer idDocumentoReferencia;
        
        @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;
        
        @Column(name="usuarioModificacion")
	private Integer usuarioModificacion;

	@Column(name="iddocumento")
	private Integer idDocumento;
        
        @Column(name="idarchivo")
	private Integer idArchivo;
        
        @Column(name="estado")
	private String estado;
        
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

        @Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
        public ReferenciaArchivo(){}
        public ReferenciaArchivo(Integer idRefArc,Integer idDocumento, Integer idDocumentoReferencia,  Integer idArchivo, String estado,Integer usuarioCreacion,  Date fechaCreacion) {
            this.idRefArc = idRefArc;
            this.idDocumento = idDocumento;
            this.idDocumentoReferencia = idDocumentoReferencia;       
            this.idArchivo = idArchivo;
            this.estado = estado;
            this.usuarioCreacion = usuarioCreacion;
            this.fechaCreacion = fechaCreacion;
        }
        
        
        public Integer getIdArchivo() {
            return idArchivo;
        }

        public void setIdArchivo(Integer idArchivo) {
            this.idArchivo = idArchivo;
        }
       
        public Integer getIdRefArc() {
            return idRefArc;
        }

        public void setIdRefArc(Integer idRefArc) {
            this.idRefArc = idRefArc;
        }
      
        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        public Documento getDocumento() {
            return documento;
        }

        public void setDocumento(Documento documento) {
            this.documento = documento;
        }

        public Integer getUsuarioModificacion() {
            return usuarioModificacion;
        }

        public void setUsuarioModificacion(Integer usuarioModificacion) {
            this.usuarioModificacion = usuarioModificacion;
        }

        public Date getFechaModificacion() {
            return fechaModificacion;
        }

        public void setFechaModificacion(Date fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
        }

	public Integer getIdDocumentoReferencia() {
		return idDocumentoReferencia;
	}

	public void setIdDocumentoReferencia(Integer idDocumentoReferencia) {
		this.idDocumentoReferencia = idDocumentoReferencia;
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
        
        public Date getFechaCreacion() {
            return fechaCreacion;
        }

        public void setFechaCreacion(Date fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
        }
}
