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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jbengoa
 */

@Entity
@Table(name="tipolegajo")
public class TipoLegajo implements Serializable{
      @Id
      @Basic(optional=false)
      @Column(name="idTipo")
      private Integer idTipo;
     
      @Column(name="descripcion")
      private String descripcion;
      
      @Column(name="estado")
      private String estado;
      
      @Column(name="acronimo")
      private String acronimo;

      @Column(name="secuencia")
      private String secuencia;
      
      @Column(name="numeracion")
      private String numeracion;

      public String getNumeracion() {
         return numeracion;
      }

      public void setNumeracion(String numeracion) {
         this.numeracion = numeracion;
      }

      public String getSecuencia() {
          return secuencia;
      }

      public void setSecuencia(String secuencia) {
          this.secuencia = secuencia;
      }
      
      public String getAcronimo() {
          return acronimo;
      }

      public void setAcronimo(String acronimo) {
          this.acronimo = acronimo;
      }

      public Integer getIdTipo() {
          return idTipo;
      }

      public void setIdTipo(Integer idTipo) {
          this.idTipo = idTipo;
      }

      public String getDescripcion() {
          return descripcion;
      }

      public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
      }

      public String getEstado() {
          return estado;
      }

      public void setEstado(String estado) {
          this.estado = estado;
      }
     
}
