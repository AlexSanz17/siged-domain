package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "IOTDTD_ADJUNTO_MPV")
@XmlRootElement
public class IotdtdAdjuntoMPV implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "IDADJUNTOMPV")
	private Integer idadjuntompv;

	@Basic(optional = false)
	@Column(name = "TIPOARCHIVO")
	private String tipoarchivo;

	@Basic(optional = false)
	@Column(name = "NOMBREARCHIVO")
	private String nombrearchivo;

	@Basic(optional = false)
	@Column(name = "RUTAARCHIVO")
	private String rutaarchivo;

	@Basic(optional = false)
	@Column(name = "FECHAREGISTRO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharegistro;

	@JoinColumn(name = "IDRECEPCION", referencedColumnName = "SIDRECEXT")
	@ManyToOne(optional = false)
	private IotdtcRecepcionMPV recepcion;
	

	public IotdtdAdjuntoMPV() {
	}

	public Integer getIdadjuntompv() {
		return idadjuntompv;
	}

	public void setIdadjuntompv(Integer idadjuntompv) {
		this.idadjuntompv = idadjuntompv;
	}

	public String getTipoarchivo() {
		return tipoarchivo;
	}

	public void setTipoarchivo(String tipoarchivo) {
		this.tipoarchivo = tipoarchivo;
	}

	public String getNombrearchivo() {
		return nombrearchivo;
	}

	public void setNombrearchivo(String nombrearchivo) {
		this.nombrearchivo = nombrearchivo;
	}

	public String getRutaarchivo() {
		return rutaarchivo;
	}

	public void setRutaarchivo(String rutaarchivo) {
		this.rutaarchivo = rutaarchivo;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public IotdtcRecepcionMPV getRecepcion() {
		return recepcion;
	}

	public void setRecepcion(IotdtcRecepcionMPV recepcion) {
		this.recepcion = recepcion;
	}

}
