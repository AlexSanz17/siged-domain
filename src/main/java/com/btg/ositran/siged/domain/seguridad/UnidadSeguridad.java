package com.btg.ositran.siged.domain.seguridad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the DEPENDENCIAS database table.
 * 
 */
@Entity
@Table(name="DEPENDENCIAS")
public class UnidadSeguridad implements Serializable{
	private static final long serialVersionUID=1L;

	@Id
	@Column(name="COD_DEP")
	private int idUnidad;

	@Column(name="DESCRIP")
	private String nombre;

	public UnidadSeguridad(){
	}

	public int getIdUnidad(){
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad){
		this.idUnidad=idUnidad;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

}