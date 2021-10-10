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
@Table(name="region")
@NamedQueries({@NamedQuery(name="Region.findAll",query="SELECT r FROM Region r"),@NamedQuery(name="Region.findByIdregion",query="SELECT r FROM Region r WHERE r.idregion = :idregion"),@NamedQuery(name="Region.findByNombreregion",query="SELECT r FROM Region r WHERE r.nombreregion = :nombreregion")})
public class Region implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="REGION_SEQ")
	@SequenceGenerator(name="REGION_SEQ",sequenceName="REGION_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idregion")
	private Integer idregion;
	@Column(name="nombreregion")
	private String nombreregion;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "idregion") private
	 * List<Diafestivo> diafestivoList;
	 */
	public Region(){
	}

	public Region(Integer idregion){
		this.idregion=idregion;
	}

	public Integer getIdregion(){
		return idregion;
	}

	public void setIdregion(Integer idregion){
		this.idregion=idregion;
	}

	public String getNombreregion(){
		return nombreregion;
	}

	public void setNombreregion(String nombreregion){
		this.nombreregion=nombreregion;
	}

	/*
	 * public List<Diafestivo> getDiafestivoList() { return diafestivoList; }
	 * 
	 * public void setDiafestivoList(List<Diafestivo> diafestivoList) {
	 * this.diafestivoList = diafestivoList; }
	 */
	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idregion != null ? idregion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Region)){
			return false;
		}
		Region other=(Region) object;
		if((this.idregion == null && other.idregion != null) || (this.idregion != null && !this.idregion.equals(other.idregion))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Region[idregion=" + idregion + "]";
	}
}
