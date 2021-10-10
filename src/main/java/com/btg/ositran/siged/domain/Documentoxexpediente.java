package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="documentoxexpediente")
@NamedQueries({@NamedQuery(name="Documentoxexpediente.findAll",query="SELECT d FROM Documentoxexpediente d"),@NamedQuery(name="Documentoxexpediente.findByIddocumento",query="SELECT d FROM Documentoxexpediente d WHERE d.documentoxexpedientePK.iddocumento = :iddocumento"),@NamedQuery(name="Documentoxexpediente.findByIdexpediente",query="SELECT d FROM Documentoxexpediente d WHERE d.documentoxexpedientePK.idexpediente = :idexpediente"),@NamedQuery(name="Documentoxexpediente.findByEstado",query="SELECT d FROM Documentoxexpediente d WHERE d.estado = :estado")})
public class Documentoxexpediente implements Serializable{
	private static final long serialVersionUID=1L;
	@EmbeddedId
	protected DocumentoxexpedientePK documentoxexpedientePK;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@JoinColumn(name="iddocumento",referencedColumnName="iddocumento",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Documento documento;
	@JoinColumn(name="idexpediente",referencedColumnName="idexpediente",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Expediente expediente;

	public Documentoxexpediente(){
	}

	public Documentoxexpediente(DocumentoxexpedientePK documentoxexpedientePK){
		this.documentoxexpedientePK=documentoxexpedientePK;
	}

	public Documentoxexpediente(DocumentoxexpedientePK documentoxexpedientePK,char estado){
		this.documentoxexpedientePK=documentoxexpedientePK;
		this.estado=estado;
	}

	public Documentoxexpediente(int iddocumento,int idexpediente){
		this.documentoxexpedientePK=new DocumentoxexpedientePK(iddocumento,idexpediente);
	}

	public DocumentoxexpedientePK getDocumentoxexpedientePK(){
		return documentoxexpedientePK;
	}

	public void setDocumentoxexpedientePK(DocumentoxexpedientePK documentoxexpedientePK){
		this.documentoxexpedientePK=documentoxexpedientePK;
	}

	public char getEstado(){
		return estado;
	}

	public void setEstado(char estado){
		this.estado=estado;
	}

	public Documento getDocumento(){
		return documento;
	}

	public void setDocumento(Documento documento){
		this.documento=documento;
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
		hash+=(documentoxexpedientePK != null ? documentoxexpedientePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Documentoxexpediente)){
			return false;
		}
		Documentoxexpediente other=(Documentoxexpediente) object;
		if((this.documentoxexpedientePK == null && other.documentoxexpedientePK != null) || (this.documentoxexpedientePK != null && !this.documentoxexpedientePK.equals(other.documentoxexpedientePK))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Documentoxexpediente[documentoxexpedientePK=" + documentoxexpedientePK + "]";
	}

}
