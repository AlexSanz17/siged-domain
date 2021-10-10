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
@Table(name="consultaapn3")
public class ConsultaAPN3 implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="idc3")
	private Integer idC3;
	
	@Column(name="idtrazabilidaddocumento")
	private Integer idTrazabilidadDocumento;
	
	@Column(name="idtrazabilidadapoyo")
	private Integer idTrazabilidadApoyo;
	
	@Column(name="idtrazabilidadcopia")
	private String idTrazabilidadCopia;
	
	@Column(name="fechacreaciontd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacionTd;
	
	@Column(name="fechalimiteatenciontd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLimiteTd;
	
	@Column(name="acciontd")
	private String accionTd;
	
	@Column(name="remitentetd")
	private String remintenteTd;
	
	@Column(name="idareaorigentd")
	private Integer idAreaOrigenTd;
	
	@Column(name="areaorigentd")
	private String areaOrigenTd;
	
	@Column(name="idareadestinotd")
	private Integer idAreaDestinoTd;
	
	@Column(name="areadestinotd")
	private String areaDestinoTd;
	
	@Column(name="fechacreacionta")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacionTa;
	
	@Column(name="fechalimiteatencionta")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLimiteTa;
	
	@Column(name="accionta")
	private String accionTa;
	
	@Column(name="remitenteta")
	private String remintenteTa;
	
	@Column(name="idareaorigenta")
	private Integer idAreaOrigenTa;
	
	@Column(name="areaorigenta")
	private String areaOrigenTa;
	
	@Column(name="idareadestinota")
	private Integer idAreaDestinoTa;
	
	@Column(name="areadestinota")
	private String areaDestinoTa;
	
	@Column(name="fechacreaciontc")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacionTc;
	
	@Column(name="acciontc")
	private String accionTc;
	
	@Column(name="remitentetc")
	private String remintenteTc;
	
	@Column(name="idareaorigentc")
	private Integer idAreaOrigenTc;
	
	@Column(name="areaorigentc")
	private String areaOrigenTc;
	
	@Column(name="idareadestinotc")
	private Integer idAreaDestinoTc;
	
	@Column(name="areadestinotc")
	private String areaDestinoTc;
		
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

	@Column(name="asuntoexpediente")
	private String asuntoExpediente;
	
	@Column(name="asuntodocumento")
	private String asuntoDocumento;
	
	@Column(name="estadodocumento")
	private String estadoDocumento;
	
	@Column(name="idproceso")
	private Integer idProceso;
	
	@Column(name="proceso")
	private String proceso;
		
	@Column(name="cliente")
	private String cliente;
	
	@Column(name="prioridad")
	private String prioridad;	
	
	
	
	public Integer getIdC3() {
		return idC3;
	}

	public void setIdC3(Integer idC3) {
		this.idC3 = idC3;
	}

	public Integer getIdTrazabilidadDocumento() {
		return idTrazabilidadDocumento;
	}

	public void setIdTrazabilidadDocumento(Integer idTrazabilidadDocumento) {
		this.idTrazabilidadDocumento = idTrazabilidadDocumento;
	}

	public Integer getIdTrazabilidadApoyo() {
		return idTrazabilidadApoyo;
	}

	public void setIdTrazabilidadApoyo(Integer idTrazabilidadApoyo) {
		this.idTrazabilidadApoyo = idTrazabilidadApoyo;
	}

	public String getIdTrazabilidadCopia() {
		return idTrazabilidadCopia;
	}

	public void setIdTrazabilidadCopia(String idTrazabilidadCopia) {
		this.idTrazabilidadCopia = idTrazabilidadCopia;
	}

	public Date getFechaCreacionTd() {
		return fechaCreacionTd;
	}

	public void setFechaCreacionTd(Date fechaCreacionTd) {
		this.fechaCreacionTd = fechaCreacionTd;
	}

	public Integer getIdAreaOrigenTd() {
		return idAreaOrigenTd;
	}

	public void setIdAreaOrigenTd(Integer idAreaOrigenTd) {
		this.idAreaOrigenTd = idAreaOrigenTd;
	}

	public String getAreaOrigenTd() {
		return areaOrigenTd;
	}

	public void setAreaOrigenTd(String areaOrigenTd) {
		this.areaOrigenTd = areaOrigenTd;
	}

	public Integer getIdAreaDestinoTd() {
		return idAreaDestinoTd;
	}

	public void setIdAreaDestinoTd(Integer idAreaDestinoTd) {
		this.idAreaDestinoTd = idAreaDestinoTd;
	}

	public String getAreaDestinoTd() {
		return areaDestinoTd;
	}

	public void setAreaDestinoTd(String areaDestinoTd) {
		this.areaDestinoTd = areaDestinoTd;
	}

	public Date getFechaCreacionTa() {
		return fechaCreacionTa;
	}

	public void setFechaCreacionTa(Date fechaCreacionTa) {
		this.fechaCreacionTa = fechaCreacionTa;
	}

	public Integer getIdAreaOrigenTa() {
		return idAreaOrigenTa;
	}

	public void setIdAreaOrigenTa(Integer idAreaOrigenTa) {
		this.idAreaOrigenTa = idAreaOrigenTa;
	}

	public String getAreaOrigenTa() {
		return areaOrigenTa;
	}

	public void setAreaOrigenTa(String areaOrigenTa) {
		this.areaOrigenTa = areaOrigenTa;
	}

	public Integer getIdAreaDestinoTa() {
		return idAreaDestinoTa;
	}

	public void setIdAreaDestinoTa(Integer idAreaDestinoTa) {
		this.idAreaDestinoTa = idAreaDestinoTa;
	}

	public String getAreaDestinoTa() {
		return areaDestinoTa;
	}

	public void setAreaDestinoTa(String areaDestinoTa) {
		this.areaDestinoTa = areaDestinoTa;
	}

	public Date getFechaCreacionTc() {
		return fechaCreacionTc;
	}

	public void setFechaCreacionTc(Date fechaCreacionTc) {
		this.fechaCreacionTc = fechaCreacionTc;
	}

	public Integer getIdAreaOrigenTc() {
		return idAreaOrigenTc;
	}

	public void setIdAreaOrigenTc(Integer idAreaOrigenTc) {
		this.idAreaOrigenTc = idAreaOrigenTc;
	}

	public String getAreaOrigenTc() {
		return areaOrigenTc;
	}

	public void setAreaOrigenTc(String areaOrigenTc) {
		this.areaOrigenTc = areaOrigenTc;
	}

	public Integer getIdAreaDestinoTc() {
		return idAreaDestinoTc;
	}

	public void setIdAreaDestinoTc(Integer idAreaDestinoTc) {
		this.idAreaDestinoTc = idAreaDestinoTc;
	}

	public String getAreaDestinoTc() {
		return areaDestinoTc;
	}

	public void setAreaDestinoTc(String areaDestinoTc) {
		this.areaDestinoTc = areaDestinoTc;
	}

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

	public String getEstadoDocumento() {
		return estadoDocumento;
	}

	public void setEstadoDocumento(String estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getFechaLimiteTd() {
		return fechaLimiteTd;
	}

	public void setFechaLimiteTd(Date fechaLimiteTd) {
		this.fechaLimiteTd = fechaLimiteTd;
	}

	public String getAccionTd() {
		return accionTd;
	}

	public void setAccionTd(String accionTd) {
		this.accionTd = accionTd;
	}

	public String getRemintenteTd() {
		return remintenteTd;
	}

	public void setRemintenteTd(String remintenteTd) {
		this.remintenteTd = remintenteTd;
	}

	public Date getFechaLimiteTa() {
		return fechaLimiteTa;
	}

	public void setFechaLimiteTa(Date fechaLimiteTa) {
		this.fechaLimiteTa = fechaLimiteTa;
	}

	public String getAccionTa() {
		return accionTa;
	}

	public void setAccionTa(String accionTa) {
		this.accionTa = accionTa;
	}

	public String getRemintenteTa() {
		return remintenteTa;
	}

	public void setRemintenteTa(String remintenteTa) {
		this.remintenteTa = remintenteTa;
	}

	public String getAccionTc() {
		return accionTc;
	}

	public void setAccionTc(String accionTc) {
		this.accionTc = accionTc;
	}

	public String getRemintenteTc() {
		return remintenteTc;
	}

	public void setRemintenteTc(String remintenteTc) {
		this.remintenteTc = remintenteTc;
	}
	
}
