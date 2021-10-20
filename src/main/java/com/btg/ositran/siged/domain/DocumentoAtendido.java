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
@Table(name="documentoatendido")
@NamedQueries({@NamedQuery(name="DocumentoAtendido.findByIdDocumentoAtendido",query="SELECT d FROM DocumentoAtendido d where d.iddocumentoatendido = :idDocumentoAtendido ")})

public class DocumentoAtendido implements Serializable{
    @Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DOCUMENTOATENDIDO_SEQ")
	//@SequenceGenerator(name="DOCUMENTOATENDIDO_SEQ",sequenceName="DOCUMENTOATENDIDO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="iddocumentoatendido",nullable=false)
	private Integer iddocumentoatendido;
    
        @Column(name="idusuario")
	private Integer idusuario;
    
        @Column(name="estado")
	private String estado;
        
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
        
        public Integer getIddocumento() {
            return iddocumento;
        }

        public void setIddocumento(Integer iddocumento) {
            this.iddocumento = iddocumento;
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
        
         public Integer getIddocumentoatendido() {
            return iddocumentoatendido;
        }

        public void setIddocumentoatendido(Integer iddocumentoatendido) {
            this.iddocumentoatendido = iddocumentoatendido;
        }
}
