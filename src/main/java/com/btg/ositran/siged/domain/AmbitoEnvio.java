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
import javax.persistence.Table;

@Entity
@Table(name="ambitoenvio")
@NamedQueries({@NamedQuery(name="AmbitoEnvio.findAll",query="SELECT ae FROM AmbitoEnvio ae"),@NamedQuery(name="AmbitoEnvio.findByIdambitoenvio",query="SELECT ae FROM AmbitoEnvio ae WHERE ae.idambitoenvio = :idambitoenvio"),@NamedQuery(name="AmbitoEnvio.findByNomambitoenvio",query="SELECT ae FROM AmbitoEnvio ae WHERE ae.nomambitoenvio = :nomambitoenvio")})
public class AmbitoEnvio implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=true)
	@Column(name="idambitoenvio")
	private Integer idambitoenvio;

	@Column(name="nomambitoenvio")
	private String nomambitoenvio;

	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "ambitoEnvio")
	// private List<Mensajeria> mensajerias;

	public Integer getIdambitoenvio(){
		return idambitoenvio;
	}

	public void setIdambitoenvio(Integer idambitoenvio){
		this.idambitoenvio=idambitoenvio;
	}

	public String getNomambitoenvio(){
		return nomambitoenvio;
	}

	public void setNomambitoenvio(String nomambitoenvio){
		this.nomambitoenvio=nomambitoenvio;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idambitoenvio != null ? idambitoenvio.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof AmbitoEnvio)){
			return false;
		}
		AmbitoEnvio other=(AmbitoEnvio) object;
		if((this.idambitoenvio == null && other.idambitoenvio != null) || (this.idambitoenvio != null && !this.idambitoenvio.equals(other.idambitoenvio))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.AmbitoEnvio[idambitoenvio=" + idambitoenvio + "]";
	}

	/**
	 * @return the mensajerias
	 */
	/*
	 * public List<Mensajeria> getMensajerias() { return mensajerias; }
	 */

	/**
	 * @param mensajerias
	 *            the mensajerias to set
	 */
	/*
	 * public void setMensajerias(List<Mensajeria> mensajerias) {
	 * this.mensajerias = mensajerias; }
	 */
}
