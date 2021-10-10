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
@Table(name="tipoinstitucion")
@NamedQueries({@NamedQuery(name="TipoInstitucion.findTipoInstitucion",query="SELECT a FROM TipoInstitucion a where a.cod_tipopersonajuridica = :codTipoPersonaJuridica and a.fla_activo = 'A' ")})
public class TipoInstitucion implements java.io.Serializable{ 
     @Id
     @Column(name="cod_tipoinstitucion")
     private Integer cod_tipoinstitucion;
     
     @Column(name="des_tipoinstitucion")
     private String des_tipoinstitucion;
     
    @Column(name="fla_activo")
     private String fla_activo;
    
    @Column(name="cod_tipopersonajuridica")
     private String cod_tipopersonajuridica;

    public String getCod_tipopersonajuridica() {
        return cod_tipopersonajuridica;
    }

    public void setCod_tipopersonajuridica(String cod_tipopersonajuridica) {
        this.cod_tipopersonajuridica = cod_tipopersonajuridica;
    }
    
     public Integer getCod_tipoinstitucion() {
        return cod_tipoinstitucion;
    }

    public void setCod_tipoinstitucion(Integer cod_tipoinstitucion) {
        this.cod_tipoinstitucion = cod_tipoinstitucion;
    }

    public String getDes_tipoinstitucion() {
        return des_tipoinstitucion;
    }

    public void setDes_tipoinstitucion(String des_tipoinstitucion) {
        this.des_tipoinstitucion = des_tipoinstitucion;
    }

    public String getFla_activo() {
        return fla_activo;
    }

    public void setFla_activo(String fla_activo) {
        this.fla_activo = fla_activo;
    }

  
}
