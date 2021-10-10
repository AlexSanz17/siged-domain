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
@Table(name="estadocargo")
@NamedQueries({@NamedQuery(name="Estadocargo.findAll",query="SELECT e FROM Estadocargo e"),@NamedQuery(name="Estadocargo.findByIdestadocargo",query="SELECT e FROM Estadocargo e WHERE e.idestadocargo = :idestadocargo"),@NamedQuery(name="Estadocargo.findByNombreestado",query="SELECT e FROM Estadocargo e WHERE e.nombreestado = :nombreestado")})
public class Estadocargo implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ESTADOCARGO_SEQ")
	@SequenceGenerator(name="ESTADOCARGO_SEQ",sequenceName="ESTADOCARGO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idestadocargo")
	private Integer idestadocargo;
	@Column(name="nombreestado")
	private String nombreestado;

	public Estadocargo(){
	}

	public Estadocargo(Integer idestadocargo){
		this.idestadocargo=idestadocargo;
	}

	public Integer getIdestadocargo(){
		return idestadocargo;
	}

	public void setIdestadocargo(Integer idestadocargo){
		this.idestadocargo=idestadocargo;
	}

	public String getNombreestado(){
		return nombreestado;
	}

	public void setNombreestado(String nombreestado){
		this.nombreestado=nombreestado;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idestadocargo != null ? idestadocargo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Estadocargo)){
			return false;
		}
		Estadocargo other=(Estadocargo) object;
		if((this.idestadocargo == null && other.idestadocargo != null) || (this.idestadocargo != null && !this.idestadocargo.equals(other.idestadocargo))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Estadocargo[idestadocargo=" + idestadocargo + "]";
	}
}
