package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DocumentoxclientePK implements Serializable{

	private static final long serialVersionUID=1L;
	@Basic(optional=false)
	@Column(name="iddocumento")
	private Integer iddocumento;
	@Basic(optional=false)
	@Column(name="idcliente")
	private Integer idcliente;

	public DocumentoxclientePK(){
	}

	public DocumentoxclientePK(Integer iddocumento,Integer idcliente){
		this.iddocumento=iddocumento;
		this.idcliente=idcliente;
	}

	public int getIdcliente(){
		return idcliente;
	}

	public void setIdcliente(int idcliente){
		this.idcliente=idcliente;
	}

	public void setIdcliente(Integer idcliente){
		if(idcliente != null){
			this.idcliente=idcliente;
		}
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

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final DocumentoxclientePK other=(DocumentoxclientePK) obj;
		if(this.idcliente != other.idcliente){
			return false;
		}
		if(this.iddocumento != other.iddocumento){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=7;
		hash=37 * hash + this.idcliente;
		hash=37 * hash + this.iddocumento;
		return hash;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.DocumentoxclientePK[idcliente=" + idcliente + ", iddocumento=" + iddocumento + "]";
	}
}
