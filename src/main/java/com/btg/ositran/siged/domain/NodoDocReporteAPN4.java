package com.btg.ositran.siged.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reporteapn4")
public class NodoDocReporteAPN4 {
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "anndocumento")
	private String anndocumento;


	public String getAnndocumento() {
		return anndocumento;
	}

	public void setAnndocumento(String anndocumento) {
		this.anndocumento = anndocumento;
	}

	@Column(name = "tipoDocumento")
	private String tipoDocumento;

	@Column(name = "idtipodocumento")
	private Integer idTipoDocumento;


	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	@Column(name = "nroDocumento")
	private String nroDocumento;

	@Column(name = "asunto")
	private String asunto;

	@Column(name = "cliente")
	private String cliente;

	@Column(name = "fechaDocumento")
	private String fechaDocumento;

	@Column(name = "area")
	private String area;

	@Column(name = "codArea")
	private Integer codArea;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "fechaTransferido")
	private String fechaTransferido;

	@Column(name = "nroExpediente")
	private String nroExpediente;


	@Column(name="iddocumento")
	private Integer idDocumento;


	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getNroExpediente() {
		return nroExpediente;
	}

	public void setNroExpediente(String nroExpediente) {
		this.nroExpediente = nroExpediente;
	}

	public Integer getCodArea() {
		return codArea;
	}

	public void setCodArea(Integer codArea) {
		this.codArea = codArea;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFechaDocumento() {
		return fechaDocumento;
	}

	public void setFechaDocumento(String fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFechaTransferido() {
		return fechaTransferido;
	}

	public void setFechaTransferido(String fechaTransferido) {
		this.fechaTransferido = fechaTransferido;
	}



}
