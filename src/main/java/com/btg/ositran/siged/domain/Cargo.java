package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cargo")
@NamedQueries({@NamedQuery(name="Cargo.findAll",query="SELECT c FROM Cargo c")})
public class Cargo implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	@Basic(optional=false)
	@Column(name="idmensajeria",nullable=false)
	private Integer idmensajeria;

	@Column(name="fechaentrega")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaentrega;

	@Column(name="recibido",length=100)
	private String recibido;

	@Column(name="fechadevcargo")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechadevcargo;

	@Column(name="primeravisita")
	@Temporal(TemporalType.TIMESTAMP)
	private Date primeravisita;

	@Column(name="segundavisita")
	@Temporal(TemporalType.TIMESTAMP)
	private Date segundavisita;

	@Column(name="observaciones")
	private String observaciones;

	@Column(name="costoenvio",length=10)
	private String costoenvio;

	@Column(name="grupo",length=13)
	private String grupo;

	@Column(name="estado",length=50)
	private String estado;

	@Column(name="fechacargo")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacargo;

	@Column(name="fechadevdoc")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechadevdoc;

	@Column(name="obs1",length=100)
	private String obs1;

	@Column(name="obs2",length=100)
	private String obs2;

	@JoinColumn(name="idmensajeria",referencedColumnName="idmensajeria",nullable=false,insertable=false,updatable=false)
	@OneToOne(optional=false)
	private Mensajeria mensajeria;

	public Cargo(){
	}

	public Cargo(Integer idmensajeria){
		this.idmensajeria=idmensajeria;
	}

	public Integer getIdmensajeria(){
		return idmensajeria;
	}

	public void setIdmensajeria(Integer idmensajeria){
		this.idmensajeria=idmensajeria;
	}

	public Date getFechaentrega(){
		return fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega){
		this.fechaentrega=fechaentrega;
	}

	public String getRecibido(){
		return recibido;
	}

	public void setRecibido(String recibido){
		this.recibido=recibido;
	}

	public Date getFechadevcargo(){
		return fechadevcargo;
	}

	public void setFechadevcargo(Date fechadevcargo){
		this.fechadevcargo=fechadevcargo;
	}

	public Date getPrimeravisita(){
		return primeravisita;
	}

	public void setPrimeravisita(Date primeravisita){
		this.primeravisita=primeravisita;
	}

	public Date getSegundavisita(){
		return segundavisita;
	}

	public void setSegundavisita(Date segundavisita){
		this.segundavisita=segundavisita;
	}

	public String getObservaciones(){
		return observaciones;
	}

	public void setObservaciones(String observaciones){
		this.observaciones=observaciones;
	}

	public String getCostoenvio(){
		return costoenvio;
	}

	public void setCostoenvio(String costoenvio){
		this.costoenvio=costoenvio;
	}

	public String getGrupo(){
		return grupo;
	}

	public void setGrupo(String grupo){
		this.grupo=grupo;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public Date getFechacargo(){
		return fechacargo;
	}

	public void setFechacargo(Date fechacargo){
		this.fechacargo=fechacargo;
	}

	public Date getFechadevdoc(){
		return fechadevdoc;
	}

	public void setFechadevdoc(Date fechadevdoc){
		this.fechadevdoc=fechadevdoc;
	}

	public String getObs1(){
		return obs1;
	}

	public void setObs1(String obs1){
		this.obs1=obs1;
	}

	public String getObs2(){
		return obs2;
	}

	public void setObs2(String obs2){
		this.obs2=obs2;
	}

	public Mensajeria getMensajeria(){
		return mensajeria;
	}

	public void setMensajeria(Mensajeria mensajeria){
		this.mensajeria=mensajeria;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idmensajeria != null ? idmensajeria.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Cargo)){
			return false;
		}
		Cargo other=(Cargo) object;
		if((this.idmensajeria == null && other.idmensajeria != null) || (this.idmensajeria != null && !this.idmensajeria.equals(other.idmensajeria))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Cargo[idmensajeria=" + idmensajeria + "]";
	}
}
