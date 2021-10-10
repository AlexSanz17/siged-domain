package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="expedientexprocincumplido")
public class Expedientexprocincumplido implements Serializable{

	private static final long serialVersionUID=1L;
	@EmbeddedId
	private ExpedientexprocincumplidoPK expedientexprocincumplidoPK;
	@JoinColumn(name="idexpediente",referencedColumnName="idexpediente",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Expediente Expediente;
	@JoinColumn(name="idprocedimientoincumplido",referencedColumnName="idprocedimientoincumplido",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Procedimientoincumplido Procedimientoincumplido;

	public ExpedientexprocincumplidoPK getExpedientexprocincumplidoPK(){
		return expedientexprocincumplidoPK;
	}

	public void setExpedientexprocincumplidoPK(ExpedientexprocincumplidoPK expedientexprocincumplidoPK){
		this.expedientexprocincumplidoPK=expedientexprocincumplidoPK;
	}

	public Expediente getExpediente(){
		return Expediente;
	}

	public void setExpediente(Expediente expediente){
		Expediente=expediente;
	}

	public Procedimientoincumplido getProcedimientoincumplido(){
		return Procedimientoincumplido;
	}

	public void setProcedimientoincumplido(Procedimientoincumplido procedimientoincumplido){
		Procedimientoincumplido=procedimientoincumplido;
	}
}