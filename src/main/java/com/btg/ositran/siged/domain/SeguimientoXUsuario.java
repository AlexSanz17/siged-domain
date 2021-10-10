package com.btg.ositran.siged.domain;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="seguimientoxusuario")
@NamedQueries({@NamedQuery(name="SeguimientoXUsuario.findByIdSeguimiento",query="SELECT d FROM SeguimientoXUsuario d where d.idSeguimientoUsuario = :idSeguimientoUsuario and estado = 'A'")})

public class SeguimientoXUsuario {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEGUIMIENTOXUSUARIO_SEQ")
	@SequenceGenerator(name="SEGUIMIENTOXUSUARIO_SEQ",sequenceName="SEGUIMIENTOXUSUARIO_SEQ",initialValue=1,allocationSize=1)
	@Column(name = "idseguimientousuario")
	private Integer idSeguimientoUsuario;

	@Column(name="iddocumento")
	@Basic(optional=false)
	private Integer idDocumento;
        
        @Column(name="unidadPropietario")
	private Integer unidadPropietario;
        
        @Column(name="cargoPropietario")
	private Integer cargoPropietario;

	@Column(name="idusuario")
	@Basic(optional=false)
	private Integer idUsuario;
        
        @Column(name="fechaCreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
        
        @Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
        
        @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;
        
        @Column(name="usuarioModificacion")
	private Integer usuarioModificacion;

        @Column(name="estado")
	private String estado;

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
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


	public Integer getIdSeguimientoUsuario() {
		return idSeguimientoUsuario;
	}

	public void setIdSeguimientoUsuario(Integer idSeguimientoUsuario) {
		this.idSeguimientoUsuario = idSeguimientoUsuario;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

        public Integer getUnidadPropietario() {
             return unidadPropietario;
        }

        public void setUnidadPropietario(Integer unidadPropietario) {
            this.unidadPropietario = unidadPropietario;
        }

        public Integer getCargoPropietario() {
            return cargoPropietario;
        }

        public void setCargoPropietario(Integer cargoPropietario) {
            this.cargoPropietario = cargoPropietario;
        }

}
