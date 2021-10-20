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
@Table(name="documentoreferencia")
public class DocumentoReferencia implements java.io.Serializable{

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DOCUMENTOREF_SEQ")
	//@SequenceGenerator(name="DOCUMENTOREF_SEQ",sequenceName="DOCUMENTOREF_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idref")
	private Integer idRef;

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
        
        @Column(name="verDocumento")
	private String verDocumento;
      
        @Column(name="usuarioModificacion")
	private Integer usuarioModificacion;

	@Column(name="iddocumento")
	private Integer idDocumento;
        
        @Column(name="estado")
	private String estado;
        
        @Column(name="respondido")
	private String respondido;

	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

        @Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
       
        /*
        public Integer getIdDocumentoOrigen() {
           return idDocumentoOrigen;
        }

        public void setIdDocumentoOrigen(Integer idDocumentoOrigen) {
            this.idDocumentoOrigen = idDocumentoOrigen;
        }*/

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

        public Integer getIdRef() {
		return idRef;
	}

	public void setIdRef(Integer idRef) {
		this.idRef = idRef;
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

	public String getRespondido() {
		return respondido;
	}

	public void setRespondido(String respondido) {
		this.respondido = respondido;
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
        
        public String getVerDocumento() {
            return verDocumento;
        }

        public void setVerDocumento(String verDocumento) {
            this.verDocumento = verDocumento;
        }
}
