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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 *
 * @author consultor_jti15
 */
@Entity
@Table(name="funcion")
@NamedQueries({@NamedQuery(name="Funcion.findByIdFuncion",query="SELECT a FROM Funcion a where a.idfuncion = :pidfuncion")})
public class Funcion implements Serializable{
    @Id
    @Basic(optional=false)
    @Column(name="idfuncion")
    private Integer idfuncion;
 
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="jefe")
    private String jefe;

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public Integer getIdfuncion() {
        return idfuncion;
    }

    public void setIdfuncion(Integer idfuncion) {
        this.idfuncion = idfuncion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
