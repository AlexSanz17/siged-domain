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
@Table(name="tipoauditoria")
@NamedQueries({@NamedQuery(name="Tipoauditoria.findAll",query="SELECT t FROM Tipoauditoria t"),@NamedQuery(name="Tipoauditoria.findByIdtipo",query="SELECT t FROM Tipoauditoria t WHERE t.idtipo = :idtipo"),@NamedQuery(name="Tipoauditoria.findByNombre",query="SELECT t FROM Tipoauditoria t WHERE t.nombre = :nombre"),@NamedQuery(name="Tipoauditoria.findByCodigo",query="SELECT t FROM Tipoauditoria t WHERE t.codigo = :codigo")})
public class Tipoauditoria implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TIPOAUDITORIA_SEQ")
	//@SequenceGenerator(name="TIPOAUDITORIA_SEQ",sequenceName="TIPOAUDITORIA_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idtipo")
	private Integer idtipo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="codigo")
	private String codigo;

	public Tipoauditoria(){
	}

	public Tipoauditoria(Integer idtipo){
		this.idtipo=idtipo;
	}

	public Integer getIdtipo(){
		return idtipo;
	}

	public void setIdtipo(Integer idtipo){
		this.idtipo=idtipo;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idtipo != null ? idtipo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Tipoauditoria)){
			return false;
		}
		Tipoauditoria other=(Tipoauditoria) object;
		if((this.idtipo == null && other.idtipo != null) || (this.idtipo != null && !this.idtipo.equals(other.idtipo))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Tipoauditoria[idtipo=" + idtipo + "]";
	}
}
