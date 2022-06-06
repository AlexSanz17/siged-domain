package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="documentonotificacion")
@NamedQueries(
		{@NamedQuery(name="DocumentoNotificacion.findByIddocumento",query="SELECT d FROM DocumentoNotificacion d WHERE d.idDocumento = :idDocumento")})
public class DocumentoNotificacion {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idNotificacion")
	private Integer idNotificacion; 
	 
	@Column(name="iddocumento")
	private Integer idDocumento; 
	
	@Column(name="fechacreacion")
	private Date fechaCreacion; 
	
	@Column(name="idUsuarioRemitente")
	private Integer idUsuarioRemitente; 
	
	@Column(name="cargoRemitente")
	private Integer cargoRemitente; 
	
	@Column(name="unidadRemitente")
	private Integer unidadRemitente; 
	
	@Column(name="idClienteDestinatario")
	private Integer idClienteDestinatario; 
	
	@Column(name="nombreDestinatario")
	private String nombreDestinatario; 
	
	@Column(name="estado")
	private Character estado; 
	
	@Column(name="usuarioCreacion")
	private Integer usuarioCreacion; 
	
	@Column(name="Pk_eIdNotificacion")
	private Integer Pk_eIdNotificacion; 
	
	public DocumentoNotificacion() {
	}
	public Integer getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(Integer idNotificacion) {
		this.idNotificacion = idNotificacion;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdUsuarioRemitente() {
		return idUsuarioRemitente;
	}

	public void setIdUsuarioRemitente(Integer idUsuarioRemitente) {
		this.idUsuarioRemitente = idUsuarioRemitente;
	}

	public Integer getCargoRemitente() {
		return cargoRemitente;
	}

	public void setCargoRemitente(Integer cargoRemitente) {
		this.cargoRemitente = cargoRemitente;
	}

	public Integer getUnidadRemitente() {
		return unidadRemitente;
	}

	public void setUnidadRemitente(Integer unidadRemitente) {
		this.unidadRemitente = unidadRemitente;
	}

	public Integer getIdClienteDestinatario() {
		return idClienteDestinatario;
	}

	public void setIdClienteDestinatario(Integer idClienteDestinatario) {
		this.idClienteDestinatario = idClienteDestinatario;
	}

	public String getNombreDestinatario() {
		return nombreDestinatario;
	}

	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = nombreDestinatario;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public Integer getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(Integer usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Integer getPk_eIdNotificacion() {
		return Pk_eIdNotificacion;
	}

	public void setPk_eIdNotificacion(Integer pk_eIdNotificacion) {
		Pk_eIdNotificacion = pk_eIdNotificacion;
	}
	@Override
	public String toString() {
		return "DocumentoNotificacion [idNotificacion=" + idNotificacion + ", idDocumento=" + idDocumento
				+ ", fechaCreacion=" + fechaCreacion + ", idUsuarioRemitente=" + idUsuarioRemitente
				+ ", cargoRemitente=" + cargoRemitente + ", unidadRemitente=" + unidadRemitente
				+ ", idClienteDestinatario=" + idClienteDestinatario + ", nombreDestinatario=" + nombreDestinatario
				+ ", estado=" + estado + ", usuarioCreacion=" + usuarioCreacion + ", Pk_eIdNotificacion="
				+ Pk_eIdNotificacion + "]";
	}  
}
