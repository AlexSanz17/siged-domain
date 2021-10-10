package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ResueltoxdocumentoPK implements Serializable{

	private static final long serialVersionUID=1L;
	@Basic(optional=false)
	@Column(name="iddocumento")
	private int iddocumento;
	@Basic(optional=false)
	@Column(name="idresuelto")
	private int idresuelto;

	public ResueltoxdocumentoPK(){
	}

	public ResueltoxdocumentoPK(int iddocumento,int idresuelto){
		this.iddocumento=iddocumento;
		this.idresuelto=idresuelto;
	}

	public int getIddocumento(){
		return iddocumento;
	}

	public void setIddocumento(int iddocumento){
		this.iddocumento=iddocumento;
	}

	public void setIddocumento(Integer iddocumento){
		if(iddocumento != null){
			this.iddocumento=iddocumento;
		}
	}

	public int getIdresuelto(){
		return idresuelto;
	}

	public void setIdresuelto(int idresuelto){
		this.idresuelto=idresuelto;
	}

	public void setIdresuelto(Integer idresuelto){
		if(idresuelto != null){
			this.idresuelto=idresuelto;
		}
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final ResueltoxdocumentoPK other=(ResueltoxdocumentoPK) obj;
		if(this.iddocumento != other.iddocumento){
			return false;
		}
		if(this.idresuelto != other.idresuelto){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=5;
		hash=97 * hash + this.iddocumento;
		hash=97 * hash + this.idresuelto;
		return hash;
	}

	@Override
	public String toString(){
		return "org.ositran.daos.ResueltoxdocumentoPK[iddocumento=" + iddocumento + ", idresuelto=" + idresuelto + "]";
	}
}
