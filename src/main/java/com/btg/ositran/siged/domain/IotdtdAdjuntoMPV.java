package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "IOTDTD_ADJUNTO_MPV")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "IotdtdAdjuntoMPV.buscarTodos", query = "SELECT i FROM IotdtdAdjuntoMPV i"),
	@NamedQuery(name = "IotdtdAdjuntoMPV.buscarPorIdAdjunto", query = "SELECT i FROM IotdtdAdjuntoMPV i WHERE i.idAdjunto = :idAdjunto"),
	@NamedQuery(name = "IotdtdAdjuntoMPV.buscarNumFoliosPorIdRecepcion", query = "SELECT i.numeroFolios FROM IotdtdAdjuntoMPV i WHERE i.recepcion.sidrecext = :idRecepcion and i.tipoArchivo = :tipoArchivo"),
	@NamedQuery(name = "IotdtdAdjuntoMPV.buscarNumFoliosTotalesPorIdRecepcion", query = "SELECT sum(i.numeroFolios) FROM IotdtdAdjuntoMPV i WHERE i.recepcion.sidrecext = :idRecepcion group by i.recepcion.sidrecext")
})
public class IotdtdAdjuntoMPV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "IDADJUNTOMPV")
	private Integer idAdjunto;

	@Basic(optional = false)
	@Column(name = "TIPOARCHIVO")
	private Integer tipoArchivo;

	@Basic(optional = false)
	@Column(name = "NOMBREARCHIVO")
	private String nombreArchivo;

	@Basic(optional = false)
	@Column(name = "RUTAARCHIVO")
	private String rutaArchivo;

	@Basic(optional = false)
	@Column(name = "FECHAREGISTRO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;

	@JoinColumn(name = "IDRECEPCION", referencedColumnName = "SIDRECEXT")
	@ManyToOne(optional = false)
	private IotdtcRecepcionMPV recepcion;
	
	@Column(name = "NUMEROFOLIOS")
	private Integer numeroFolios;

	public IotdtdAdjuntoMPV() {
	}

	public Integer getIdAdjunto() {
		return idAdjunto;
	}

	public void setIdAdjunto(Integer idAdjunto) {
		this.idAdjunto = idAdjunto;
	}

	public Integer getTipoArchivo() {
		return tipoArchivo;
	}

	public void setTipoArchivo(Integer tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public IotdtcRecepcionMPV getRecepcion() {
		return recepcion;
	}

	public void setRecepcion(IotdtcRecepcionMPV recepcion) {
		this.recepcion = recepcion;
	}

	public Integer getNumeroFolios() {
		return numeroFolios;
	}

	public void setNumeroFolios(Integer numeroFolios) {
		this.numeroFolios = numeroFolios;
	}

	@Override
	public String toString() {
		return "IotdtdAdjuntoMPV [idAdjunto=" + idAdjunto + ", tipoArchivo=" + tipoArchivo + ", nombreArchivo="
			+ nombreArchivo + ", rutaArchivo=" + rutaArchivo + ", fechaRegistro=" + fechaRegistro + ", recepcion="
			+ recepcion + ", numeroFolios=" + numeroFolios + "]";
	}
}