package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NotificacionxEnumerarPK implements Serializable{

	private static final long serialVersionUID=1L;
	@Basic(optional=false)
	@Column(name="iddocumento")
	private int iddocumento;
	@Basic(optional=false)
	@Column(name="idusuario")
	private int idusuario;

	public NotificacionxEnumerarPK(){
	}

	public NotificacionxEnumerarPK(int iddocumento,int idusuario){
		super();
		this.iddocumento=iddocumento;
		this.idusuario=idusuario;

	}

	public int getIddocumento(){
		return iddocumento;
	}

	public void setIddocumento(int iddocumento){
		this.iddocumento=iddocumento;
	}

	public int getIdusuario(){
		return idusuario;
	}

	public void setIdusuario(int idusuario){
		this.idusuario=idusuario;
	}

	@Override
	public String toString(){
		return "NotificacionxEnumerarPK [iddocumento=" + iddocumento + ", idusuario=" + idusuario + ", tiponotificacion=" + "]";
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final NotificacionxEnumerarPK other=(NotificacionxEnumerarPK) obj;
		if(this.iddocumento != other.iddocumento){
			return false;
		}
		if(this.idusuario != other.idusuario){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=7;
		hash=97 * hash + this.iddocumento;
		hash=97 * hash + this.idusuario;
		return hash;
	}

}
