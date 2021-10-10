package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UsuarioxrolPK implements Serializable{
	private static final long serialVersionUID=1L;
	@Basic(optional=false)
	@Column(name="idusuario")
	private int idusuario;
	@Basic(optional=false)
	@Column(name="idrol")
	private int idrol;
	
	public UsuarioxrolPK() {
	}
	public UsuarioxrolPK(int idusuario, int idrol) {		
		this.idusuario = idusuario;
		this.idrol = idrol;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final UsuarioxrolPK other=(UsuarioxrolPK) obj;
		if(this.idusuario != other.idusuario){
			return false;
		}
		if(this.idrol != other.idrol){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=7;
		hash=37 * hash + this.idusuario;
		hash=37 * hash + this.idrol;
		return hash;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.UsuarioxrolPK[idusuario=" + idusuario + ", idrol=" + idrol + "]";
	}
}
