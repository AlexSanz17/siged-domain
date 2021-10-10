package com.btg.ositran.siged.domain;

import java.util.List;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class NodoExpReporteAPN8 {
	@Column(name="fechalimite")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechalimite;

	private Date fechaCreacionExterna;

	private Integer idExpediente;

	private Integer idProceso;

	public Integer getIdProceso() {
		return idProceso;
	}


	public void setIdProceso(Integer idProceso) {
		this.idProceso = idProceso;
	}


	private Integer plazoProceso;

	private String numeroExpediente;

	private String administrado;

	private String asunto;

	private String prioridad;

	private Integer idGrupoProceso;

	private String desArea;

	private String estado;

	private String nroDocumento;

	private Date fechaCreacion;

	private transient long dias;

	private List<NodoDocReporteAPN8> documentos;

	public NodoExpReporteAPN8(Integer idExpediente, Integer plazoProceso, String numeroExpediente, String administrado, String asunto){
		this.idExpediente = idExpediente;
		this.plazoProceso = plazoProceso;
		this.numeroExpediente = numeroExpediente;
		this.administrado = administrado;
		this.asunto = asunto;
	}


	public NodoExpReporteAPN8(Integer idExpediente, Integer plazoProceso, String numeroExpediente, String administrado, String asunto, Integer idGrupoProceso){
		this.idExpediente = idExpediente;
		this.plazoProceso = plazoProceso;
		this.numeroExpediente = numeroExpediente;
		this.administrado = administrado;
		this.asunto = asunto;
		this.idGrupoProceso = idGrupoProceso;
	}

	public NodoExpReporteAPN8(Integer idExpediente, Integer plazoProceso, String numeroExpediente, String administrado, String asunto, Integer idGrupoProceso, Date fechaCreacion){
		this.idExpediente = idExpediente;
		this.plazoProceso = plazoProceso;
		this.numeroExpediente = numeroExpediente;
		this.administrado = administrado;
		this.asunto = asunto;
		this.idGrupoProceso = idGrupoProceso;
		this.fechaCreacion = fechaCreacion;
	}


	public NodoExpReporteAPN8(Integer idExpediente, Integer plazoProceso, String numeroExpediente, String administrado, String asunto, Integer idGrupoProceso, Date fechaCreacion, Integer idProceso){
		this.idExpediente = idExpediente;
		this.plazoProceso = plazoProceso;
		this.numeroExpediente = numeroExpediente;
		this.administrado = administrado;
		this.asunto = asunto;
		this.idGrupoProceso = idGrupoProceso;
		this.fechaCreacion = fechaCreacion;
		this.idProceso = idProceso;
	}

	public String getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public String getAdministrado() {
		return administrado;
	}

	public void setAdministrado(String administrado) {
		this.administrado = administrado;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public List<NodoDocReporteAPN8> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<NodoDocReporteAPN8> documentos) {
		this.documentos = documentos;
	}

	public Integer getCantidadDocumentos(){
		if(documentos == null || documentos.isEmpty()){
			return 0;
		}
		return documentos.size();
	}

	public Integer getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Integer idExpediente) {
		this.idExpediente = idExpediente;
	}

	public Integer getPlazoProceso() {
		return plazoProceso;
	}

	public void setPlazoProceso(Integer plazoProceso) {
		this.plazoProceso = plazoProceso;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public Integer getIdGrupoProceso() {
		return idGrupoProceso;
	}

	public void setIdGrupoProceso(Integer idGrupoProceso) {
		this.idGrupoProceso = idGrupoProceso;
	}

	public String getDesArea() {
		return desArea;
	}

	public void setDesArea(String desArea) {
		this.desArea = desArea;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechalimite() {
		return fechalimite;
	}

	public void setFechalimite(Date fechalimite) {
		this.fechalimite = fechalimite;
	}

	public Date getFechaCreacionExterna() {
		return fechaCreacionExterna;
	}

	public void setFechaCreacionExterna(Date fechaCreacionExterna) {
		this.fechaCreacionExterna = fechaCreacionExterna;
	}

	public long getDias() {
		return dias;
	}

	public void setDias(long dias) {
		this.dias = dias;
	}



	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public String getNroDocumento() {
		return nroDocumento;
	}


	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
}
