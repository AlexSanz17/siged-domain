/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author consultor_jti15
 */

@Entity
@Table(name="cargoadministrado")
@NamedQueries({@NamedQuery(name="CargoAdministrado.findAllCargoAdministrado",query="SELECT a FROM CargoAdministrado a where a.estado = 'A'"),
               @NamedQuery(name="CargoAdministrado.findCargoAdministrado",query="SELECT a FROM CargoAdministrado a where a.idCargoAdministrado = :idCargoAdministrado")})

public class CargoAdministrado {
     @Id
     @Column(name="idCargoAdministrado")
     private Integer idCargoAdministrado;
     
     @Column(name="desCargo")
     private String desCargo;

     @Column(name="estado")
     private String estado;
     
      public Integer getIdCargoAdministrado() {
        return idCargoAdministrado;
     }

     public void setIdCargoAdministrado(Integer idCargoAdministrado) {
        this.idCargoAdministrado = idCargoAdministrado;
     }

     public String getDesCargo() {
        return desCargo;
     }

     public void setDesCargo(String desCargo) {
        this.desCargo = desCargo;
     }

     public String getEstado() {
        return estado;
     }

     public void setEstado(String estado) {
        this.estado = estado;
     }
}
