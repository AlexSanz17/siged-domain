package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="td_reporte_documento_atendido")
public class ReporteAPN10 implements Serializable {
	private static final long serialVersionUID=1L;

	public static long getSerialVersionUID(){
		return serialVersionUID;
	}
	/**************************************************/

	@Id
	@Column(name="idr1")
	private Integer idR1;

	@Column(name="idunidadorigen")
	private Integer idUnidadOrigen;

	@Column(name="iddocumento")
	private Integer idDocumento;

	@Column(name="iddocumentoat")
	private Integer idDocumentoAt;

	@Column(name="desunidadorigen")
	private String desUnidadOrigen;

	@Column(name="tipodocumento")
	private String tipoDocumento;

	@Column(name="tipodocumentoat")
	private String tipoDocumentoAt;

	@Column(name="nrodocumento")
	private String nroDocumento;

	@Column(name="nrodocumentoat")
	private String nroDocumentoAt;

	@Column(name="asunto")
	private String asunto;

	@Column(name="asuntoat")
	private String asuntoAt;

	public Integer getIdR1() {
		return idR1;
	}

	public void setIdR1(Integer idR1) {
		this.idR1 = idR1;
	}

	public Integer getIdUnidadOrigen() {
		return idUnidadOrigen;
	}

	public void setIdUnidadOrigen(Integer idUnidadOrigen) {
		this.idUnidadOrigen = idUnidadOrigen;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdDocumentoAt() {
		return idDocumentoAt;
	}

	public void setIdDocumentoAt(Integer idDocumentoAt) {
		this.idDocumentoAt = idDocumentoAt;
	}

	public String getDesUnidadOrigen() {
		return desUnidadOrigen;
	}

	public void setDesUnidadOrigen(String desUnidadOrigen) {
		this.desUnidadOrigen = desUnidadOrigen;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getTipoDocumentoAt() {
		return tipoDocumentoAt;
	}

	public void setTipoDocumentoAt(String tipoDocumentoAt) {
		this.tipoDocumentoAt = tipoDocumentoAt;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getNroDocumentoAt() {
		return nroDocumentoAt;
	}

	public void setNroDocumentoAt(String nroDocumentoAt) {
		this.nroDocumentoAt = nroDocumentoAt;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getAsuntoAt() {
		return asuntoAt;
	}

	public void setAsuntoAt(String asuntoAt) {
		this.asuntoAt = asuntoAt;
	}

	public String getNroExpediente() {
		return nroExpediente;
	}

	public void setNroExpediente(String nroExpediente) {
		this.nroExpediente = nroExpediente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getAreas() {
		return areas;
	}

	public void setAreas(String areas) {
		this.areas = areas;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaCreacionAt() {
		return fechaCreacionAt;
	}

	public void setFechaCreacionAt(Date fechaCreacionAt) {
		this.fechaCreacionAt = fechaCreacionAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name="nroexpediente")
	private String nroExpediente;

	@Column(name="cliente")
	private String cliente;

	@Column(name="areas")
	private String areas;

	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	@Column(name="fechacreacionat")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacionAt;




}
