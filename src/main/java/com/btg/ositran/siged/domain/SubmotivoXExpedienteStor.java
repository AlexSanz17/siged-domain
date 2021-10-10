package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="SUBMOTIVOXEXPEDIENTESTOR")
public class SubmotivoXExpedienteStor implements Serializable{
	private static final long serialVersionUID=1L;

	@EmbeddedId
	protected SubmotivoXExpedienteStorPK submotivoxexpedientePK;

	@JoinColumn(name="idsubmotivo",referencedColumnName="idsubmotivo",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Submotivo submotivo;

	@JoinColumn(name="idexpediente",referencedColumnName="idexpediente",insertable=false,updatable=false)
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Expedientestor expedientestor;

	@Column(name="monto")
	private Double monto;

	@JoinColumn(name="moneda",referencedColumnName="idparametro")
	@ManyToOne(optional=false)
	private Parametro moneda;

	@Transient
	private String strMonto;

	public SubmotivoXExpedienteStorPK getSubmotivoxexpedientePK(){
		return submotivoxexpedientePK;
	}

	public void setSubmotivoxexpedientePK(SubmotivoXExpedienteStorPK submotivoxexpedientePK){
		this.submotivoxexpedientePK=submotivoxexpedientePK;
	}

	public Submotivo getSubmotivo(){
		return submotivo;
	}

	public void setSubmotivo(Submotivo submotivo){
		this.submotivo=submotivo;
	}

	public Expedientestor getExpedientestor(){
		return expedientestor;
	}

	public void setExpedientestor(Expedientestor expedientestor){
		this.expedientestor=expedientestor;
	}

	public Double getMonto(){
		return monto;
	}

	public void setMonto(Double monto){
		this.monto=monto;
	}

	public Parametro getMoneda(){
		return moneda;
	}

	public void setMoneda(Parametro moneda){
		this.moneda=moneda;
	}

	public String getStrMonto(){
		return strMonto;
	}

	public void setStrMonto(String strMonto){
		this.strMonto=strMonto;
	}
}
