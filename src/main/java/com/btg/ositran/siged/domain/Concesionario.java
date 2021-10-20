package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="concesionario")
@NamedQueries({@NamedQuery(name="Concesionario.findAll",query="SELECT c FROM Concesionario c"),@NamedQuery(name="Concesionario.findByRuc",query="SELECT c FROM Concesionario c WHERE c.ruc = :ruc")})
public class Concesionario implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CONCESIONARIO_SEQ")
	//@SequenceGenerator(name="CONCESIONARIO_SEQ",sequenceName="CONCESIONARIO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idconcesionario")
	private Integer idConcesionario;

	@Basic(optional=false)
	@Column(name="razonsocial")
	private String razonSocial;

	@Basic(optional=false)
	private String ruc;

	@Column(name="representantelegal")
	private String representanteLegal;

	@Basic(optional=false)
	private String direccion;

	@Column(name="fechainiciooperacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicioOperacion;

	@Column(name="nroresolucionesfavor")
	private Integer numeroResolucionesFavor;

	@Column(name="nroresolucionescontra")
	private Integer numeroResolucionesContra;

	private String correo;

	private Character estado;

	public Concesionario(){
	}

	public Integer getIdConcesionario(){
		return idConcesionario;
	}

	public void setIdConcesionario(Integer idConcesionario){
		this.idConcesionario=idConcesionario;
	}

	public String getRazonSocial(){
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial){
		this.razonSocial=razonSocial;
	}

	public String getRuc(){
		return ruc;
	}

	public void setRuc(String ruc){
		this.ruc=ruc;
	}

	public String getRepresentanteLegal(){
		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal){
		this.representanteLegal=representanteLegal;
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion=direccion;
	}

	public Date getFechaInicioOperacion(){
		return fechaInicioOperacion;
	}

	public void setFechaInicioOperacion(Date fechaInicioOperacion){
		this.fechaInicioOperacion=fechaInicioOperacion;
	}

	public Integer getNumeroResolucionesFavor(){
		return numeroResolucionesFavor;
	}

	public void setNumeroResolucionesFavor(Integer numeroResolucionesFavor){
		this.numeroResolucionesFavor=numeroResolucionesFavor;
	}

	public Integer getNumeroResolucionesContra(){
		return numeroResolucionesContra;
	}

	public void setNumeroResolucionesContra(Integer numeroResolucionesContra){
		this.numeroResolucionesContra=numeroResolucionesContra;
	}

	public String getCorreo(){
		return correo;
	}

	public void setCorreo(String correo){
		this.correo=correo;
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
		hash+=(idConcesionario != null ? idConcesionario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Concesionario)){
			return false;
		}
		Concesionario other=(Concesionario) object;
		if((this.idConcesionario == null && other.idConcesionario != null) || (this.idConcesionario != null && !this.idConcesionario.equals(other.idConcesionario))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Concesionario[concesionario=" + this.razonSocial + "]";
	}
}
