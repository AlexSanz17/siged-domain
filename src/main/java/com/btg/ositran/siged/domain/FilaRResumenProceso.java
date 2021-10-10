package com.btg.ositran.siged.domain;

/*DUMMY*/

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * REVISAR TODOS LOS ELEMENTOS PARA LAS TABLAS
 * 
 * @author PC
 * 
 */
@Entity
@Table(name="resumenproceso")
@NamedQueries({@NamedQuery(name="FilaRResumenProceso.reporteInicialResumen",query="SELECT f FROM FilaRResumenProceso f ")})
public class FilaRResumenProceso implements Serializable{

	private static final long serialVersionUID=1L;

	/**
	 * @return the serialVersionUID
	 */
	public static long getSerialVersionUID(){
		return serialVersionUID;
	}

	@Id
	@Column(name="NROEXPEDIENTE")
	private String expediente;
	@Column(name="GRUPOPROCESO")
	private String grupoproceso;
	@Column(name="PROCESO")
	private String proceso;
	@Column(name="FECHACREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaexpediente;
	@Column(name="CLIENTE")
	private String cliente;
	// NUEVOS
	@Column(name="NOMBREP")
	private String nombrep;
	@Column(name="NOMBREM")
	private String nombrem;
	@Column(name="NOMBREN")
	private String nombren;
	// NUEVOS
	@Column(name="ASUNTO")
	private String asunto;
	@Column(name="ESTADO")
	private String estado;
	@Column(name="PROPIETARIO")
	private String propietario;

	public String getExpediente(){
		return expediente;
	}

	public void setExpediente(String expediente){
		this.expediente=expediente;
	}

	public String getFechaexpediente(){
		if(fechaexpediente == null){
			return "";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("dd-MM-yyyy");
		return fechita.format(fechaexpediente);
	}

	public void setFechaexpediente(Date fechaexpediente){
		this.fechaexpediente=fechaexpediente;
	}

	public String getPropietario(){
		return propietario;
	}

	public void setPropietario(String usuario){
		this.propietario=usuario;
	}

	public void setNombrep(String nombrep){
		this.nombrep=nombrep;
	}

	public void setNombrem(String nombrem){
		this.nombrem=nombrem;
	}

	public void setNombren(String nombren){
		this.nombren=nombren;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final FilaRResumenProceso other=(FilaRResumenProceso) obj;
		if((this.expediente == null) ? (other.expediente != null) : !this.expediente.equals(other.expediente)){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=3;
		hash=29 * hash + (this.expediente != null ? this.expediente.hashCode() : 0);
		return hash;
	}

	/**
	 * @return the proceso
	 */
	public String getProceso(){
		return proceso;
	}

	/**
	 * @param proceso
	 *            the proceso to set
	 */
	public void setProceso(String proceso){
		this.proceso=proceso;
	}

	/**
	 * @return the nroexpediente
	 */
	/*
	 * public String getNroexpediente() { return expediente; }
	 * 
	 * /**
	 * 
	 * @param nroexpediente the nroexpediente to set
	 *//*
		 * public void setNroexpediente(String nroexpediente) { this.expediente
		 * = nroexpediente; }
		 * 
		 * /**
		 * 
		 * @return the fechacreacion
		 *//*
			 * public Date getFechacreacion() { return fechaexpediente; }
			 * 
			 * /**
			 * 
			 * @param fechacreacion the fechacreacion to set
			 *//*
				 * public void setFechacreacion(Date fechacreacion) {
				 * this.fechaexpediente = fechacreacion; }/*
				 */

	public String getCliente(){
		if(cliente != null){
			return cliente;
		}
		return nombrep + " " + nombrem + " " + nombren;
	}

	/**
	 * @param razonsocial
	 *            the razonsocial to set
	 */
	public void setCliente(String razonsocial){
		this.cliente=razonsocial;
	}

	/**
	 * @return the asunto
	 */
	public String getAsunto(){
		return asunto;
	}

	/**
	 * @param asunto
	 *            the asunto to set
	 */
	public void setAsunto(String asunto){
		this.asunto=asunto;
	}

	/**
	 * @return the estado
	 */
	public String getEstado(){
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(String estado){
		this.estado=estado;
	}

	public String getGrupoproceso(){
		return grupoproceso;
	}

	public void setGrupoproceso(String grupoproceso){
		this.grupoproceso=grupoproceso;
	}
}
