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
@Table(name="sala")
@NamedQueries({@NamedQuery(name="Sala.findAll",query="SELECT s FROM Sala s"),@NamedQuery(name="Sala.findByIdsala",query="SELECT s FROM Sala s WHERE s.idsala = :idsala"),@NamedQuery(name="Sala.findByNombre",query="SELECT s FROM Sala s WHERE s.nombre = :nombre"),@NamedQuery(name="Sala.findByNroapelaciones",query="SELECT s FROM Sala s WHERE s.nroapelaciones = :nroapelaciones"),@NamedQuery(name="Sala.findByNroquejas",query="SELECT s FROM Sala s WHERE s.nroquejas = :nroquejas"),@NamedQuery(name="Sala.findByNrocautelares",query="SELECT s FROM Sala s WHERE s.nrocautelares = :nrocautelares")})
public class Sala implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SALA_SEQ")
	//@SequenceGenerator(name="SALA_SEQ",sequenceName="SALA_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idsala")
	private Integer idsala;
	@Column(name="nombre")
	private String nombre;
	@Column(name="nroapelaciones")
	private Integer nroapelaciones;
	@Column(name="nroquejas")
	private Integer nroquejas;
	@Column(name="nrocautelares")
	private Integer nrocautelares;
	@OneToMany(mappedBy="sala")
	private List<UsuarioStor> usuariostorList;
	@OneToMany(mappedBy="sala")
	private List<Expedientestor> expedientestorList;

	public Sala(){
	}

	public Sala(Integer idsala){
		this.idsala=idsala;
	}

	public Integer getIdsala(){
		return idsala;
	}

	public void setIdsala(Integer idsala){
		this.idsala=idsala;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public Integer getNroapelaciones(){
		return nroapelaciones;
	}

	public void setNroapelaciones(Integer nroapelaciones){
		this.nroapelaciones=nroapelaciones;
	}

	public Integer getNroquejas(){
		return nroquejas;
	}

	public void setNroquejas(Integer nroquejas){
		this.nroquejas=nroquejas;
	}

	public Integer getNrocautelares(){
		return nrocautelares;
	}

	public void setNrocautelares(Integer nrocautelares){
		this.nrocautelares=nrocautelares;
	}

	public List<UsuarioStor> getUsuariostorList(){
		return usuariostorList;
	}

	public void setUsuariostorList(List<UsuarioStor> usuariostorList){
		this.usuariostorList=usuariostorList;
	}

	public List<Expedientestor> getExpedientestorList(){
		return expedientestorList;
	}

	public void setExpedientestorList(List<Expedientestor> expedientestorList){
		this.expedientestorList=expedientestorList;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idsala != null ? idsala.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Sala)){
			return false;
		}
		Sala other=(Sala) object;
		if((this.idsala == null && other.idsala != null) || (this.idsala != null && !this.idsala.equals(other.idsala))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Sala[idsala=" + idsala + "]";
	}
}
