package com.btg.ositran.siged.domain;

import java.sql.Date;

public class ArchivoAdjunto {
	private Integer idAjunto;
	private Integer idRecepcion;
	private Integer idDespacho;
	private String tipoArchivo;
	private String nombreArchivo;
	private String rutaArchivo;
	private String tamanoArchivo;
	private Integer numeroFolios;
	private Date fechaRegistro;
	
	public ArchivoAdjunto() {
	}
	
	public Integer getIdAjunto() {
		return idAjunto;
	}
	
	public void setIdAjunto(Integer idAjunto) {
		this.idAjunto = idAjunto;
	}
	
	public Integer getIdRecepcion() {
		return idRecepcion;
	}
	
	public void setIdRecepcion(Integer idRecepcion) {
		this.idRecepcion = idRecepcion;
	}
	
	public Integer getIdDespacho() {
		return idDespacho;
	}
	
	public void setIdDespacho(Integer idDespacho) {
		this.idDespacho = idDespacho;
	}
	
	public String getTipoArchivo() {
		return tipoArchivo;
	}
	
	public void setTipoArchivo(String tipoArchivo) {
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
	
	public String getTamanoArchivo() {
		return tamanoArchivo;
	}

	public void setTamanoArchivo(String tamanoArchivo) {
		this.tamanoArchivo = tamanoArchivo;
	}
	
	public Integer getNumeroFolios() {
		return numeroFolios;
	}
	
	public void setNumeroFolios(Integer numeroFolios) {
		this.numeroFolios = numeroFolios;
	}
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	@Override
	public String toString() {
		return "ArchivoAdjunto [idAjunto=" + idAjunto + ", idRecepcion=" + idRecepcion + ", idDespacho=" + idDespacho
			+ ", tipoArchivo=" + tipoArchivo + ", nombreArchivo=" + nombreArchivo + ", rutaArchivo=" + rutaArchivo
			+ ", tamanoArchivo=" + tamanoArchivo + ", numeroFolios=" + numeroFolios + ", fechaRegistro="
			+ fechaRegistro + "]";
	}
}