package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reporteapn2")
public class FilaReporteAPN2 {
	
	@Id
	@Column(name="iddocumento")
	private Integer idDocumento;
	
	@Column(name="nrodocumento")
	private String numeroDocumento;
	
	@Column(name="idproceso")
	private Integer idProceso;
	
	private String proceso;
	
	@Column(name="idgrupoproceso")
	private Integer idGrupoProceso;
	
	private String asunto;
	
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
	
	@Column(name="idtipodocumento")
	private Integer idTipoDocumento;
	
	@Column(name="tipodocumento")
	private String tipoDocumento;
	
	@Column(name="idarearegistro")
	private Integer idAreaRegistro;
	
	@Column(name="arearegistro")
	private String areaRegistro;
	
	@Column(name="nroexpediente")
	private String numeroExpediente;
	
	private String cliente;
	
	private String prioridad;
	
	@Column(name="idareadestino")
	private Integer idAreaDestino;
	
	private String destinatario;

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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

	public Integer getIdGrupoProceso() {
		return idGrupoProceso;
	}

	public void setIdGrupoProceso(Integer idGrupoProceso) {
		this.idGrupoProceso = idGrupoProceso;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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

	public Integer getIdAreaRegistro() {
		return idAreaRegistro;
	}

	public void setIdAreaRegistro(Integer idAreaRegistro) {
		this.idAreaRegistro = idAreaRegistro;
	}

	public String getAreaRegistro() {
		return areaRegistro;
	}

	public void setAreaRegistro(String areaRegistro) {
		this.areaRegistro = areaRegistro;
	}

	public String getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public Integer getIdAreaDestino() {
		return idAreaDestino;
	}

	public void setIdAreaDestino(Integer idAreaDestino) {
		this.idAreaDestino = idAreaDestino;
	}

	public String getDestinatario() {
		if(destinatario == null){
			return "-";
		}
		
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
}
