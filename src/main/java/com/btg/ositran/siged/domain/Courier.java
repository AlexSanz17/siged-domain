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
@Table(name="courier")
@NamedQueries({@NamedQuery(name="Courier.findAll",query="SELECT c FROM Courier c"),@NamedQuery(name="Courier.findByCodigo",query="SELECT c FROM Courier c WHERE c.codigo = :codigo")})
public class Courier implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="COURIER_SEQ")
	//@SequenceGenerator(name="COURIER_SEQ",sequenceName="COURIER_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idcourier")
	private Integer idCourier;

	private String codigo;

	@Column(name="nombrecourrier")
	private String nombreCourrier;

	public Courier(){
	}

	public Courier(Integer idcourier){
		this.idCourier=idcourier;
	}

	public Integer getIdCourier(){
		return idCourier;
	}

	public void setIdCourier(Integer idCourier){
		this.idCourier=idCourier;
	}

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
	}

	public String getNombreCourrier(){
		return nombreCourrier;
	}

	public void setNombreCourrier(String nombreCourrier){
		this.nombreCourrier=nombreCourrier;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idCourier != null ? idCourier.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Courier)){
			return false;
		}
		Courier other=(Courier) object;
		if((this.idCourier == null && other.idCourier != null) || (this.idCourier != null && !this.idCourier.equals(other.idCourier))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Courier[courier=" + this.nombreCourrier + "]";
	}
}
