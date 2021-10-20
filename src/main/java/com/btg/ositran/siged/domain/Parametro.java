package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="parametro")
@NamedQueries({@NamedQuery(name="Parametro.findAll",query="SELECT p FROM Parametro p"),@NamedQuery(name="Parametro.findByIdparametro",query="SELECT p FROM Parametro p WHERE p.idparametro = :idparametro"),@NamedQuery(name="Parametro.findByTipo",query="SELECT p FROM Parametro p WHERE p.tipo = :tipo"),@NamedQuery(name="Parametro.findByTipoActivo",query="SELECT p FROM Parametro p WHERE p.tipo = :tipo"),@NamedQuery(name="Parametro.findByValor",query="SELECT p FROM Parametro p WHERE p.valor = :valor "),@NamedQuery(name="Parametro.findByTipoAndValor",query="SELECT p FROM Parametro p WHERE p.valor = :valor and  p.tipo = :tipo"),@NamedQuery(name="Parametro.findByDescripcion",query="SELECT p FROM Parametro p WHERE p.descripcion = :descripcion")})
public class Parametro implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PARAMETRO_SEQ")
	//@SequenceGenerator(name="PARAMETRO_SEQ",sequenceName="PARAMETRO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idparametro")
	private Integer idparametro;
	@Column(name="tipo")
	private String tipo;
	@Column(name="valor")
	private String valor;
	@Column(name="descripcion")
	private String descripcion;

	/*
	 * Constructors
	 */
	public Parametro(){
	}

	public Parametro(Integer valor, String descripcion){
		if(valor != null){
			this.valor = String.valueOf(valor);
		}
		this.descripcion = descripcion;
	}
	
	public Parametro(String valor,String descripcion){

		this.valor=valor;
		this.descripcion=descripcion;

	}

	public Parametro(Integer idparametro){
		this.idparametro=idparametro;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdparametro(){
		return idparametro;
	}

	public void setIdparametro(Integer idparametro){
		this.idparametro=idparametro;
	}

	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo=tipo;
	}

	public String getValor(){
		return valor;
	}

	public void setValor(String valor){
		this.valor=valor;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idparametro != null ? idparametro.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Parametro)){
			return false;
		}
		Parametro other=(Parametro) object;
		if((this.idparametro == null && other.idparametro != null) || (this.idparametro != null && !this.idparametro.equals(other.idparametro))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Parametro[idparametro=" + idparametro + "]";
	}
}
