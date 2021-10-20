/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jbengoa
 */

@Entity
@Table(name="vistabandejalegajos")
public class FilaBandejaLegajo implements Serializable{
    @Id
	private Integer id;
    
    @Column(name="idTipo")
	private Integer idTipo;
        
    @Column(name="desTipo")
	private String desTipo;

    @Column(name="idUnidad")
	private Integer idUnidad;
        
    @Column(name="desUnidad")
	private String desUnidad;

    @Column(name="nroLegajo")
    private String nroLegajo;
    
    @Column(name="asunto")
    private String asunto;
    
    @Column(name="estado")
    private String estado;
    
    @Column(name="idProcedimiento")
    private String idProcedimiento;
    
    @Column(name="idMetodo")
    private String idMetodo;

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
    
    @Column(name="fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
        
    @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;
        
     public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getDesUnidad() {
        return desUnidad;
    }

    public void setDesUnidad(String desUnidad) {
        this.desUnidad = desUnidad;
    }
       
        public Integer getUsuarioCreacion() {
            return usuarioCreacion;
        }

        public void setUsuarioCreacion(Integer usuarioCreacion) {
            this.usuarioCreacion = usuarioCreacion;
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

        public Integer getIdTipo() {
            return idTipo;
        }

        public void setIdTipo(Integer idTipo) {
            this.idTipo = idTipo;
        }

        public String getDesTipo() {
            return desTipo;
        }

        public void setDesTipo(String desTipo) {
            this.desTipo = desTipo;
        }
        
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
}
