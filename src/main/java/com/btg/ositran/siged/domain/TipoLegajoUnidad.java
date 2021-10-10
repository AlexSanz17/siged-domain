/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.io.Serializable;
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

/**
 *
 * @author jbengoa
 */


@Entity
@Table(name="tipolegajounidad")
public class TipoLegajoUnidad implements java.io.Serializable{
       @Id
       @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TIPOLEGAJOUNIDAD_SEQ")
       @SequenceGenerator(name="TIPOLEGAJOUNIDAD_SEQ",sequenceName="TIPOLEGAJOUNIDAD_SEQ",initialValue=1,allocationSize=1)
       @Basic(optional=false)
       @Column(name="idTipoLegajoUnidad")
       private Integer idTipoLegajoUnidad;
      
       @Column(name="idTipo")
       private Integer idTipo;
      
       @JoinColumn(name="idUnidad",referencedColumnName="idunidad")
       @ManyToOne(optional=false,fetch=FetchType.LAZY)
       private Unidad unidad;

       @Column(name="estado")
       private String estado;
       
       @Column(name="accion")
       private String accion;

        public String getAccion() {
            return accion;
        }

        public void setAccion(String accion) {
            this.accion = accion;
        }

        public Integer getIdTipoLegajoUnidad() {
            return idTipoLegajoUnidad;
        }

        public void setIdTipoLegajoUnidad(Integer idTipoLegajoUnidad) {
            this.idTipoLegajoUnidad = idTipoLegajoUnidad;
        }

        public Integer getIdTipo() {
            return idTipo;
        }

        public void setIdTipo(Integer idTipo) {
            this.idTipo = idTipo;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        public Unidad getUnidad() {
            return unidad;
        }

        public void setUnidad(Unidad unidad) {
            this.unidad = unidad;
        }
}
