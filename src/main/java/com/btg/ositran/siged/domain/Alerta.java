package com.btg.ositran.siged.domain;

import javax.persistence.Column;
import java.io.Serializable;
import javax.persistence.Entity;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reportealerta")
public class Alerta implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	private Integer idPK;
	private String indtable;   
	private Integer iddocumento;
	private String documento;
	private transient Character desplazo;
	private transient String desfase;
	private transient Character enabledCheck;
	private String asunto;
	private String areaorigen;
	private String areadestino;
	private transient String area;
	private Integer remitente;
	private Integer destinatario;
	private Integer userremitente;
	private Integer userdestinatario;

	@Column(name="fechalimiteatencion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechalimiteatencion;

	private transient String fechalimite;

	public Integer getIdPK() {
		return idPK;
	}

	public void setIdPK(Integer idPK) {
		this.idPK = idPK;
	}

	public Integer getIddocumento() {
		return iddocumento;
	}

	public void setIddocumento(Integer iddocumento) {
		this.iddocumento = iddocumento;
	}



	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}



	public Date getFechalimiteatencion() {
		return fechalimiteatencion;
	}

	public void setFechalimiteatencion(Date fechalimiteatencion) {
		this.fechalimiteatencion = fechalimiteatencion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getAreaorigen() {
		return areaorigen;
	}

	public void setAreaorigen(String areaorigen) {
		this.areaorigen = areaorigen;
	}

	public String getAreadestino() {
		return areadestino;
	}

	public void setAreadestino(String areadestino) {
		this.areadestino = areadestino;
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

	public String getIndtable() {
		return indtable;
	}

	public void setIndtable(String indtable) {
		this.indtable = indtable;
	}

	public Integer getUserremitente() {
		return userremitente;
	}

	public void setUserremitente(Integer userremitente) {
		this.userremitente = userremitente;
	}

	public Integer getUserdestinatario() {
		return userdestinatario;
	}

	public void setUserdestinatario(Integer userdestinatario) {
		this.userdestinatario = userdestinatario;
	}

	public Character getDesplazo() {
		return desplazo;
	}

	public void setDesplazo(Character desplazo) {
		this.desplazo = desplazo;
	}

	public String getDesfase() {
		return desfase;
	}

	public void setDesfase(String desfase) {
		this.desfase = desfase;
	}

	public String getFechalimite() {
		return fechalimite;
	}

	public void setFechalimite(String fechalimite) {
		this.fechalimite = fechalimite;
	}



	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Character getEnabledCheck() {
		return enabledCheck;
	}

	public void setEnabledCheck(Character enabledCheck) {
		this.enabledCheck = enabledCheck;
	}
}
