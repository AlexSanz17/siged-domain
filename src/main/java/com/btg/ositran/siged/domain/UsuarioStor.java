package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="usuariostor")
@NamedQueries({@NamedQuery(name="Usuariostor.findByIdusuario",query="SELECT u FROM UsuarioStor u WHERE u.idusuario = :idusuario"),@NamedQuery(name="Usuariostor.findByUsuario",query="SELECT u FROM UsuarioStor u WHERE u.usuario = :usuario"),@NamedQuery(name="Usuariostor.getResponsableSala",query="SELECT u FROM UsuarioStor u WHERE u.sala.idsala = :idsala AND u.responsable = :responsable"),@NamedQuery(name="Usuariostor.getAllBySala",query="SELECT u FROM UsuarioStor u WHERE u.sala.idsala = :idsala")})
public class UsuarioStor extends Usuario implements Serializable{

	private static final long serialVersionUID=-860192408614784456L;
	@Column(name="responsable")
	private Character responsable;
	@Column(name="nroapelaciones")
	private Integer nroapelaciones;
	@Column(name="nroquejas")
	private Integer nroquejas;
	@Column(name="nrocautelares")
	private Integer nrocautelares;
	@Column(name="usuariointalio")
	private String usuariointalio;
	@JoinColumn(name="sala",referencedColumnName="idsala")
	@ManyToOne(fetch=FetchType.LAZY)
	private Sala sala;

	/*
	 * Constructors
	 */
	public UsuarioStor(){
	}

	public UsuarioStor(Character responsable){
		this.responsable=responsable;
	}

	/*
	 * Getters & Setters
	 */
	public char getResponsable(){
		return responsable;
	}

	public void setResponsable(char responsable){
		this.responsable=responsable;
	}

	public void setResponsable(Character responsable){
		if(responsable != null){
			this.responsable=responsable;
		}
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

	public String getUsuariointalio(){
		return usuariointalio;
	}

	public void setUsuariointalio(String usuariointalio){
		this.usuariointalio=usuariointalio;
	}

	public Sala getSala(){
		return sala;
	}

	public void setSala(Sala sala){
		this.sala=sala;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(getIdusuario() != null ? getIdusuario().hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof UsuarioStor)){
			return false;
		}
		UsuarioStor other=(UsuarioStor) object;
		if((getIdusuario() == null && other.getIdusuario() != null) || (getIdusuario() != null && !getIdusuario().equals(other.getIdusuario()))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.UsuarioStor[idusuario=" + getIdusuario() + "]";
	}
}
