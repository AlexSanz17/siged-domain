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
@Table(name = "reporteapn3")
public class NodoDocReporteAPN8 {

	@Id
	@Column(name = "iddocumento")
	private Integer idDocumento;

	private transient long dias;

	@Column(name = "idexpediente")
	private Integer idExpediente;

	@Column(name = "estado")
	private String estado;

	@Column(name = "idareaorigen")
	private Integer idAreaOrigen;

	@Column(name = "idareaexterna")
	private Integer idAreaExterna;

	@Column(name = "idareadestino")
	private Integer idAreaDestino;

	@Column(name = "areaorigen")
	private String areaOrigen;

	@Column(name = "areaexterna")
	private String areaExterna;

	@Column(name = "areadestino")
	private String areaDestino;

	@Column(name = "prioridad")
	private Integer prioridad;

	private String documento;

	@Column(name = "fechacreacionexterna")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacionExterna;

	@Column(name = "fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	@Column(name = "fechatransferencia")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaTransferencia;

	@Column(name = "fechalimite")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLimite;

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Integer idExpediente) {
		this.idExpediente = idExpediente;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(Date fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	public String getFechaCreacionStr(){
		if(this.fechaCreacion == null){
			return "";
		}
		return (new SimpleDateFormat("dd-MM-yyyy hh:mm")).format(this.fechaCreacion);
	}

	public String getFechaTransferenciaStr(){
		if(this.fechaTransferencia == null){
			return "";
		}
		return (new SimpleDateFormat("dd-MM-yyyy hh:mm")).format(this.fechaTransferencia);
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public Date getFechaCreacionExterna() {
		return fechaCreacionExterna;
	}

	public void setFechaCreacionExterna(Date fechaCreacionExterna) {
		this.fechaCreacionExterna = fechaCreacionExterna;
	}

	public Integer getIdAreaOrigen() {
		return idAreaOrigen;
	}

	public void setIdAreaOrigen(Integer idAreaOrigen) {
		this.idAreaOrigen = idAreaOrigen;
	}

	public Integer getIdAreaExterna() {
		return idAreaExterna;
	}

	public void setIdAreaExterna(Integer idAreaExterna) {
		this.idAreaExterna = idAreaExterna;
	}

	public Integer getIdAreaDestino() {
		return idAreaDestino;
	}

	public void setIdAreaDestino(Integer idAreaDestino) {
		this.idAreaDestino = idAreaDestino;
	}

	public String getAreaOrigen() {
		return areaOrigen;
	}

	public void setAreaOrigen(String areaOrigen) {
		this.areaOrigen = areaOrigen;
	}

	public String getAreaExterna() {
		return areaExterna;
	}

	public void setAreaExterna(String areaExterna) {
		this.areaExterna = areaExterna;
	}

	public String getAreaDestino() {
		return areaDestino;
	}

	public void setAreaDestino(String areaDestino) {
		this.areaDestino = areaDestino;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public long getDias() {
		return dias;
	}

	public void setDias(long dias) {
		this.dias = dias;
	}
}
