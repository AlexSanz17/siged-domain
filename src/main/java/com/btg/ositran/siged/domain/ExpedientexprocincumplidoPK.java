package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ExpedientexprocincumplidoPK implements Serializable{

	private static final long serialVersionUID=1L;
	@Basic(optional=false)
	@Column(name="idexpediente")
	private Integer idexpediente;
	@Basic(optional=false)
	@Column(name="idprocedimientoincumplido")
	private Integer idprocedimientoincumplido;

	public Integer getIdexpediente(){
		return idexpediente;
	}

	public void setIdexpediente(Integer idexpediente){
		this.idexpediente=idexpediente;
	}

	public Integer getIdprocedimientoincumplido(){
		return idprocedimientoincumplido;
	}

	public void setIdprocedimientoincumplido(Integer idprocedimientoincumplido){
		this.idprocedimientoincumplido=idprocedimientoincumplido;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final ExpedientexprocincumplidoPK other=(ExpedientexprocincumplidoPK) obj;
		if(this.idexpediente == null || !this.idexpediente.equals(other.idexpediente)){
			return false;
		}
		if(this.idprocedimientoincumplido == null || !this.idprocedimientoincumplido.equals(other.idprocedimientoincumplido)){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=7;
		hash=59 * hash + (this.idexpediente != null ? this.idexpediente.hashCode() : 0);
		hash=59 * hash + (this.idprocedimientoincumplido != null ? this.idprocedimientoincumplido.hashCode() : 0);
		return hash;
	}
}
