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
@Table(name="documentoareafuncional")
public class DocumentoAreaFuncional implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="iddocumentoareafuncional")
	private Integer idDocumentoAreaFuncional;
	
	@Column(name="iddocumento")
	private Integer id;
	
	@Column(name="nrodocumento")
	private String nroDocumento;
	
	@Column(name="asuntodocumento")
	private String asuntoDocumento;
	
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
	
	@Column(name="cliente")
	private String cliente;
	
	@Column(name="idexpediente")
	private Integer idExpediente;
	
	@Column(name="nroexpediente")
	private String nroExpediente;
	
	@Column(name="asuntoexpediente")
	private String asuntoExpediente;
	
	@Column(name="idareacreacion")
	private Integer idAreaCreacion;
	
	@Column(name="idareafuncionalcreacion")
	private Integer idAreaFuncionalCreacion;
	
	@Column(name="idarearecepcion")
	private Integer idAreaRecepcion;
	
	@Column(name="idareafuncionalrecepcion")
	private Integer idAreaFuncionalRecepcion;
	
	@Column(name="idareadestino")
	private Integer idAreaDestino;
	
	@Column(name="areadestino")
	private String areaDestino;
	
	@Column(name="propietario")
	private String propietario;
	
	@Column(name="idproceso")
	private Integer idProceso;

	@Column(name="idremitente")
	private Integer idRemitente;
	
	@Column(name="destinatario")
	private Integer destinatario;

	@Column(name="remitente")
	private String remitente;

	@Column(name="accion")
	private String accion;

	@Column(name="fechalimiteatencion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLimite;

	@Column(name="idprioridad")
	private Integer idPrioridad;
	
	@Column(name="prioridad")
	private String prioridad;
	
	public Integer getIdDocumentoAreaFuncional() {
		return idDocumentoAreaFuncional;
	}



	public void setIdDocumentoAreaFuncional(Integer idDocumentoAreaFuncional) {
		this.idDocumentoAreaFuncional = idDocumentoAreaFuncional;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNroDocumento() {
		return nroDocumento;
	}



	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}



	public String getAsuntoDocumento() {
		return asuntoDocumento;
	}



	public void setAsuntoDocumento(String asuntoDocumento) {
		this.asuntoDocumento = asuntoDocumento;
	}



	public Date getFechaCreacion() {
		return fechaCreacion;
	}



	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public Integer getIdExpediente() {
		return idExpediente;
	}



	public void setIdExpediente(Integer idExpediente) {
		this.idExpediente = idExpediente;
	}



	public String getNroExpediente() {
		return nroExpediente;
	}



	public void setNroExpediente(String nroExpediente) {
		this.nroExpediente = nroExpediente;
	}



	public String getAsuntoExpediente() {
		return asuntoExpediente;
	}



	public void setAsuntoExpediente(String asuntoExpediente) {
		this.asuntoExpediente = asuntoExpediente;
	}



	public Integer getIdAreaCreacion() {
		return idAreaCreacion;
	}



	public void setIdAreaCreacion(Integer idAreaCreacion) {
		this.idAreaCreacion = idAreaCreacion;
	}



	public Integer getIdAreaFuncionalCreacion() {
		return idAreaFuncionalCreacion;
	}



	public void setIdAreaFuncionalCreacion(Integer idAreaFuncionalCreacion) {
		this.idAreaFuncionalCreacion = idAreaFuncionalCreacion;
	}



	public Integer getIdAreaRecepcion() {
		return idAreaRecepcion;
	}



	public void setIdAreaRecepcion(Integer idAreaRecepcion) {
		this.idAreaRecepcion = idAreaRecepcion;
	}



	public Integer getIdAreaFuncionalRecepcion() {
		return idAreaFuncionalRecepcion;
	}



	public void setIdAreaFuncionalRecepcion(Integer idAreaFuncionalRecepcion) {
		this.idAreaFuncionalRecepcion = idAreaFuncionalRecepcion;
	}



	public Integer getIdAreaDestino() {
		return idAreaDestino;
	}



	public void setIdAreaDestino(Integer idAreaDestino) {
		this.idAreaDestino = idAreaDestino;
	}



	public String getAreaDestino() {
		return areaDestino;
	}



	public void setAreaDestino(String areaDestino) {
		this.areaDestino = areaDestino;
	}



	public String getPropietario() {
		return propietario;
	}



	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}



	public Integer getIdProceso() {
		return idProceso;
	}



	public void setIdProceso(Integer idProceso) {
		this.idProceso = idProceso;
	}

	public Integer getIdRemitente() {
		return idRemitente;
	}

	public void setIdRemitente(Integer idRemitente) {
		this.idRemitente = idRemitente;
	}


	public Integer getDestinatario() {
		return destinatario;
	}



	public void setDestinatario(Integer destinatario) {
		this.destinatario = destinatario;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getRemitente() {
		return remitente;
	}



	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}



	public String getAccion() {
		return accion;
	}



	public void setAccion(String accion) {
		this.accion = accion;
	}



	public Date getFechaLimite() {
		return fechaLimite;
	}



	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}



	public Integer getIdPrioridad() {
		return idPrioridad;
	}



	public void setIdPrioridad(Integer idPrioridad) {
		this.idPrioridad = idPrioridad;
	}



	public String getPrioridad() {
		return prioridad;
	}



	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	
	
}
