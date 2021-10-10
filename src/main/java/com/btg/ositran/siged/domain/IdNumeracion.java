package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdNumeracion implements Serializable{

	private static final long serialVersionUID=1L;
	@Basic(optional=false)
	@Column(name="idunidad")
	private int idunidad;
	@Basic(optional=false)
	@Column(name="idtipodocumento")
	private int idtipodocumento;

	public IdNumeracion(){
	}

	public IdNumeracion(int idunidad,int idtipodocumento){
		this.idunidad=idunidad;
		this.idtipodocumento=idtipodocumento;
	}

	public int getIdunidad(){
		return idunidad;
	}

	public void setIdunidad(int idunidad){
		this.idunidad=idunidad;
	}

	public int getIdtipodocumento(){
		return idtipodocumento;
	}

	public void setIdtipodocumento(int idtipodocumento){
		this.idtipodocumento=idtipodocumento;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final IdNumeracion other=(IdNumeracion) obj;
		if(this.idunidad != other.idunidad){
			return false;
		}
		if(this.idtipodocumento != other.idtipodocumento){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=5;
		hash=97 * hash + this.idunidad;
		hash=97 * hash + this.idtipodocumento;
		return hash;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.NumeracionPK[idunidad=" + idunidad + ", idtipodocumento=" + idtipodocumento + "]";
	}
}
