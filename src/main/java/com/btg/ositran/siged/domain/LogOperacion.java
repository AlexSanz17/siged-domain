package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="logoperacion")

public class LogOperacion implements Serializable{


	 /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 @Id
	 //@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LOG_OPERACION_SEQ")
	 //@SequenceGenerator(name="LOG_OPERACION_SEQ",sequenceName="LOG_OPERACION_SEQ",initialValue=1,allocationSize=1)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Basic(optional=false)
	 @Column(name="idlogoperacion")
	 private Integer idlogoperacion;

	 @Column(name="iddocumento")
	 private Integer iddocumento;

	 @Column(name="idusuario")
	 private Integer idusuario;

	 @Column(name="nombrepc")
	 private String  nombrepc;

	 @Column(name="opcion")
	 private String  opcion;

	 @Column(name="nombrefile")
	 private String  nombrefile;

	 @Column(name="fechaoperacion")
	 private Date fechaoperacion;


	 public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	private transient String documento;
	 private transient String usuario;
	 private transient String desOpcion;


	public String getDesOpcion() {
		return desOpcion;
	}

	public void setDesOpcion(String desOpcion) {
		this.desOpcion = desOpcion;
	}

	public LogOperacion(){

	}

	public Integer getIdlogoperacion() {
		return idlogoperacion;
	}
	public void setIdlogoperacion(Integer idlogoperacion) {
		this.idlogoperacion = idlogoperacion;
	}
	public Integer getIddocumento() {
		return iddocumento;
	}
	public void setIddocumento(Integer iddocumento) {
		this.iddocumento = iddocumento;
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
	public String getOpcion() {
		return opcion;
	}
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	public String getNombrefile() {
		return nombrefile;
	}
	public void setNombrefile(String nombrefile) {
		this.nombrefile = nombrefile;
	}
	public Date getFechaoperacion() {
		return fechaoperacion;
	}
	public void setFechaoperacion(Date fechaoperacion) {
		this.fechaoperacion = fechaoperacion;
	}





}
