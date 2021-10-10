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
 * @author consultor_jti15
 */

@Entity
@Table(name="serie")
public class Serie implements Serializable{
    @Id
    @Column(name="idserie")
    private Integer idserie;

    @Basic(optional=true)
    @Column(name="nombre")
    private String nombre;
    
    @Basic(optional=true)
    @Column(name="estado")
    private String estado;
    
    public Integer getIdserie() {
        return idserie;
    }

    public void setIdserie(Integer idserie) {
        this.idserie = idserie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
