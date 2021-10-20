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


@Entity
@Table(name="documentopendiente")
@NamedQueries({@NamedQuery(name="DocumentoPendiente.findByIdDocumentoPendiente",query="SELECT d FROM DocumentoPendiente d where d.iddocumentopendiente = :idDocumentoPendiente ")})
public class DocumentoPendiente implements Serializable{
        @Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DOCUMENTOPENDIENTE_SEQ")
	//@SequenceGenerator(name="DOCUMENTOPENDIENTE_SEQ",sequenceName="DOCUMENTOPENDIENTE_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="iddocumentopendiente",nullable=false)
	private Integer iddocumentopendiente;
    
        @Column(name="idusuario")
	private Integer idusuario;
    
        @Column(name="estado")
	private String estado; 
        
        @Column(name="idTipoTrazabilidad")
	private String idTipoTrazabilidad;

        @Column(name="idTrazabilidad")
	private Integer idTrazabilidad;
        
        @Column(name="unidadpropietario")
	private Integer unidadpropietario;
        
        @Column(name="cargopropietario")
	private Integer cargopropietario;
        
        @Column(name="usuariocreacion")
	private Integer usuariocreacion;
        
        @Column(name="usuariomodificacion")
	private Integer usuariomodificacion;
        
        @Column(name="iddocumento")
	private Integer iddocumento;

        @Basic(optional=true)
        @Column(name="iddocumentorespuesta")
	private Integer iddocumentorespuesta;

        @Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;
        
        @Column(name="fechamodificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechamodificacion;
        
      /*  @Column(name = "origen")
        private Integer origen;

        public Integer getOrigen() {
            return origen;
        }

        public void setOrigen(Integer origen) {
            this.origen = origen;
        }*/
        
        public Integer getIddocumento() {
            return iddocumento;
        }

        public void setIddocumento(Integer iddocumento) {
            this.iddocumento = iddocumento;
        }

        public Integer getIddocumentopendiente() {
            return iddocumentopendiente;
        }

        public void setIddocumentopendiente(Integer iddocumentopendiente) {
            this.iddocumentopendiente = iddocumentopendiente;
        }

        public Integer getIdusuario() {
            return idusuario;
        }

        public void setIdusuario(Integer idusuario) {
            this.idusuario = idusuario;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public Integer getUnidadpropietario() {
            return unidadpropietario;
        }

        public void setUnidadpropietario(Integer unidadpropietario) {
            this.unidadpropietario = unidadpropietario;
        }

        public Integer getCargopropietario() {
            return cargopropietario;
        }

        public void setCargopropietario(Integer cargopropietario) {
            this.cargopropietario = cargopropietario;
        }

        public Integer getUsuariocreacion() {
            return usuariocreacion;
        }

        public void setUsuariocreacion(Integer usuariocreacion) {
            this.usuariocreacion = usuariocreacion;
        }

        public Integer getUsuariomodificacion() {
            return usuariomodificacion;
        }

        public void setUsuariomodificacion(Integer usuariomodificacion) {
            this.usuariomodificacion = usuariomodificacion;
        }

        public Date getFechacreacion() {
            return fechacreacion;
        }

        public void setFechacreacion(Date fechacreacion) {
            this.fechacreacion = fechacreacion;
        }

        public Date getFechamodificacion() {
            return fechamodificacion;
        }

        public void setFechamodificacion(Date fechamodificacion) {
            this.fechamodificacion = fechamodificacion;
        }
        
         public Integer getIddocumentorespuesta() {
            return iddocumentorespuesta;
        }

        public void setIddocumentorespuesta(Integer iddocumentorespuesta) {
            this.iddocumentorespuesta = iddocumentorespuesta;
        }
        
        public String getIdTipoTrazabilidad() {
            return idTipoTrazabilidad;
        }

        public void setIdTipoTrazabilidad(String idTipoTrazabilidad) {
            this.idTipoTrazabilidad = idTipoTrazabilidad;
        }

        public Integer getIdTrazabilidad() {
            return idTrazabilidad;
        }

        public void setIdTrazabilidad(Integer idTrazabilidad) {
            this.idTrazabilidad = idTrazabilidad;
        }
}
