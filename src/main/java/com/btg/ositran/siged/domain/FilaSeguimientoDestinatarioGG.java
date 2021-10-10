package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "seguimientodestinatariogg")
public class FilaSeguimientoDestinatarioGG{
	@Id
	private Integer idPK;

	private Integer iddocumento;

	private String numerodocumento;

	private String asunto;

	@Column(name="fechalimite")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLimite;

	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;


	private Integer remitente;

	private Integer destinatario;

	private String responsable;


	public Integer getIddocumento() {
		return iddocumento;
	}

	public void setIddocumento(Integer iddocumento) {
		this.iddocumento = iddocumento;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public Integer getRemitente() {
		return remitente;
	}

	public void setRemitente(Integer remitente) {
		this.remitente = remitente;
	}

	public Integer getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Integer destinatario) {
		this.destinatario = destinatario;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Integer getIdPK() {
		return idPK;
	}

	public void setIdPK(Integer idPK) {
		this.idPK = idPK;
	}


}
