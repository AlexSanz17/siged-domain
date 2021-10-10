package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="datos")
public class Datos implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	@Basic(optional=false)
	@Column(name="idmensajeria")
	private Integer idmensajeria;

	@Column(name="numerointerno")
	private String numerointerno;

	@Column(name="usuariodestino")
	private String usuariodestino;

	@Column(name="direccion")
	private String direccion;

	@Column(name="departamento")
	private String departamento;

	@Column(name="provincia")
	private String provincia;

	@Column(name="distrito")
	private String distrito;

	@Column(name="referencia")
	private String referencia;

	@JoinColumn(name="idempresadestino",referencedColumnName="idempresadestino")
	@ManyToOne
	private Empresadestino idempresadestino;

	@JoinColumn(name="idmensajeria",referencedColumnName="idmensajeria",insertable=false,updatable=false)
	@OneToOne(optional=true,fetch=FetchType.LAZY)
	private Mensajeria mensajeria;

	@JoinColumn(name="idambitoenvio",referencedColumnName="idambitoenvio")
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	private AmbitoEnvio idambitoenvio;

	public Datos(){
	}

	public Datos(Integer idmensajeria){
		this.idmensajeria=idmensajeria;
	}

	public Integer getIdmensajeria(){
		return idmensajeria;
	}

	public void setIdmensajeria(Integer idmensajeria){
		this.idmensajeria=idmensajeria;
	}

	public String getNumerointerno(){
		return numerointerno;
	}

	public void setNumerointerno(String numerointerno){
		this.numerointerno=numerointerno;
	}

	public String getUsuariodestino(){
		return usuariodestino;
	}

	public void setUsuariodestino(String usuariodestino){
		this.usuariodestino=usuariodestino;
	}

	public String getDireccion(){
		return direccion;
	}

	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}

	public String getDepartamento(){
		return departamento;
	}

	public void setDepartamento(String departamento){
		this.departamento=departamento;
	}

	public String getProvincia(){
		return provincia;
	}

	public void setProvincia(String provincia){
		this.provincia=provincia;
	}

	public String getDistrito(){
		return distrito;
	}

	public void setDistrito(String distrito){
		this.distrito=distrito;
	}

	public String getReferencia(){
		return referencia;
	}

	public void setReferencia(String referencia){
		this.referencia=referencia;
	}

	public Empresadestino getIdempresadestino(){
		return idempresadestino;
	}

	public void setIdempresadestino(Empresadestino idempresadestino){
		this.idempresadestino=idempresadestino;
	}

	public Mensajeria getMensajeria(){
		return mensajeria;
	}

	public void setMensajeria(Mensajeria mensajeria){
		this.mensajeria=mensajeria;
	}

	public AmbitoEnvio getIdambitoenvio(){
		return idambitoenvio;
	}

	public void setIdambitoenvio(AmbitoEnvio idambitoenvio){
		this.idambitoenvio=idambitoenvio;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idmensajeria != null ? idmensajeria.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Datos)){
			return false;
		}
		Datos other=(Datos) object;
		if((this.idmensajeria == null && other.idmensajeria != null) || (this.idmensajeria != null && !this.idmensajeria.equals(other.idmensajeria))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Datos[idmensajeria=" + idmensajeria + "]";
	}
}
