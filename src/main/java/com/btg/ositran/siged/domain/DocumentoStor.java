package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="documentostor")
public class DocumentoStor implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	@Basic(optional=false)
	@Column(name="iddocumento")
	private Integer idDocumento;

	@Column(name="direccionenvio")
	private String direccionEnvio;

	@Column(name="complejidad")
	private String complejidad;

	@Column(name="monto")
	private Double monto;

	@Column(name="atencion")
	private String atencion;

	@JoinTable(name="submotivoxdocumentostor",joinColumns={@JoinColumn(name="iddocumento",referencedColumnName="iddocumento")},inverseJoinColumns={@JoinColumn(name="idsubmotivo",referencedColumnName="idsubmotivo")})
	@ManyToMany
	private List<Submotivo> submotivos;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="documentostor")
	private List<Suministro> suministros;

	@JoinColumn(name="iddocumento",referencedColumnName="iddocumento",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private Documento documento;

	public DocumentoStor(){
	}

	public DocumentoStor(Integer idDocumento){
		this.idDocumento=idDocumento;
	}

	public Integer getIdDocumento(){
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento){
		this.idDocumento=idDocumento;
	}

	public String getDireccionEnvio(){
		return direccionEnvio;
	}

	public void setDireccionEnvio(String direccionEnvio){
		this.direccionEnvio=direccionEnvio;
	}

	public String getComplejidad(){
		return complejidad;
	}

	public void setComplejidad(String complejidad){
		this.complejidad=complejidad;
	}

	public Double getMonto(){
		return monto;
	}

	public void setMonto(Double monto){
		this.monto=monto;
	}

	public String getAtencion(){
		return atencion;
	}

	public void setAtencion(String atencion){
		this.atencion=atencion;
	}

	public List<Submotivo> getSubmotivos(){
		return submotivos;
	}

	public void setSubmotivos(List<Submotivo> submotivos){
		this.submotivos=submotivos;
	}

	public List<Suministro> getSuministros(){
		return suministros;
	}

	public void setSuministros(List<Suministro> suministros){
		this.suministros=suministros;
	}

	public Documento getDocumento(){
		return documento;
	}

	public void setDocumento(Documento documento){
		this.documento=documento;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idDocumento != null ? idDocumento.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof DocumentoStor)){
			return false;
		}
		DocumentoStor other=(DocumentoStor) object;
		if((this.idDocumento == null && other.idDocumento != null) || (this.idDocumento != null && !this.idDocumento.equals(other.idDocumento))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Documentostor[iddocumento=" + idDocumento + "]";
	}
}
