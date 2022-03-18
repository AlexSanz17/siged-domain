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
@Table(name="firmaarchivo")
public class FirmaArchivo  implements Serializable{

    @Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="FIRMAARCHIVO_SEQ")
	//@SequenceGenerator(name="FIRMAARCHIVO_SEQ",sequenceName="FIRMAARCHIVO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idFirmaArchivo",nullable=false)
	private Integer idFirmaArchivo;
    
        @Column(name="idArchivo")
	private Integer idArchivo;
    
        @Column(name="idUsuario")
	private Integer idUsuario;
    
        @Column(name="estado")
	private String estado;
        
        @Column(name="unidadPropietario")
	private Integer unidadPropietario;
        
        @Column(name="cargoPropietario")
	private Integer cargoPropietario;
        
        @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;
        
        @Column(name="usuarioModificacion")
	private Integer usuarioModificacion;
        
        @Column(name="fechaCreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
        
        @Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
        
        @Column(name="idProceso")
	private String idProceso;
        
        @Column(name="accion")
	private String accion;

        @Column(name="alias")
	private String alias;
        
        @Column(name="fechaFirma")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFirma;
        
         public String getAccion() {
            return accion;
        }

        public void setAccion(String accion) {
            this.accion = accion;
        }

        public Date getFechaFirma() {
            return fechaFirma;
        }

        public void setFechaFirma(Date fechaFirma) {
            this.fechaFirma = fechaFirma;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getIdProceso() {
            return idProceso;
        }

        public void setIdProceso(String idProceso) {
            this.idProceso = idProceso;
        }

        public Integer getIdFirmaArchivo() {
            return idFirmaArchivo;
        }

        public void setIdFirmaArchivo(Integer idFirmaArchivo) {
            this.idFirmaArchivo = idFirmaArchivo;
        }

        public Integer getIdArchivo() {
            return idArchivo;
        }

        public void setIdArchivo(Integer idArchivo) {
            this.idArchivo = idArchivo;
        }

        public Integer getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(Integer idUsuario) {
            this.idUsuario = idUsuario;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
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
}
