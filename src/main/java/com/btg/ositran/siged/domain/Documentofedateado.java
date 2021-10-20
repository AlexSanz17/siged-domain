package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="documentofedateado")
public class Documentofedateado implements java.io.Serializable{

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DOCUMENTOFEDATEADO_SEQ")
	//@SequenceGenerator(name="DOCUMENTOFEDATEADO_SEQ",sequenceName="DOCUMENTOFEDATEADO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idoperacion")
	private Integer idOperacion;

	@Column(name="fechadocumento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDocumento;

	private transient String fechaDocumentoRegistro;
	private transient String nroDocumentoArea;

	@Column(name="desunidad")
	private String desUnidad;


	@Column(name="idcertfirmas")
	private String idCertFirmas;

	public String getIdCertFirmas() {
		return idCertFirmas;
	}

	public void setIdCertFirmas(String idCertFirmas) {
		this.idCertFirmas = idCertFirmas;
	}

	public String getDesUnidad() {
		return desUnidad;
	}

	public void setDesUnidad(String desUnidad) {
		this.desUnidad = desUnidad;
	}

	public String getNroDocumentoArea() {
		return nroDocumentoArea;
	}

	public void setNroDocumentoArea(String nroDocumentoArea) {
		this.nroDocumentoArea = nroDocumentoArea;
	}

	public String getFechaDocumentoRegistro() {
		return fechaDocumentoRegistro;
	}

	public void setFechaDocumentoRegistro(String fechaDocumentoRegistro) {
		this.fechaDocumentoRegistro = fechaDocumentoRegistro;
	}

	@Column(name="iddocumentofedateado")
	private Integer idDocumentoFedateado;

	@Column(name="idtipodocumentofedateado")
	private Integer idTipoDocumentoFedateado;

	@Column(name="nrodocumento")
	private String nroDocumento;


	@Column(name="asunto")
	private String asunto;

	@Column(name="estado")
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name="nrofoliosdocumento")
	private Integer nroFoliosDocumento;

	@Column(name="nrocopiasfedateadas")
	private Integer nroCopiasFedateadas;

	@Column(name="idunidadsolicitante")
	private Integer idUnidadSolicitante;

	@Column(name="idusuario")
	private Integer idUsuario;

	@Column(name="nombrepc")
	private String nombrePC;

	@Column(name="servicio")
	private String servicio;


	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public Integer getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(Integer idOperacion) {
		this.idOperacion = idOperacion;
	}

	public Date getFechaDocumento() {
		return fechaDocumento;
	}

	public void setFechaDocumento(Date fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}

	public Integer getIdDocumentoFedateado() {
		return idDocumentoFedateado;
	}

	public void setIdDocumentoFedateado(Integer idDocumentoFedateado) {
		this.idDocumentoFedateado = idDocumentoFedateado;
	}

	public Integer getIdTipoDocumentoFedateado() {
		return idTipoDocumentoFedateado;
	}

	public void setIdTipoDocumentoFedateado(Integer idTipoDocumentoFedateado) {
		this.idTipoDocumentoFedateado = idTipoDocumentoFedateado;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Integer getNroFoliosDocumento() {
		return nroFoliosDocumento;
	}

	public void setNroFoliosDocumento(Integer nroFoliosDocumento) {
		this.nroFoliosDocumento = nroFoliosDocumento;
	}

	public Integer getNroCopiasFedateadas() {
		return nroCopiasFedateadas;
	}

	public void setNroCopiasFedateadas(Integer nroCopiasFedateadas) {
		this.nroCopiasFedateadas = nroCopiasFedateadas;
	}

	public Integer getIdUnidadSolicitante() {
		return idUnidadSolicitante;
	}

	public void setIdUnidadSolicitante(Integer idUnidadSolicitante) {
		this.idUnidadSolicitante = idUnidadSolicitante;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombrePC() {
		return nombrePC;
	}

	public void setNombrePC(String nombrePC) {
		this.nombrePC = nombrePC;
	}









}
