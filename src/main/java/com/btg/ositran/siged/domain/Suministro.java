package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="suministro")
public class Suministro implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SUMINISTRO_SEQ")
	@SequenceGenerator(name="SUMINISTRO_SEQ",sequenceName="SUMINISTRO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idsuministro")
	private Integer idsuministro;
	@Column(name="nrosuministro")
	private String nrosuministro;
	@JoinColumn(name="documentostor",referencedColumnName="iddocumento")
	@ManyToOne(optional=true)
	private DocumentoStor documentostor;
	@JoinColumn(name="expedientestor",referencedColumnName="idexpediente",nullable=false)
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	private Expediente expediente;

	public Suministro(){
	}

	public Suministro(Integer idsuministro){
		this.idsuministro=idsuministro;
	}

	public Integer getIdsuministro(){
		return idsuministro;
	}

	public void setIdsuministro(Integer idsuministro){
		this.idsuministro=idsuministro;
	}

	public String getNrosuministro(){
		return nrosuministro;
	}

	public void setNrosuministro(String nrosuministro){
		this.nrosuministro=nrosuministro;
	}

	public DocumentoStor getDocumentostor(){
		return documentostor;
	}

	public void setDocumentostor(DocumentoStor documentostor){
		this.documentostor=documentostor;
	}

	public Expediente getExpediente(){
		return expediente;
	}

	public void setExpediente(Expediente expediente){
		this.expediente=expediente;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idsuministro != null ? idsuministro.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Suministro)){
			return false;
		}
		Suministro other=(Suministro) object;
		if((this.idsuministro == null && other.idsuministro != null) || (this.idsuministro != null && !this.idsuministro.equals(other.idsuministro))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.nrosuministro + "]";
	}
}
