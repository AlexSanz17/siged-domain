package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="documentorechazado")
@NamedQueries({@NamedQuery(name="DocumentoRechazado.buscarTodos",query="SELECT d FROM DocumentoRechazado d"),
	@NamedQuery(name="DocumentoRechazado.buscarPorIdDocumentoRechazado",query="SELECT d FROM DocumentoRechazado d WHERE d.idDocumentoRechazado = :idDocumentoRechazado")})
public class DocumentoRechazado {
    @Id
	@Column(name="iddocumentorechazado")
	private Integer idDocumentoRechazado;
    
	@Column(name="iddocumento")
	private Integer idDocumento;
    
    @Column(name="estado")
	private String estado;
    
    @Column(name="observacion")
	private String observacion;
    
    @Column(name="idusuario")
	private Integer idUsuario;
    
	@Column(name="cargopropietario")
	private Integer cargoPropietario;

    @Column(name="unidadpropietario")
	private Integer unidadPropietario;
        
    @Column(name="usuariocreacion")
	private Integer usuarioCreacion;
        
    @Column(name="usuariomodificacion")
	private Integer usuarioModificacion;

    @Column(name="fechacreacion")
	private Date fechaCreacion;
        
    @Column(name="fechamodificacion")
	private Date fechaModificacion;
    
	public DocumentoRechazado() {
	}
	
	public Integer getIdDocumentoRechazado() {
		return idDocumentoRechazado;
	}

	public void setIdDocumentoRechazado(Integer idDocumentoRechazado) {
		this.idDocumentoRechazado = idDocumentoRechazado;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getCargoPropietario() {
		return cargoPropietario;
	}

	public void setCargoPropietario(Integer cargoPropietario) {
		this.cargoPropietario = cargoPropietario;
	}

	public Integer getUnidadPropietario() {
		return unidadPropietario;
	}

	public void setUnidadPropietario(Integer unidadPropietario) {
		this.unidadPropietario = unidadPropietario;
	}

	public Integer getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(Integer usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Integer getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(Integer usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public String toString() {
		return "DocumentoRechazado [idDocumentoRechazado=" + idDocumentoRechazado + ", idDocumento=" + idDocumento
			+ ", estado=" + estado + ", observacion=" + observacion + ", idUsuario=" + idUsuario
			+ ", cargoPropietario=" + cargoPropietario + ", unidadPropietario=" + unidadPropietario
			+ ", usuarioCreacion=" + usuarioCreacion + ", usuarioModificacion=" + usuarioModificacion
			+ ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion + "]";
	}
}