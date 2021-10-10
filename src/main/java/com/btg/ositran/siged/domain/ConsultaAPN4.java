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
@Table(name="consultaapn4")
public class ConsultaAPN4 implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="iddocumento")
	private Integer id;
	
	@Column(name="idexpediente")
	private Integer idExpediente;
	
	@Column(name="nroexpediente")
	private String nroExpediente;
	
	@Column(name="nrodocumento")
	private String nroDocumento;
	
	@Column(name="idtipodocumento")
	private Integer idTipoDocumento;
	
	@Column(name="tipodocumento")
	private String tipoDocumento;
	
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
	
	@Column(name="idproceso")
	private Integer idProceso;
	
	@Column(name="proceso")
	private String proceso;
	
	@Column(name="idareaorigen")
	private Integer idAreaOrigen;
	
	@Column(name="areaorigen")
	private String areaOrigen;
	
	@Column(name="asuntoexpediente")
	private String asuntoExpediente;
	
	@Column(name="asuntodocumento")
	private String asuntoDocumento;
	
	@Column(name="estadoexpediente")
	private String estadoExpediente;
	
	@Column(name="idareadestino")
	private Integer idAreaDestino;
	
	@Column(name="areadestino")
	private String areaDestino;
	
	@Column(name="idcliente")
	private Integer idCliente;
	
	@Column(name="cliente")
	private String cliente;
	
	@Column(name="idprioridad")
	private Integer idPrioridad;
	
	@Column(name="prioridad")
	private String prioridad;
	
	@Column(name="remitente")
	private Integer remitente;
	
	@Column(name="destinatario")
	private String destinatario;

	@Column(name="documentoreferencia")
	private Integer documentoReferencia;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdProceso() {
		return idProceso;
	}

	public void setIdProceso(Integer idProceso) {
		this.idProceso = idProceso;
	}

	public String getProceso() {
		return proceso;
	}

	public void setProceso(String proceso) {
		this.proceso = proceso;
	}

	public Integer getIdAreaOrigen() {
		return idAreaOrigen;
	}

	public void setIdAreaOrigen(Integer idAreaOrigen) {
		this.idAreaOrigen = idAreaOrigen;
	}

	public String getAreaOrigen() {
		return areaOrigen;
	}

	public void setAreaOrigen(String areaOrigen) {
		this.areaOrigen = areaOrigen;
	}

	public String getAsuntoExpediente() {
		return asuntoExpediente;
	}

	public void setAsuntoExpediente(String asuntoExpediente) {
		this.asuntoExpediente = asuntoExpediente;
	}

	public String getAsuntoDocumento() {
		return asuntoDocumento;
	}

	public void setAsuntoDocumento(String asuntoDocumento) {
		this.asuntoDocumento = asuntoDocumento;
	}

	public String getEstadoExpediente() {
		return estadoExpediente;
	}

	public void setEstadoExpediente(String estadoExpediente) {
		this.estadoExpediente = estadoExpediente;
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

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
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

	public Integer getRemitente() {
		return remitente;
	}

	public void setRemitente(Integer remitente) {
		this.remitente = remitente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public Integer getDocumentoReferencia() {
		return documentoReferencia;
	}

	public void setDocumentoReferencia(Integer documentoReferencia) {
		this.documentoReferencia = documentoReferencia;
	}
	
	
	
}
