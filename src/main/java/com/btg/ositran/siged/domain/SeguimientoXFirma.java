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
@Table(name="seguimientoxfirma")
@NamedQueries({@NamedQuery(name="SeguimientoXFirma.findByIdDocumentoFirmado",query="SELECT d FROM SeguimientoXFirma d where d.idSeguimientoFirma = :idDocumentoFirmado and estado = 'A'")})

public class SeguimientoXFirma {
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEGUIMIENTOXFIRMA_SEQ")
	@SequenceGenerator(name="SEGUIMIENTOXFIRMA_SEQ",sequenceName="SEGUIMIENTOXFIRMA_SEQ",initialValue=1,allocationSize=1)
	@Column(name = "idSeguimientoFirma")
	private Integer idSeguimientoFirma;
    
        @Column(name="idDocumento")
	@Basic(optional=false)
	private Integer idDocumento;
        
        @Column(name="unidadPropietario")
	private Integer unidadPropietario;
        
        @Column(name="cargoPropietario")
	private Integer cargoPropietario;

	@Column(name="idUsuario")
	@Basic(optional=false)
	private Integer idUsuario;
        
        @Column(name="estado")
	@Basic(optional=false)
	private String estado;
        
        @Column(name="fechaCreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
        
        @Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
        
        @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;
        
        @Column(name="usuarioModificacion")
	private Integer usuarioModificacion;

        public Integer getUsuarioModificacion() {
            return usuarioModificacion;
        }

        public void setUsuarioModificacion(Integer usuarioModificacion) {
            this.usuarioModificacion = usuarioModificacion;
        }
        
        @Basic(optional=true)
        @Column(name="idTipoTrazabilidad")
	private String idTipoTrazabilidad;

        public Date getFechaModificacion() {
            return fechaModificacion;
        }

        public void setFechaModificacion(Date fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
        }
        
        @Basic(optional=true)
        @Column(name="idTrazabilidad")
	private Integer idTrazabilidad;

        public Integer getIdTrazabilidad() {
            return idTrazabilidad;
        }

        public void setIdTrazabilidad(Integer idTrazabilidad) {
            this.idTrazabilidad = idTrazabilidad;
        }

        public String getIdTipoTrazabilidad() {
            return idTipoTrazabilidad;
        }

        public void setIdTipoTrazabilidad(String idTipoTrazabilidad) {
            this.idTipoTrazabilidad = idTipoTrazabilidad;
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

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public Integer getIdSeguimientoFirma() {
            return idSeguimientoFirma;
        }

        public void setIdSeguimientoFirma(Integer idSeguimientoFirma) {
            this.idSeguimientoFirma = idSeguimientoFirma;
        }

        public Integer getIdDocumento() {
            return idDocumento;
        }

        public void setIdDocumento(Integer idDocumento) {
            this.idDocumento = idDocumento;
        }

        public Integer getUnidadPropietario() {
            return unidadPropietario;
        }

        public void setUnidadPropietario(Integer unidadPropietario) {
            this.unidadPropietario = unidadPropietario;
        }

        public Integer getCargoPropietario() {
            return cargoPropietario;
        }

        public void setCargoPropietario(Integer cargoPropietario) {
            this.cargoPropietario = cargoPropietario;
        }

        public Integer getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(Integer idUsuario) {
            this.idUsuario = idUsuario;
        }

}
