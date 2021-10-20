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
@Table(name="mes")
@NamedQueries({@NamedQuery(name="Mes.findAll",query="SELECT m FROM Mes m"),@NamedQuery(name="Mes.findByIdmes",query="SELECT m FROM Mes m WHERE m.idmes = :idmes"),@NamedQuery(name="Mes.findByMesferiado",query="SELECT m FROM Mes m WHERE m.mesferiado = :mesferiado")})
public class Mes implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="MES_SEQ")
	//@SequenceGenerator(name="MES_SEQ",sequenceName="MES_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idmes")
	private Integer idmes;
	@Column(name="mesferiado")
	private String mesferiado;

	public Mes(){
	}

	public Mes(Integer idmes){
		this.idmes=idmes;
	}

	public Integer getIdmes(){
		return idmes;
	}

	public void setIdmes(Integer idmes){
		this.idmes=idmes;
	}

	public String getMesferiado(){
		return mesferiado;
	}

	public void setMesferiado(String mesferiado){
		this.mesferiado=mesferiado;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idmes != null ? idmes.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Mes)){
			return false;
		}
		Mes other=(Mes) object;
		if((this.idmes == null && other.idmes != null) || (this.idmes != null && !this.idmes.equals(other.idmes))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Mes[idmes=" + idmes + "]";
	}
}
