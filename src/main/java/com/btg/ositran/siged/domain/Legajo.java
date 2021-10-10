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

/**
 *
 * @author jbengoa
 */

@Entity
@Table(name="legajo")
public class Legajo implements Serializable{
        @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LEGAJO_SEQ")
	@SequenceGenerator(name="LEGAJO_SEQ",sequenceName="LEGAJO_SEQ",initialValue=1,allocationSize=1)
        @Basic(optional=false)
        @Column(name="idLegajo")
	private Integer idLegajo;
        
        @JoinColumn(name="idTipo",referencedColumnName="idTipo")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private TipoLegajo tipoLegajo;
        
        @Column(name="nroLegajo")
        private String nroLegajo;
        
        @Column(name="asunto")
        private String asunto;
        
        @Column(name="idProcedimiento")
        private String idProcedimiento;
    
        @Column(name="idMetodo")
        private String idMetodo;
        
        @Column(name="observacion")
        private String observacion;
     
        @Column(name="estado")
        private String estado;
        
        @Basic(optional=false)
	@Column(name="fechaCreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
        
        @Basic(optional=true)
	@Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
        
        @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;
        
        @Column(name="usuarioModificacion")
	private Integer usuarioModificacion;
        
        @JoinColumn(name="idUnidad",referencedColumnName="idunidad")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Unidad unidad;
        
        @Column(name="nota1")
        private String nota1;
        
        @Column(name="nota2")
        private String nota2;
        
        @Column(name="nota3")
        private String nota3;
        
        @Column(name="nota4")
        private String nota4;
       
        public String getNota1() {
            return nota1;
        }

        public void setNota1(String nota1) {
            this.nota1 = nota1;
        }

        public String getNota2() {
            return nota2;
        }

        public void setNota2(String nota2) {
            this.nota2 = nota2;
        }

        public String getNota3() {
            return nota3;
        }

        public void setNota3(String nota3) {
            this.nota3 = nota3;
        }

        public String getNota4() {
            return nota4;
        }

        public void setNota4(String nota4) {
            this.nota4 = nota4;
        }
        
        public TipoLegajo getTipoLegajo() {
            return tipoLegajo;
        }

        public void setTipoLegajo(TipoLegajo tipoLegajo) {
            this.tipoLegajo = tipoLegajo;
        }
     
         public String getObservacion() {
            return observacion;
        }

        public void setObservacion(String observacion) {
            this.observacion = observacion;
        }

        public Unidad getUnidad() {
            return unidad;
        }

        public void setUnidad(Unidad unidad) {
            this.unidad = unidad;
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
        
        public Integer getIdLegajo() {
           return idLegajo;
        }

        public void setIdLegajo(Integer idLegajo) {
            this.idLegajo = idLegajo;
        }

        public String getNroLegajo() {
            return nroLegajo;
        }

        public void setNroLegajo(String nroLegajo) {
            this.nroLegajo = nroLegajo;
        }

        public String getAsunto() {
            return asunto;
        }

        public void setAsunto(String asunto) {
            this.asunto = asunto;
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
        
        public String getIdProcedimiento() {
            return idProcedimiento;
        }

        public void setIdProcedimiento(String idProcedimiento) {
            this.idProcedimiento = idProcedimiento;
        }

        public String getIdMetodo() {
            return idMetodo;
        }

        public void setIdMetodo(String idMetodo) {
            this.idMetodo = idMetodo;
        }
}
