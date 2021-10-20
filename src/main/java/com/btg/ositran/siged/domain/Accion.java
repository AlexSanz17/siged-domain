package com.btg.ositran.siged.domain;

import java.io.Serializable;
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

@Entity
@Table(name="accion")
@NamedQueries({@NamedQuery(name="Accion.findByNombre",query="SELECT a FROM Accion a WHERE a.nombre = :nombre")})
public class Accion implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ACCION_SEQ")
	//@SequenceGenerator(name="ACCION_SEQ",sequenceName="ACCION_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idaccion")
	private Integer idAccion;

	@Basic(optional=false)
	private String nombre;

	private String descripcion;

	@Basic(optional=false)
	private char estado;

	public Accion(){
	}

	public Accion(Integer idaccion){
		this.idAccion=idaccion;
	}

	public Accion(Integer idaccion,String nombre,char estado){
		this.idAccion=idaccion;
		this.nombre=nombre;
		this.estado=estado;
	}

	public Integer getIdAccion(){
		return idAccion;
	}

	public void setIdAccion(Integer idaccion){
		this.idAccion=idaccion;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public char getEstado(){
		return estado;
	}

	public void setEstado(char estado){
		this.estado=estado;
	}

	public void setEstado(Character estado){
		if(estado != null){
			this.estado=estado;
		}
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idAccion != null ? idAccion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Accion)){
			return false;
		}
		Accion other=(Accion) object;
		if((this.idAccion == null && other.idAccion != null) || (this.idAccion != null && !this.idAccion.equals(other.idAccion))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Accion[accion=" + this.nombre + "]";
	}
}
