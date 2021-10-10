package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="documentoxcliente")
/*
 * @NamedQueries({
 * 
 * @NamedQuery(name = "Documentoxcliente.findAll", query =
 * "SELECT u FROM Documentoxcliente d"),
 * 
 * @NamedQuery(name = "Documentoxcliente.findByIdcliente", query =
 * "SELECT u FROM Documentoxcliente d WHERE d.documentoxclientePK.idcliente = :idcliente"
 * ),
 * 
 * @NamedQuery(name = "Documentoxcliente.findByIddocumento", query =
 * "SELECT u FROM Documentoxcliente d WHERE d.documentoxclientePK.iddocumento = :iddocumento"
 * ),
 * 
 * @NamedQuery(name = "Documentoxcliente.findByTipo", query =
 * "SELECT u FROM Documentoxcliente d WHERE d.tipo = :tipo") })
 */
public class Documentoxcliente implements Serializable{

	private static final long serialVersionUID=1L;
	@EmbeddedId
	protected DocumentoxclientePK documentoxclientePK;
	@Column(name="tipo")
	private Character tipo;

	@JoinColumn(name="iddocumento",referencedColumnName="iddocumento",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Documento documento;

	@JoinColumn(name="idcliente",referencedColumnName="idcliente",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Cliente Cliente;

	public Documentoxcliente(){
	}

	public Documentoxcliente(DocumentoxclientePK documentoxclientePK){
		this.documentoxclientePK=documentoxclientePK;
	}

	public Documentoxcliente(DocumentoxclientePK documentoxclientePK,Character tipo){
		this.documentoxclientePK=documentoxclientePK;
		this.tipo=tipo;
	}

	public Documentoxcliente(int iddocumento,int idcliente){
		this.documentoxclientePK=new DocumentoxclientePK(iddocumento,idcliente);
	}

	public DocumentoxclientePK getDocumentoxclientePK(){
		return documentoxclientePK;
	}

	public void setDocumentoxclientePK(DocumentoxclientePK documentoxclientePK){
		this.documentoxclientePK=documentoxclientePK;
	}

	public Documento getDocumento(){
		return documento;
	}

	public void setDocumento(Documento documento){
		this.documento=documento;
	}

	public Character getTipo(){
		return tipo;
	}

	public void setTipo(Character tipo){
		this.tipo=tipo;
	}

	public Cliente getCliente(){
		return Cliente;
	}

	public void setCliente(Cliente cliente){
		Cliente=cliente;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(documentoxclientePK != null ? documentoxclientePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Documentoxcliente)){
			return false;
		}
		Documentoxcliente other=(Documentoxcliente) object;
		if((this.documentoxclientePK == null && other.documentoxclientePK != null) || (this.documentoxclientePK != null && !this.documentoxclientePK.equals(other.documentoxclientePK))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Documentoxcliente[documentoxclientePK=" + documentoxclientePK + "]";
	}
}
