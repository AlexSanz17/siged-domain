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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author consultor_jti15
 */


@Entity
@Table(name="documentoadjunto")
@NamedQueries({@NamedQuery(name="DocumentoAdjunto.findByListDocumentoAdjunto",query="SELECT d FROM DocumentoAdjunto d where d.idDocumento = :idDocumento  and d.estado = 'A'")})
public class DocumentoAdjunto  implements Serializable{
        @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DOCUMENTOADJUNTO_SEQ")
	@SequenceGenerator(name="DOCUMENTOADJUNTO_SEQ",sequenceName="DOCUMENTOADJUNTO_SEQ",initialValue=1,allocationSize=1)
        @Basic(optional=false)
        @Column(name="idDocumentoAdjunto")
	private Integer idDocumentoAdjunto;
        
        @Column(name="estado")
	private String estado;

        @Column(name="idDocumento")
	private Integer idDocumento;
       
        @Column(name="codTipoAdj")
	private String codTipoAdj;
        
        @Column(name="nroAdj")
	private Integer nroAdj;
        
        @Column(name="copOrig")
	private String copOrig;
        
        @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;
        
        @Column(name="usuarioModificacion")
	private Integer usuarioModificacion;

        @Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
        
        @Column(name="fechaCreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

        public Date getFechaCreacion() {
            return fechaCreacion;
        }

        public void setFechaCreacion(Date fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
        }
        
        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        public Integer getUsuarioCreacion() {
            return usuarioCreacion;
        }

        public void setUsuarioCreacion(Integer usuarioCreacion) {
            this.usuarioCreacion = usuarioCreacion;
        }

        public Integer getIdDocumentoAdjunto() {
            return idDocumentoAdjunto;
        }

        public void setIdDocumentoAdjunto(Integer idDocumentoAdjunto) {
            this.idDocumentoAdjunto = idDocumentoAdjunto;
        }

        public Integer getIdDocumento() {
            return idDocumento;
        }

        public void setIdDocumento(Integer idDocumento) {
            this.idDocumento = idDocumento;
        }

        public String getCodTipoAdj() {
            return codTipoAdj;
        }

        public void setCodTipoAdj(String codTipoAdj) {
            this.codTipoAdj = codTipoAdj;
        }

        public Integer getNroAdj() {
            return nroAdj;
        }

        public void setNroAdj(Integer nroAdj) {
            this.nroAdj = nroAdj;
        }

        public String getCopOrig() {
            return copOrig;
        }

        public void setCopOrig(String copOrig) {
            this.copOrig = copOrig;
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
}
