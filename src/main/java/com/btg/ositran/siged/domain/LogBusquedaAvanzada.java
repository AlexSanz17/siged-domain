package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LogBusquedaAvanzada")

public class LogBusquedaAvanzada implements Serializable{


	 /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 @Id
	 //@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LOG_BUSQUEDA_AVANZADA_SEQ")
	 //@SequenceGenerator(name="LOG_BUSQUEDA_AVANZADA_SEQ",sequenceName="LOG_BUSQUEDA_AVANZADA_SEQ",initialValue=1,allocationSize=1)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Basic(optional=false)
	 @Column(name="idlogbusqueda")
	 private Integer idlogbusqueda;

	 @Column(name="idusuario")
	 private Integer idusuario;

	 @Column(name="nombrepc")
	 private String  nombrepc;

	 @Column(name="consulta")
	 private String consulta;

	 @Column(name="fechaoperacion")
	 private Date fechaoperacion;


	public Integer getIdlogbusqueda() {
		return idlogbusqueda;
	}


	public void setIdlogbusqueda(Integer idlogbusqueda) {
		this.idlogbusqueda = idlogbusqueda;
	}


	public Integer getIdusuario() {
		return idusuario;
	}


	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}


	public String getNombrepc() {
		return nombrepc;
	}


	public void setNombrepc(String nombrepc) {
		this.nombrepc = nombrepc;
	}


	public String getConsulta() {
		return consulta;
	}


	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}


	public Date getFechaoperacion() {
		return fechaoperacion;
	}


	public void setFechaoperacion(Date fechaoperacion) {
		this.fechaoperacion = fechaoperacion;
	}




	public LogBusquedaAvanzada(){

	}


}
