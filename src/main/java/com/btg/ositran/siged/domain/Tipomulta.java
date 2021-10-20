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
@Table(name="tipomulta")
@NamedQueries({@NamedQuery(name="Tipomulta.findAll",query="SELECT t FROM Tipomulta t"),@NamedQuery(name="Tipomulta.findByIdtipomulta",query="SELECT t FROM Tipomulta t WHERE t.idtipomulta = :idtipomulta"),@NamedQuery(name="Tipomulta.findByDescripcion",query="SELECT t FROM Tipomulta t WHERE t.descripcion = :descripcion"),@NamedQuery(name="Tipomulta.findByEstado",query="SELECT t FROM Tipomulta t WHERE t.estado = :estado")})
public class Tipomulta implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TIPOMULTA_SEQ")
	//@SequenceGenerator(name="TIPOMULTA_SEQ",sequenceName="TIPOMULTA_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idtipomulta")
	private Integer idtipomulta;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="estado")
	private Character estado;

	public Tipomulta(){
	}

	public Tipomulta(Integer idtipomulta){
		this.idtipomulta=idtipomulta;
	}

	public Integer getIdtipomulta(){
		return idtipomulta;
	}

	public void setIdtipomulta(Integer idtipomulta){
		this.idtipomulta=idtipomulta;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public Character getEstado(){
		return estado;
	}

	public void setEstado(Character estado){
		this.estado=estado;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idtipomulta != null ? idtipomulta.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Tipomulta)){
			return false;
		}
		Tipomulta other=(Tipomulta) object;
		if((this.idtipomulta == null && other.idtipomulta != null) || (this.idtipomulta != null && !this.idtipomulta.equals(other.idtipomulta))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Tipomulta[idtipomulta=" + idtipomulta + "]";
	}
}
