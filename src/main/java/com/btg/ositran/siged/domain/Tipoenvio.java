package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tipoenvio")
@NamedQueries({@NamedQuery(name="Tipoenvio.findAll",query="SELECT t FROM Tipoenvio t"),@NamedQuery(name="Tipoenvio.findByIdtipoenvio",query="SELECT t FROM Tipoenvio t WHERE t.idtipoenvio = :idtipoenvio"),@NamedQuery(name="Tipoenvio.findByTipoenvio2",query="SELECT t FROM Tipoenvio t WHERE t.tipoenvio2 = :tipoenvio2")})
public class Tipoenvio implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TIPOENVIO_SEQ")
	@SequenceGenerator(name="TIPOENVIO_SEQ",sequenceName="TIPOENVIO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idtipoenvio")
	private Integer idtipoenvio;
	@Column(name="nombre")
	private String tipoenvio2;
	@OneToMany(mappedBy="idtipoenvio")
	private List<Mensajeria> mensajeriaCollection;

	public Tipoenvio(){
		tipoenvio2="";
	}

	public Tipoenvio(Integer idtipoenvio){
		this.idtipoenvio=idtipoenvio;
	}

	public Integer getIdtipoenvio(){
		return idtipoenvio;
	}

	public void setIdtipoenvio(Integer idtipoenvio){
		this.idtipoenvio=idtipoenvio;
	}

	public String getTipoenvio2(){
		return tipoenvio2;
	}

	public void setTipoenvio2(String tipoenvio2){
		this.tipoenvio2=tipoenvio2;
	}

	public List<Mensajeria> getMensajeriaCollection(){
		return mensajeriaCollection;
	}

	public void setMensajeriaCollection(List<Mensajeria> mensajeriaCollection){
		this.mensajeriaCollection=mensajeriaCollection;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idtipoenvio != null ? idtipoenvio.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Tipoenvio)){
			return false;
		}
		Tipoenvio other=(Tipoenvio) object;
		if((this.idtipoenvio == null && other.idtipoenvio != null) || (this.idtipoenvio != null && !this.idtipoenvio.equals(other.idtipoenvio))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Tipoenvio[idtipoenvio=" + idtipoenvio + "]";
	}
}
