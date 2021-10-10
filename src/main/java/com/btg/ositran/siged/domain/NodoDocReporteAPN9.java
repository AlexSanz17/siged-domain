package com.btg.ositran.siged.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reporteapn9")
public class NodoDocReporteAPN9 {

	@Id
	@Column(name = "iddocumento")
	private Integer idDocumento;

	@Column(name = "tipodocumento")
	private Integer tipoDocumento;

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getDesTipoDocumento() {
		return desTipoDocumento;
	}

	public void setDesTipoDocumento(Integer desTipoDocumento) {
		this.desTipoDocumento = desTipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getFechaDocumento() {
		return fechaDocumento;
	}

	public void setFechaDocumento(String fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}

	public String getDesPrioridad() {
		return desPrioridad;
	}

	public void setDesPrioridad(String desPrioridad) {
		this.desPrioridad = desPrioridad;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Column(name = "destipodocumento")
	private Integer desTipoDocumento;

	@Column(name = "nrodocumento")
	private String nroDocumento;

	@Column(name = "fechadocumento")
	private String fechaDocumento;

	@Column(name = "desprioridad")
	private String desPrioridad;

	@Column(name = "cliente")
	private String cliente;

	@Column(name = "destinatario")
	private String destinatario;

	@Column(name = "asunto")
	private String asunto;



}
