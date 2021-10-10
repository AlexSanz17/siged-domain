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
@Table(name="reporteapn1")
public class ReporteAPN1 implements Serializable {
	private static final long serialVersionUID=1L;

	public static long getSerialVersionUID(){
		return serialVersionUID;
	}
	/**************************************************/

	@Id
	@Column(name="idr1")
	private Integer idR1;

	@Column(name="iddocumento")
	private Integer id;

	@Column(name="nrodocumento")
	private String nroDocumento;

	@Column(name= "asuntodocumento")
	private String asuntoDocumento;

	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	@Column(name="fechadocumento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDocumento;

	@Column(name="idtipodocumento")
	private Integer idTipoDocumento;

	@Column(name="tipodocumento")
	private String tipoDocumento;

	@Column(name="idareaorigen")
	private Integer idAreaOrigen;

	@Column(name="areaorigen")
	private String areaOrigen;

	@Column(name="areadestino")
	private String areaDestino;

	public String getAreaDestino() {
		return areaDestino;
	}

	public void setAreaDestino(String areaDestino) {
		this.areaDestino = areaDestino;
	}
	@Column(name="idexpediente")
	private Integer idExpediente;

	@Column(name="nroexpediente")
	private String nroExpediente;

	@Column(name="cliente")
	private String cliente;

	@Column(name="idprioridad")
	private String idPrioridad;

	@Column(name="prioridad")
	private String prioridad;

	@Column(name="destinatario")
	private String destinatario;

	@Column(name="proceso")
	private String proceso;

	@Column(name="idareadestino")
	private Integer idAreaDestino;



	public Integer getIdAreaDestino() {
		return idAreaDestino;
	}

	public void setIdAreaDestino(Integer idAreaDestino) {
		this.idAreaDestino = idAreaDestino;
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

	public Date getFechaDocumento() {
		return fechaDocumento;
	}

	public void setFechaDocumento(Date fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
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

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public String getIdPrioridad() {
		return idPrioridad;
	}

	public void setIdPrioridad(String idPrioridad) {
		this.idPrioridad = idPrioridad;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getProceso() {
		return proceso;
	}

	public void setProceso(String proceso) {
		this.proceso = proceso;
	}

	public Integer getIdR1() {
		return idR1;
	}

	public void setIdR1(Integer idR1) {
		this.idR1 = idR1;
	}



}
