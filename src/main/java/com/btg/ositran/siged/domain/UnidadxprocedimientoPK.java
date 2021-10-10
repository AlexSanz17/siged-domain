package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 * @author Jesse James
 */
@Embeddable
public class UnidadxprocedimientoPK implements Serializable{

	private static final long serialVersionUID=1L;
	@Basic(optional=false)
	@Column(name="idunidad")
	private Integer idunidad;
	@Basic(optional=false)
	@Column(name="idprocedimiento")
	private Integer idprocedimiento;

	public UnidadxprocedimientoPK(){
	}

	public Integer getIdunidad(){
		return idunidad;
	}

	public void setIdunidad(Integer idunidad){
		this.idunidad=idunidad;
	}

	public Integer getIdprocedimiento(){
		return idprocedimiento;
	}

	public void setIdprocedimiento(Integer idprocedimiento){
		this.idprocedimiento=idprocedimiento;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final UnidadxprocedimientoPK other=(UnidadxprocedimientoPK) obj;
		if(this.idunidad == null || !this.idunidad.equals(other.idunidad)){
			return false;
		}
		if(this.idprocedimiento == null || !this.idprocedimiento.equals(other.idprocedimiento)){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=5;
		hash=41 * hash + (this.idunidad != null ? this.idunidad.hashCode() : 0);
		hash=41 * hash + (this.idprocedimiento != null ? this.idprocedimiento.hashCode() : 0);
		return hash;
	}

}
